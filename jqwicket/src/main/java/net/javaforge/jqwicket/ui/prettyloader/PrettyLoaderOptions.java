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
package net.javaforge.jqwicket.ui.prettyloader;

import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * @author mkalina
 * 
 */
public class PrettyLoaderOptions extends AbstractJQOptions<PrettyLoaderOptions> {

	private static final long serialVersionUID = 1L;

	private static final JavascriptResourceReference jsResource = new JavascriptResourceReference(
			PrettyLoaderOptions.class, "js/jquery.prettyLoader.js");

	private static final JavascriptResourceReference jsResourceMin = new JavascriptResourceReference(
			PrettyLoaderOptions.class, "js/jquery.prettyLoader.min.js");

	private static final ResourceReference cssResource = new ResourceReference(
			PrettyLoaderOptions.class, "css/prettyLoader.css");

	private static final ResourceReference ajaxLoaderGif = new ResourceReference(
			PrettyLoaderOptions.class, "images/prettyLoader/ajax-loader.gif");

	public PrettyLoaderOptions() {
		this.setJsResourceReferences(jsResource);
		this.setJsResourceReferencesMin(jsResourceMin);
		this.setCssResourceReferences(cssResource);
		this.loader(RequestCycle.get().urlFor(ajaxLoaderGif));
	}

	/**
	 * Animation speed. fast/normal/slow/integer
	 * 
	 * @param speed
	 * @return
	 */
	public PrettyLoaderOptions animation_speed(CharSequence speed) {
		return super.put("animation_speed", speed);
	}

	/**
	 * Animation speed. fast/normal/slow/integer
	 * 
	 * @param speed
	 * @return
	 */
	public PrettyLoaderOptions animation_speed(int speed) {
		return super.put("animation_speed", speed);
	}

	/**
	 * Binds pretty loader to jquery's ajax loading "load()" method.
	 * 
	 * @param bindToAjax
	 * @return
	 */
	public PrettyLoaderOptions bind_to_ajax(boolean bindToAjax) {
		return super.put("bind_to_ajax", bindToAjax);
	}

	/**
	 * false OR time in milliseconds (ms)
	 * 
	 * @param delay
	 * @return
	 */
	public PrettyLoaderOptions delay(boolean delay) {
		return super.put("delay", delay);
	}

	/**
	 * false OR time in milliseconds (ms)
	 * 
	 * @param delay
	 * @return
	 */
	public PrettyLoaderOptions delay(int millis) {
		return super.put("delay", millis);
	}

	/**
	 * Path to your loader gif
	 * 
	 * @param loader
	 * @return
	 */
	public PrettyLoaderOptions loader(CharSequence loader) {
		return super.put("loader", loader);
	}

	/**
	 * @param offsetTop
	 * @return
	 */
	public PrettyLoaderOptions offset_top(int offsetTop) {
		return super.put("offset_top", offsetTop);
	}

	/**
	 * @param offsetLeft
	 * @return
	 */
	public PrettyLoaderOptions offset_left(int offsetLeft) {
		return super.put("offset_left", offsetLeft);
	}

}
