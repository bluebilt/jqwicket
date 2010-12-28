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
package net.javaforge.jqwicket.ui.colorpicker;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.JQOptions;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class ColorPickerOptions extends AbstractJQOptions<ColorPickerOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			ColorPickerOptions.class, "js/colorpicker.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			ColorPickerOptions.class, "css/colorpicker.css");

	public ColorPickerOptions() {
		this.setJsResourceReferences(JS_RESOURCE);
		this.setCssResourceReferences(CSS_RESOURCE);
	}

	/**
	 * The desired event to trigger the colorpicker. Default: 'click'
	 * 
	 * @param eventName
	 * @return
	 */
	public ColorPickerOptions eventName(CharSequence eventName) {
		super.put("eventName", eventName);
		return this;
	}

	/**
	 * The default color. String for hex color or hash for RGB and HSB ({r:255,
	 * r:0, b:0}) . Default: 'ff0000'
	 * 
	 * @param color
	 * @return
	 */
	public ColorPickerOptions color(CharSequence color) {
		super.put("color", color);
		return this;
	}

	/**
	 * The default color. String for hex color or hash for RGB and HSB ({r:255,
	 * r:0, b:0}) . Default: 'ff0000'
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @return
	 */
	public ColorPickerOptions color(int r, int g, int b) {
		super.putUnquoted("color",
				new JQOptions().put("r", r).put("g", g).put("b", b)
						.toJson());
		return this;
	}

	/**
	 * Whatever if the color picker is appended to the element or triggered by
	 * an event. Default false
	 * 
	 * @param flat
	 * @return
	 */
	public ColorPickerOptions flat(boolean flat) {
		super.put("flat", flat);
		return this;
	}

	/**
	 * Whatever if the color values are filled in the fields while changing
	 * values on selector or a field. If false it may improve speed. Default
	 * true
	 * 
	 * @param livePreview
	 * @return
	 */
	public ColorPickerOptions livePreview(boolean livePreview) {
		super.put("livePreview", livePreview);
		return this;
	}

	/**
	 * Callback function triggered when the color picker is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onShowEvent(CharSequence callbackBody) {
		return this.onShowEvent(js(callbackBody));
	}

	/**
	 * Callback function triggered when the color picker is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onShowEvent(JQStatement callbackBody) {
		return this.onShowEvent($f(callbackBody, "colpkr"));
	}

	/**
	 * Callback function triggered when the color picker is shown
	 * 
	 * @param callback
	 * @return
	 */
	public ColorPickerOptions onShowEvent(JQFunction callback) {
		super.put("onShow", callback);
		return this;
	}

	/**
	 * Callback function triggered before the color picker is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onBeforeShowEvent(CharSequence callbackBody) {
		return this.onBeforeShowEvent(js(callbackBody));
	}

	/**
	 * Callback function triggered before the color picker is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onBeforeShowEvent(JQStatement callbackBody) {
		return this.onBeforeShowEvent($f(callbackBody));
	}

	/**
	 * Callback function triggered before the color picker is shown
	 * 
	 * @param callback
	 * @return
	 */
	public ColorPickerOptions onBeforeShowEvent(JQFunction callback) {
		super.put("onBeforeShow", callback);
		return this;
	}

	/**
	 * Callback function triggered when the color picker is hidden
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onHideEvent(CharSequence callbackBody) {
		return this.onHideEvent(js(callbackBody));
	}

	/**
	 * Callback function triggered when the color picker is hidden
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onHideEvent(JQStatement callbackBody) {
		return this.onHideEvent($f(callbackBody, "colpkr"));
	}

	/**
	 * Callback function triggered when the color picker is hidden
	 * 
	 * @param callback
	 * @return
	 */
	public ColorPickerOptions onHideEvent(JQFunction callback) {
		super.put("onHide", callback);
		return this;
	}

	/**
	 * Callback function triggered when the color is changed
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onChangeEvent(CharSequence callbackBody) {
		return this.onChangeEvent(js(callbackBody));
	}

	/**
	 * Callback function triggered when the color is changed
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onChangeEvent(JQStatement callbackBody) {
		return this.onChangeEvent($f(callbackBody, "hsb", "hex", "rgb"));
	}

	/**
	 * Callback function triggered when the color is changed
	 * 
	 * @param callback
	 * @return
	 */
	public ColorPickerOptions onChangeEvent(JQFunction callback) {
		super.put("onChange", callback);
		return this;
	}

	/**
	 * Callback function triggered when the color it is chosen
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onSubmitEvent(CharSequence callbackBody) {
		return this.onSubmitEvent(js(callbackBody));
	}

	/**
	 * Callback function triggered when the color it is chosen
	 * 
	 * @param callbackBody
	 * @return
	 */
	public ColorPickerOptions onSubmitEvent(JQStatement callbackBody) {
		return this.onSubmitEvent($f(callbackBody));
	}

	/**
	 * Callback function triggered when the color it is chosen
	 * 
	 * @param callback
	 * @return
	 */
	public ColorPickerOptions onSubmitEvent(JQFunction callback) {
		super.put("onSubmit", callback);
		return this;
	}
}
