package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.tabs.TabsWebMarkupContainer;

public class TabsPage extends BaseJQueryUIPage {

	public TabsPage() {
		add(new TabsWebMarkupContainer("tabs").add(JQBehaviors.draggable()));
	}

}
