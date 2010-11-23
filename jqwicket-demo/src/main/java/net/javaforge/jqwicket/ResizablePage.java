package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class ResizablePage extends WebPage {

	public ResizablePage() {

		add(new WebMarkupContainer("resizable")
				.add(JQBehaviors.resizable()));

	}

}
