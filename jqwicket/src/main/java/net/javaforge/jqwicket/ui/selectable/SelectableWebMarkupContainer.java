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
package net.javaforge.jqwicket.ui.selectable;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 *
 */
public class SelectableWebMarkupContainer extends
		JQUIWebMarkupContainer<SelectableBehavior, SelectableOptions> implements
		ISelectable {

	private static final long serialVersionUID = 1L;

	public SelectableWebMarkupContainer(String id) {
		this(id, new SelectableOptions());
	}

	public SelectableWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new SelectableOptions());
	}

	public SelectableWebMarkupContainer(String id, IModel<?> model,
			SelectableOptions options) {
		super(id, model, options);
	}

	public SelectableWebMarkupContainer(String id, SelectableOptions options) {
		super(id, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.JQOptions)
	 */
	@Override
	protected SelectableBehavior newJQComponentBehavior(
			SelectableOptions options) {
		return new SelectableBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.selectable.ISelectable#refresh()
	 */
	public JQFunction refresh() {
		return this.behavior.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.selectable.ISelectable#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.refresh(ajaxRequestTarget);
	}

}
