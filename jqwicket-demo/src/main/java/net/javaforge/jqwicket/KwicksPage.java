package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.kwicks.KwicksBehavior;
import net.javaforge.jqwicket.ui.kwicks.KwicksOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class KwicksPage extends WebPage {

	public KwicksPage() {
		add(new WebMarkupContainer("kwicks").add(new KwicksBehavior(
				new KwicksOptions().max(205).spacing(5))));
	}
}
