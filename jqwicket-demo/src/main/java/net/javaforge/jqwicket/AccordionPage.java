package net.javaforge.jqwicket;

import static net.javaforge.jqwicket.JQuery.$;
import net.javaforge.jqwicket.effect.Effect;
import net.javaforge.jqwicket.ui.accordion.AccordionBehavior;
import net.javaforge.jqwicket.ui.accordion.AccordionWebMarkupContainer;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class AccordionPage extends WebPage {

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
		x.add(JQBehaviors.js($(x).effect(Effect.PULSATE)));
		add(x);

	}

}
