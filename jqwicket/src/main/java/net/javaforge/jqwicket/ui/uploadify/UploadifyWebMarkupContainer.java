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
package net.javaforge.jqwicket.ui.uploadify;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.IJQOptions;
import net.javaforge.jqwicket.ui.JQWebMarkupContainer;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.IModel;

/**
 * @author mkalina
 * 
 */
public class UploadifyWebMarkupContainer extends
		JQWebMarkupContainer<UploadifyBehavior, UploadifyOptions> implements
		IUploadify {

	private static final long serialVersionUID = 1L;

	public UploadifyWebMarkupContainer(String id) {
		this(id, new UploadifyOptions());
	}

	public UploadifyWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new UploadifyOptions());
	}

	public UploadifyWebMarkupContainer(String id, IModel<?> model,
			UploadifyOptions options) {
		super(id, model, options);
	}

	public UploadifyWebMarkupContainer(String id, UploadifyOptions options) {
		super(id, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQUIWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected UploadifyBehavior newJQComponentBehavior(UploadifyOptions options) {
		return new UploadifyBehavior(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify()
	 */
	public JQFunction uploadify() {
		return this.behavior.uploadify();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadify(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.uploadify(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public JQFunction uploadify(IJQOptions<?> options) {
		return this.behavior.uploadify(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadify(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public void uploadify(AjaxRequestTarget ajaxRequestTarget,
			IJQOptions<?> options) {
		this.behavior.uploadify(ajaxRequestTarget, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyCancel(java.lang.String)
	 */
	public JQFunction uploadifyCancel(String id) {
		return this.behavior.uploadifyCancel(id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyCancel(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void uploadifyCancel(AjaxRequestTarget ajaxRequestTarget, String id) {
		this.behavior.uploadifyCancel(ajaxRequestTarget, id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyClearQueue()
	 */
	public JQFunction uploadifyClearQueue() {
		return this.behavior.uploadifyClearQueue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyClearQueue(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadifyClearQueue(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.uploadifyClearQueue(ajaxRequestTarget);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(java.lang.String,
	 *      java.lang.String)
	 */
	public JQFunction uploadifySettings(String name, String value) {
		return this.behavior.uploadifySettings(name, value);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String)
	 */
	public void uploadifySettings(AjaxRequestTarget ajaxRequestTarget,
			String name, String value) {
		this.behavior.uploadifySettings(ajaxRequestTarget, name, value);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(java.lang.String,
	 *      java.lang.String, boolean)
	 */
	public JQFunction uploadifySettings(String name, String value,
			boolean resetObject) {
		return this.behavior.uploadifySettings(name, value, resetObject);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifySettings(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String, java.lang.String, boolean)
	 */
	public void uploadifySettings(AjaxRequestTarget ajaxRequestTarget,
			String name, String value, boolean resetObject) {
		this.behavior.uploadifySettings(ajaxRequestTarget, name, value,
				resetObject);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload()
	 */
	public JQFunction uploadifyUpload() {
		return this.behavior.uploadifyUpload();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void uploadifyUpload(AjaxRequestTarget ajaxRequestTarget) {
		this.behavior.uploadifyUpload(ajaxRequestTarget);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(java.lang.String)
	 */
	public JQFunction uploadifyUpload(String id) {
		return this.behavior.uploadifyUpload(id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.uploadify.IUploadify#uploadifyUpload(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void uploadifyUpload(AjaxRequestTarget ajaxRequestTarget, String id) {
		this.behavior.uploadifyUpload(ajaxRequestTarget, id);
	}

}
