package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.datepicker.DatePickerBehavior;
import net.javaforge.jqwicket.ui.datepicker.DatePickerTextField;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class DatePickerPage extends WebPage {

	public DatePickerPage() {

		add(new DatePickerTextField<String>("datepicker"));
		add(new WebMarkupContainer("datepicker.inline").add(
				new DatePickerBehavior()).add(JQBehaviors.draggable()));

	}
}
