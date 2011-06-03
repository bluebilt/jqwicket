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
package com.google.code.jqwicket.ui.cjimageflipbox;


import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.api.AbstractJQOptions;

/**
 * @author mkalina
 * 
 */
public class CJImageFlipboxOptions extends
		AbstractJQOptions<CJImageFlipboxOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			CJImageFlipboxOptions.class, "jquery.cj-image-flipbox.js");

	public static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			CJImageFlipboxOptions.class, "jquery.cj-image-flipbox.min.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			CJImageFlipboxOptions.class, "jquery.cj-image-flipbox.css");

	public CJImageFlipboxOptions() {
		this.setJsResourceReferences(JS_RESOURCE);
		this.setJsResourceReferencesMin(JS_RESOURCE_MIN);
		this.setCssResourceReferences(CSS_RESOURCE);
	}

}
