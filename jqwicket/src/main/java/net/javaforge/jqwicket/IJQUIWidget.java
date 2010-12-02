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

import java.io.Serializable;

import net.javaforge.jqwicket.ui.IJQOptions;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * Central interface for JQuery UI widgets.
 * 
 * @author mkalina
 * 
 * @param <T>
 *            is the type of {@link IJQOptions} associated with this widget.
 */
public interface IJQUIWidget<T extends IJQOptions<T>> extends IJQWidget<T>,
		Serializable {

	/**
	 * Remove the component functionality completely. This will return the
	 * element back to its pre-init state.
	 */
	JQFunction destroy();

	/**
	 * Remove the component functionality completely. This will return the
	 * element back to its pre-init state.
	 * 
	 * @param ajaxRequestTarget
	 */
	void destroy(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Disable the component.
	 */
	JQFunction disable();

	/**
	 * Disable the component.
	 * 
	 * @param ajaxRequestTarget
	 */
	void disable(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Enable the component.
	 */
	JQFunction enable();

	/**
	 * Enable the component.
	 * 
	 * @param ajaxRequestTarget
	 */
	void enable(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Set any component option.
	 */
	JQFunction option(CharSequence optionName, CharSequence optionValue);

	/**
	 * Set any component option.
	 * 
	 * @param ajaxRequestTarget
	 */
	void option(AjaxRequestTarget ajaxRequestTarget, CharSequence optionName,
			CharSequence optionValue);

	/**
	 * Set any component option.
	 */
	JQFunction options(IJQOptions<?> options);

	/**
	 * Set any component option.
	 * 
	 * @param ajaxRequestTarget
	 */
	public void options(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options);

	/**
	 * Returns the .ui-... element.
	 */
	JQFunction widget();

	/**
	 * Returns the .ui-... element.
	 * 
	 * @param ajaxRequestTarget
	 */
	void widget(AjaxRequestTarget ajaxRequestTarget);
}
