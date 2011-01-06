package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.datetimepicker.DateTimePickerBehavior;
import net.javaforge.jqwicket.ui.datetimepicker.DateTimePickerOptions;
import net.javaforge.jqwicket.ui.datetimepicker.DateTimePickerTextField;
import net.javaforge.jqwicket.ui.datetimepicker.TimePickerTextField;

import org.apache.wicket.markup.html.WebMarkupContainer;

public class DateTimePickerPage extends BaseJQueryUIPage {

	public DateTimePickerPage() {

		add(new DateTimePickerTextField<String>("datetimepicker"));
		add(new TimePickerTextField<String>("timepicker",
				new DateTimePickerOptions().hourGrid(3)));

		add(new WebMarkupContainer("datetimepicker.inline")
				.add(new DateTimePickerBehavior()));

	}
}
