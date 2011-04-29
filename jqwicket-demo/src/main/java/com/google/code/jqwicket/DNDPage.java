/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.code.jqwicket;

import static com.google.code.jqwicket.JQuery.$;
import static com.google.code.jqwicket.JQuery.$f;
import static com.google.code.jqwicket.JQuery.$this;
import static com.google.code.jqwicket.JQuery.js;
import static com.google.code.jqwicket.JQuery.wicketAjaxGet;

import java.util.Map;


import org.apache.wicket.RequestCycle;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

import com.google.code.jqwicket.JQBehaviors;
import com.google.code.jqwicket.MapBuilder;
import com.google.code.jqwicket.Utils;
import com.google.code.jqwicket.ui.accordion.AccordionWebMarkupContainer;
import com.google.code.jqwicket.ui.draggable.DraggableOptions;
import com.google.code.jqwicket.ui.droppable.DroppableOptions;

/**
 * @author mkalina
 * 
 */
public class DNDPage extends BaseJQueryUIPage {

	private static final Map<String, String> labels = new MapBuilder<String, String>()
			.add("lolcatShirt", "Lolcat Shirt")
			.add("cheezeburgerShirt", "Cheezeburger Shirt")
			.add("buckitShirt", "Buckit Shirt")
			.add("zebraStriped", "Zebra Striped")
			.add("blackLeather", "Black Leather")
			.add("alligatorLeather", "Alligator Leather").build();

	public DNDPage() {

		// Create accordion containing dummy products
		AccordionWebMarkupContainer accordion = new AccordionWebMarkupContainer(
				"catalog");
		for (Map.Entry<String, String> e : labels.entrySet()) {
			accordion.add(new Label(e.getKey(), e.getValue()).add(JQBehaviors
					.draggable(new DraggableOptions().appendTo("body").helper(
							"clone"))));
		}
		add(accordion);

		// Create shopping cart webmarkup container
		WebMarkupContainer cartContainer = new WebMarkupContainer(
				"cartContainer");
		add(cartContainer);

		// added ajax behavior to the shopping cart that responds to the page
		// with simple javascript alert
		final AbstractDefaultAjaxBehavior behave = new AbstractDefaultAjaxBehavior() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void respond(AjaxRequestTarget target) {
				String product = RequestCycle.get().getRequest()
						.getParameter("product");
				if (Utils.isNotBlank(product))
					target.appendJavascript("alert('product \"" + product
							+ "\" added on the serverside!')");
			}
		};
		cartContainer.add(behave);

		// make shopping cart container droppable
		// and implement onDropEvent to send the ajax request to the shopping
		// cart!
		cartContainer.add(JQBehaviors.droppable(new DroppableOptions()
				.activeClass("ui-state-default")
				.hoverClass("ui-state-hover")
				.accept(":not(.ui-sortable-helper)")
				.dropEvent(
						$f($this().find(".placeholder").remove(),
								$("<li></li>").text("ui.draggable.text()")
										.appendTo("this"),
								wicketAjaxGet(
										behave,
										new MapBuilder<String, Object>().add(
												"product",
												js("ui.draggable.text()"))
												.build()), "event", "ui"))));

	}
}
