package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.JQBehaviors;

public class ResizablePage extends BaseJQueryUIPage {

	public ResizablePage() {
		add(new WebMarkupContainer("resizable").add(JQBehaviors.resizable()));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleTitle()
	 */
	@Override
	protected String getExampleTitle() {
		return "JQuery UI Resizable example";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleDescription()
	 */
	@Override
	protected String getExampleDescription() {
		return "This example demonstrates JQuery UI Resizable integration";
	}
}
