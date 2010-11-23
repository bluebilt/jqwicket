package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.colorpicker.ColorPickerTextField;

import org.apache.wicket.markup.html.WebPage;

public class ColorPickerPage extends WebPage {

	public ColorPickerPage() {
		add(new ColorPickerTextField<String>("colorpicker"));
	}
}
