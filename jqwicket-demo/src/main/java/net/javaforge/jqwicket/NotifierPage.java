package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.notifier.NotifierWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;

public class NotifierPage extends WebPage {
	@SuppressWarnings("serial")
	public NotifierPage() {
		final NotifierWebMarkupContainer notifier = new NotifierWebMarkupContainer("notifier1");
		add(notifier);
		add(new AjaxLink<Void>("notifier.open1") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				notifier.create(
						target,
						"Test Notification",
						"This is an example of the default config, and will fade out after five seconds.");
			}
		});
	}
}
