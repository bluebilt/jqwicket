package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.prettygallery.PrettyGalleryBehavior;

public class PrettyGalleryPage extends WebPage {

	public PrettyGalleryPage() {
		add(new WebMarkupContainer("prettyGallery")
				.add(new PrettyGalleryBehavior()));
	}
}
