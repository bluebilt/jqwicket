package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.notifier.NotifierBehavior;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class NotifierPage extends WebPage {

	@SuppressWarnings("serial")
	public NotifierPage() {

		final NotifierBehavior b = new NotifierBehavior();
		WebMarkupContainer notifier = new WebMarkupContainer("notifier1");
		notifier.add(b);
		add(notifier);

		add(new AjaxLink<Void>("notifier.open1") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				b.create(
						target,
						"Test Notification",
						"This is an example of the default config, and will fade out after five seconds.");
			}
		});

	}
}
