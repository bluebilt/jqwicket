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

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.effect.Effect;
import net.javaforge.jqwicket.effect.EffectSpeed;
import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.IJQOptions;

/**
 * @author mkalina
 *
 */
public class DatePickerOptions extends AbstractJQOptions<DatePickerOptions> {

	private static final long serialVersionUID = 1L;

	/**
	 * Disables (true) or enables (false) the datepicker. Can be set when
	 * initialising (first creating) the datepicker. Default:false
	 * 
	 * @param disabled
	 * @return
	 */
	public DatePickerOptions disabled(boolean disabled) {
		super.put("disabled", disabled);
		return this;
	}

	/**
	 * The jQuery selector for another field that is to be updated with the
	 * selected date from the datepicker. Use the altFormat setting to change
	 * the format of the date within this field. Leave as blank for no alternate
	 * field. Default:''
	 * 
	 * @param selector
	 * @return
	 */
	public DatePickerOptions altField(CharSequence selector) {
		super.put("altField", selector);
		return this;
	}

	/**
	 * The dateFormat to be used for the altField option. This allows one date
	 * format to be shown to the user for selection purposes, while a different
	 * format is actually sent behind the scenes. For a full list of the
	 * possible formats see the formatDate function. Default:''
	 * 
	 * @param altFormat
	 * @return
	 */
	public DatePickerOptions altFormat(CharSequence altFormat) {
		super.put("altFormat", altFormat);
		return this;
	}

	/**
	 * The text to display after each date field, e.g. to show the required
	 * format. Default:''
	 * 
	 * @param autoSize
	 * @return
	 */
	public DatePickerOptions appendText(CharSequence appendText) {
		super.put("appendText", appendText);
		return this;
	}

	/**
	 * Set to true to automatically resize the input field to accomodate dates
	 * in the current dateFormat. Default:false
	 * 
	 * @param autoSize
	 * @return
	 */
	public DatePickerOptions autoSize(boolean autoSize) {
		super.put("autoSize", autoSize);
		return this;
	}

	/**
	 * The URL for the popup button image. If set, buttonText becomes the alt
	 * value and is not directly displayed. Default:''
	 * 
	 * @param buttonImage
	 * @return
	 */
	public DatePickerOptions buttonImage(CharSequence buttonImage) {
		super.put("buttonImage", buttonImage);
		return this;
	}

	/**
	 * Set to true to place an image after the field to use as the trigger
	 * without it appearing on a button. Default:false
	 * 
	 * @param buttonImageOnly
	 * @return
	 */
	public DatePickerOptions buttonImageOnly(boolean buttonImageOnly) {
		super.put("buttonImageOnly", buttonImageOnly);
		return this;
	}

	/**
	 * The text to display on the trigger button. Use in conjunction with showOn
	 * equal to 'button' or 'both'. Default:'...'
	 * 
	 * @param buttonText
	 * @return
	 */
	public DatePickerOptions buttonText(CharSequence buttonText) {
		super.put("buttonText", buttonText);
		return this;
	}

	/**
	 * function to calculate the week of the year for a given date. The default
	 * implementation uses the ISO 8601 definition: weeks start on a Monday; the
	 * first week of the year contains the first Thursday of the year.
	 * Default:$.datepicker.iso8601Week
	 * 
	 * @param function
	 * @return
	 */
	public DatePickerOptions calculateWeek(JQFunction function) {
		super.put("calculateWeek", function);
		return this;
	}

	/**
	 * function to calculate the week of the year for a given date. The default
	 * implementation uses the ISO 8601 definition: weeks start on a Monday; the
	 * first week of the year contains the first Thursday of the year.
	 * Default:$.datepicker.iso8601Week
	 * 
	 * @param js
	 * @param args
	 * @return
	 */
	public DatePickerOptions calculateWeek(CharSequence js,
			CharSequence... args) {
		super.put("calculateWeek", $f(js, args));
		return this;
	}

	/**
	 * 
	 * Allows you to change the month by selecting from a drop-down list. You
	 * can enable this feature by setting the attribute to true. Default:false
	 * 
	 * @param changeMonth
	 * @return
	 */
	public DatePickerOptions changeMonth(boolean changeMonth) {
		super.put("changeMonth", changeMonth);
		return this;
	}

	/**
	 * Allows you to change the year by selecting from a drop-down list. You can
	 * enable this feature by setting the attribute to true. Use the yearRange
	 * option to control which years are made available for selection.
	 * Default:false
	 * 
	 * @param changeYear
	 * @return
	 */
	public DatePickerOptions changeYear(boolean changeYear) {
		super.put("changeYear", changeYear);
		return this;
	}

	/**
	 * The text to display for the close link. This attribute is one of the
	 * regionalisation attributes. Use the showButtonPanel to display this
	 * button. Default:'Done'
	 * 
	 * @param closeText
	 * @return
	 */
	public DatePickerOptions closeText(CharSequence closeText) {
		super.put("closeText", closeText);
		return this;
	}

	/**
	 * When true entry in the input field is constrained to those characters
	 * allowed by the current dateFormat. Default:true
	 * 
	 * @param constrainInput
	 * @return
	 */
	public DatePickerOptions constrainInput(boolean constrainInput) {
		super.put("constrainInput", constrainInput);
		return this;
	}

	/**
	 * The text to display for the current day link. This attribute is one of
	 * the regionalisation attributes. Use the showButtonPanel to display this
	 * button. Default:'Today'
	 * 
	 * @param currentText
	 * @return
	 */
	public DatePickerOptions currentText(CharSequence currentText) {
		super.put("currentText", currentText);
		return this;
	}

	/**
	 * The format for parsed and displayed dates. This attribute is one of the
	 * regionalisation attributes. For a full list of the possible formats see
	 * the formatDate function. Default:'mm/dd/yy'
	 * 
	 * @param dateFormat
	 * @return
	 */
	public DatePickerOptions dateFormat(CharSequence dateFormat) {
		super.put("dateFormat", dateFormat);
		return this;
	}

	/**
	 * The list of long day names, starting from Sunday, for use as requested
	 * via the dateFormat setting. They also appear as popup hints when hovering
	 * over the corresponding column headings. This attribute is one of the
	 * regionalisation attributes.<br>
	 * Default:['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday',
	 * 'Friday', 'Saturday']
	 * 
	 * @param dayNames
	 * @return
	 */
	public DatePickerOptions dayNames(CharSequence... dayNames) {
		super.put("dayNames", dayNames);
		return this;
	}

	/**
	 * The list of minimised day names, starting from Sunday, for use as column
	 * headers within the datepicker. This attribute is one of the
	 * regionalisation attributes.<br>
	 * Default:['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa']
	 * 
	 * @param dayNamesMin
	 * @return
	 */
	public DatePickerOptions dayNamesMin(CharSequence... dayNamesMin) {
		super.put("dayNamesMin", dayNamesMin);
		return this;
	}

	/**
	 * The list of abbreviated day names, starting from Sunday, for use as
	 * requested via the dateFormat setting. This attribute is one of the
	 * regionalisation attributes. <br>
	 * Default:['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
	 * 
	 * @param dayNamesMin
	 * @return
	 */
	public DatePickerOptions dayNamesShort(CharSequence... dayNamesShort) {
		super.put("dayNamesShort", dayNamesShort);
		return this;
	}

	/**
	 * Set the date to highlight on first opening if the field is blank. Specify
	 * either an actual date via a Date object or as a string in the current
	 * dateFormat, or a number of days from today (e.g. +7) or a string of
	 * values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for
	 * days, e.g. '+1m +7d'), or null for today. Default:null
	 * 
	 * @param defaultDate
	 * @return
	 */
	public DatePickerOptions defaultDate(CharSequence defaultDate) {
		super.put("defaultDate", defaultDate);
		return this;
	}

	/**
	 * Set the date to highlight on first opening if the field is blank. Specify
	 * either an actual date via a Date object or as a string in the current
	 * dateFormat, or a number of days from today (e.g. +7) or a string of
	 * values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for
	 * days, e.g. '+1m +7d'), or null for today. Default:null
	 * 
	 * @param defaultDate
	 * @return
	 */
	public DatePickerOptions defaultDate(int defaultDate) {
		super.put("defaultDate", defaultDate);
		return this;
	}

	/**
	 * Control the speed at which the datepicker appears, it may be a time in
	 * milliseconds or a string representing one of the three predefined speeds
	 * ("slow", "normal", "fast"). Default:'normal'
	 * 
	 * @param duration
	 * @return
	 */
	public DatePickerOptions duration(EffectSpeed duration) {
		super.put("duration", duration);
		return this;
	}

	/**
	 * Control the speed at which the datepicker appears, it may be a time in
	 * milliseconds or a string representing one of the three predefined speeds
	 * ("slow", "normal", "fast"). Default:'normal'
	 * 
	 * @param duration
	 * @return
	 */
	public DatePickerOptions duration(int duration) {
		super.put("duration", duration);
		return this;
	}

	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, ... This
	 * attribute is one of the regionalisation attributes. Default:0
	 * 
	 * @param firstDay
	 * @return
	 */
	public DatePickerOptions firstDay(int firstDay) {
		super.put("firstDay", firstDay);
		return this;
	}

	/**
	 * When true the current day link moves to the currently selected date
	 * instead of today. Default:false
	 * 
	 * @param gotoCurrent
	 * @return
	 */
	public DatePickerOptions gotoCurrent(boolean gotoCurrent) {
		super.put("gotoCurrent", gotoCurrent);
		return this;
	}

	/**
	 * Normally the previous and next links are disabled when not applicable
	 * (see minDate/maxDate). You can hide them altogether by setting this
	 * attribute to true. Default:false
	 * 
	 * @param hideIfNoPrevNext
	 * @return
	 */
	public DatePickerOptions hideIfNoPrevNext(boolean hideIfNoPrevNext) {
		super.put("hideIfNoPrevNext", hideIfNoPrevNext);
		return this;
	}

	/**
	 * True if the current language is drawn from right to left. This attribute
	 * is one of the regionalisation attributes. Default:false
	 * 
	 * @param isRTL
	 * @return
	 */
	public DatePickerOptions isRTL(boolean isRTL) {
		super.put("isRTL", isRTL);
		return this;
	}

	/**
	 * Set a maximum selectable date via a Date object or as a string in the
	 * current dateFormat, or a number of days from today (e.g. +7) or a string
	 * of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd'
	 * for days, e.g. '+1m +1w'), or null for no limit. Default:null
	 * 
	 * @param maxDate
	 * @return
	 */
	public DatePickerOptions maxDate(CharSequence maxDate) {
		super.put("maxDate", maxDate);
		return this;
	}

	/**
	 * Set a maximum selectable date via a Date object or as a string in the
	 * current dateFormat, or a number of days from today (e.g. +7) or a string
	 * of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd'
	 * for days, e.g. '+1m +1w'), or null for no limit. Default:null
	 * 
	 * @param maxDate
	 * @return
	 */
	public DatePickerOptions maxDate(int maxDate) {
		super.put("maxDate", maxDate);
		return this;
	}

	/**
	 * Set a minimum selectable date via a Date object or as a string in the
	 * current dateFormat, or a number of days from today (e.g. +7) or a string
	 * of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd'
	 * for days, e.g. '-1y -1m'), or null for no limit. Default:null
	 * 
	 * @param minDate
	 * @return
	 */
	public DatePickerOptions minDate(CharSequence minDate) {
		super.put("minDate", minDate);
		return this;
	}

	/**
	 * Set a minimum selectable date via a Date object or as a string in the
	 * current dateFormat, or a number of days from today (e.g. +7) or a string
	 * of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd'
	 * for days, e.g. '-1y -1m'), or null for no limit. Default:null
	 * 
	 * @param minDate
	 * @return
	 */
	public DatePickerOptions minDate(int minDate) {
		super.put("minDate", minDate);
		return this;
	}

	/**
	 * The list of full month names, for use as requested via the dateFormat
	 * setting. This attribute is one of the regionalisation attributes. <br>
	 * Default:['January', 'February', 'March', 'April', 'May', 'June', 'July',
	 * 'August', 'September', 'October', 'November', 'December']
	 * 
	 * @param monthNames
	 * @return
	 */
	public DatePickerOptions monthNames(CharSequence... monthNames) {
		super.put("monthNames", monthNames);
		return this;
	}

	/**
	 * The list of abbreviated month names, as used in the month header on each
	 * datepicker and as requested via the dateFormat setting. This attribute is
	 * one of the regionalisation attributes. <br>
	 * Default:['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep',
	 * 'Oct', 'Nov', 'Dec']
	 * 
	 * @param monthNamesShort
	 * @return
	 */
	public DatePickerOptions monthNamesShort(CharSequence... monthNamesShort) {
		super.put("monthNamesShort", monthNamesShort);
		return this;
	}

	/**
	 * When true the formatDate function is applied to the prevText, nextText,
	 * and currentText values before display, allowing them to display the
	 * target month names for example. Default:false
	 * 
	 * @param navigationAsDateFormat
	 * @return
	 */
	public DatePickerOptions navigationAsDateFormat(
			boolean navigationAsDateFormat) {
		super.put("navigationAsDateFormat", navigationAsDateFormat);
		return this;
	}

	/**
	 * The text to display for the next month link. This attribute is one of the
	 * regionalisation attributes. With the standard ThemeRoller styling, this
	 * value is replaced by an icon. Default:'Next'
	 * 
	 * @param nextText
	 * @return
	 */
	public DatePickerOptions nextText(CharSequence nextText) {
		super.put("nextText", nextText);
		return this;
	}

	/**
	 * Set how many months to show at once. The value can be a straight integer,
	 * or can be a two-element array to define the number of rows and columns to
	 * display. Default:1
	 * 
	 * @param numberOfMonths
	 * @return
	 */
	public DatePickerOptions numberOfMonths(int numberOfMonths) {
		super.put("numberOfMonths", numberOfMonths);
		return this;
	}

	/**
	 * Set how many months to show at once. The value can be a straight integer,
	 * or can be a two-element array to define the number of rows and columns to
	 * display. Default:1
	 * 
	 * @param numberOfMonthRows
	 * @param numberOfMonthColumns
	 * @return
	 */
	public DatePickerOptions numberOfMonths(int numberOfMonthRows,
			int numberOfMonthColumns) {
		super.put("numberOfMonths", new int[] { numberOfMonthRows,
				numberOfMonthColumns });
		return this;
	}

	/**
	 * The text to display for the previous month link. This attribute is one of
	 * the regionalisation attributes. With the standard ThemeRoller styling,
	 * this value is replaced by an icon. Default:'Prev'
	 * 
	 * @param prevText
	 * @return
	 */
	public DatePickerOptions prevText(CharSequence prevText) {
		super.put("prevText", prevText);
		return this;
	}

	/**
	 * When true days in other months shown before or after the current month
	 * are selectable. This only applies if showOtherMonths is also true.
	 * Default:false
	 * 
	 * @param selectOtherMonths
	 * @return
	 */
	public DatePickerOptions selectOtherMonths(boolean selectOtherMonths) {
		super.put("selectOtherMonths", selectOtherMonths);
		return this;
	}

	/**
	 * Set the cutoff year for determining the century for a date (used in
	 * conjunction with dateFormat 'y'). If a numeric value (0-99) is provided
	 * then this value is used directly. If a string value is provided then it
	 * is converted to a number and added to the current year. Once the cutoff
	 * year is calculated, any dates entered with a year value less than or
	 * equal to it are considered to be in the current century, while those
	 * greater than it are deemed to be in the previous century. Default:'+10'
	 * 
	 * @param shortYearCutoff
	 * @return
	 */
	public DatePickerOptions shortYearCutoff(CharSequence shortYearCutoff) {
		super.put("shortYearCutoff", shortYearCutoff);
		return this;
	}

	/**
	 * Set the cutoff year for determining the century for a date (used in
	 * conjunction with dateFormat 'y'). If a numeric value (0-99) is provided
	 * then this value is used directly. If a string value is provided then it
	 * is converted to a number and added to the current year. Once the cutoff
	 * year is calculated, any dates entered with a year value less than or
	 * equal to it are considered to be in the current century, while those
	 * greater than it are deemed to be in the previous century. Default:'+10'
	 * 
	 * @param shortYearCutoff
	 * @return
	 */
	public DatePickerOptions shortYearCutoff(int shortYearCutoff) {
		super.put("shortYearCutoff", shortYearCutoff);
		return this;
	}

	/**
	 * Set the name of the animation used to show/hide the datepicker. Use
	 * 'show' (the default), 'slideDown', 'fadeIn', any of the show/hide jQuery
	 * UI effects, or '' for no animation.Default:'show'
	 * 
	 * @param showAnim
	 * @return
	 */
	public DatePickerOptions showAnim(CharSequence showAnim) {
		super.put("showAnim", showAnim);
		return this;
	}

	/**
	 * Set the name of the animation used to show/hide the datepicker. Use
	 * 'show' (the default), 'slideDown', 'fadeIn', any of the show/hide jQuery
	 * UI effects, or '' for no animation. Default:'show'
	 * 
	 * @param showAnim
	 * @return
	 */
	public DatePickerOptions showAnim(Effect effect) {
		super.put("showAnim", effect);
		return this;
	}

	/**
	 * Whether to show the button panel. Default:false
	 * 
	 * @param showButtonPanel
	 * @return
	 */
	public DatePickerOptions showButtonPanel(boolean showButtonPanel) {
		super.put("showButtonPanel", showButtonPanel);
		return this;
	}

	/**
	 * Specify where in a multi-month display the current month shows, starting
	 * from 0 at the top/left. Default:0
	 * 
	 * @param showCurrentAtPos
	 * @return
	 */
	public DatePickerOptions showCurrentAtPos(int showCurrentAtPos) {
		super.put("showCurrentAtPos", showCurrentAtPos);
		return this;
	}

	/**
	 * Whether to show the month after the year in the header. This attribute is
	 * one of the regionalisation attributes. Default:false
	 * 
	 * @param showMonthAfterYear
	 * @return
	 */
	public DatePickerOptions showMonthAfterYear(boolean showMonthAfterYear) {
		super.put("showMonthAfterYear", showMonthAfterYear);
		return this;
	}

	/**
	 * Have the datepicker appear automatically when the field receives focus
	 * ('focus'), appear only when a button is clicked ('button'), or appear
	 * when either event takes place ('both'). Default:'focus'
	 * 
	 * @param showOn
	 * @return
	 */
	public DatePickerOptions showOn(CharSequence showOn) {
		super.put("showOn", showOn);
		return this;
	}

	/**
	 * If using one of the jQuery UI effects for showAnim, you can provide
	 * additional settings for that animation via this option. Default:{}
	 * 
	 * @param showOptions
	 * @return
	 */
	public DatePickerOptions showOptions(IJQOptions<?> showOptions) {
		super.put("showOptions", showOptions);
		return this;
	}

	/**
	 * Display dates in other months (non-selectable) at the start or end of the
	 * current month. To make these days selectable use selectOtherMonths.
	 * Default:false
	 * 
	 * @param showOtherMonths
	 * @return
	 */
	public DatePickerOptions showOtherMonths(boolean showOtherMonths) {
		super.put("showOtherMonths", showOtherMonths);
		return this;
	}

	/**
	 * When true a column is added to show the week of the year. The
	 * calculateWeek option determines how the week of the year is calculated.
	 * You may also want to change the firstDay option. Default:false
	 * 
	 * @param showWeek
	 * @return
	 */
	public DatePickerOptions showWeek(boolean showWeek) {
		super.put("showWeek", showWeek);
		return this;
	}

	/**
	 * Set how many months to move when clicking the Previous/Next links.
	 * Default:1
	 * 
	 * @param stepMonths
	 * @return
	 */
	public DatePickerOptions stepMonths(int stepMonths) {
		super.put("stepMonths", stepMonths);
		return this;
	}

	/**
	 * The text to display for the week of the year column heading. This
	 * attribute is one of the regionalisation attributes. Use showWeek to
	 * display this column. Default:'Wk'
	 * 
	 * @param weekHeader
	 * @return
	 */
	public DatePickerOptions weekHeader(CharSequence weekHeader) {
		super.put("weekHeader", weekHeader);
		return this;
	}

	/**
	 * Control the range of years displayed in the year drop-down: either
	 * relative to today's year (-nn:+nn), relative to the currently selected
	 * year (c-nn:c+nn), absolute (nnnn:nnnn), or combinations of these formats
	 * (nnnn:-nn). Note that this option only affects what appears in the
	 * drop-down, to restrict which dates may be selected use the minDate and/or
	 * maxDate options. Default:'c-10:c+10'
	 * 
	 * @param yearRange
	 * @return
	 */
	public DatePickerOptions yearRange(CharSequence yearRange) {
		super.put("yearRange", yearRange);
		return this;
	}

	/**
	 * Additional text to display after the year in the month headers. This
	 * attribute is one of the regionalisation attributes. Default:''
	 * 
	 * @param yearSuffix
	 * @return
	 */
	public DatePickerOptions yearSuffix(CharSequence yearSuffix) {
		super.put("yearSuffix", yearSuffix);
		return this;
	}

	/**
	 * Can be a function that takes an input field and current datepicker
	 * instance and returns an options object to update the datepicker with. It
	 * is called just before the datepicker is displayed.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions beforeShowEvent(CharSequence callbackBody) {
		return this.beforeShowEvent(js(callbackBody));
	}

	/**
	 * Can be a function that takes an input field and current datepicker
	 * instance and returns an options object to update the datepicker with. It
	 * is called just before the datepicker is displayed.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions beforeShowEvent(JQStatement callbackBody) {
		return this.beforeShowEvent($f(callbackBody, "input", "inst"));
	}

	/**
	 * Can be a function that takes an input field and current datepicker
	 * instance and returns an options object to update the datepicker with. It
	 * is called just before the datepicker is displayed.
	 * 
	 * @param callback
	 * @return
	 */
	public DatePickerOptions beforeShowEvent(JQFunction callback) {
		super.put("beforeShow", callback);
		return this;
	}

	/**
	 * The function takes a date as a parameter and must return an array with
	 * [0] equal to true/false indicating whether or not this date is
	 * selectable, [1] equal to a CSS class name(s) or '' for the default
	 * presentation, and [2] an optional popup tooltip for this date. It is
	 * called for each day in the datepicker before it is displayed.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions beforeShowDayEvent(CharSequence callbackBody) {
		return this.beforeShowDayEvent(js(callbackBody));
	}

	/**
	 * The function takes a date as a parameter and must return an array with
	 * [0] equal to true/false indicating whether or not this date is
	 * selectable, [1] equal to a CSS class name(s) or '' for the default
	 * presentation, and [2] an optional popup tooltip for this date. It is
	 * called for each day in the datepicker before it is displayed.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions beforeShowDayEvent(JQStatement callbackBody) {
		return this.beforeShowDayEvent($f(callbackBody, "date"));
	}

	/**
	 * The function takes a date as a parameter and must return an array with
	 * [0] equal to true/false indicating whether or not this date is
	 * selectable, [1] equal to a CSS class name(s) or '' for the default
	 * presentation, and [2] an optional popup tooltip for this date. It is
	 * called for each day in the datepicker before it is displayed.
	 * 
	 * @param callback
	 * @return
	 */
	public DatePickerOptions beforeShowDayEvent(JQFunction callback) {
		super.put("beforeShowDay", callback);
		return this;
	}

	/**
	 * Allows you to define your own event when the datepicker moves to a new
	 * month and/or year. The function receives the selected year, month (1-12),
	 * and the datepicker instance as parameters. this refers to the associated
	 * input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onChangeMonthYearEvent(CharSequence callbackBody) {
		return this.onChangeMonthYearEvent(js(callbackBody));
	}

	/**
	 * Allows you to define your own event when the datepicker moves to a new
	 * month and/or year. The function receives the selected year, month (1-12),
	 * and the datepicker instance as parameters. this refers to the associated
	 * input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onChangeMonthYearEvent(JQStatement callbackBody) {
		return this.onChangeMonthYearEvent($f(callbackBody, "year", "month",
				"inst"));
	}

	/**
	 * Allows you to define your own event when the datepicker moves to a new
	 * month and/or year. The function receives the selected year, month (1-12),
	 * and the datepicker instance as parameters. this refers to the associated
	 * input field.
	 * 
	 * @param callback
	 * @return
	 */
	public DatePickerOptions onChangeMonthYearEvent(JQFunction callback) {
		super.put("onChangeMonthYear", callback);
		return this;
	}

	/**
	 * Allows you to define your own event when the datepicker is closed,
	 * whether or not a date is selected. The function receives the selected
	 * date as text ('' if none) and the datepicker instance as parameters. this
	 * refers to the associated input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onCloseEvent(CharSequence callbackBody) {
		return this.onCloseEvent(js(callbackBody));
	}

	/**
	 * Allows you to define your own event when the datepicker is closed,
	 * whether or not a date is selected. The function receives the selected
	 * date as text ('' if none) and the datepicker instance as parameters. this
	 * refers to the associated input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onCloseEvent(JQStatement callbackBody) {
		return this.onCloseEvent($f(callbackBody, "dateText", "inst"));
	}

	/**
	 * Allows you to define your own event when the datepicker is closed,
	 * whether or not a date is selected. The function receives the selected
	 * date as text ('' if none) and the datepicker instance as parameters. this
	 * refers to the associated input field.
	 * 
	 * @param callback
	 * @return
	 */
	public DatePickerOptions onCloseEvent(JQFunction callback) {
		super.put("onClose", callback);
		return this;
	}

	/**
	 * Allows you to define your own event when the datepicker is selected. The
	 * function receives the selected date as text and the datepicker instance
	 * as parameters. this refers to the associated input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onSelectEvent(CharSequence callbackBody) {
		return this.onSelectEvent(js(callbackBody));
	}

	/**
	 * Allows you to define your own event when the datepicker is selected. The
	 * function receives the selected date as text and the datepicker instance
	 * as parameters. this refers to the associated input field.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DatePickerOptions onSelectEvent(JQStatement callbackBody) {
		return this.onSelectEvent($f(callbackBody, "dateText", "inst"));
	}

	/**
	 * Allows you to define your own event when the datepicker is selected. The
	 * function receives the selected date as text and the datepicker instance
	 * as parameters. this refers to the associated input field.
	 * 
	 * @param callback
	 * @return
	 */
	public DatePickerOptions onSelectEvent(JQFunction callback) {
		super.put("onSelect", callback);
		return this;
	}
}
