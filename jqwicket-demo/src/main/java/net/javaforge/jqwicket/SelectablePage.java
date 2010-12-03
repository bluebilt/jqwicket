package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

public class SelectablePage extends BaseJQueryUIPage {

	public SelectablePage() {
		add(new WebMarkupContainer("selectable").add(JQBehaviors.selectable()));
	}

}
