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

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 *
 */
public class JQContributionConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private String jqueryCoreJsUrl = "http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js";

	private String jqueryUiJsUrl = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js";

	private String jqueryUiCssUrl = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/themes/base/jquery-ui.css";

	private JavascriptResourceReference jqueryCoreJsResourceReference;

	private JavascriptResourceReference jqueryUiJsResourceReference;

	private ResourceReference jqueryUiCssResourceReference;

	/**
	 * Initializes this config with given url to the jquery ui library (e.g. <a
	 * href
	 * ="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js">http
	 * ://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js</a>)
	 * 
	 * @param url
	 * @return
	 */
	public JQContributionConfig withJQueryCoreJsUrl(String url) {
		this.jqueryCoreJsUrl = url;
		this.jqueryCoreJsResourceReference = null;
		return this;
	}

	/**
	 * Initializes this config with given url to the jquery ui library (e.g. <a
	 * href
	 * ="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js">
	 * http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js</a>)
	 * 
	 * @param url
	 * @return
	 */
	public JQContributionConfig withJQueryUiJsUrl(String url) {
		this.jqueryUiJsUrl = url;
		this.jqueryUiJsResourceReference = null;
		return this;
	}

	/**
	 * Initializes this config with given url to the jquery ui css file(e.g. <a
	 * href =
	 * "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/themes/base/jquery-ui.css"
	 * >http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/themes/base/jquery-
	 * ui.css</a>)
	 * 
	 * @param url
	 * @return
	 */
	public JQContributionConfig withJQueryUiCssUrl(String url) {
		this.jqueryUiCssUrl = url;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	/**
	 * Initializes this config with given resource reference to the jquery core
	 * library.
	 * 
	 * @param ref
	 * @return
	 */
	public JQContributionConfig withJQueryCoreJsResourceReference(
			JavascriptResourceReference ref) {
		this.jqueryCoreJsUrl = null;
		this.jqueryCoreJsResourceReference = ref;
		return this;
	}

	/**
	 * Initializes this config with given resource reference to the jquery ui
	 * library.
	 * 
	 * @param ref
	 * @return
	 */
	public JQContributionConfig withJQueryUiJsResourceReference(
			JavascriptResourceReference ref) {
		this.jqueryUiJsUrl = null;
		this.jqueryUiJsResourceReference = ref;
		return this;
	}

	/**
	 * Initializes this config with given resource reference to the jquery css
	 * file.
	 * 
	 * @param ref
	 * @return
	 */
	public JQContributionConfig withJQueryUiCssResourceReference(
			ResourceReference ref) {
		this.jqueryUiCssUrl = null;
		this.jqueryUiCssResourceReference = ref;
		return this;
	}

	/**
	 * Initializes this config only with jquery core library url (e.g. <a href
	 * ="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js">http
	 * ://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js</a>). Once
	 * configured only reference to the jquery core will be rendered with the
	 * html page.
	 * 
	 * @param url
	 * @return
	 */
	public JQContributionConfig withJQueryCoreJsUrlOnly(String url) {
		this.jqueryCoreJsUrl = url;
		this.jqueryCoreJsResourceReference = null;
		this.jqueryUiJsUrl = null;
		this.jqueryUiJsResourceReference = null;
		this.jqueryUiCssUrl = null;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	/**
	 * Initializes this config only with the resource reference to the jquery
	 * core library. Once configured only reference to the jquery core will be
	 * rendered with the html page.
	 * 
	 * @param url
	 * @return
	 */
	public JQContributionConfig withJQueryCoreJsResourceReferenceOnly(
			JavascriptResourceReference ref) {
		this.jqueryCoreJsUrl = null;
		this.jqueryCoreJsResourceReference = ref;
		this.jqueryUiJsUrl = null;
		this.jqueryUiJsResourceReference = null;
		this.jqueryUiCssUrl = null;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	/**
	 * Returns configured jquery core library url or null, if no url specified.
	 * 
	 * @return configured jquery core library url or null, if no url specified.
	 */
	public String getJqueryCoreJsUrl() {
		return jqueryCoreJsUrl;
	}

	/**
	 * Returns configured jquery ui library url or null, if no url specified.
	 * 
	 * @return configured jquery ui library url or null, if no url specified.
	 */
	public String getJqueryUiJsUrl() {
		return jqueryUiJsUrl;
	}

	/**
	 * Returns configured jquery css file url or null, if no url specified.
	 * 
	 * @return configured jquery css file url or null, if no url specified.
	 */
	public String getJqueryUiCssUrl() {
		return jqueryUiCssUrl;
	}

	/**
	 * Returns configured jquery core library resource reference or null, if no
	 * reference specified.
	 * 
	 * @return configured jquery core library resource reference or null, if no
	 *         reference specified.
	 */
	public ResourceReference getJqueryCoreJsResourceReference() {
		return jqueryCoreJsResourceReference;
	}

	/**
	 * Returns configured jquery ui library resource reference or null, if no
	 * url specified.
	 * 
	 * @return configured jquery ui library resource reference or null, if no
	 *         url specified.
	 */
	public ResourceReference getJqueryUiJsResourceReference() {
		return jqueryUiJsResourceReference;
	}

	/**
	 * Returns configured jquery css resource reference or null, if no reference
	 * specified.
	 * 
	 * @return configured jquery css resource reference or null, if no reference
	 *         specified.
	 */
	public ResourceReference getJqueryUiCssResourceReference() {
		return jqueryUiCssResourceReference;
	}

}
