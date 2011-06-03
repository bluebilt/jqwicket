package com.google.code.jqwicket;

import static com.google.code.jqwicket.api.JQuery.$;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

import com.google.code.jqwicket.JQBehaviors;
import com.google.code.jqwicket.ui.accordion.AccordionBehavior;
import com.google.code.jqwicket.ui.accordion.AccordionWebMarkupContainer;

public class AccordionPage extends BaseJQueryUIPage {

	public AccordionPage() {

		AccordionWebMarkupContainer a1 = new AccordionWebMarkupContainer(
				"accordion-component");
		Label label = new Label("accordion.label", "Hello WORLD!");
		label.add(JQBehaviors.js($(label).css("color", "red")));
		label.add(JQBehaviors.draggable());
		a1.add(label);
		a1.add(JQBehaviors.resizable());

		add(a1);

		add(new WebMarkupContainer("accordion-behavior")
				.add(new AccordionBehavior()));

		Label x = new Label("effect-label", "TESTS ET ET ST SET SETSE SET ");
		x.add(JQBehaviors.js($(x).effect("pulsate")));
		add(x);

	}

}
