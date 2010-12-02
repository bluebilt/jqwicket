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

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.IJQUIWidget;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * Abstract wicket web markup container for pure jquery ui components.
 * 
 * @author mkalina
 * 
 * @param <B>
 * @param <O>
 */
public abstract class JQUIWebMarkupContainer<B extends JQUIComponentBehaivor<O>, O extends IJQOptions<O>>
		extends JQWebMarkupContainer<B, O> implements IJQUIWidget<O> {

	private static final long serialVersionUID = 1L;

	public JQUIWebMarkupContainer(String id, O options) {
		super(id, options);
	}

	public JQUIWebMarkupContainer(String id, IModel<?> model, O options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy()
	 */
	public JQFunction destroy() {
		return this.behavior.destroy();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void destroy(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.destroy(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable()
	 */
	public JQFunction disable() {
		return this.behavior.disable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void disable(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.disable(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable()
	 */
	public JQFunction enable() {
		return this.behavior.enable();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void enable(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.enable(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public JQFunction option(CharSequence optionName, CharSequence optionValue) {
		return this.behavior.option(optionName, optionValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, java.lang.CharSequence)
	 */
	public void option(AjaxRequestTarget ajaxRequestTarget,
			CharSequence optionName, CharSequence optionValue) {
		this.behavior.option(ajaxRequestTarget, optionName, optionValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction options(IJQOptions<?> options) {
		return this.behavior.options(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void options(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		this.behavior.options(ajaxRequestTarget, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget()
	 */
	public JQFunction widget() {
		return this.behavior.widget();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void widget(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.widget(ajaxRequestTarget);
	}

}
