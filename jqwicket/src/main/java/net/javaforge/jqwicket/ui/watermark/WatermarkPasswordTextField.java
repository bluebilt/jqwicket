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
package net.javaforge.jqwicket.ui.watermark;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQHeaderContributionTarget;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 * 
 */
public class WatermarkPasswordTextField extends PasswordTextField implements
		IWatermark {

	private static final long serialVersionUID = 1L;

	private WatermarkBehavior behavior;

	public WatermarkPasswordTextField(String id, CharSequence watermark) {
		super(id);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	public WatermarkPasswordTextField(String id, CharSequence watermark,
			IModel<String> model) {
		super(id, model);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return this.behavior.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getOptions()
	 */
	public WatermarkOptions getOptions() {
		return this.behavior.getOptions();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQHeaderContributor#contribute(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	public void contribute(JQHeaderContributionTarget target) {
		// do nothing here because the underlying behavior already contributes
		// necessary scripts to the jquery target.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#show(java.lang.CharSequence)
	 */
	public JQFunction show(CharSequence selector) {
		return this.behavior.show(selector);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#show(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget, CharSequence selector) {
		this.behavior.show(ajaxRequestTarget, selector);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#hide(java.lang.CharSequence)
	 */
	public JQFunction hide(CharSequence selector) {
		return this.behavior.hide(selector);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#hide(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence)
	 */
	public void hide(AjaxRequestTarget ajaxRequestTarget, CharSequence selector) {
		this.behavior.hide(ajaxRequestTarget, selector);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#showAll()
	 */
	public JQFunction showAll() {
		return this.behavior.showAll();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.watermark.IWatermark#showAll(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void showAll(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.showAll(ajaxRequestTarget);
	}

}
