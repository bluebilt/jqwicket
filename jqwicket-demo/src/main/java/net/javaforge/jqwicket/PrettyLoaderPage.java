package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.prettyloader.PrettyLoaderBehavior;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;

public class PrettyLoaderPage extends WebPage {

	private PrettyLoaderBehavior prettyLoader;

	public PrettyLoaderPage() {
		add(this.prettyLoader = new PrettyLoaderBehavior());

		add(new Button("showPrettyLoader").add(JQBehaviors
				.mouseClick(this.prettyLoader.show())));
		add(new Button("showPrettyLoader2Seconds").add(JQBehaviors
				.mouseClick(this.prettyLoader.show(2000))));
		add(new Button("hidePrettyLoader").add(JQBehaviors
				.mouseClick(this.prettyLoader.hide())));

	}
}
