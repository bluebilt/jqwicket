package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebMarkupContainer;

public class ResizablePage extends BaseJQueryUIPage {

	public ResizablePage() {
		add(new WebMarkupContainer("resizable").add(JQBehaviors.resizable()));
	}

}
