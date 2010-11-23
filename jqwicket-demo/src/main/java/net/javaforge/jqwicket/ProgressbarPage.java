package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.progressbar.ProgressbarWebMarkupContainer;

import org.apache.wicket.ajax.AbstractAjaxTimerBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.util.time.Duration;

public class ProgressbarPage extends WebPage {

	private int counter = 0;

	@SuppressWarnings("serial")
	public ProgressbarPage() {

		final ProgressbarWebMarkupContainer progressbar = new ProgressbarWebMarkupContainer(
				"progressbar");
		progressbar.add(JQBehaviors.draggable());
		add(progressbar);

		add(new AbstractAjaxTimerBehavior(Duration.seconds(1)) {
			@Override
			protected void onTimer(AjaxRequestTarget target) {
				progressbar.value(target, counter);
				counter++;
				if (counter > 100)
					counter = 0;
			}
		});
	}
}
