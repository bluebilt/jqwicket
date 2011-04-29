package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.JQBehaviors;
import com.google.code.jqwicket.ui.datepicker.DatePickerBehavior;
import com.google.code.jqwicket.ui.datepicker.DatePickerTextField;

public class DatePickerPage extends BaseJQueryUIPage {

	public DatePickerPage() {

		add(new DatePickerTextField<String>("datepicker"));
		add(new WebMarkupContainer("datepicker.inline").add(
				new DatePickerBehavior()).add(JQBehaviors.draggable()));

	}
}
