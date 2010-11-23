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
package net.javaforge.jqwicket.ui.sortable;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.IJQOptions;
import net.javaforge.jqwicket.ui.JQUIWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 *
 */
public class SortableWebMarkupContainer extends
		JQUIWebMarkupContainer<SortableBehavior, SortableOptions> implements
		ISortable {

	private static final long serialVersionUID = 1L;

	public SortableWebMarkupContainer(String id) {
		this(id, new SortableOptions());
	}

	public SortableWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new SortableOptions());
	}

	public SortableWebMarkupContainer(String id, IModel<?> model,
			SortableOptions options) {
		super(id, model, options);
	}

	public SortableWebMarkupContainer(String id, SortableOptions options) {
		super(id, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected SortableBehavior newJQComponentBehavior(SortableOptions options) {
		return new SortableBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize()
	 */
	public JQFunction serialize() {
		return this.behavior.serialize();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void serialize(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.serialize(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction serialize(IJQOptions<?> options) {
		return this.behavior.serialize(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void serialize(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		this.behavior.serialize(ajaxRequestTarget, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#toArray()
	 */
	public JQFunction toArray() {
		return this.behavior.toArray();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#toArray(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void toArray(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.toArray(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refresh()
	 */
	public JQFunction refresh() {
		return this.behavior.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.refresh(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refreshPositions()
	 */
	public JQFunction refreshPositions() {
		return this.behavior.refreshPositions();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refreshPositions(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refreshPositions(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.refreshPositions(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#cancel()
	 */
	public JQFunction cancel() {
		return this.behavior.cancel();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#cancel(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void cancel(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.cancel(ajaxRequestTarget);
	}

}
