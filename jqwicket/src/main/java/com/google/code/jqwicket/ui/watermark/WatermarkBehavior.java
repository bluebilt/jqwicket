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
package com.google.code.jqwicket.ui.watermark;

import static com.google.code.jqwicket.api.JQuery.$;
import static com.google.code.jqwicket.api.JQuery.$f;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;

import com.google.code.jqwicket.JQHeaderContributionTarget;
import com.google.code.jqwicket.api.IJQFunction;
import com.google.code.jqwicket.api.IJQStatement;
import com.google.code.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class WatermarkBehavior extends JQComponentBehaivor<WatermarkOptions>
		implements IWatermark {

	private static final long serialVersionUID = 1L;

	public WatermarkBehavior(CharSequence text) {
		this(new WatermarkOptions(text));
	}

	public WatermarkBehavior(WatermarkOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQUIWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.behavior.AbstractBehavior#beforeRender(org.apache.wicket.Component)
	 */
	@Override
	public void beforeRender(Component component) {
		super.beforeRender(component);

		if (AjaxRequestTarget.get() != null) {
			AjaxRequestTarget.get().appendJavascript(
					String.valueOf(createContributionStatement()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQComponentBehaivor#contributeInternal(com.google.code.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		if (!Page.class.isAssignableFrom(this.component.getClass()))
			target.addJQStatements(createContributionStatement());
	}

	private IJQStatement createContributionStatement() {
		return $(this.component).chain(this.getName(), options.getText(),
				this.options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#show(java.lang.CharSequence)
	 */
	public IJQFunction show(CharSequence selector) {
		return $f($(this.component).chain("show", selector));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#show(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget, CharSequence selector) {
		chain(ajaxRequestTarget, this.show(selector));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#hide(java.lang.CharSequence)
	 */
	public IJQFunction hide(CharSequence selector) {
		return $f($(this.component).chain("hide", selector));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#hide(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence)
	 */
	public void hide(AjaxRequestTarget ajaxRequestTarget, CharSequence selector) {
		chain(ajaxRequestTarget, this.hide(selector));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#showAll()
	 */
	public IJQFunction showAll() {
		return $f($(this.component).chain("showAll"));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.watermark.IWatermark#showAll(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void showAll(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.showAll());
	}

}
