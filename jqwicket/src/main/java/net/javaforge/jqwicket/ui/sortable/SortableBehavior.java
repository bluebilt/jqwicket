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
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;
import net.javaforge.jqwicket.ui.IJQOptions;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public class SortableBehavior extends JQUIComponentBehaivor<SortableOptions>
		implements ISortable {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "sortable";

	public SortableBehavior() {
		this(new SortableOptions());
	}

	public SortableBehavior(SortableOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize()
	 */
	public JQFunction serialize() {
		return chain("'serialize'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void serialize(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.serialize());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction serialize(IJQOptions<?> options) {
		return chain("'serialize'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#serialize(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void serialize(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		chain(ajaxRequestTarget, this.serialize(options));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#toArray()
	 */
	public JQFunction toArray() {
		return chain("'toArray'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#toArray(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void toArray(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.toArray());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refresh()
	 */
	public JQFunction refresh() {
		return chain("'refresh'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.refresh());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refreshPositions()
	 */
	public JQFunction refreshPositions() {
		return chain("'refreshPositions'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#refreshPositions(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refreshPositions(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.refreshPositions());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#cancel()
	 */
	public JQFunction cancel() {
		return chain("'cancel'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.sortable.ISortable#cancel(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void cancel(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.cancel());
	}

}
