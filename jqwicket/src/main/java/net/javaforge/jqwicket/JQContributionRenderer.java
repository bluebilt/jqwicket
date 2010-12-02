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

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import org.apache.wicket.Application;
import org.apache.wicket.MetaDataKey;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.javascript.IJavascriptCompressor;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Wicket's {@link IHeaderContributor} implementation able to render all
 * necessary jquery/css resources gathered from the component hierarchy to the
 * html-page head section.
 * 
 * @author mkalina
 * 
 */
public class JQContributionRenderer implements IHeaderContributor {

	private static final long serialVersionUID = 1L;

	private static JQContributionConfig config = new JQContributionConfig();

	private static final MetaDataKey<JQContributionRenderer> KEY = new MetaDataKey<JQContributionRenderer>() {
		private static final long serialVersionUID = 1L;
	};

	public static final void setJQueryContributionConfig(
			JQContributionConfig config) {
		if (config != null)
			JQContributionRenderer.config = config;
	}

	public static final JQContributionRenderer get() {
		JQContributionRenderer target = RequestCycle.get().getMetaData(KEY);
		if (target == null) {
			target = new JQContributionRenderer();
			RequestCycle.get().setMetaData(KEY, target);
		}

		return target;
	}

	private Set<IJQHeaderContributor> contributors;

	JQContributionRenderer() {
	}

	public JQContributionRenderer addContributor(
			IJQHeaderContributor contributor) {

		if (this.contributors == null)
			this.contributors = new LinkedHashSet<IJQHeaderContributor>();

		this.contributors.add(contributor);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.markup.html.IHeaderContributor#renderHead(org.apache.wicket.markup.html.IHeaderResponse)
	 */
	public void renderHead(IHeaderResponse response) {

		if (AjaxRequestTarget.get() != null || isEmpty(this.contributors))
			return;

		JQHeaderContributionTarget target = new JQHeaderContributionTarget();

		for (IJQHeaderContributor c : this.contributors) {
			c.contribute(target);
		}

		if (!target.hasResourcesToRender())
			return;

		// first render resources from global config
		this.renderJsResourcesUrls(response, config.getJsUrls());
		this.renderJsResourcesRefs(response, config.getJsResourceReferences());
		this.renderCssResourcesUrls(response, config.getCssUrls());
		this.renderCssResourcesRefs(response, config.getCssResourceReferences());

		// now render resource explicitly added to the target
		this.renderJsResourcesUrls(response, target.getJsResourceUrls());
		this.renderJsResourcesRefs(response, target.getJsResourceReferences());
		this.renderCssResourcesUrls(response, target.getCssResourceUrls());
		this.renderCssResourcesRefs(response, target.getCssResourceReferences());

		this.renderDocumentReadyJavaScript(response, target.getJQStatements());

		// clear contributors after rendering
		this.contributors.clear();

	}

	private void renderJsResourcesUrls(IHeaderResponse response,
			Collection<String> resources) {
		for (String url : resources) {
			response.renderJavascriptReference(url);
		}
	}

	private void renderJsResourcesRefs(IHeaderResponse response,
			Collection<JavascriptResourceReference> resources) {
		for (JavascriptResourceReference ref : resources) {
			response.renderJavascriptReference(ref);
		}
	}

	private void renderCssResourcesUrls(IHeaderResponse response,
			Collection<String> resources) {
		for (String url : resources) {
			response.renderCSSReference(url);
		}
	}

	private void renderCssResourcesRefs(IHeaderResponse response,
			Collection<ResourceReference> resources) {
		for (ResourceReference ref : resources) {
			response.renderCSSReference(ref);
		}
	}

	private void renderDocumentReadyJavaScript(IHeaderResponse response,
			Collection<JQStatement> statements) {

		if (isEmpty(statements))
			return;

		JQStatement q = JQuery.documentReady(statements);
		IJavascriptCompressor compressor = Application.get()
				.getResourceSettings().getJavascriptCompressor();

		String script = compressor != null ? compressor.compress(q.render())
				: q.render();

		if (script != null)
			response.renderJavascript(script, UUID.randomUUID().toString());

	}
}
