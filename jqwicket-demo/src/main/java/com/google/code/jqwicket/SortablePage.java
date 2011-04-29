package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.JQBehaviors;

public class SortablePage extends BaseJQueryUIPage {

	public SortablePage() {
		add(new WebMarkupContainer("sortable").add(JQBehaviors.sortable()));
	}

}
