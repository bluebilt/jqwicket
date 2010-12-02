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
package net.javaforge.jqwicket.ui.button;

import net.javaforge.jqwicket.ui.AbstractJQOptions;
import net.javaforge.jqwicket.ui.IJQOptions;

/**
 * @author mkalina
 *
 */
public class ButtonOptions extends AbstractJQOptions<ButtonOptions> {

	private static final long serialVersionUID = 1L;

	public ButtonOptions disabled(boolean disabled) {
		super.put("disabled", disabled);
		return this;
	}

	public ButtonOptions text(boolean text) {
		super.put("text", text);
		return this;
	}

	public ButtonOptions icons(IJQOptions<?> icons) {
		super.put("icons", icons);
		return this;
	}

	public ButtonOptions label(CharSequence label) {
		super.put("label", label);
		return this;
	}
}
