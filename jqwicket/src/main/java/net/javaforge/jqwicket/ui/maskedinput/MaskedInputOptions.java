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
package net.javaforge.jqwicket.ui.maskedinput;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class MaskedInputOptions extends AbstractJQOptions<MaskedInputOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			MaskedInputOptions.class, "jquery.maskedinput-1.2.2.js");

	public static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			MaskedInputOptions.class, "jquery.maskedinput-1.2.2.min.js");

	public MaskedInputOptions() {
		this.jsResourceReferences(JS_RESOURCE);
		this.jsResourceReferencesMin(JS_RESOURCE_MIN);
	}

	/**
	 * Sets placeholder
	 * 
	 * @param controlNavThumbsSearch
	 * @return
	 */
	public MaskedInputOptions placeholder(String placeholder) {
		super.put("placeholder", placeholder);
		return this;
	}

	/**
	 * Triggers once the mask has been completed
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MaskedInputOptions completedEvent(CharSequence callbackBody) {
		return this.completedEvent(js(callbackBody));
	}

	/**
	 * Triggers once the mask has been completed
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MaskedInputOptions completedEvent(JQStatement callbackBody) {
		return this.completedEvent($f(callbackBody));
	}

	/**
	 * Triggers once the mask has been completed
	 * 
	 * @param callback
	 * @return
	 */
	public MaskedInputOptions completedEvent(JQFunction callback) {
		super.put("completed", callback);
		return this;
	}

}
