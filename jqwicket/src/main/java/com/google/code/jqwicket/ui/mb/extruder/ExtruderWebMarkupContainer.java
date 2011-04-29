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
package com.google.code.jqwicket.ui.mb.extruder;


import org.apache.wicket.model.IModel;

import com.google.code.jqwicket.ui.JQWebMarkupContainer;

/**
 * @author mkalina
 * 
 */
public class ExtruderWebMarkupContainer extends
		JQWebMarkupContainer<ExtruderBehavior, ExtruderOptions> implements
		IExtruder {

	private static final long serialVersionUID = 1L;

	public ExtruderWebMarkupContainer(String id, CharSequence title) {
		this(id, title, (CharSequence) null);
	}

	public ExtruderWebMarkupContainer(String id, CharSequence title,
			CharSequence url) {
		this(id, new ExtruderOptions(title, url));
	}

	public ExtruderWebMarkupContainer(String id, CharSequence title,
			IModel<?> model) {
		this(id, title, null, model);
	}

	public ExtruderWebMarkupContainer(String id, CharSequence title,
			CharSequence url, IModel<?> model) {
		this(id, model, new ExtruderOptions(title, url));
	}

	public ExtruderWebMarkupContainer(String id, IModel<?> model,
			ExtruderOptions options) {
		super(id, model, options);
	}

	public ExtruderWebMarkupContainer(String id, ExtruderOptions options) {
		super(id, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(com.google.code.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected ExtruderBehavior newJQComponentBehavior(ExtruderOptions options) {
		return new ExtruderBehavior(options);
	}

}
