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
package net.javaforge.jqwicket.ui.mb.extruder;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.IJsonAware;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.Utils;
import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.DefaultJQOptions;
import net.javaforge.jqwicket.ui.mb.fliptext.FlipTextOptions;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class ExtruderOptions extends AbstractJQOptions<ExtruderOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_METADATA_RESOURCE = new JavascriptResourceReference(
			ExtruderOptions.class, "jquery.metadata.js");

	public static final JavascriptResourceReference JS_HOVER_RESOURCE = new JavascriptResourceReference(
			ExtruderOptions.class, "jquery.hoverIntent.min.js");

	public static final JavascriptResourceReference JS_EXTRUDER_RESOURCE = new JavascriptResourceReference(
			ExtruderOptions.class, "mbExtruder.js");

	public static final JavascriptResourceReference JS_FLIPTEXT_RESOURCE = new JavascriptResourceReference(
			FlipTextOptions.class, "jquery.mb.flipText.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			ExtruderOptions.class, "css/mbExtruder.css");

	public enum Position implements IJsonAware {

		TOP, LEFT, RIGHT, BOTTOM;

		public CharSequence toJson() {
			return this.name().toLowerCase();
		}
	}

	public enum TextOrientation implements IJsonAware {

		TB, BT;

		public CharSequence toJson() {
			return this.name().toLowerCase();
		}
	}

	private CharSequence title;

	private CharSequence url;

	public ExtruderOptions(CharSequence title) {
		this(title, null);
	}

	public ExtruderOptions(CharSequence title, CharSequence url) {
		this.setJsResourceReferences(JS_METADATA_RESOURCE, JS_HOVER_RESOURCE,
				JS_FLIPTEXT_RESOURCE, JS_EXTRUDER_RESOURCE);
		this.setCssResourceReferences(CSS_RESOURCE);
		this.title = title;
		this.url = url;
	}

	public CharSequence getTitle() {
		return title;
	}

	public CharSequence getUrl() {
		return url;
	}

	public CharSequence getExtruderClass() {
		DefaultJQOptions opt = new DefaultJQOptions().putDblquoted("title",
				this.title);
		if (Utils.isNotBlank(this.url)) {
			opt.putDblquoted("url", this.url);
		}
		return opt.toJson();
	}

	public ExtruderOptions positionFixed(boolean positionFixed) {
		return super.put("positionFixed", positionFixed);
	}

	/**
	 * the width of the sliding panel<br>
	 * Default: 350
	 * 
	 * @param width
	 * @return
	 */
	public ExtruderOptions width(int width) {
		return super.put("width", width);
	}

	/**
	 * the time in milliseconds to wait befor the slider will open without a
	 * click event<br>
	 * Default: 800
	 * 
	 * @param sensibility
	 * @return
	 */
	public ExtruderOptions sensibility(int sensibility) {
		return super.put("sensibility", sensibility);
	}

	/**
	 * to define if the slider is on top, left, right or bottom of your page <br>
	 * Default: top
	 * 
	 * @param position
	 * @return
	 */
	public ExtruderOptions position(Position position) {
		return super.put("position", position);
	}

	/**
	 * the opacity of the sliding panel once it’s closed (doesn’t work in IE)<br>
	 * Default: 1
	 * 
	 * @param extruderOpacity
	 * @return
	 */
	public ExtruderOptions extruderOpacity(float extruderOpacity) {
		return super.put("extruderOpacity", extruderOpacity);
	}

	/**
	 * the width or height (depends on the extruder position) of the flap
	 * containing the title<br>
	 * Default: 100
	 * 
	 * @param flapDim
	 * @return
	 */
	public ExtruderOptions flapDim(int flapDim) {
		return super.put("flapDim", flapDim);
	}

	public ExtruderOptions flapMargin(int flapMargin) {
		return super.put("flapMargin", flapMargin);
	}

	/**
	 * “tb”, or “bt” the orientation of the text for titles in the left panel
	 * flaps
	 * 
	 * @param textOrientation
	 * @return
	 */
	public ExtruderOptions textOrientation(TextOrientation textOrientation) {
		return super.put("textOrientation", textOrientation);
	}

	/**
	 * the time in milliseconds for the slide transition<br>
	 * Default: 300
	 * 
	 * @param slideTimer
	 * @return
	 */
	public ExtruderOptions slideTimer(int slideTimer) {
		return super.put("slideTimer", slideTimer);
	}

	/**
	 * define if last subpanel should stay opened or not on next extruder open<br>
	 * Default:true
	 * 
	 * @param hidePanelsOnClose
	 * @return
	 */
	public ExtruderOptions hidePanelsOnClose(boolean hidePanelsOnClose) {
		return super.put("hidePanelsOnClose", hidePanelsOnClose);
	}

	/**
	 * define the time in milliseconds the extruder should close on mouse out;
	 * 0=never<br>
	 * Default: 0
	 * 
	 * @param autoCloseTime
	 * @return
	 */
	public ExtruderOptions autoCloseTime(int autoCloseTime) {
		return super.put("autoCloseTime", autoCloseTime);
	}

	/**
	 * define top positiony<br>
	 * Default: auto
	 * 
	 * @param top
	 * @return
	 */
	public ExtruderOptions top(int top) {
		return super.put("top", top);
	}

	public ExtruderOptions accordionPanels(boolean accordionPanels) {
		return super.put("accordionPanels", accordionPanels);
	}

	public ExtruderOptions onExtOpenEvent(CharSequence callbackBody) {
		return this.onExtOpenEvent(js(callbackBody));
	}

	public ExtruderOptions onExtOpenEvent(JQStatement callbackBody) {
		return this.onExtOpenEvent($f(callbackBody));
	}

	public ExtruderOptions onExtOpenEvent(JQFunction callback) {
		super.put("onExtOpen", callback);
		return this;
	}

	public ExtruderOptions onExtContentLoadEvent(CharSequence callbackBody) {
		return this.onExtContentLoadEvent(js(callbackBody));
	}

	public ExtruderOptions onExtContentLoadEvent(JQStatement callbackBody) {
		return this.onExtContentLoadEvent($f(callbackBody));
	}

	public ExtruderOptions onExtContentLoadEvent(JQFunction callback) {
		super.put("onExtContentLoad", callback);
		return this;
	}

	public ExtruderOptions onExtCloseEvent(CharSequence callbackBody) {
		return this.onExtCloseEvent(js(callbackBody));
	}

	public ExtruderOptions onExtCloseEvent(JQStatement callbackBody) {
		return this.onExtCloseEvent($f(callbackBody));
	}

	public ExtruderOptions onExtCloseEvent(JQFunction callback) {
		super.put("onExtClose", callback);
		return this;
	}
}
