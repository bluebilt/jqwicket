package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.colorpicker.ColorPickerTextField;

public class ColorPickerPage extends WebPage {

	public ColorPickerPage() {
		add(new ColorPickerTextField<String>("colorpicker"));
	}
}
