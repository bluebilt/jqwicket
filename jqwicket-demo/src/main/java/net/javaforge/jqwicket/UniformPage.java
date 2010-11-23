package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.datepicker.DatePickerTextField;
import net.javaforge.jqwicket.ui.uniform.GenericUniformBehavior;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.CheckBox;

public class UniformPage extends WebPage {

	public UniformPage() {
		add(new GenericUniformBehavior("input, textarea, select, button"));
		add(new CheckBox("uniform.checkbox"));
		add(new DatePickerTextField<String>("dateOfBirth"));
	}

}
