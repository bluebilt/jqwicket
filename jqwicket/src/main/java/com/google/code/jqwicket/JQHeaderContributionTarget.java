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

import static com.google.code.jqwicket.Utils.isEmpty;
import static com.google.code.jqwicket.Utils.isNotEmpty;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.api.IJQStatement;

/**
 * @author mkalina
 * 
 */
public class JQHeaderContributionTarget implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<JavascriptResourceReference> jsResourceReferences;

	private Set<CharSequence> jsResourceUrls;

	private Set<ResourceReference> cssResourceReferences;

	private Set<CharSequence> cssResourceUrls;

	private Set<IJQStatement> jqStatements;

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
			Collection<CharSequence> urls) {
		if (isEmpty(urls))
			return this;

		if (this.jsResourceUrls == null)
			this.jsResourceUrls = new LinkedHashSet<CharSequence>();

		this.jsResourceUrls.addAll(urls);
		return this;
	}

	public JQHeaderContributionTarget addJavascriptResourceUrls(
			CharSequence... urls) {
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

	public JQHeaderContributionTarget addCssResourceUrls(
			Collection<CharSequence> urls) {
		if (isEmpty(urls))
			return this;

		if (this.cssResourceUrls == null)
			this.cssResourceUrls = new LinkedHashSet<CharSequence>();

		this.cssResourceUrls.addAll(urls);
		return this;
	}

	public JQHeaderContributionTarget addCssResourceUrls(CharSequence... urls) {
		if (isEmpty(urls))
			return this;
		return this.addCssResourceUrls(Arrays.asList(urls));
	}

	public JQHeaderContributionTarget addJQStatements(
			Collection<IJQStatement> statements) {
		if (isEmpty(statements))
			return this;

		if (this.jqStatements == null)
			this.jqStatements = new LinkedHashSet<IJQStatement>();

		this.jqStatements.addAll(statements);
		return this;
	}

	public JQHeaderContributionTarget addJQStatements(
			IJQStatement... statements) {
		if (isEmpty(statements))
			return this;
		return this.addJQStatements(Arrays.asList(statements));
	}

	/**
	 * Returns true, if at least one resource (url, resource reference,
	 * statement..) was added to the contribution target and should be rendered.
	 * Otherwise returns false.
	 * 
	 * @return
	 */
	public boolean hasResourcesToRender() {
		return isNotEmpty(this.jsResourceReferences)
				|| isNotEmpty(this.jsResourceUrls)
				|| isNotEmpty(this.cssResourceReferences)
				|| isNotEmpty(this.cssResourceUrls)
				|| isNotEmpty(this.jqStatements);
	}

	/**
	 * Returns unmodifiable collection of available javascript resource
	 * references. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<JavascriptResourceReference> getJsResourceReferences() {
		return this.jsResourceReferences != null ? Collections
				.unmodifiableSet(this.jsResourceReferences) : Collections
				.<JavascriptResourceReference> emptySet();
	}

	/**
	 * Returns unmodifiable collection of available javascript resource urls. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<CharSequence> getJsResourceUrls() {
		return this.jsResourceUrls != null ? Collections
				.unmodifiableSet(this.jsResourceUrls) : Collections
				.<CharSequence> emptySet();
	}

	/**
	 * Returns unmodifiable collection of available css resource references. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<ResourceReference> getCssResourceReferences() {
		return this.cssResourceReferences != null ? Collections
				.unmodifiableSet(this.cssResourceReferences) : Collections
				.<ResourceReference> emptySet();
	}

	/**
	 * Returns unmodifiable collection of available css resource urls. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<CharSequence> getCssResourceUrls() {
		return this.cssResourceUrls != null ? Collections
				.unmodifiableSet(this.cssResourceUrls) : Collections
				.<CharSequence> emptySet();
	}

	/**
	 * Returns unmodifiable collection of available {@link JQStatement}-s. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<IJQStatement> getJQStatements() {
		return this.jqStatements != null ? Collections
				.unmodifiableSet(this.jqStatements) : Collections
				.<IJQStatement> emptySet();
	}

}
