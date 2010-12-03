package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebPage;

public class JQueryPage extends WebPage {

	public JQueryPage() {
		add(JQBehaviors.js("alert('this page uses only jquery!')"));
	}

}
