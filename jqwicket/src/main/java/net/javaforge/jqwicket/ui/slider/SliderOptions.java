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
package net.javaforge.jqwicket.ui.slider;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;

/**
 * @author mkalina
 *
 */
public class SliderOptions extends AbstractJQOptions<SliderOptions> {

	private static final long serialVersionUID = 1L;

	public static enum Orientation {
		HORIZONTAL, VERTICAL
	};

	public SliderOptions disabled(boolean disabled) {
		super.put("disabled", disabled);
		return this;
	}

	public SliderOptions animate(boolean animate) {
		super.put("animate", animate);
		return this;
	}

	public SliderOptions animate(String animate) {
		super.put("animate", animate);
		return this;
	}

	public SliderOptions animate(int animate) {
		super.put("animate", animate);
		return this;
	}

	public SliderOptions max(int max) {
		super.put("max", max);
		return this;
	}

	public SliderOptions min(int min) {
		super.put("min", min);
		return this;
	}

	public SliderOptions orientation(Orientation orientation) {
		super.put("orientation", orientation);
		return this;
	}

	public SliderOptions range(boolean range) {
		super.put("range", range);
		return this;
	}

	public SliderOptions range(String range) {
		super.put("range", range);
		return this;
	}

	public SliderOptions step(int step) {
		super.put("step", step);
		return this;
	}

	public SliderOptions value(int value) {
		super.put("value", value);
		return this;
	}

	public SliderOptions values(int... values) {
		super.put("values", values);
		return this;
	}

	public SliderOptions startEvent(JQFunction callback) {
		super.put("start", callback);
		return this;
	}

	public SliderOptions startEvent(CharSequence callbackBody) {
		return this.startEvent(js(callbackBody));
	}

	public SliderOptions startEvent(JQStatement callbackBody) {
		super.put("start", $f(callbackBody, "event", "ui"));
		return this;
	}

	public SliderOptions slideEvent(JQFunction callback) {
		super.put("slide", callback);
		return this;
	}

	public SliderOptions slideEvent(CharSequence callbackBody) {
		return this.slideEvent(js(callbackBody));
	}

	public SliderOptions slideEvent(JQStatement callbackBody) {
		super.put("slide", $f(callbackBody, "event", "ui"));
		return this;
	}

	public SliderOptions changeEvent(JQFunction callback) {
		super.put("change", callback);
		return this;
	}

	public SliderOptions changeEvent(CharSequence callbackBody) {
		return this.changeEvent(js(callbackBody));
	}

	public SliderOptions changeEvent(JQStatement callbackBody) {
		super.put("change", $f(callbackBody, "event", "ui"));
		return this;
	}

	public SliderOptions stopEvent(JQFunction callback) {
		super.put("stop", callback);
		return this;
	}

	public SliderOptions stopEvent(CharSequence callbackBody) {
		return this.stopEvent(js(callbackBody));
	}

	public SliderOptions stopEvent(JQStatement callbackBody) {
		super.put("stop", $f(callbackBody, "event", "ui"));
		return this;
	}
}
