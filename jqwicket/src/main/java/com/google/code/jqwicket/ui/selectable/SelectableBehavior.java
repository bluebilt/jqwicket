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
package com.google.code.jqwicket.ui.selectable;


import org.apache.wicket.ajax.AjaxRequestTarget;

import com.google.code.jqwicket.JQFunction;
import com.google.code.jqwicket.ui.JQUIComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class SelectableBehavior extends
		JQUIComponentBehaivor<SelectableOptions> implements ISelectable {

	private static final long serialVersionUID = 1L;

	public SelectableBehavior() {
		this(new SelectableOptions());
	}

	public SelectableBehavior(SelectableOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQUIWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.selectable.ISelectable#refresh()
	 */
	public JQFunction refresh() {
		return chain("'refresh'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.selectable.ISelectable#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.refresh());
	}
}
