package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.kwicks.KwicksBehavior;
import com.google.code.jqwicket.ui.kwicks.KwicksOptions;

public class KwicksPage extends WebPage {

	public KwicksPage() {
		add(new WebMarkupContainer("kwicks").add(new KwicksBehavior(
				new KwicksOptions().max(205).spacing(5))));
	}
}
