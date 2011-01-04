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
package net.javaforge.jqwicket.ui.prettyloader;

import org.apache.wicket.ajax.AjaxRequestTarget;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

import static net.javaforge.jqwicket.JQuery.$f;

/**
 * @author mkalina
 * 
 */
public class PrettyLoaderBehavior extends
		JQComponentBehaivor<PrettyLoaderOptions> implements IPrettyLoader {

	private static final long serialVersionUID = 1L;

	public PrettyLoaderBehavior() {
		this(new PrettyLoaderOptions());
	}

	public PrettyLoaderBehavior(PrettyLoaderOptions options) {
		super(options);
		super.addJQStatements(new StringBuffer().append("$.")
				.append(this.getName()).append("(")
				.append(this.options.toJson()).append(")"));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#contributeInternal(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		; // do nothing
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#show()
	 */
	public JQFunction show() {
		return $f(new StringBuffer("$.").append(this.getName()).append(
				".show()"));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#show(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget) {
		this.chain(ajaxRequestTarget, this.show());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#show(int)
	 */
	public JQFunction show(int seconds) {
		return $f(new StringBuffer("$.").append(this.getName())
				.append(".show(").append(seconds).append(")"));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#show(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget, int seconds) {
		this.chain(ajaxRequestTarget, this.show(seconds));

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#hide()
	 */
	public JQFunction hide() {
		return $f(new StringBuffer("$.").append(this.getName()).append(
				".hide()"));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.prettyloader.IPrettyLoader#hide(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void hide(AjaxRequestTarget ajaxRequestTarget) {
		this.chain(ajaxRequestTarget, this.hide());
	}

}
