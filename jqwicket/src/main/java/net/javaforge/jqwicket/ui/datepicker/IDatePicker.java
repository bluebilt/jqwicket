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

import net.javaforge.jqwicket.IJQUIWidget;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.XYPosition;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public interface IDatePicker extends IJQUIWidget<DatePickerOptions> {

	static final CharSequence JQ_COMPONENT_NAME = "datepicker";

	/**
	 * Open a datepicker in a "dialog" box.
	 */
	JQFunction dialog(CharSequence date, JQFunction onSelect,
			DatePickerOptions options, XYPosition position);

	/**
	 * Open a datepicker in a "dialog" box.
	 * 
	 * @param ajaxRequestTarget
	 */
	void dialog(AjaxRequestTarget ajaxRequestTarget, CharSequence date,
			JQFunction onSelect, DatePickerOptions options, XYPosition position);

	/**
	 * Close a previously opened date picker.
	 */
	JQFunction hide();

	/**
	 * Close a previously opened date picker.
	 * 
	 * @param ajaxRequestTarget
	 */
	void hide(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Call up a previously attached date picker.
	 */
	JQFunction show();

	/**
	 * Call up a previously attached date picker.
	 * 
	 * @param ajaxRequestTarget
	 */
	void show(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Redraw a date picker, after having made some external modifications.
	 */
	JQFunction refresh();

	/**
	 * Redraw a date picker, after having made some external modifications.
	 * 
	 * @param ajaxRequestTarget
	 */
	void refresh(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Sets the current date for the datepicker.
	 */
	JQFunction setDate(CharSequence date);

	/**
	 * Sets the current date for the datepicker.
	 * 
	 * @param ajaxRequestTarget
	 */
	void setDate(AjaxRequestTarget ajaxRequestTarget, CharSequence date);

	/**
	 * Sets the current date for the datepicker.
	 */
	JQFunction setDate(int date);

	/**
	 * Sets the current date for the datepicker.
	 * 
	 * @param ajaxRequestTarget
	 */
	void setDate(AjaxRequestTarget ajaxRequestTarget, int date);
}
