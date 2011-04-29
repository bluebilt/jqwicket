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
package com.google.code.jqwicket.ui.markitup;

import java.io.Serializable;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class MarkItUpSet implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final MarkItUpSet DEFAULT = new MarkItUpSet("mySettings",
			new JavascriptResourceReference(MarkItUpSet.class,
					"sets/default/set.js"), new ResourceReference(
					MarkItUpSet.class, "sets/default/style.css"));

	public static final MarkItUpSet HTML = new MarkItUpSet("mySettings",
			new JavascriptResourceReference(MarkItUpSet.class,
					"sets/html/set.js"), new ResourceReference(
					MarkItUpSet.class, "sets/html/style.css"));

	public static final MarkItUpSet BBCODE = new MarkItUpSet("mySettings",
			new JavascriptResourceReference(MarkItUpSet.class,
					"sets/bbcode/set.js"), new ResourceReference(
					MarkItUpSet.class, "sets/bbcode/style.css"));

	public static final MarkItUpSet WIKI = new MarkItUpSet("mySettings",
			new JavascriptResourceReference(MarkItUpSet.class,
					"sets/wiki/set.js"), new ResourceReference(
					MarkItUpSet.class, "sets/wiki/style.css"));

	private String name;

	private JavascriptResourceReference jsResource;

	private ResourceReference cssResource;

	public MarkItUpSet(String name, JavascriptResourceReference jsResource,
			ResourceReference cssResource) {
		this.name = name;
		this.jsResource = jsResource;
		this.cssResource = cssResource;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the jsResource
	 */
	public JavascriptResourceReference getJsResource() {
		return jsResource;
	}

	/**
	 * @return the cssResource
	 */
	public ResourceReference getCssResource() {
		return cssResource;
	}

}
