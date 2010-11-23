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
package net.javaforge.jqwicket.ui.uniform;

import net.javaforge.jqwicket.JQWidget;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * see <a
 * href="http://pixelmatrixdesign.com/uniform/">http://pixelmatrixdesign.com
 * /uniform/</a>
 * 
 * @author mkalina
 * 
 */
public interface IUniform extends JQWidget<UniformOptions> {

	public static final JavascriptResourceReference JS_RESOURCE_MIN = new JavascriptResourceReference(
			IUniform.class, "jquery.uniform.min.js");

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			IUniform.class, "jquery.uniform.js");

	public static final ResourceReference CSS_RESOURCE_DEFAULT = new ResourceReference(
			IUniform.class, "theme/uniform/css/uniform.default.css");

	public static final ResourceReference CSS_RESOURCE_ARISTO = new ResourceReference(
			IUniform.class, "theme/aristo/css/uniform.aristo.css");

}
