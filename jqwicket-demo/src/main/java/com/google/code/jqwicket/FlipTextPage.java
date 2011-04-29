package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.mb.fliptext.FlipTextOptions;
import com.google.code.jqwicket.ui.mb.fliptext.FlipTextWebMarkupContainer;

public class FlipTextPage extends WebPage {

	public FlipTextPage() {
		add(new FlipTextWebMarkupContainer("tb"));
		add(new FlipTextWebMarkupContainer("bt", new FlipTextOptions(false)));
	}
}
