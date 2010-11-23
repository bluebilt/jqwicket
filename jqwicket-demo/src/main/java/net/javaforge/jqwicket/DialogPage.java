package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.dialog.DialogOptions;
import net.javaforge.jqwicket.ui.dialog.DialogWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;

public class DialogPage extends WebPage {

	@SuppressWarnings("serial")
	public DialogPage() {

		final DialogWebMarkupContainer dialog = new DialogWebMarkupContainer(
				"dialog", new DialogOptions().modal(true).resizable(false));
		add(dialog);

		add(new AjaxLink<Void>("dialog.open1") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				dialog.open(target);
			}
		});

	}
}
