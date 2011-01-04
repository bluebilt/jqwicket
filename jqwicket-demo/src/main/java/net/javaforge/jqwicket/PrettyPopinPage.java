package net.javaforge.jqwicket;

import net.javaforge.jqwicket.dnd.DND2Page;
import net.javaforge.jqwicket.ui.prettypopin.PrettyPopinBehavior;
import net.javaforge.jqwicket.ui.prettypopin.PrettyPopinOptions;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.link.Link;

public class PrettyPopinPage extends WebPage {

	public PrettyPopinPage() {

		Link<Void> linkInternal = new Link<Void>("linkInternal") {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				setResponsePage(DND2Page.class);
			}
		};
		linkInternal.add(new PrettyPopinBehavior(new PrettyPopinOptions()
				.width(500).height(400).followScroll(false)));
		add(linkInternal);

		ExternalLink linkExternal = new ExternalLink("linkExternal",
				"http://localhost:8080/prettypopin");
		linkExternal.add(new PrettyPopinBehavior(new PrettyPopinOptions()
				.width(500).height(400).followScroll(true)));
		add(linkExternal);

	}
}
