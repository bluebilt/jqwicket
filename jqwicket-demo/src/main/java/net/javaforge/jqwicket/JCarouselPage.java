package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.jcarousel.JCarouselWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class JCarouselPage extends WebPage {

	public JCarouselPage() {

		add(new JCarouselWebMarkupContainer("mycarousel"));

	}
}
