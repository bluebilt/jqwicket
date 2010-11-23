/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javaforge.jqwicket.ui;

import static net.javaforge.jqwicket.JQuery.$;
import static net.javaforge.jqwicket.JQuery.$f;
import net.javaforge.jqwicket.JQBehavior;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.JQWidget;
import net.javaforge.jqwicket.Utils;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Abstract component behavior for JQuery components.
 * 
 * @author mkalina
 * 
 * @param <T>
 */
public abstract class JQComponentBehaivor<T extends IJQOptions<T>> extends
		JQBehavior implements JQWidget<T> {

	private static final long serialVersionUID = 1L;

	protected T options;

	public JQComponentBehaivor(T options) {
		this.options = options;

		JavascriptResourceReference[] jsRefs = options.jsResourceReferences();
		if (Utils.isDevelopmentMode()
				&& Utils.isNotEmpty(options.jsResourceReferencesMin()))
			jsRefs = options.jsResourceReferencesMin();

		this.addJsResourceReferences(jsRefs);
		this.addCssResourceReferences(options.cssResourceReferences());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.JQUIWidget#getOptions()
	 */
	public T getOptions() {
		return this.options;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.JQBehavior#contribute(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	public void contribute(JQHeaderContributionTarget target) {
		super.contribute(target);
		if (!Page.class.isAssignableFrom(this.component.getClass()))
			this.initComponentJavascript(target);
	}

	protected void initComponentJavascript(JQHeaderContributionTarget target) {
		target.addJsStatement($(this.component).chain(this.getName(),
				this.options.toJson()));
	}

	protected JQFunction chain(CharSequence... methodArgs) {
		return $f($(this.component).chain(this.getName(), methodArgs));
	}

	protected void chain(AjaxRequestTarget ajaxRequestTarget,
			JQFunction function) {
		ajaxRequestTarget.appendJavascript(function.renderBodyOnly());
	}

}
