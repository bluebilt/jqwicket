package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.tabs.TabsWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class TabsPage extends WebPage {

	public TabsPage() {
		add(new TabsWebMarkupContainer("tabs").add(JQBehaviors.draggable()));
	}
	
}
