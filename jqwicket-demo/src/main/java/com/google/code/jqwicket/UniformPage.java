package com.google.code.jqwicket;


import org.apache.wicket.markup.html.form.CheckBox;

import com.google.code.jqwicket.ui.datepicker.DatePickerTextField;
import com.google.code.jqwicket.ui.uniform.GenericUniformBehavior;

public class UniformPage extends BaseJQueryUIPage {

	public UniformPage() {
		add(new GenericUniformBehavior("input, textarea, select, button"));
		add(new CheckBox("uniform.checkbox"));
		add(new DatePickerTextField<String>("dateOfBirth"));
	}

}
