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
package com.google.code.jqwicket.ui.mobilymap;

import static com.google.code.jqwicket.JQuery.$f;
import static com.google.code.jqwicket.JQuery.js;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.JQFunction;
import com.google.code.jqwicket.JQStatement;
import com.google.code.jqwicket.ui.AbstractJQOptions;

/**
 * @author mkalina
 * 
 */
public class MobilyMapOptions extends AbstractJQOptions<MobilyMapOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			MobilyMapOptions.class, "js/mobilymap.js");

	public static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			MobilyMapOptions.class, "js/mobilymap.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			MobilyMapOptions.class, "css/mobilymap.css");

	public MobilyMapOptions() {
		this.setJsResourceReferences(JS_RESOURCE);
		this.setJsResourceReferencesMin(JS_RESOURCE_MIN);
		this.setCssResourceReferences(CSS_RESOURCE);
	}

	/**
	 * map position after loading - 'X Y', 'center', 'top left', 'top right',
	 * 'bottom left', 'bottom right'
	 * 
	 * @param position
	 * @return
	 */
	public MobilyMapOptions position(CharSequence position) {
		return super.put("position", position);
	}

	/**
	 * Default: bubble
	 * 
	 * @param popupClass
	 * @return
	 */
	public MobilyMapOptions popupClass(CharSequence popupClass) {
		return super.put("popupClass", popupClass);
	}

	/**
	 * Default: point
	 * 
	 * @param markerClass
	 * @return
	 */
	public MobilyMapOptions markerClass(CharSequence markerClass) {
		return super.put("markerClass", markerClass);
	}

	/**
	 * show popup on marker click - true/false<br>
	 * 
	 * default: true
	 * 
	 * @param popup
	 * @return
	 */
	public MobilyMapOptions popup(boolean popup) {
		return super.put("popup", popup);
	}

	/**
	 * remember last map position - true/false<br>
	 * 
	 * default: true
	 * 
	 * @param cookies
	 * @return
	 */
	public MobilyMapOptions cookies(boolean cookies) {
		return super.put("cookies", cookies);
	}

	/**
	 * show caption - true/false<br>
	 * 
	 * default: true
	 * 
	 * @param caption
	 * @return
	 */
	public MobilyMapOptions caption(boolean caption) {
		return super.put("caption", caption);
	}

	/**
	 * sets the map view to the center on marker click<br>
	 * 
	 * default: true
	 * 
	 * @param setCenter
	 * @return
	 */
	public MobilyMapOptions setCenter(boolean setCenter) {
		return super.put("setCenter", setCenter);
	}

	/**
	 * display buttons to pan in four directions<br>
	 * 
	 * default: true
	 * 
	 * @param navigation
	 * @return
	 */
	public MobilyMapOptions navigation(boolean navigation) {
		return super.put("navigation", navigation);
	}

	/**
	 * speed of panning map (higher value for slow panning)<br>
	 * 
	 * default: 1000
	 * 
	 * @param navSpeed
	 * @return
	 */
	public MobilyMapOptions navSpeed(int navSpeed) {
		return super.put("navSpeed", navSpeed);
	}

	/**
	 * default: navBtn
	 * 
	 * @param navBtnClass
	 * @return
	 */
	public MobilyMapOptions navBtnClass(CharSequence navBtnClass) {
		return super.put("navBtnClass", navBtnClass);
	}

	/**
	 * selector, only anchors eg. '.map_buttons a'<br>
	 * 
	 * @param selector
	 * @return
	 */
	public MobilyMapOptions outsideButtons(CharSequence selector) {
		return super.put("outsideButtons", selector);
	}

	/**
	 * call the function on marker click (popup must be disabled)
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions markerClickEvent(CharSequence callbackBody) {
		return this.markerClickEvent(js(callbackBody));
	}

	/**
	 * call the function on marker click (popup must be disabled)
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions markerClickEvent(JQStatement callbackBody) {
		return this.markerClickEvent($f(callbackBody));
	}

	/**
	 * call the function on marker click (popup must be disabled)
	 * 
	 * @param callback
	 * @return
	 */
	public MobilyMapOptions markerClickEvent(JQFunction callback) {
		super.put("onMarkerClick", callback);
		return this;
	}

	/**
	 * call the function after popup closing
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions popupCloseEvent(CharSequence callbackBody) {
		return this.popupCloseEvent(js(callbackBody));
	}

	/**
	 * call the function after popup closing
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions popupCloseEvent(JQStatement callbackBody) {
		return this.popupCloseEvent($f(callbackBody));
	}

	/**
	 * call the function after popup closing
	 * 
	 * @param callback
	 * @return
	 */
	public MobilyMapOptions popupCloseEvent(JQFunction callback) {
		super.put("onPopupClose", callback);
		return this;
	}

	/**
	 * call the function after loading map
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions mapLoadEvent(CharSequence callbackBody) {
		return this.mapLoadEvent(js(callbackBody));
	}

	/**
	 * call the function after loading map
	 * 
	 * @param callbackBody
	 * @return
	 */
	public MobilyMapOptions mapLoadEvent(JQStatement callbackBody) {
		return this.mapLoadEvent($f(callbackBody));
	}

	/**
	 * call the function after loading map
	 * 
	 * @param callback
	 * @return
	 */
	public MobilyMapOptions mapLoadEvent(JQFunction callback) {
		super.put("onMapLoad", callback);
		return this;
	}
}
