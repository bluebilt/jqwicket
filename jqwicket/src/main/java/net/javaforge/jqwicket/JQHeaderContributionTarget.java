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

	private Set<ResourceReference> cssResourceReferences;

	private Set<JQStatement> jsStatements;

	public JQHeaderContributionTarget addJavascriptResourceReference(
			Collection<JavascriptResourceReference> resources) {

		if (isEmpty(resources))
			return this;

		if (this.jsResourceReferences == null)
			this.jsResourceReferences = new LinkedHashSet<JavascriptResourceReference>();

		this.jsResourceReferences.addAll(resources);
		return this;
	}

	public JQHeaderContributionTarget addJavascriptResourceReference(
			JavascriptResourceReference... resources) {

		if (isEmpty(resources))
			return this;

		return this.addJavascriptResourceReference(Arrays.asList(resources));
	}

	public JQHeaderContributionTarget addCssResourceReference(
			Collection<ResourceReference> resources) {

		if (isEmpty(resources))
			return this;

		if (this.cssResourceReferences == null)
			this.cssResourceReferences = new LinkedHashSet<ResourceReference>();

		this.cssResourceReferences.addAll(resources);
		return this;
	}

	public JQHeaderContributionTarget addCssResourceReference(
			ResourceReference... resources) {

		if (isEmpty(resources))
			return this;

		return this.addCssResourceReference(Arrays.asList(resources));
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
				|| isNotEmpty(this.cssResourceReferences)
				|| isNotEmpty(this.jsStatements);

	}

	@SuppressWarnings("unchecked")
	public Collection<JavascriptResourceReference> getJsResourceReferences() {
		return this.jsResourceReferences != null ? Collections
				.unmodifiableSet(this.jsResourceReferences)
				: Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<ResourceReference> getCssResourceReferences() {
		return this.cssResourceReferences != null ? Collections
				.unmodifiableSet(this.cssResourceReferences)
				: Collections.EMPTY_SET;
	}

	@SuppressWarnings("unchecked")
	public Collection<JQStatement> getJsStatements() {
		return this.jsStatements != null ? Collections
				.unmodifiableSet(this.jsStatements) : Collections.EMPTY_SET;
	}

}
