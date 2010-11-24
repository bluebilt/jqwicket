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
package net.javaforge.jqwicket.ui.dialog;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.Utils;
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 *
 */
public class DialogBehavior extends JQUIComponentBehaivor<DialogOptions>
		implements IDialog {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "dialog";

	public DialogBehavior() {
		this(new DialogOptions());
	}

	public DialogBehavior(DialogOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	public DialogBehavior addButtons(DialogButton... buttons) {

		if (Utils.isEmpty(buttons)) {
			this.options.removeOption("buttons");
			return this;
		}
		this.options.putUnquoted("buttons", Utils.toJson(buttons));
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#open()
	 */
	public JQFunction open() {
		return chain("'open'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#open(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void open(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.open());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#close()
	 */
	public JQFunction close() {
		return chain("'close'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#close(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void close(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.close());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#isOpen()
	 */
	public JQFunction isOpen() {
		return chain("'isOpen'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#isOpen(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void isOpen(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.isOpen());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#moveToTop()
	 */
	public JQFunction moveToTop() {
		return chain("'moveToTop'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.dialog.IDialog#moveToTop(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void moveToTop(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.moveToTop());
	}

}
