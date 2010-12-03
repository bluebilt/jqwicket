package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

public class SortablePage extends BaseJQueryUIPage {

	public SortablePage() {
		add(new WebMarkupContainer("sortable").add(JQBehaviors.sortable()));
	}

}
