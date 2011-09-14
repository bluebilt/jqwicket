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
import org.apache.wicket.Component;
import org.apache.wicket.MetaDataKey;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.javascript.IJavaScriptCompressor;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import static com.google.code.jqwicket.Utils.isEmpty;

/**
 * Wicket's {@link IHeaderContributor} implementation able to render all necessary jquery/css resources gathered from
 * the component hierarchy to the html-page head section.
 *
 * @author mkalina
 */
public class JQContributionRenderer extends Behavior {

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


    public JQContributionRenderer addContributors(Collection<? extends IJQHeaderContributor> contributors) {

        if (this.contributors == null)
            this.contributors = new LinkedHashSet<IJQHeaderContributor>();

        if (Utils.isNotEmpty(contributors))
            this.contributors.addAll(contributors);

        return this;
    }

    public JQContributionRenderer addContributor(IJQHeaderContributor contributor) {

        if (this.contributors == null)
            this.contributors = new LinkedHashSet<IJQHeaderContributor>();

        this.contributors.add(contributor);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void renderHead(Component component, IHeaderResponse response) {

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
            response.renderJavaScriptReference(RequestCycle.get()
                    .getUrlRenderer().renderContextRelativeUrl(String.valueOf(url)));
    }

    private void renderJsResourcesRefs(IHeaderResponse response,
                                       Collection<JavaScriptResourceReference> resources) {
        for (JavaScriptResourceReference ref : resources) {
            renderJsResourcesRef(response, ref);
        }
    }

    private void renderJsResourcesRef(IHeaderResponse response,
                                      JavaScriptResourceReference ref) {
        if (ref != null)
            response.renderJavaScriptReference(ref);
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
            response.renderCSSReference(RequestCycle.get()
                    .getUrlRenderer().renderContextRelativeUrl(String.valueOf(url)));
    }

    private void renderCssResourcesRefs(IHeaderResponse response,
                                        Collection<CssResourceReference> resources) {
        for (CssResourceReference ref : resources) {
            renderCssResourcesRef(response, ref);
        }
    }

    private void renderCssResourcesRef(IHeaderResponse response,
                                       CssResourceReference ref) {
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
        response.renderJavaScript(compressJavaScript(buf), UUID.randomUUID()
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
            response.renderJavaScript(script, UUID.randomUUID().toString());
    }

    private CharSequence compressJavaScript(CharSequence script) {

        final IJavaScriptCompressor compressor;

        if (JQContributionConfig.get().isUseYuiJavascriptCompressor())
            compressor = YuiJavascriptCompressor.get();
        else
            compressor = Application.get()
                    .getResourceSettings().getJavaScriptCompressor();

        return (compressor != null && Utils.isNotBlank(script)) ? compressor
                .compress(String.valueOf(script)) : script;
    }
}
