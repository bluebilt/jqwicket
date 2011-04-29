package com.google.code.jqwicket;

import com.google.code.jqwicket.JQBehaviors;
import com.google.code.jqwicket.ui.tabs.TabsWebMarkupContainer;

public class TabsPage extends BaseJQueryUIPage {

	public TabsPage() {
		add(new TabsWebMarkupContainer("tabs").add(JQBehaviors.draggable()));
	}

}
