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

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.wicket.Component;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Base, low-level jquery wicket behavior able to render javascript statements
 * and javascript/css resources.
 * 
 * @author mkalina
 */
public class JQBehavior extends AbstractBehavior implements
		IJQHeaderContributor {

	private static final long serialVersionUID = 1L;

	private Set<JQStatement> statements;

	private Set<JavascriptResourceReference> jsResourceReferences;

	private Set<ResourceReference> cssResourceReferences;

	private Set<CharSequence> jsResourceUrls;

	private Set<CharSequence> cssResourceUrls;

	protected Component component;

	public JQBehavior() {
	}

	public JQBehavior(JQStatement... statements) {
		this.addJQStatements(statements);
	}

	public JQBehavior(CharSequence... statements) {
		this.addJQStatements(statements);
	}

	public JQBehavior addJQStatements(JQStatement... statements) {
		if (Utils.isEmpty(statements))
			return this;

		if (this.statements == null)
			this.statements = new LinkedHashSet<JQStatement>();

		this.statements.addAll(Arrays.asList(statements));
		return this;
	}

	public JQBehavior addJQStatements(CharSequence... statements) {
		if (Utils.isEmpty(statements))
			return this;

		if (this.statements == null)
			this.statements = new LinkedHashSet<JQStatement>();

		for (CharSequence stmt : statements) {
			this.statements.add(JQuery.js(stmt));
		}
		return this;
	}

	public JQBehavior addJsResourceReferences(
			JavascriptResourceReference... refs) {
		if (Utils.isEmpty(refs))
			return this;

		if (this.jsResourceReferences == null)
			this.jsResourceReferences = new LinkedHashSet<JavascriptResourceReference>();

		this.jsResourceReferences.addAll(Arrays.asList(refs));
		return this;
	}

	public JQBehavior addJsResourceUrls(CharSequence... urls) {
		if (Utils.isEmpty(urls))
			return this;

		if (this.jsResourceUrls == null)
			this.jsResourceUrls = new LinkedHashSet<CharSequence>();

		this.jsResourceUrls.addAll(Arrays.asList(urls));
		return this;
	}

	public JQBehavior addCssResourceReferences(ResourceReference... refs) {
		if (Utils.isEmpty(refs))
			return this;

		if (this.cssResourceReferences == null)
			this.cssResourceReferences = new LinkedHashSet<ResourceReference>();

		this.cssResourceReferences.addAll(Arrays.asList(refs));
		return this;
	}

	public JQBehavior addCssResourceUrls(CharSequence... urls) {
		if (Utils.isEmpty(urls))
			return this;

		if (this.cssResourceUrls == null)
			this.cssResourceUrls = new LinkedHashSet<CharSequence>();

		this.cssResourceUrls.addAll(Arrays.asList(urls));
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.behavior.AbstractBehavior#bind(org.apache.wicket.Component)
	 */
	@Override
	public void bind(Component component) {
		this.component = component;
		this.component.setOutputMarkupId(true);
		super.bind(component);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQHeaderContributor#contribute(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	public final void contribute(JQHeaderContributionTarget target) {
		target.addJavascriptResourceReferences(this.jsResourceReferences);
		target.addJavascriptResourceUrls(this.jsResourceUrls);
		target.addCssResourceReferences(this.cssResourceReferences);
		target.addCssResourceUrls(this.cssResourceUrls);
		target.addJQStatements(this.statements);
		this.contributeInternal(target);
	}

	/**
	 * Subclasses should override this method to add custom contributions to the
	 * target.
	 * 
	 * @param target
	 */
	protected void contributeInternal(JQHeaderContributionTarget target) {
	}
}
