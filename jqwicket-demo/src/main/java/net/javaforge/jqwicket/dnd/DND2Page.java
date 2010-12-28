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
package net.javaforge.jqwicket.dnd;

import java.util.Arrays;
import java.util.List;

import net.javaforge.jqwicket.BaseJQueryUIPage;

import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

/**
 * @author mkalina
 * 
 */
public class DND2Page extends BaseJQueryUIPage {

	private static final List<Product> products = Arrays.asList(new Product(1,
			"product 1"), new Product(2, "product 2"), new Product(3,
			"product 3"), new Product(4, "product 4"), new Product(5,
			"product 5"), new Product(6, "product 6"), new Product(7,
			"product 7"), new Product(8, "product 8"));

	public DND2Page() {

		add(new ListView<Product>("availableProducts", products) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Product> item) {
				item.add(new ProductPanel("product", item.getModelObject()));
			}
		});

		add(new ShoppingCartPanel("cart"));
	}

}
