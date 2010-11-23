package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class SortablePage extends WebPage {

	public SortablePage() {

		add(new WebMarkupContainer("sortable").add(JQBehaviors.sortable()));

	}

}
