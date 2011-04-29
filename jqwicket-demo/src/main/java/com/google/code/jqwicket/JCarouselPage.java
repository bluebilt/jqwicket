package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.jcarousel.JCarouselWebMarkupContainer;

public class JCarouselPage extends WebPage {

	public JCarouselPage() {

		add(new JCarouselWebMarkupContainer("mycarousel"));

	}
}
