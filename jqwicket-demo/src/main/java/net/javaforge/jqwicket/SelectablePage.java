package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class SelectablePage extends WebPage {

	public SelectablePage() {

		add(new WebMarkupContainer("selectable").add(JQBehaviors
				.selectable()));

	}

}
