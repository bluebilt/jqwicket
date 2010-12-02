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
package net.javaforge.jqwicket.ui;

import static net.javaforge.jqwicket.JQuery.$;
import net.javaforge.jqwicket.JQHeaderContributionTarget;

/**
 * Generic, selector based abstract component behavior for JQuery components.
 * 
 * @author mkalina
 * 
 * @param <T>
 */
public abstract class GenericJQComponentBehaivor<T extends IJQOptions<T>>
		extends JQComponentBehaivor<T> {

	private static final long serialVersionUID = 1L;

	private String selector;

	public GenericJQComponentBehaivor(String selector, T options) {
		super(options);
		this.selector = selector;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#initComponentJavascript(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void initComponentJavascript(JQHeaderContributionTarget target) {
		target.addJQStatements($(this.selector).chain(this.getName(),
				this.options.toJson()));
	}

}
