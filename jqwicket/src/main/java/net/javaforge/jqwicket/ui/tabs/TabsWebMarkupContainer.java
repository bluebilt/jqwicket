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
package net.javaforge.jqwicket.ui.tabs;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 * 
 */
public class TabsWebMarkupContainer extends
		JQUIWebMarkupContainer<TabsBehavior, TabsOptions> implements ITabs {

	private static final long serialVersionUID = 1L;

	public TabsWebMarkupContainer(String id) {
		this(id, new TabsOptions());
	}

	public TabsWebMarkupContainer(String id, TabsOptions options) {
		super(id, options);
	}

	public TabsWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new TabsOptions());
	}

	public TabsWebMarkupContainer(String id, IModel<?> model,
			TabsOptions options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.JQOptions)
	 */
	@Override
	protected TabsBehavior newJQComponentBehavior(TabsOptions options) {
		return new TabsBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#add(java.lang.String,
	 *      java.lang.String)
	 */
	public JQFunction add(String url, String label) {
		return this.behavior.add(url, label);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#add(java.lang.String,
	 *      java.lang.String, java.lang.Integer)
	 */
	public JQFunction add(String url, String label, Integer index) {
		return this.behavior.add(url, label, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#add(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String)
	 */
	public void add(AjaxRequestTarget ajaxRequestTarget, String url,
			String label) {
		this.behavior.add(ajaxRequestTarget, url, label);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#add(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String, java.lang.Integer)
	 */
	public void add(AjaxRequestTarget ajaxRequestTarget, String url,
			String label, Integer index) {
		this.behavior.add(ajaxRequestTarget, url, label, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#remove(int)
	 */
	public JQFunction remove(int index) {
		return this.behavior.remove(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#remove(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void remove(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.remove(ajaxRequestTarget, index);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#enable(int)
	 */
	public JQFunction enable(int index) {
		return this.behavior.enable(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#enable(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void enable(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.enable(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#disable(int)
	 */
	public JQFunction disable(int index) {
		return this.behavior.disable(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#disable(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void disable(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.disable(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#select(int)
	 */
	public JQFunction select(int index) {
		return this.behavior.select(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#select(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void select(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.select(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#load(int)
	 */
	public JQFunction load(int index) {
		return this.behavior.load(index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#load(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void load(AjaxRequestTarget ajaxRequestTarget, int index) {
		this.behavior.load(ajaxRequestTarget, index);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#url(int, java.lang.String)
	 */
	public JQFunction url(int index, String url) {
		return this.behavior.url(index, url);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#url(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int, java.lang.String)
	 */
	public void url(AjaxRequestTarget ajaxRequestTarget, int index, String url) {
		this.behavior.url(ajaxRequestTarget, index, url);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#length()
	 */
	public JQFunction length() {
		return this.behavior.length();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#length(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void length(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.length(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#abort()
	 */
	public JQFunction abort() {
		return this.behavior.abort();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#abort(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void abort(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.abort(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#rotate(int, boolean)
	 */
	public JQFunction rotate(int ms, boolean continuing) {
		return this.behavior.rotate(ms, continuing);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.tabs.ITabs#rotate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int, boolean)
	 */
	public void rotate(AjaxRequestTarget ajaxRequestTarget, int ms,
			boolean continuing) {
		this.behavior.rotate(ajaxRequestTarget, ms, continuing);
	}

}
