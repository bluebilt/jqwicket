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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

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

	public static final CharSequence DEFAULT_JQUERY_URL = "http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js";

	public static final CharSequence DEFAULT_JQUERYUI_URL = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js";

	public static final CharSequence DEFAULT_JQUERYUI_CSS_URL = "http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/themes/base/jquery-ui.css";

	private Set<CharSequence> jsUrls;

	private Set<JavascriptResourceReference> jsResourceReferences;

	private Set<CharSequence> cssUrls;

	private Set<ResourceReference> cssResourceReferences;

	public JQContributionConfig() {
		this(new CharSequence[] { DEFAULT_JQUERY_URL, DEFAULT_JQUERYUI_URL },
				new CharSequence[] { DEFAULT_JQUERYUI_CSS_URL });
	}

	public JQContributionConfig(CharSequence... jsUrls) {
		this(jsUrls != null ? Arrays.asList(jsUrls) : null, null, null, null);
	}

	public JQContributionConfig(JavascriptResourceReference... jsRefs) {
		this(null, jsRefs != null ? Arrays.asList(jsRefs) : null, null, null);
	}

	public JQContributionConfig(CharSequence[] jsUrls, CharSequence[] cssUrls) {
		this(jsUrls != null ? Arrays.asList(jsUrls) : null, null,
				cssUrls != null ? Arrays.asList(cssUrls) : null, null);
	}

	public JQContributionConfig(Collection<CharSequence> jsUrls,
			Collection<JavascriptResourceReference> jsResourceReferences,
			Collection<CharSequence> cssUrls,
			Collection<ResourceReference> cssResourceReferences) {

		this.jsUrls = new LinkedHashSet<CharSequence>(jsUrls != null ? jsUrls
				: Collections.<CharSequence> emptySet());
		this.jsResourceReferences = new LinkedHashSet<JavascriptResourceReference>(
				jsResourceReferences != null ? jsResourceReferences
						: Collections.<JavascriptResourceReference> emptySet());
		this.cssUrls = new LinkedHashSet<CharSequence>(
				cssUrls != null ? cssUrls
						: Collections.<CharSequence> emptySet());
		this.cssResourceReferences = new LinkedHashSet<ResourceReference>(
				cssResourceReferences != null ? cssResourceReferences
						: Collections.<ResourceReference> emptySet());
	}

	public JQContributionConfig withJsUrls(CharSequence... jsUrls) {
		if (jsUrls != null)
			this.jsUrls.addAll(Arrays.asList(jsUrls));
		return this;
	}

	public JQContributionConfig withJsRefs(
			JavascriptResourceReference... jsRefs) {
		if (jsRefs != null)
			this.jsResourceReferences.addAll(Arrays.asList(jsRefs));
		return this;
	}

	public JQContributionConfig withCssUrls(CharSequence... cssUrls) {
		if (cssUrls != null)
			this.cssUrls.addAll(Arrays.asList(cssUrls));
		return this;
	}

	public JQContributionConfig withCssRefs(ResourceReference... cssRefs) {
		if (cssRefs != null)
			this.cssResourceReferences.addAll(Arrays.asList(cssRefs));
		return this;
	}

	public Set<CharSequence> getJsUrls() {
		return Collections.unmodifiableSet(this.jsUrls);
	}

	public Set<JavascriptResourceReference> getJsResourceReferences() {
		return Collections.unmodifiableSet(this.jsResourceReferences);
	}

	public Set<CharSequence> getCssUrls() {
		return Collections.unmodifiableSet(this.cssUrls);
	}

	public Set<ResourceReference> getCssResourceReferences() {
		return Collections.unmodifiableSet(this.cssResourceReferences);
	}

}
