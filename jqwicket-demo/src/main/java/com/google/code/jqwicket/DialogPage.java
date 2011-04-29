package com.google.code.jqwicket;


import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

import com.google.code.jqwicket.ui.dialog.DialogOptions;
import com.google.code.jqwicket.ui.dialog.DialogWebMarkupContainer;

public class DialogPage extends BaseJQueryUIPage {

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
