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
package net.javaforge.jqwicket.effect;

import net.javaforge.jqwicket.IJsonAware;

/**
 * @author mkalina
 * 
 */
public enum EffectEasing implements IJsonAware {

	LINEAR("linear"), SWING("swing"), EASE_IN_QUAD("easeInQuad"), EASE_OUT_QUAD(
			"easeOutQuad"), EASE_IN_OUT_QUAD("easeInOutQuad"), EASE_IN_CUBIC(
			"easeInCubic"), EASE_OUT_CUBIC("easeOutCubic"), EASE_IN_OUT_CUBIC(
			"easeInOutCubic"), EASE_OUT_QUINT("easeOutQuint"), EASE_IN_OUT_QUINT(
			"easeInOutQuint"), EASE_IN_SINE("easeInSine"), EASE_OUT_SINE(
			"easeOutSine"), EASE_IN_OUT_SINE("easeInOutSine"), EASE_IN_EXPO(
			"easeInExpo"), EASE_OUT_EXPO("easeOutExpo"), EASE_IN_OUT_EXPO(
			"easeInOutExpo"), EASE_IN_CIRC("easeInCirc"), EASE_OUT_CIRC(
			"easeOutCirc"), EASE_IN_OUT_CIRC("easeInOutCirc"), EASE_IN_ELASTIC(
			"easeInElastic"), EASE_OUT_ELASTIC("easeOutElastic"), EASE_IN_OUT_ELASTIC(
			"easeInOutElastic"), EASE_IN_BACK("easeInBack"), EASE_OUT_BACK(
			"easeOutBack"), EASE_IN_OUT_BACK("easeInOutBack"), EASE_IN_BOUNCE(
			"easeInBounce"), EASE_OUT_BOUNCE("easeOutBounce"), EASE_IN_OUT_BOUNCE(
			"easeInOutBounce");

	private String easingName;

	private EffectEasing(String name) {
		this.easingName = name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJsonAware#toJson()
	 */
	public CharSequence toJson() {
		return this.easingName;
	}

}
