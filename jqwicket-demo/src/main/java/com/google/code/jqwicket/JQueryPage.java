package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.JQBehaviors;

public class JQueryPage extends WebPage {

	public JQueryPage() {
		add(JQBehaviors.js("alert('this page uses only jquery!')"));
	}

}
