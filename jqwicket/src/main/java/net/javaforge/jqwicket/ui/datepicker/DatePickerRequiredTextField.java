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
package net.javaforge.jqwicket.ui.datepicker;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.ui.IJQOptions;
import net.javaforge.jqwicket.ui.XYPosition;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 * 
 * @param <T>
 *            the model object's type
 */
public class DatePickerRequiredTextField<T> extends RequiredTextField<T>
		implements IDatePicker {

	private static final long serialVersionUID = 1L;

	private DatePickerBehavior behavior;

	public DatePickerRequiredTextField(String id) {
		this(id, new DatePickerOptions());
	}

	public DatePickerRequiredTextField(String id, DatePickerOptions options) {
		super(id);
		this.add(this.behavior = new DatePickerBehavior(options));
	}

	public DatePickerRequiredTextField(String id, Class<T> type) {
		this(id, type, new DatePickerOptions());
	}

	public DatePickerRequiredTextField(String id, Class<T> type,
			DatePickerOptions options) {
		super(id, type);
		this.add(this.behavior = new DatePickerBehavior(options));
	}

	public DatePickerRequiredTextField(String id, IModel<T> model) {
		this(id, model, new DatePickerOptions());
	}

	public DatePickerRequiredTextField(String id, IModel<T> model,
			DatePickerOptions options) {
		super(id, model);
		this.add(this.behavior = new DatePickerBehavior(options));
	}

	public DatePickerRequiredTextField(String id, IModel<T> model, Class<T> type) {
		this(id, model, type, new DatePickerOptions());
	}

	public DatePickerRequiredTextField(String id, IModel<T> model,
			Class<T> type, DatePickerOptions options) {
		super(id, model, type);
		this.add(this.behavior = new DatePickerBehavior(options));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy()
	 */
	public JQFunction destroy() {
		return behavior.destroy();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void destroy(AjaxRequestTarget ajaxRequestTarget) {
		behavior.destroy(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable()
	 */
	public JQFunction disable() {
		return behavior.disable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void disable(AjaxRequestTarget ajaxRequestTarget) {
		behavior.disable(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable()
	 */
	public JQFunction enable() {
		return behavior.enable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void enable(AjaxRequestTarget ajaxRequestTarget) {
		behavior.enable(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public JQFunction option(CharSequence optionName, CharSequence optionValue) {
		return behavior.option(optionName, optionValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, java.lang.CharSequence)
	 */
	public void option(AjaxRequestTarget ajaxRequestTarget,
			CharSequence optionName, CharSequence optionValue) {
		behavior.option(ajaxRequestTarget, optionName, optionValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#dialog(java.lang.CharSequence,
	 *      net.javaforge.jqwicket.JQFunction,
	 *      net.javaforge.jqwicket.ui.datepicker.DatePickerOptions,
	 *      net.javaforge.jqwicket.ui.XYPosition)
	 */
	public JQFunction dialog(CharSequence date, JQFunction onSelect,
			DatePickerOptions options, XYPosition position) {
		return behavior.dialog(date, onSelect, options, position);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#dialog(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, net.javaforge.jqwicket.JQFunction,
	 *      net.javaforge.jqwicket.ui.datepicker.DatePickerOptions,
	 *      net.javaforge.jqwicket.ui.XYPosition)
	 */
	public void dialog(AjaxRequestTarget ajaxRequestTarget, CharSequence date,
			JQFunction onSelect, DatePickerOptions options, XYPosition position) {
		behavior.dialog(ajaxRequestTarget, date, onSelect, options, position);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#hide()
	 */
	public JQFunction hide() {
		return behavior.hide();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#hide(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void hide(AjaxRequestTarget ajaxRequestTarget) {
		behavior.hide(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#show()
	 */
	public JQFunction show() {
		return behavior.show();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#show(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget) {
		behavior.show(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#refresh()
	 */
	public JQFunction refresh() {
		return behavior.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		behavior.refresh(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(java.lang.CharSequence)
	 */
	public JQFunction setDate(CharSequence date) {
		return behavior.setDate(date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence)
	 */
	public void setDate(AjaxRequestTarget ajaxRequestTarget, CharSequence date) {
		behavior.setDate(ajaxRequestTarget, date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(int)
	 */
	public JQFunction setDate(int date) {
		return behavior.setDate(date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void setDate(AjaxRequestTarget ajaxRequestTarget, int date) {
		behavior.setDate(ajaxRequestTarget, date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public CharSequence getName() {
		return this.behavior.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getOptions()
	 */
	public DatePickerOptions getOptions() {
		return this.behavior.getOptions();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction options(IJQOptions<?> options) {
		return this.behavior.options(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void options(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		this.behavior.options(ajaxRequestTarget, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget()
	 */
	public JQFunction widget() {
		return this.behavior.widget();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void widget(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.widget(ajaxRequestTarget);
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
}
