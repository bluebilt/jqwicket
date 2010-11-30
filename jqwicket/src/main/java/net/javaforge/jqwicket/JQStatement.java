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
package net.javaforge.jqwicket;

import static net.javaforge.jqwicket.Utils.isBlank;
import static net.javaforge.jqwicket.Utils.join;
import static net.javaforge.jqwicket.Utils.quote;
import static net.javaforge.jqwicket.Utils.semicolon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;

import net.javaforge.jqwicket.Utils.IJoinCallback;
import net.javaforge.jqwicket.effect.Effect;
import net.javaforge.jqwicket.effect.EffectEasing;
import net.javaforge.jqwicket.effect.EffectSpeed;
import net.javaforge.jqwicket.ui.IJQOptions;

/**
 * Wrapper for javascript/jquery statement.
 * 
 * @author mkalina
 * 
 */
public class JQStatement implements Serializable {

	private static final long serialVersionUID = 1L;

	private StringBuffer buf;

	JQStatement() {
		this.buf = new StringBuffer();
	}

	public JQStatement animate(IJQOptions<?> options) {
		return this.chain("animate", options.toJson());
	}

	public JQStatement animate(IJQOptions<?> options, int duration) {
		return this
				.chain("animate", options.toJson(), String.valueOf(duration));
	}

	public JQStatement animate(IJQOptions<?> options, EffectSpeed duration) {
		return this.chain("animate", options.toJson(), duration.toJson());
	}

	public JQStatement animate(IJQOptions<?> options, int duration,
			EffectEasing easing) {
		return this.chain("animate", options.toJson(),
				String.valueOf(duration), easing.toJson());
	}

	public JQStatement animate(IJQOptions<?> options, EffectSpeed duration,
			EffectEasing easing) {
		return this.chain("animate", options.toJson(), duration.toJson(),
				easing.toJson());
	}

	public JQStatement animate(IJQOptions<?> options, int duration,
			EffectEasing easing, JQFunction callback) {
		return this.chain("animate", options.toJson(),
				String.valueOf(duration), easing.toJson(), callback.render());
	}

	public JQStatement animate(IJQOptions<?> options, EffectSpeed duration,
			EffectEasing easing, JQFunction callback) {
		return this.chain("animate", options.toJson(), duration.toJson(),
				easing.toJson(), callback.render());
	}

	public JQStatement add(CharSequence value) {
		return this.chain("add", quote(value));
	}

	public JQStatement addClass(CharSequence clazz) {
		return this.chain("addClass", quote(clazz));
	}

	public JQStatement addClass(JQFunction function) {
		return this.chain("addClass", function.render());
	}

	public JQStatement after(CharSequence content) {
		return this.chain("after", quote(content));
	}

	public JQStatement after(JQFunction function) {
		return this.chain("after", function.render());
	}

	public JQStatement append(CharSequence charSequence) {
		return this.append(charSequence, false);
	}

	public JQStatement hasClass(CharSequence clazz) {
		return this.chain("hasClass", clazz);
	}

	public JQStatement css(CharSequence property) {
		return this.chain("css", quote(property));
	}

	public JQStatement css(CharSequence property, CharSequence value) {
		return this.chain("css", quote(property), quote(value));
	}

	public JQStatement attr(CharSequence property) {
		return this.chain("attr", quote(property));
	}

	public JQStatement attr(CharSequence property, CharSequence value) {
		return this.chain("attr", quote(property), quote(value));
	}

	public JQStatement find(CharSequence selector) {
		return this.chain("find", quote(selector));
	}

	public JQStatement append(CharSequence charSequence,
			boolean withTrailingSemicolon) {
		this.buf.append(withTrailingSemicolon ? semicolon(charSequence)
				: charSequence);
		return this;
	}

	public JQStatement html() {
		return this.chain("html");
	}

	public JQStatement html(CharSequence htmlString) {
		return this.chain("html", quote(htmlString));
	}

	public JQStatement removeAttr(CharSequence attributeName) {
		return this.chain("removeAttr", quote(attributeName));
	}

	public JQStatement removeClass(CharSequence className) {
		return this.chain("removeClass", quote(className));
	}

	public JQStatement removeClass(JQFunction function) {
		return this.chain("removeClass", function.render());
	}

	public JQStatement switchClass(String removeClass, String addClass) {
		return this.chain("switchClass", quote(removeClass), quote(addClass));
	}

	public JQStatement switchClass(String removeClass, String addClass,
			int duration) {
		return this.chain("switchClass", quote(removeClass), quote(addClass),
				String.valueOf(duration));
	}

	public JQStatement switchClass(String removeClass, String addClass,
			EffectSpeed duration) {
		return this.chain("switchClass", quote(removeClass), quote(addClass),
				quote(duration.toJson()));
	}

	public JQStatement toggleClass(CharSequence... classNames) {
		return this.chain("toggleClass", quote(Utils.join(classNames, " ")));
	}

	public JQStatement toggleClass(JQFunction function) {
		return this.chain("toggleClass", function.render());
	}

	public JQStatement val() {
		return this.chain("val");
	}

	public JQStatement val(CharSequence value) {
		return this.chain("val", quote(value));
	}

	public JQStatement val(JQFunction function) {
		return this.chain("val", function.render());
	}

	public JQStatement height() {
		return this.chain("height");
	}

	public JQStatement height(int height) {
		return this.chain("height", String.valueOf(height));
	}

	public JQStatement height(JQFunction function) {
		return this.chain("height", function.render());
	}

	public JQStatement innerHeight() {
		return this.chain("innerHeight");
	}

	public JQStatement innerWidth() {
		return this.chain("innerWidth");
	}

	public JQStatement offset() {
		return this.chain("offset");
	}

	public JQStatement offset(CharSequence coordinates) {
		return this.chain("offset", coordinates);
	}

	public JQStatement offset(JQFunction function) {
		return this.chain("offset", function.render());
	}

	public JQStatement chain(CharSequence methodLabel,
			CharSequence... methodArgs) {
		this.buf.append(".").append(methodLabel).append("(");
		this.buf.append(join(methodArgs, ","));
		this.buf.append(")");
		return this;
	}

	public <T> JQStatement chain(CharSequence label,
			IChainCallback<T> callback, String separator, T... args) {
		this.buf.append(".").append(label).append("(");
		this.buf.append(join(args, separator, callback));
		this.buf.append(")");
		return this;
	}

	public JQStatement effect(Effect effect) {
		return this.effect(effect, null, null, null);
	}

	public JQStatement effect(Effect effect, IJQOptions<?> options) {
		return this.effect(effect, options, null, null);
	}

	public JQStatement effect(Effect effect, IJQOptions<?> options,
			EffectSpeed speed) {
		return this.effect(effect, options, speed, null);
	}

	public JQStatement effect(Effect effect, IJQOptions<?> options, int speed) {
		return this.effect(effect, options, speed, null);
	}

	public JQStatement effect(Effect effect, IJQOptions<?> options,
			EffectSpeed speed, JQFunction callback) {

		List<CharSequence> args = new ArrayList<CharSequence>();
		if (effect != null)
			args.add(Utils.quote(effect.name().toLowerCase()));
		if (options != null)
			args.add(options.toJson());
		if (speed != null)
			args.add(Utils.quote(speed.name().toLowerCase()));
		if (callback != null)
			args.add(callback.render());

		return this
				.chain("effect", args.toArray(new CharSequence[args.size()]));
	}

	public JQStatement effect(Effect effect, IJQOptions<?> options, int speed,
			JQFunction callback) {

		List<CharSequence> args = new ArrayList<CharSequence>();
		if (effect != null)
			args.add(effect.name().toLowerCase());
		if (options != null)
			args.add(options.toJson());
		args.add(String.valueOf(speed));
		if (callback != null)
			args.add(callback.render());

		return this
				.chain("effect", args.toArray(new CharSequence[args.size()]));
	}

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @return
	 */
	public JQStatement remove() {
		return this.chain("remove");
	}

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @param selector
	 * @return
	 */
	public JQStatement remove(CharSequence selector) {
		return this.chain("remove", selector);
	}

	/**
	 * Get the combined text contents of each element in the set of matched
	 * elements, including their descendants.
	 * 
	 * @return
	 */
	public JQStatement text() {
		return this.chain("text");
	}

	/**
	 * Set the content of each element in the set of matched elements to the
	 * specified text.
	 * 
	 * @param textString
	 * @return
	 */
	public JQStatement text(String textString) {
		return this.chain("text", textString);
	}

	/**
	 * Insert every element in the set of matched elements to the end of the
	 * target.
	 * 
	 * @param target
	 * @return
	 */
	public JQStatement appendTo(CharSequence target) {
		return this.chain("appendTo", target);
	}

	/**
	 * Insert every element in the set of matched elements to the end of the
	 * target.
	 * 
	 * @param target
	 * @return
	 */	
	public JQStatement appendTo(Component target) {
		CharSequence _selector = target == null ? "" : new StringBuffer()
				.append("#").append(target.getMarkupId());
		return this.appendTo(_selector);
	}

	public String render() {
		return this.render(true);
	}

	public String render(boolean trailingSemicolon) {
		String s = this.buf.toString().trim();
		if (isBlank(s))
			return "";
		if (s.endsWith("}"))
			return s;
		if (!s.endsWith(";") && trailingSemicolon)
			return (s + ";");
		return s;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.render();
	}

	/**
	 * @author mkalina
	 * 
	 * @param <T>
	 */
	public static interface IChainCallback<T> extends IJoinCallback<T> {

	}
}
