package com.google.code.jqwicket;

import com.google.code.jqwicket.api.JQOptions;
import com.google.code.jqwicket.ui.tabs.TabsOptions;
import com.google.code.jqwicket.ui.tabs.TabsWebMarkupContainer;

public class TabsPage extends BaseJQueryUIPage {

	public TabsPage() {

		TabsOptions options = new TabsOptions().disabled(1).cookie(
				JQOptions.valueOf("expires: 7, path: '/'"));

		add(new TabsWebMarkupContainer("tabs", options).add(JQBehaviors
				.draggable()));
	}

}
