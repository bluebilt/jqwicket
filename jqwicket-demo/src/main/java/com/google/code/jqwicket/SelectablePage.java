package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.JQBehaviors;

public class SelectablePage extends BaseJQueryUIPage {

	public SelectablePage() {
		add(new WebMarkupContainer("selectable").add(JQBehaviors.selectable()));
	}

}
