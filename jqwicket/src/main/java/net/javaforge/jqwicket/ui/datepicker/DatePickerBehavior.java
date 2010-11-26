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

import java.util.ArrayList;
import java.util.List;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;
import net.javaforge.jqwicket.ui.XYPosition;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 *
 */
public class DatePickerBehavior extends JQUIComponentBehaivor<DatePickerOptions>
		implements IDatePicker {

	private static final long serialVersionUID = 1L;

	public DatePickerBehavior() {
		this(new DatePickerOptions());
	}

	public DatePickerBehavior(DatePickerOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#dialog(java.lang.String,
	 *      net.javaforge.jqwicket.JQFunction,
	 *      net.javaforge.jqwicket.ui.datepicker.DatePickerOptions,
	 *      net.javaforge.jqwicket.ui.XYPosition)
	 */
	public JQFunction dialog(String date, JQFunction onSelect,
			DatePickerOptions options, XYPosition position) {

		List<CharSequence> args = new ArrayList<CharSequence>();
		args.add("'dialog'");
		args.add(date);
		if (onSelect != null)
			args.add(onSelect.render());
		if (options != null)
			args.add(options.toJson());
		if (position != null)
			args.add(position.toJson());

		return chain(args.toArray(new CharSequence[args.size()]));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#dialog(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, net.javaforge.jqwicket.JQFunction,
	 *      net.javaforge.jqwicket.ui.datepicker.DatePickerOptions,
	 *      net.javaforge.jqwicket.ui.XYPosition)
	 */
	public void dialog(AjaxRequestTarget ajaxRequestTarget, String date,
			JQFunction onSelect, DatePickerOptions options, XYPosition position) {
		chain(ajaxRequestTarget, this.dialog(date, onSelect, options, position));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#hide()
	 */
	public JQFunction hide() {
		return chain("'hide'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#hide(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void hide(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.hide());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#show()
	 */
	public JQFunction show() {
		return chain("'hide'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#show(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void show(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.show());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#refresh()
	 */
	public JQFunction refresh() {
		return chain("'refresh'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.refresh());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(java.lang.String)
	 */
	public JQFunction setDate(String date) {
		return chain("'setDate'", date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void setDate(AjaxRequestTarget ajaxRequestTarget, String date) {
		chain(ajaxRequestTarget, this.setDate(date));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(int)
	 */
	public JQFunction setDate(int date) {
		return chain("'setDate'", String.valueOf(date));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.datepicker.IDatePicker#setDate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void setDate(AjaxRequestTarget ajaxRequestTarget, int date) {
		chain(ajaxRequestTarget, this.setDate(date));
	}

}
