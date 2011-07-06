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

import com.google.code.jqwicket.api.IJQStatement;
import com.google.code.jqwicket.api.JQuery;
import org.apache.wicket.Application;
import org.apache.wicket.MetaDataKey;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.javascript.IJavascriptCompressor;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import static com.google.code.jqwicket.Utils.isEmpty;

/**
 * Wicket's {@link IHeaderContributor} implementation able to render all
 * necessary jquery/css resources gathered from the component hierarchy to the
 * html-page head section.
 *
 * @author mkalina
 */
public class JQContributionRenderer implements IHeaderContributor {

    private static final long serialVersionUID = 1L;

    private static final MetaDataKey<JQContributionRenderer> KEY = new MetaDataKey<JQContributionRenderer>() {
        private static final long serialVersionUID = 1L;
    };

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

        JQContributionConfig config = JQContributionConfig.get();
        JQHeaderContributionTarget target = new JQHeaderContributionTarget();
        for (IJQHeaderContributor c : this.contributors) {
            c.contribute(target);
        }

        if (!target.hasResourcesToRender())
            return;

        // 1. render global javascripts
        this.renderJavaScriptOutsideDocumentReady(response,
                target.getJQStatementsOutsideDocumentReady());

        // 2. render resources from global config
        this.renderJsResourcesUrl(response, config.getJqueryCoreJsUrl());
        this.renderJsResourcesRef(response,
                config.getJqueryCoreJsResourceReference());
        this.renderJsResourcesUrl(response, config.getJqueryUiJsUrl());
        this.renderJsResourcesRef(response,
                config.getJqueryUiJsResourceReference());
        this.renderCssResourcesUrl(response, config.getJqueryUiCssUrl());
        this.renderCssResourcesRef(response,
                config.getJqueryUiCssResourceReference());

        // 3. render resource explicitly added to the target
        this.renderJsResourcesUrls(response, target.getJsResourceUrls());
        this.renderJsResourcesRefs(response, target.getJsResourceReferences());
        this.renderCssResourcesUrls(response, target.getCssResourceUrls());
        this.renderCssResourcesRefs(response, target.getCssResourceReferences());
        this.renderJavaScriptInsideDocumentReady(response,
                target.getJQStatementsInsideDocumentReady());

        // clear contributors after rendering
        this.contributors.clear();

    }

    private void renderJsResourcesUrls(IHeaderResponse response,
                                       Collection<CharSequence> resources) {
        for (CharSequence url : resources) {
            renderJsResourcesUrl(response, url);
        }
    }

    private void renderJsResourcesUrl(IHeaderResponse response, CharSequence url) {
        if (Utils.isNotBlank(url))
            response.renderJavascriptReference(RequestCycle.get()
                    .getProcessor().getRequestCodingStrategy()
                    .rewriteStaticRelativeUrl(String.valueOf(url)));
    }

    private void renderJsResourcesRefs(IHeaderResponse response,
                                       Collection<JavascriptResourceReference> resources) {
        for (JavascriptResourceReference ref : resources) {
            renderJsResourcesRef(response, ref);
        }
    }

    private void renderJsResourcesRef(IHeaderResponse response,
                                      JavascriptResourceReference ref) {
        if (ref != null)
            response.renderJavascriptReference(ref);
    }

    private void renderCssResourcesUrls(IHeaderResponse response,
                                        Collection<CharSequence> resources) {
        for (CharSequence url : resources) {
            renderCssResourcesUrl(response, url);
        }
    }

    private void renderCssResourcesUrl(IHeaderResponse response,
                                       CharSequence url) {
        if (Utils.isNotBlank(url))
            response.renderCSSReference(RequestCycle.get().getProcessor()
                    .getRequestCodingStrategy()
                    .rewriteStaticRelativeUrl(String.valueOf(url)));
    }

    private void renderCssResourcesRefs(IHeaderResponse response,
                                        Collection<ResourceReference> resources) {
        for (ResourceReference ref : resources) {
            renderCssResourcesRef(response, ref);
        }
    }

    private void renderCssResourcesRef(IHeaderResponse response,
                                       ResourceReference ref) {
        if (ref != null)
            response.renderCSSReference(ref);
    }

    private void renderJavaScriptOutsideDocumentReady(IHeaderResponse response,
                                                      Collection<IJQStatement> statements) {

        if (isEmpty(statements))
            return;

        StringBuffer buf = new StringBuffer();
        for (IJQStatement s : statements) {
            buf.append(s);
        }
        response.renderJavascript(compressJavaScript(buf), UUID.randomUUID()
                .toString());
    }

    private void renderJavaScriptInsideDocumentReady(IHeaderResponse response,
                                                     Collection<IJQStatement> statements) {

        if (isEmpty(statements))
            return;

        JQContributionConfig config = JQContributionConfig.get();

        StringBuffer script = new StringBuffer();
        if (Utils.isNotBlank(config.getNonConflictAlias())) {
            script.append("var ").append(config.getNonConflictAlias())
                    .append(" = jQuery.noConflict();\n");
        }

        script.append(compressJavaScript(JQuery.documentReady(statements)));

        if (Utils.isNotBlank(script))
            response.renderJavascript(script, UUID.randomUUID().toString());
    }

    private CharSequence compressJavaScript(CharSequence script) {

        final IJavascriptCompressor compressor;

        if (JQContributionConfig.get().isUseYuiJavascriptCompressor())
            compressor = YuiJavascriptCompressor.get();
        else
            compressor = Application.get()
                    .getResourceSettings().getJavascriptCompressor();

        return (compressor != null && Utils.isNotBlank(script)) ? compressor
                .compress(String.valueOf(script)) : script;
    }
}
