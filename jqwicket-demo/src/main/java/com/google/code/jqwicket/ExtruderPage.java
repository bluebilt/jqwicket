package com.google.code.jqwicket;

import static com.google.code.jqwicket.JQuery.$;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.mb.extruder.ExtruderOptions;
import com.google.code.jqwicket.ui.mb.extruder.ExtruderWebMarkupContainer;
import com.google.code.jqwicket.ui.mb.extruder.ExtruderOptions.Position;

public class ExtruderPage extends WebPage {

	public ExtruderPage() {
		add(new ExtruderWebMarkupContainer("extruderTop", "extruder top"));

		add(new ExtruderWebMarkupContainer("extruderBottom",
				new ExtruderOptions("extruder bottom")
						.position(Position.BOTTOM).width(350)
						.extruderOpacity(1)));

		ExtruderWebMarkupContainer extruderLeft = null;
		extruderLeft = new ExtruderWebMarkupContainer("extruderLeft",
				new ExtruderOptions("Our network ",
						"_static/extruder/extruderLeft.html")
						.position(Position.LEFT)
						.width(300)
						.extruderOpacity(0.8f)
						.hidePanelsOnClose(false)
						.accordionPanels(false)
						.onExtContentLoadEvent(
								$(extruderLeft).chain("openPanel")));
		add(extruderLeft);

		add(new ExtruderWebMarkupContainer("extruderLeft1",
				new ExtruderOptions("What\\'s new in this part of world",
						"_static/extruder/extruderLeft1.html")
						.position(Position.LEFT).width(300)
						.extruderOpacity(0.8f)));

		add(new ExtruderWebMarkupContainer("extruderLeft2",
				new ExtruderOptions("content in place").position(Position.LEFT)
						.width(300).positionFixed(false).top(0)
						.extruderOpacity(0.8f)));

	}
}
