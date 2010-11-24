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
package net.javaforge.jqwicket.ui.jcarousel;

import net.javaforge.jqwicket.IJQWidget;

import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Implementation of <a
 * href="http://sorgalla.com/projects/jcarousel/>JCarousel</a> jquery plugin.
 * 
 * @author mkalina
 * 
 */
public interface IJCarousel extends IJQWidget<JCarouselOptions> {

	static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			IJCarousel.class, "jquery.jcarousel.js");

	static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			IJCarousel.class, "jquery.jcarousel.min.js");

}
