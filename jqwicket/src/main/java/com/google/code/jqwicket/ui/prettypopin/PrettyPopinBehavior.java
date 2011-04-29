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
package com.google.code.jqwicket.ui.prettypopin;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;

import com.google.code.jqwicket.ui.JQComponentBehaivor;


/**
 * @author mkalina
 * 
 */
public class PrettyPopinBehavior extends
		JQComponentBehaivor<PrettyPopinOptions> implements IPrettyPopin {

	private static final long serialVersionUID = 1L;

	public PrettyPopinBehavior() {
		this(new PrettyPopinOptions());
	}

	public PrettyPopinBehavior(PrettyPopinOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.behavior.AbstractBehavior#onComponentTag(org.apache.wicket.Component,
	 *      org.apache.wicket.markup.ComponentTag)
	 */
	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		super.onComponentTag(component, tag);
		tag.put("rel", JQ_COMPONENT_NAME);
	}

}
