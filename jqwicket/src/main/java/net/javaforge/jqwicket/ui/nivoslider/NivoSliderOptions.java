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
package net.javaforge.jqwicket.ui.nivoslider;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.IJsonAware;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class NivoSliderOptions extends AbstractJQOptions<NivoSliderOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			NivoSliderOptions.class, "jquery.nivo.slider.js");

	public static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			NivoSliderOptions.class, "jquery.nivo.slider.pack.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			NivoSliderOptions.class, "nivo-slider.css");

	public enum Effect implements IJsonAware {

		SLICE_DOWN("sliceDown"), SLICE_DOWN_LEFT("sliceDownLeft"), SLICE_UP(
				"sliceUp"), SLICE_UP_LEFT("sliceUpLeft"), SLICE_UP_DOWN(
				"sliceUpDown"), SLICE_UP_DOWN_LEFT("sliceUpDownLeft"), FOLD(
				"fold"), FADE("fade"), RANDOM("random");

		private CharSequence effect;

		private Effect(CharSequence effect) {
			this.effect = effect;
		}

		/**
		 * {@inheritDoc}
		 * 
		 * @see net.javaforge.jqwicket.IJsonAware#toJson()
		 */
		public CharSequence toJson() {
			return this.effect;
		}
	}

	public NivoSliderOptions() {
		this.setJsResourceReferences(JS_RESOURCE);
		this.setJsResourceReferencesMin(JS_RESOURCE_MIN);
		this.setCssResourceReferences(CSS_RESOURCE);
	}

	/**
	 * Specify sets like: 'fold,fade,sliceDown'
	 * 
	 * @param effects
	 * @return
	 */
	public NivoSliderOptions effect(Effect... effects) {
		return super.put("effect", effects);
	}

	/**
	 * @param slices
	 * @return
	 */
	public NivoSliderOptions slices(int slices) {
		return super.put("slices", slices);
	}

	/**
	 * Slide transition speed
	 * 
	 * @param animSpeed
	 * @return
	 */
	public NivoSliderOptions animSpeed(int animSpeed) {
		return super.put("animSpeed", animSpeed);
	}

	/**
	 * @param pauseTime
	 * @return
	 */
	public NivoSliderOptions pauseTime(int pauseTime) {
		return super.put("pauseTime", pauseTime);
	}

	/**
	 * Set starting Slide (0 index)
	 * 
	 * @param startSlide
	 * @return
	 */
	public NivoSliderOptions startSlide(int startSlide) {
		return super.put("startSlide", startSlide);
	}

	/**
	 * Next & Prev
	 * 
	 * @param directionNav
	 * @return
	 */
	public NivoSliderOptions directionNav(boolean directionNav) {
		return super.put("directionNav", directionNav);
	}

	/**
	 * Only show on hover
	 * 
	 * @param directionNavHide
	 * @return
	 */
	public NivoSliderOptions directionNavHide(boolean directionNavHide) {
		return super.put("directionNavHide", directionNavHide);
	}

	/**
	 * 1,2,3...
	 * 
	 * @param controlNav
	 * @return
	 */
	public NivoSliderOptions controlNav(boolean controlNav) {
		return super.put("controlNav", controlNav);
	}

	/**
	 * Use thumbnails for Control Nav
	 * 
	 * @param controlNavThumbs
	 * @return
	 */
	public NivoSliderOptions controlNavThumbs(boolean controlNavThumbs) {
		return super.put("controlNavThumbs", controlNavThumbs);
	}

	/**
	 * Use image rel for thumbs
	 * 
	 * @param controlNavThumbsFromRel
	 * @return
	 */
	public NivoSliderOptions controlNavThumbsFromRel(
			boolean controlNavThumbsFromRel) {
		return super.put("controlNavThumbsFromRel", controlNavThumbsFromRel);
	}

	/**
	 * Replace this with...
	 * 
	 * @param controlNavThumbsSearch
	 * @return
	 */
	public NivoSliderOptions controlNavThumbsSearch(
			CharSequence controlNavThumbsSearch) {
		super.put("controlNavThumbsSearch", controlNavThumbsSearch);
		return this;
	}

	/**
	 * ...this in thumb Image src
	 * 
	 * @param controlNavThumbsReplace
	 * @return
	 */
	public NivoSliderOptions controlNavThumbsReplace(
			CharSequence controlNavThumbsReplace) {
		super.put("controlNavThumbsReplace", controlNavThumbsReplace);
		return this;
	}

	/**
	 * Use left & right arrows
	 * 
	 * @param keyboardNav
	 * @return
	 */
	public NivoSliderOptions keyboardNav(boolean keyboardNav) {
		super.put("keyboardNav", keyboardNav);
		return this;
	}

	/**
	 * Stop animation while hovering
	 * 
	 * @param pauseOnHover
	 * @return
	 */
	public NivoSliderOptions pauseOnHover(boolean pauseOnHover) {
		super.put("pauseOnHover", pauseOnHover);
		return this;
	}

	/**
	 * Force manual transitions
	 * 
	 * @param manualAdvance
	 * @return
	 */
	public NivoSliderOptions manualAdvance(boolean manualAdvance) {
		super.put("manualAdvance", manualAdvance);
		return this;
	}

	/**
	 * Universal caption opacity
	 * 
	 * @param captionOpacity
	 * @return
	 */
	public NivoSliderOptions captionOpacity(float captionOpacity) {
		super.put("captionOpacity", captionOpacity);
		return this;
	}

	/**
	 * Fires before change
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions beforeChangeEvent(CharSequence callbackBody) {
		return this.beforeChangeEvent(js(callbackBody));
	}

	/**
	 * Fires before change
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions beforeChangeEvent(JQStatement callbackBody) {
		return this.beforeChangeEvent($f(callbackBody));
	}

	/**
	 * Fires before change.
	 * 
	 * @param callback
	 * @return
	 */
	public NivoSliderOptions beforeChangeEvent(JQFunction callback) {
		super.put("beforeChange", callback);
		return this;
	}

	/**
	 * Fires after change
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions afterChangeEvent(CharSequence callbackBody) {
		return this.afterChangeEvent(js(callbackBody));
	}

	/**
	 * Fires after change
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions afterChangeEvent(JQStatement callbackBody) {
		return this.afterChangeEvent($f(callbackBody));
	}

	/**
	 * Fires after change
	 * 
	 * @param callback
	 * @return
	 */
	public NivoSliderOptions afterChangeEvent(JQFunction callback) {
		super.put("afterChange", callback);
		return this;
	}

	/**
	 * Triggers after all slides have been shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions slideshowEndEvent(CharSequence callbackBody) {
		return this.slideshowEndEvent(js(callbackBody));
	}

	/**
	 * Triggers after all slides have been shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions slideshowEndEvent(JQStatement callbackBody) {
		return this.slideshowEndEvent($f(callbackBody));
	}

	/**
	 * Triggers after all slides have been shown
	 * 
	 * @param callback
	 * @return
	 */
	public NivoSliderOptions slideshowEndEvent(JQFunction callback) {
		super.put("slideshowEnd", callback);
		return this;
	}

	/**
	 * Triggers when last slide is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions lastSlideEvent(CharSequence callbackBody) {
		return this.lastSlideEvent(js(callbackBody));
	}

	/**
	 * Triggers when last slide is shown
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions lastSlideEvent(JQStatement callbackBody) {
		return this.lastSlideEvent($f(callbackBody));
	}

	/**
	 * Triggers when last slide is shown
	 * 
	 * @param callback
	 * @return
	 */
	public NivoSliderOptions lastSlideEvent(JQFunction callback) {
		super.put("lastSlide", callback);
		return this;
	}

	/**
	 * Triggers when slider has loaded
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions afterLoadEvent(CharSequence callbackBody) {
		return this.afterLoadEvent(js(callbackBody));
	}

	/**
	 * Triggers when slider has loaded
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NivoSliderOptions afterLoadEvent(JQStatement callbackBody) {
		return this.afterLoadEvent($f(callbackBody));
	}

	/**
	 * Triggers when slider has loaded
	 * 
	 * @param callback
	 * @return
	 */
	public NivoSliderOptions afterLoadEvent(JQFunction callback) {
		super.put("afterLoad", callback);
		return this;
	}

}
