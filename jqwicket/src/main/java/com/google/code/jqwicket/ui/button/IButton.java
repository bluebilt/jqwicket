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
package com.google.code.jqwicket.ui.button;


import org.apache.wicket.ajax.AjaxRequestTarget;

import com.google.code.jqwicket.IJQUIWidget;
import com.google.code.jqwicket.JQFunction;

/**
 * @author mkalina
 * 
 */
public interface IButton extends IJQUIWidget<ButtonOptions> {

	static final CharSequence JQ_COMPONENT_NAME = "button";

	/**
	 * Refreshes the visual state of the button. Useful for updating button
	 * state after the native element's checked or disabled state is changed
	 * programatically.
	 */
	JQFunction refresh();

	/**
	 * Refreshes the visual state of the button. Useful for updating button
	 * state after the native element's checked or disabled state is changed
	 * programatically.
	 * 
	 * @param ajaxRequestTarget
	 */
	void refresh(AjaxRequestTarget ajaxRequestTarget);

}
