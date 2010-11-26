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
package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.tiptip.GenericTipTipBehavior;
import net.javaforge.jqwicket.ui.tiptip.TipTipBehavior;
import net.javaforge.jqwicket.ui.tiptip.TipTipOptions;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

/**
 * @author mkalina
 * 
 */
public class TipTipPage extends WebPage {

	@SuppressWarnings("serial")
	public TipTipPage() {

		add(new GenericTipTipBehavior(".someClass", new TipTipOptions()
				.content("<h3>this is custom dynamic tooltip</h3>").maxWidth(
						"auto")));

		add(new Link<Void>("tiptip") {
			@Override
			public void onClick() {
			}
		}.add(new TipTipBehavior(new TipTipOptions().maxWidth("auto")
				.edgeOffset(10))));

	}

}
