package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.JQBehaviors;

public class ResizablePage extends BaseJQueryUIPage {

	public ResizablePage() {
		add(new WebMarkupContainer("resizable").add(JQBehaviors.resizable()));
	}

}
