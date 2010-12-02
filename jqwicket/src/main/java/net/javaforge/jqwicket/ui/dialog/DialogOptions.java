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

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.IJQOptions;

/**
 * @author mkalina
 *
 */
public class DialogOptions extends AbstractJQOptions<DialogOptions> {

	private static final long serialVersionUID = 1L;

	public static enum Position {
		TOP, BOTTOM, CENTER, LEFT, RIGHT
	};

	public DialogOptions() {
		autoOpen(false);
		position(Position.CENTER);
	}

	public DialogOptions buttons(IJQOptions<?> options) {
		super.put("buttons", options);
		return this;
	}

	public DialogOptions disabled(boolean disabled) {
		super.put("disabled", disabled);
		return this;
	}

	public DialogOptions autoOpen(boolean autoOpen) {
		super.put("autoOpen", autoOpen);
		return this;
	}

	public DialogOptions closeOnEscape(boolean closeOnEscape) {
		super.put("closeOnEscape", closeOnEscape);
		return this;
	}

	public DialogOptions closeText(CharSequence closeText) {
		super.put("closeText", closeText);
		return this;
	}

	public DialogOptions dialogClass(CharSequence dialogClass) {
		super.put("dialogClass", dialogClass);
		return this;
	}

	public DialogOptions draggable(boolean draggable) {
		super.put("draggable", draggable);
		return this;
	}

	public DialogOptions height(int height) {
		super.put("height", height);
		return this;
	}

	public DialogOptions autoHeight(boolean auto) {
		super.put("height", auto);
		return this;
	}

	public DialogOptions hideEffect(CharSequence effect) {
		super.put("hide", effect);
		return this;
	}

	public DialogOptions maxHeight(int maxHeight) {
		super.put("maxHeight", maxHeight);
		return this;
	}

	public DialogOptions maxWidth(int maxWidth) {
		super.put("maxWidth", maxWidth);
		return this;
	}

	public DialogOptions minHeight(int minHeight) {
		super.put("minHeight", minHeight);
		return this;
	}

	public DialogOptions minWidth(int minWidth) {
		super.put("minWidth", minWidth);
		return this;
	}

	public DialogOptions modal(boolean modal) {
		super.put("modal", modal);
		return this;
	}

	public DialogOptions position(Position position) {
		super.put("position", position);
		return this;
	}

	public DialogOptions resizable(boolean resizable) {
		super.put("resizable", resizable);
		return this;
	}

	public DialogOptions showEffect(CharSequence effect) {
		super.put("show", effect);
		return this;
	}

	public DialogOptions stack(boolean stack) {
		super.put("stack", stack);
		return this;
	}

	/**
	 * Specifies the title of the dialog. Any valid HTML may be set as the
	 * title. The title can also be specified by the title attribute on the
	 * dialog source element.
	 * 
	 * @param title
	 * @return
	 */
	public DialogOptions title(CharSequence title) {
		super.put("title", title);
		return this;
	}

	public DialogOptions width(int width) {
		super.put("width", width);
		return this;
	}

	public DialogOptions zIndex(int zIndex) {
		super.put("zIndex", zIndex);
		return this;
	}

	public DialogOptions bgiframe(boolean bgiframe) {
		super.put("bgiframe", bgiframe);
		return this;
	}

	/**
	 * Set's the callback before the dialog is closing. If the beforeclose event
	 * handler (callback function) returns false, the close will be prevented
	 * 
	 * @param beforeclose
	 * @return instance of the current component
	 */
	public DialogOptions beforeCloseEvent(JQFunction callback) {
		super.put("beforeclose", callback);
		return this;
	}

	public DialogOptions beforeCloseEvent(CharSequence callbackBody) {
		return this.beforeCloseEvent(js(callbackBody));
	}

	public DialogOptions beforeCloseEvent(JQStatement callbackBody) {
		super.put("beforeclose", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback before the dialog is closed.
	 * 
	 * @param close
	 * @return instance of the current component
	 */
	public DialogOptions closeEvent(JQFunction callback) {
		super.put("close", callback);
		return this;
	}

	public DialogOptions closeEvent(CharSequence callbackBody) {
		return this.closeEvent(js(callbackBody));
	}

	public DialogOptions closeEvent(JQStatement callbackBody) {
		super.put("close", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog is dragged.
	 * 
	 * @param drag
	 * @return instance of the current component
	 */
	public DialogOptions dragEvent(JQFunction callback) {
		super.put("drag", callback);
		return this;
	}

	public DialogOptions dragEvent(CharSequence callbackBody) {
		return this.dragEvent(js(callbackBody));
	}

	public DialogOptions dragEvent(JQStatement callbackBody) {
		super.put("drag", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog is being dragged.
	 * 
	 * @param dragStart
	 * @return instance of the current component
	 */
	public DialogOptions dragStartEvent(JQFunction callback) {
		super.put("dragStart", callback);
		return this;
	}

	public DialogOptions dragStartEvent(CharSequence callbackBody) {
		return this.dragStartEvent(js(callbackBody));
	}

	public DialogOptions dragStartEvent(JQStatement callbackBody) {
		super.put("dragStart", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog has been dragged.
	 * 
	 * @param dragStop
	 * @return instance of the current component
	 */
	public DialogOptions dragStopEvent(JQFunction callback) {
		super.put("dragStop", callback);
		return this;
	}

	public DialogOptions dragStopEvent(CharSequence callbackBody) {
		return this.dragStopEvent(js(callbackBody));
	}

	public DialogOptions dragStopEvent(JQStatement callbackBody) {
		super.put("dragStop", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog gains focus.
	 * 
	 * @param focus
	 * @return instance of the current component
	 */
	public DialogOptions focusEvent(JQFunction callback) {
		super.put("focus", callback);
		return this;
	}

	public DialogOptions focusEvent(CharSequence callbackBody) {
		return this.focusEvent(js(callbackBody));
	}

	public DialogOptions focusEvent(JQStatement callbackBody) {
		super.put("focus", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback before the dialog is opening.
	 * 
	 * @param open
	 * @return instance of the current component
	 */
	public DialogOptions openEvent(JQFunction callback) {
		super.put("open", callback);
		return this;
	}

	public DialogOptions openEvent(CharSequence callbackBody) {
		return this.openEvent(js(callbackBody));
	}

	public DialogOptions openEvent(JQStatement callbackBody) {
		super.put("open", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog is resized.
	 * 
	 * @param resize
	 * @return instance of the current component
	 */
	public DialogOptions resizeEvent(JQFunction callback) {
		super.put("resize", callback);
		return this;
	}

	public DialogOptions resizeEvent(CharSequence callbackBody) {
		return this.resizeEvent(js(callbackBody));
	}

	public DialogOptions resizeEvent(JQStatement callbackBody) {
		super.put("resize", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog is being resized.
	 * 
	 * @param resizeStart
	 * @return instance of the current component
	 */
	public DialogOptions resizeStartEvent(JQFunction callback) {
		super.put("resizeStart", callback);
		return this;
	}

	/**
	 * Set's the callback when the dialog is being resized.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DialogOptions resizeStartEvent(CharSequence callbackBody) {
		return this.resizeStartEvent(js(callbackBody));
	}

	/**
	 * Set's the callback when the dialog is being resized.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DialogOptions resizeStartEvent(JQStatement callbackBody) {
		super.put("resizeStart", $f(callbackBody, "event", "ui"));
		return this;
	}

	/**
	 * Set's the callback when the dialog has been resized.
	 * 
	 * @param resizeStop
	 * @return instance of the current component
	 */
	public DialogOptions resizeStopEvent(JQFunction callback) {
		super.put("resizeStop", callback);
		return this;
	}

	/**
	 * Set's the callback when the dialog has been resized.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DialogOptions resizeStopEvent(CharSequence callbackBody) {
		return this.resizeStopEvent(js(callbackBody));
	}

	/**
	 * Set's the callback when the dialog has been resized.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public DialogOptions resizeStopEvent(JQStatement callbackBody) {
		super.put("resizeStop", $f(callbackBody, "event", "ui"));
		return this;
	}

}
