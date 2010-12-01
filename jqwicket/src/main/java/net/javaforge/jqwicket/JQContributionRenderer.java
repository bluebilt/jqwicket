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
import static net.javaforge.jqwicket.Utils.isNotBlank;
import static net.javaforge.jqwicket.Utils.isNotEmpty;

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

		if (isNotBlank(config.getJqueryCoreJsUrl()))
			response.renderJavascriptReference(config.getJqueryCoreJsUrl());
		else if (config.getJqueryCoreJsResourceReference() != null)
			response.renderJavascriptReference(config
					.getJqueryCoreJsResourceReference());

		if (isNotBlank(config.getJqueryUiJsUrl()))
			response.renderJavascriptReference(config.getJqueryUiJsUrl());
		else if (config.getJqueryUiJsResourceReference() != null)
			response.renderJavascriptReference(config
					.getJqueryUiJsResourceReference());

		if (isNotBlank(config.getJqueryUiCssUrl()))
			response.renderCSSReference(config.getJqueryUiCssUrl());
		else if (config.getJqueryUiCssResourceReference() != null)
			response.renderCSSReference(config
					.getJqueryUiCssResourceReference());

		if (isNotEmpty(target.getJsResourceUrls())) {
			for (String r : target.getJsResourceUrls()) {
				response.renderJavascriptReference(r);
			}
		}

		if (isNotEmpty(target.getJsResourceReferences())) {
			for (JavascriptResourceReference r : target
					.getJsResourceReferences()) {
				response.renderJavascriptReference(r);
			}
		}

		if (isNotEmpty(target.getCssResourceReferences())) {
			for (ResourceReference r : target.getCssResourceReferences()) {
				response.renderCSSReference(r);
			}
		}

		if (isNotEmpty(target.getCssResourceUrls())) {
			for (String r : target.getCssResourceUrls()) {
				response.renderCSSReference(r);
			}
		}

		String script = this.renderDocumentReadyJavaScript(target);
		if (script != null)
			response.renderJavascript(script, UUID.randomUUID().toString());

		// clear contributors after rendering
		this.contributors.clear();

	}

	private String renderDocumentReadyJavaScript(
			JQHeaderContributionTarget target) {

		if (isEmpty(target.getJsStatements()))
			return null;

		JQStatement q = JQuery.documentReady(target.getJsStatements());
		IJavascriptCompressor compressor = Application.get()
				.getResourceSettings().getJavascriptCompressor();

		return compressor != null ? compressor.compress(q.render()) : q
				.render();
	}
}
