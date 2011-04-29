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


import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.IModel;

import com.google.code.jqwicket.JQFunction;

/**
 * @author mkalina
 * 
 */
public class WatermarkRequiredTextField<T> extends RequiredTextField<T> {

	private static final long serialVersionUID = 1L;

	private WatermarkBehavior behavior;

	public WatermarkRequiredTextField(String id, CharSequence watermark) {
		super(id);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	public WatermarkRequiredTextField(String id, CharSequence watermark,
			Class<T> type) {
		super(id, type);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	public WatermarkRequiredTextField(String id, CharSequence watermark,
			IModel<T> model) {
		super(id, model);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	public WatermarkRequiredTextField(String id, CharSequence watermark,
			IModel<T> model, Class<T> type) {
		super(id, model, type);
		add(this.behavior = new WatermarkBehavior(watermark));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return this.behavior.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getOptions()
	 */
	public WatermarkOptions getOptions() {
		return this.behavior.getOptions();
	}

	public JQFunction show() {
		return this.behavior.show(this.getMarkupId());
	}

	public void show(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.show(ajaxRequestTarget, this.getMarkupId());
	}

	public JQFunction hide() {
		return this.behavior.hide(this.getMarkupId());
	}

	public void hide(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.hide(ajaxRequestTarget, this.getMarkupId());
	}

}
