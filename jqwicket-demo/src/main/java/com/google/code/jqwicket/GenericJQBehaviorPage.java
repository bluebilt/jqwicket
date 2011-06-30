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

import org.apache.wicket.markup.html.basic.Label;

import com.google.code.jqwicket.api.JQLiteral;
import com.google.code.jqwicket.api.JQuery;
import com.google.code.jqwicket.api.S;

/**
 * @author mkalina
 * 
 */
public class GenericJQBehaviorPage extends DemoPage {

	public GenericJQBehaviorPage() {

		// add JQBehavior, that displays alert while click the link with id =
		// link0
		add(new JQBehavior(S.id("link0").to$()
				.click(JQuery.$f("alert('hello world!')"))));

		// add JQBehavior to the label
		Label label = new Label("label",
				"I'm a wicket label. Click me to see an alert!");
		label.add(JQBehaviors.mouseClick("alert('clicked!')"));
		add(label);

		// add JQBehavior to some static html element
		add(new JQBehavior(S
				.id("censoredA")
				.to$()
				.click(JQuery.$f(
						S.id("censoredDiv")
								.to$()
								.fadeIn(JQLiteral._raw(3000),
										JQuery.$f(S.id("censoredSpan").to$()
												.fadeIn(JQLiteral._raw(100)))),
						"return false;"))));

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleTitle()
	 */
	@Override
	protected String getExampleTitle() {
		return "Low-level JQBehavior example";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleDescription()
	 */
	@Override
	protected String getExampleDescription() {
		return "This example demonstrates how to use pre-implemented JQBehavior class "
				+ "to add jquery support to the wicket components";
	}
}
