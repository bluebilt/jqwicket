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
package net.javaforge.jqwicket.ui.accordion;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.effect.Effect;
import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.IJQOptions;

/**
 * @author mkalina
 * 
 */
public class AccordionOptions extends AbstractJQOptions<AccordionOptions> {

	private static final long serialVersionUID = 1L;

	/**
	 * Disables (true) or enables (false) the accordion. Can be set when
	 * initialising (first creating) the accordion. Default:false
	 * 
	 * @param disabled
	 * @return
	 */
	public AccordionOptions disabled(boolean disabled) {
		super.put("disabled", disabled);
		return this;
	}

	/**
	 * Set to false to display none at start. Needs collapsible: true.
	 * Default:first child
	 * 
	 * @param active
	 * @return
	 */
	public AccordionOptions active(boolean active) {
		super.put("active", active);
		return this;
	}

	/**
	 * Selector for the active element. Needs collapsible: true. Default:first
	 * child
	 * 
	 * @param activeSelector
	 * @return
	 */
	public AccordionOptions active(CharSequence activeSelector) {
		super.put("active", activeSelector);
		return this;
	}

	/**
	 * Zero-base number for the active element. Needs collapsible: true.
	 * Default:first child
	 * 
	 * @param activeNumber
	 * @return
	 */
	public AccordionOptions active(int activeNumber) {
		super.put("active", activeNumber);
		return this;
	}

	/**
	 * Disable animations.
	 * 
	 * @param animated
	 * @return
	 */
	public AccordionOptions animated(boolean animated) {
		super.put("animated", animated);
		return this;
	}

	/**
	 * Choose your favorite animation. In addition to the default, 'bounceslide'
	 * and all defined easing methods are supported ('bounceslide' requires UI
	 * Effects Core). Default:'slide'
	 * 
	 * @param animated
	 * @return
	 */
	public AccordionOptions animated(Effect animated) {
		super.put("animated", animated);
		return this;
	}

	/**
	 * If set, the highest content part is used as height reference for all
	 * other parts. Provides more consistent animations. Default:true
	 * 
	 * @param autoHeight
	 * @return
	 */
	public AccordionOptions autoHeight(boolean autoHeight) {
		super.put("autoHeight", autoHeight);
		return this;
	}

	/**
	 * If set, clears height and overflow styles after finishing animations.
	 * This enables accordions to work with dynamic content. Won't work together
	 * with autoHeight. Default:false
	 * 
	 * @param clearStyle
	 * @return
	 */
	public AccordionOptions clearStyle(boolean clearStyle) {
		super.put("clearStyle", clearStyle);
		return this;
	}

	/**
	 * Whether all the sections can be closed at once. Allows collapsing the
	 * active section by the triggering event (click is the default).
	 * Default:false
	 * 
	 * @param collapsible
	 * @return
	 */
	public AccordionOptions collapsible(boolean collapsible) {
		super.put("collapsible", collapsible);
		return this;
	}

	/**
	 * The event on which to trigger the accordion. Default: click
	 * 
	 * @param event
	 * @return
	 */
	public AccordionOptions event(CharSequence event) {
		super.put("event", event);
		return this;
	}

	/**
	 * If set, the accordion completely fills the height of the parent element.
	 * Overrides autoheight. Default:false
	 * 
	 * @param fillSpace
	 * @return
	 */
	public AccordionOptions fillSpace(boolean fillSpace) {
		super.put("fillSpace", fillSpace);
		return this;
	}

	/**
	 * Selector for the header element.
	 * 
	 * @param selector
	 * @return
	 */
	public AccordionOptions header(CharSequence selector) {
		super.put("header", selector);
		return this;
	}

	/**
	 * Icons to use for headers. Icons may be specified for 'header' and
	 * 'headerSelected', and we recommend using the icons native to the jQuery
	 * UI CSS Framework manipulated by jQuery UI ThemeRoller
	 * 
	 * @param icons
	 * @return
	 */
	public AccordionOptions icons(IJQOptions<?> icons) {
		super.put("icons", icons);
		return this;
	}

	/**
	 * If set, looks for the anchor that matches location.href and activates it.
	 * Great for href-based state-saving. Use navigationFilter to implement your
	 * own matcher.
	 * 
	 * @param navigation
	 * @return
	 */
	public AccordionOptions navigation(boolean navigation) {
		super.put("navigation", navigation);
		return this;
	}

	/**
	 * Overwrite the default location.href-matching with your own matcher.
	 * 
	 * @param navigationFilter
	 * @return
	 */
	public AccordionOptions navigationFilter(JQFunction navigationFilter) {
		super.put("navigationFilter", navigationFilter);
		return this;
	}

	/**
	 * Overwrite the default location.href-matching with your own matcher.
	 * 
	 * @param js
	 * @param args
	 * @return
	 */
	public AccordionOptions navigationFilter(CharSequence js,
			CharSequence... args) {
		return this.navigationFilter($f(js, args));
	}

	/**
	 * This event is triggered every time the accordion changes. If the
	 * accordion is animated, the event will be triggered upon completion of the
	 * animation; otherwise, it is triggered immediately.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public AccordionOptions changeEvent(CharSequence callbackBody) {
		return this.changeEvent(js(callbackBody));
	}

	/**
	 * This event is triggered every time the accordion changes. If the
	 * accordion is animated, the event will be triggered upon completion of the
	 * animation; otherwise, it is triggered immediately.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public AccordionOptions changeEvent(JQStatement callbackBody) {
		return this.changeEvent($f(callbackBody, "event", "ui"));
	}

	/**
	 * This event is triggered every time the accordion changes. If the
	 * accordion is animated, the event will be triggered upon completion of the
	 * animation; otherwise, it is triggered immediately.
	 * 
	 * @param callback
	 * @return
	 */
	public AccordionOptions changeEvent(JQFunction callback) {
		super.put("change", callback);
		return this;
	}

	/**
	 * This event is triggered every time the accordion starts to change.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public AccordionOptions changestartEvent(CharSequence callbackBody) {
		return this.changeEvent(js(callbackBody));
	}

	/**
	 * This event is triggered every time the accordion starts to change.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public AccordionOptions changestartEvent(JQStatement callbackBody) {
		return this.changeEvent($f(callbackBody, "event", "ui"));
	}

	/**
	 * This event is triggered every time the accordion starts to change.
	 * 
	 * @param callback
	 * @return
	 */
	public AccordionOptions changestartEvent(JQFunction callback) {
		super.put("changestart", callback);
		return this;
	}
}
