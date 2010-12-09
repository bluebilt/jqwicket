package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.mb.fliptext.FlipTextOptions;
import net.javaforge.jqwicket.ui.mb.fliptext.FlipTextWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class FlipTextPage extends WebPage {

	public FlipTextPage() {
		add(new FlipTextWebMarkupContainer("tb"));
		add(new FlipTextWebMarkupContainer("bt", new FlipTextOptions(false)));
	}
}
