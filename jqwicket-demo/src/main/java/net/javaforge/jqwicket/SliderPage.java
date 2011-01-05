package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.slider.SliderBehavior;
import net.javaforge.jqwicket.ui.slider.SliderOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;

public class SliderPage extends BaseJQueryUIPage {
	public SliderPage() {
		add(new WebMarkupContainer("slider").add(new SliderBehavior(
				new SliderOptions().min(10).max(100).value(20))));
	}
}
