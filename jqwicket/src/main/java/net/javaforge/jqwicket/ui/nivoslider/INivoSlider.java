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

import net.javaforge.jqwicket.JQWidget;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Implementation of the Nivo-Slider plugin (see <a
 * href="http://nivo.dev7studios.com">http://nivo.dev7studios.com</a>)
 * 
 * @author mkalina
 * 
 */
public interface INivoSlider extends JQWidget<NivoSliderOptions> {

	static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			INivoSlider.class, "jquery.nivo.slider.js");

	static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			INivoSlider.class, "jquery.nivo.slider.pack.js");

	static final ResourceReference CSS_RESOURCE = new ResourceReference(
			INivoSlider.class, "nivo-slider.css");

}
