package com.google.code.jqwicket;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ILinkListener;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;

import com.google.code.jqwicket.ui.JQOptions;
import com.google.code.jqwicket.ui.dialog.DialogOptions;
import com.google.code.jqwicket.ui.dialog.DialogWebMarkupContainer;

public class DialogPage extends BaseJQueryUIPage {

	private static final List<String> list = Arrays.asList("a", "b", "c");

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

		DataView<String> listview = new DataView<String>("pageable", new ListDataProvider<String>(list)) {
			
			
			
			@Override
			protected void populateItem(Item<String> item) {
				
				this.add(item);
				
				item.add(new Label("somecolumn", item.getModel()));
				final Link<Void> link = new Link<Void>("accept") {
					@Override
					public void onClick() {
						// do stuff
					}

					@Override
					protected void onComponentTag(ComponentTag tag) {
						super.onComponentTag(tag);
						tag.put("href", "#");
					}

				};
				item.add(link);
				
				
				
				DialogWebMarkupContainer confirm = new DialogWebMarkupContainer(
						"confirm-dialog",
						new DialogOptions()
								.modal(true)
								.resizable(false)
								.buttons(
										new JQOptions()
												.put("'Yes'",
														JQuery.$f("$(this).dialog('close'); window.location = '"
																+ link.urlFor(ILinkListener.INTERFACE)
																+ "';"))
												.put("'No'",
														JQuery.$f("$(this).dialog('close')"))));
				item.add(confirm);

				link.add(JQBehaviors.mouseClick(confirm.open()));

			}
		};
		add(listview);

	}
}
