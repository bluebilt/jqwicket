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

/**
 * Abstract component behavior for JQuery UI components.
 * 
 * @author mkalina
 * 
 * @param <T>
 */
public abstract class JQUIComponentBehaivor<T extends IJQOptions<T>> extends
		JQComponentBehaivor<T> implements IJQUIWidget<T> {

	private static final long serialVersionUID = 1L;

	public JQUIComponentBehaivor(T options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy()
	 */
	public JQFunction destroy() {
		return chain("'destroy'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#destroy(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void destroy(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.destroy());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable()
	 */
	public JQFunction disable() {
		return chain("'disable'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#disable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void disable(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.disable());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable()
	 */
	public JQFunction enable() {
		return chain("'enable'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#enable(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void enable(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.enable());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public JQFunction option(CharSequence optionName, CharSequence optionValue) {
		return chain("'option'", optionName, optionValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#option(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.CharSequence, java.lang.CharSequence)
	 */
	public void option(AjaxRequestTarget ajaxRequestTarget,
			CharSequence optionName, CharSequence optionValue) {
		chain(ajaxRequestTarget, this.option(optionName, optionValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction options(IJQOptions<?> options) {
		return chain("'option'", options.toJson());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#options(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void options(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		chain(ajaxRequestTarget, this.options(options));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget()
	 */
	public JQFunction widget() {
		return chain("'widget'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#widget(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void widget(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.widget());
	}

}
