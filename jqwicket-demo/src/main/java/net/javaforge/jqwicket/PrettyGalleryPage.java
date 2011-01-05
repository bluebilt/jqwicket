package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.prettygallery.PrettyGalleryBehavior;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class PrettyGalleryPage extends WebPage {

	public PrettyGalleryPage() {
		add(new WebMarkupContainer("prettyGallery")
				.add(new PrettyGalleryBehavior()));
	}
}
