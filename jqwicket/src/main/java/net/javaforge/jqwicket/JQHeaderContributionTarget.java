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

import static net.javaforge.jqwicket.Utils.isEmpty;
import static net.javaforge.jqwicket.Utils.isNotEmpty;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class JQHeaderContributionTarget implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<JavascriptResourceReference> jsResourceReferences;

	private Set<String> jsResourceUrls;

	private Set<ResourceReference> cssResourceReferences;

	private Set<String> cssResourceUrls;

	private Set<JQStatement> jsStatements;

	public JQHeaderContributionTarget addJavascriptResourceReferences(
			Collection<JavascriptResourceReference> refs) {

		if (isEmpty(refs))
			return this;

		if (this.jsResourceReferences == null)
			this.jsResourceReferences = new LinkedHashSet<JavascriptResourceReference>();

		this.jsResourceReferences.addAll(refs);
		return this;
	}

	public JQHeaderContributionTarget addJavascriptResourceReferences(
			JavascriptResourceReference... refs) {
		if (isEmpty(refs))
			return this;

		return this.addJavascriptResourceReferences(Arrays.asList(refs));
	}

	public JQHeaderContributionTarget addJavascriptResourceUrls(
			Collection<String> urls) {

		if (isEmpty(urls))
			return this;

		if (this.jsResourceUrls == null)
			this.jsResourceUrls = new LinkedHashSet<String>();

		this.jsResourceUrls.addAll(urls);
		return this;
	}

	public JQHeaderContributionTarget addJavascriptResourceUrls(String... urls) {
		if (isEmpty(urls))
			return this;

		return this.addJavascriptResourceUrls(Arrays.asList(urls));
	}

	public JQHeaderContributionTarget addCssResourceReferences(
			Collection<ResourceReference> refs) {

		if (isEmpty(refs))
			return this;

		if (this.cssResourceReferences == null)
			this.cssResourceReferences = new LinkedHashSet<ResourceReference>();

		this.cssResourceReferences.addAll(refs);
		return this;
	}

	public JQHeaderContributionTarget addCssResourceReferences(
			ResourceReference... refs) {

		if (isEmpty(refs))
			return this;

		return this.addCssResourceReferences(Arrays.asList(refs));
	}

	public JQHeaderContributionTarget addCssResourceUrls(Collection<String> urls) {

		if (isEmpty(urls))
			return this;

		if (this.cssResourceUrls == null)
			this.cssResourceUrls = new LinkedHashSet<String>();

		this.cssResourceUrls.addAll(urls);
		return this;
	}

	public JQHeaderContributionTarget addCssResourceUrls(String... urls) {

		if (isEmpty(urls))
			return this;

		return this.addCssResourceUrls(Arrays.asList(urls));
	}

	public JQHeaderContributionTarget addJsStatement(
			Collection<JQStatement> statements) {

		if (isEmpty(statements))
			return this;

		if (this.jsStatements == null)
			this.jsStatements = new LinkedHashSet<JQStatement>();

		this.jsStatements.addAll(statements);
		return this;
	}

	public JQHeaderContributionTarget addJsStatement(JQStatement... statements) {

		if (isEmpty(statements))
			return this;

		return this.addJsStatement(Arrays.asList(statements));
	}

	boolean hasResourcesToRender() {
		return isNotEmpty(this.jsResourceReferences)
				|| isNotEmpty(this.jsResourceUrls)
				|| isNotEmpty(this.cssResourceReferences)
				|| isNotEmpty(this.cssResourceUrls)
				|| isNotEmpty(this.jsStatements);

	}

	@SuppressWarnings("unchecked")
	public Collection<JavascriptResourceReference> getJsResourceReferences() {
		return this.jsResourceReferences != null ? Collections
				.unmodifiableSet(this.jsResourceReferences)
				: Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<String> getJsResourceUrls() {
		return this.jsResourceUrls != null ? Collections
				.unmodifiableSet(this.jsResourceUrls) : Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<ResourceReference> getCssResourceReferences() {
		return this.cssResourceReferences != null ? Collections
				.unmodifiableSet(this.cssResourceReferences)
				: Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<String> getCssResourceUrls() {
		return this.cssResourceUrls != null ? Collections
				.unmodifiableSet(this.cssResourceUrls) : Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<JQStatement> getJsStatements() {
		return this.jsStatements != null ? Collections
				.unmodifiableSet(this.jsStatements) : Collections.EMPTY_SET;
	}

}
