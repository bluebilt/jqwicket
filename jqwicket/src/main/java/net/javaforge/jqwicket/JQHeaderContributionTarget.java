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

	private Set<JQStatement> jqStatements;

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

	public JQHeaderContributionTarget addJQStatements(
			Collection<JQStatement> statements) {
		if (isEmpty(statements))
			return this;

		if (this.jqStatements == null)
			this.jqStatements = new LinkedHashSet<JQStatement>();

		this.jqStatements.addAll(statements);
		return this;
	}

	public JQHeaderContributionTarget addJQStatements(JQStatement... statements) {
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
	public Collection<String> getJsResourceUrls() {
		return this.jsResourceUrls != null ? Collections
				.unmodifiableSet(this.jsResourceUrls) : Collections
				.<String> emptySet();
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
	public Collection<String> getCssResourceUrls() {
		return this.cssResourceUrls != null ? Collections
				.unmodifiableSet(this.cssResourceUrls) : Collections
				.<String> emptySet();
	}

	/**
	 * Returns unmodifiable collection of available {@link JQStatement}-s. <br>
	 * This method will never return null.
	 * 
	 * @return
	 */
	public Collection<JQStatement> getJQStatements() {
		return this.jqStatements != null ? Collections
				.unmodifiableSet(this.jqStatements) : Collections
				.<JQStatement> emptySet();
	}

}
