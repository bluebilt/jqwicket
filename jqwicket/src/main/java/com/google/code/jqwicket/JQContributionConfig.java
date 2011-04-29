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
package com.google.code.jqwicket;

import java.io.Serializable;

import org.apache.wicket.Application;
import org.apache.wicket.MetaDataKey;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Global JQWicket contribution config defining javascript/css resources that
 * will be always rendered into the HTML-Page head section as soon as some
 * JQWicket component/behavior will be rendered.
 * 
 * @author mkalina
 * 
 */
public class JQContributionConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final MetaDataKey<JQContributionConfig> configKey = new MetaDataKey<JQContributionConfig>() {
		private static final long serialVersionUID = 1L;
	};

	private static final CharSequence defaultJQueryCoreJsUrl = "http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js";

	private static final CharSequence defaultJQueryUiJsUrl = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.11/jquery-ui.min.js";

	private static final CharSequence defaultJQueryUiCssUrl = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.11/themes/base/jquery-ui.css";

	private CharSequence jqueryCoreJsUrl;

	private JavascriptResourceReference jqueryCoreJsResourceReference;

	private CharSequence jqueryUiJsUrl;

	private JavascriptResourceReference jqueryUiJsResourceReference;

	private CharSequence jqueryUiCssUrl;

	private ResourceReference jqueryUiCssResourceReference;

	public static JQContributionConfig get() {
		return Application.get().getMetaData(configKey);
	}

	public static void set(JQContributionConfig config) {
		Application.get().setMetaData(configKey, config);
	}

	public JQContributionConfig() {
		this.jqueryCoreJsUrl = defaultJQueryCoreJsUrl;
	}

	public JQContributionConfig(CharSequence jqueryCoreJsUrl) {
		this.jqueryCoreJsResourceReference = null;
		this.jqueryCoreJsUrl = jqueryCoreJsUrl;
	}

	public JQContributionConfig(
			JavascriptResourceReference jqueryCoreResourceReference) {
		this.jqueryCoreJsResourceReference = jqueryCoreResourceReference;
		this.jqueryCoreJsUrl = null;
	}

	public JQContributionConfig withDefaultJQueryUi() {
		this.jqueryUiJsUrl = defaultJQueryUiJsUrl;
		this.jqueryUiCssUrl = defaultJQueryUiCssUrl;
		this.jqueryUiJsResourceReference = null;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	public JQContributionConfig withJQueryUiJs(CharSequence url) {
		this.jqueryUiJsUrl = url;
		this.jqueryUiJsResourceReference = null;
		return this;
	}

	public JQContributionConfig withJQueryUiJs(JavascriptResourceReference ref) {
		this.jqueryUiJsUrl = null;
		this.jqueryUiJsResourceReference = ref;
		return this;
	}

	public JQContributionConfig withJQueryUiCss(CharSequence url) {
		this.jqueryUiCssUrl = url;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	public JQContributionConfig withJQueryUiCss(ResourceReference ref) {
		this.jqueryUiCssUrl = null;
		this.jqueryUiCssResourceReference = ref;
		return this;
	}

	public JQContributionConfig withoutJQueryUi() {
		this.jqueryUiJsUrl = null;
		this.jqueryUiCssUrl = null;
		this.jqueryUiJsResourceReference = null;
		this.jqueryUiCssResourceReference = null;
		return this;
	}

	public CharSequence getJqueryCoreJsUrl() {
		return jqueryCoreJsUrl;
	}

	public JavascriptResourceReference getJqueryCoreJsResourceReference() {
		return jqueryCoreJsResourceReference;
	}

	public CharSequence getJqueryUiJsUrl() {
		return jqueryUiJsUrl;
	}

	public JavascriptResourceReference getJqueryUiJsResourceReference() {
		return jqueryUiJsResourceReference;
	}

	public CharSequence getJqueryUiCssUrl() {
		return jqueryUiCssUrl;
	}

	public ResourceReference getJqueryUiCssResourceReference() {
		return jqueryUiCssResourceReference;
	}

}
