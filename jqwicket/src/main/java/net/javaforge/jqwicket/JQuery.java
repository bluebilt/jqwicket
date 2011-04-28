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

import static net.javaforge.jqwicket.Utils.isEmpty;
import static net.javaforge.jqwicket.Utils.join;

import java.util.Collection;
import java.util.Map;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.AbstractAjaxBehavior;

/**
 * 
 * @author mkalina
 * 
 */
public abstract class JQuery {

	JQuery() {
	}

	public static final JQStatement $() {
		return new JQStatement().append("$");
	}

	public static final JQStatement $(CharSequence selector) {
		return new JQStatement().append("$('").append(selector).append("')");
	}

	public static final JQStatement $(Component component) {
		return $(selector(component));
	}

	public static final JQStatement $(Component component, CharSequence selector) {
		CharSequence _selector = component == null ? selector
				: new StringBuffer().append(selector(component)).append(" ")
						.append(selector);
		return $(_selector);
	}

	public static final CharSequence selector(Component component) {
		return component == null ? "" : new StringBuffer().append("#").append(
				component.getMarkupId());
	}

	public static final JQStatement $this() {
		return new JQStatement().append("$(this)");
	}

	public static final JQStatement $document() {
		return new JQStatement().append("$(document)");
	}

	public static final JQFunction $f(JQStatement statement) {
		return function(statement);
	}

	public static final JQFunction function(JQStatement statement) {
		return function(statement, (CharSequence[]) null);
	}

	public static final JQFunction $f(JQStatement stmt1, JQStatement stmt2) {
		return function(stmt1, stmt2);
	}

	public static final JQFunction function(JQStatement stmt1, JQStatement stmt2) {
		return function(stmt1, stmt2, (CharSequence[]) null);
	}

	public static final JQFunction $f(JQStatement stmt1, JQStatement stmt2,
			JQStatement stmt3) {
		return function(stmt1, stmt2, stmt3);
	}

	public static final JQFunction function(JQStatement stmt1,
			JQStatement stmt2, JQStatement stmt3) {
		return function(stmt1, stmt2, stmt3, (CharSequence[]) null);
	}

	public static final JQFunction $f(JQStatement[] statements) {
		return function(statements);
	}

	public static final JQFunction function(JQStatement[] statements) {
		return function(statements, (CharSequence[]) null);
	}

	public static final JQFunction $f(JQStatement stmt, CharSequence... args) {
		return function(stmt, args);
	}

	public static final JQFunction function(JQStatement stmt,
			CharSequence... args) {
		return function(new JQStatement[] { stmt }, args);
	}

	public static final JQFunction $f(JQStatement stmt1, JQStatement stmt2,
			CharSequence... args) {
		return function(stmt1, stmt2, args);
	}

	public static final JQFunction function(JQStatement stmt1,
			JQStatement stmt2, CharSequence... args) {
		return function(new JQStatement[] { stmt1, stmt2 }, args);
	}

	public static final JQFunction $f(JQStatement stmt1, JQStatement stmt2,
			JQStatement stmt3, CharSequence... args) {
		return function(stmt1, stmt2, stmt3, args);
	}

	public static final JQFunction function(JQStatement stmt1,
			JQStatement stmt2, JQStatement stmt3, CharSequence... args) {
		return function(new JQStatement[] { stmt1, stmt2, stmt3 }, args);
	}

	public static final JQFunction $f(JQStatement[] statements,
			CharSequence... args) {
		return function(statements, args);
	}

	public static final JQFunction function(JQStatement[] statements,
			CharSequence... args) {
		return new JQFunction(join(statements, "\n"), args);
	}

	public static final JQFunction $f(CharSequence js) {
		return function(js);
	}

	public static final JQFunction function(CharSequence js) {
		return function(js, (CharSequence[]) null);
	}

	public static final JQFunction $f(CharSequence js, CharSequence... args) {
		return function(js, args);
	}

	public static final JQFunction function(CharSequence js,
			CharSequence... args) {
		return new JQFunction(js, args);
	}

	public static final JQStatement js(CharSequence js, Object... args) {

		if (js == null || js.length() == 0)
			return null;

		JQStatement s = new JQStatement();

		if (Utils.isNotEmpty(args))
			s.append(String.format(String.valueOf(js), args));
		else
			s.append(js);

		return s;
	}

	public static final JQStatement js(JQStatement... statements) {

		if (isEmpty(statements))
			return null;

		StringBuffer buf = new StringBuffer();
		for (JQStatement stmt : statements) {
			buf.append(stmt.render());
		}

		return js(buf);
	}

	public static final JQStatement documentReady(
			Collection<JQStatement> statements) {
		return documentReady(statements.toArray(new JQStatement[statements
				.size()]));
	}

	public static final JQStatement documentReady(JQStatement... statements) {
		return $document().chain("ready", new JQFunction(statements).render());
	}

	/**
	 * Creates JQStatement to invoke the respond method of the given
	 * {@link AbstractAjaxBehavior} via ajax.
	 * 
	 * @param behave
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(AbstractAjaxBehavior behave) {
		return wicketAjaxGet(behave, null);
	}

	/**
	 * Creates JQStatement to invoke the respond method of the given
	 * {@link AbstractAjaxBehavior} via ajax.
	 * 
	 * @param behave
	 * @param params
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(AbstractAjaxBehavior behave,
			Map<String, Object> params) {
		return wicketAjaxGet(behave.getCallbackUrl(), params);
	}

	/**
	 * Creates JQStatement to invoke the respond method of the given
	 * {@link AbstractAjaxBehavior} via ajax.
	 * 
	 * @param behave
	 * @param params
	 * @param successHandler
	 * @param failureHandler
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(AbstractAjaxBehavior behave,
			Map<String, Object> params, JQFunction successHandler,
			JQFunction failureHandler) {
		return wicketAjaxGet(behave.getCallbackUrl(), params, successHandler,
				failureHandler);
	}

	/**
	 * Creates JQStatement to invoke the respond method on
	 * {@link AbstractAjaxBehavior} added to the wicket component.
	 * 
	 * @param url
	 *            is the wicket component's url
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(CharSequence url) {
		return wicketAjaxGet(url, null);
	}

	/**
	 * Creates JQStatement to invoke the respond method on
	 * {@link AbstractAjaxBehavior} added to the wicket component.
	 * 
	 * @param url
	 *            is the wicket component's url
	 * @param params
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(CharSequence url,
			Map<String, Object> params) {
		return wicketAjaxGet(url, params, null, null);
	}

	/**
	 * Creates JQStatement to invoke the respond method on
	 * {@link AbstractAjaxBehavior} added to the wicket component.
	 * 
	 * @param url
	 * @param params
	 * @param successHandler
	 * @param failureHandler
	 * @return
	 */
	public static final JQStatement wicketAjaxGet(CharSequence url,
			Map<String, Object> params, JQFunction successHandler,
			JQFunction failureHandler) {

		StringBuffer buf = new StringBuffer();
		buf.append("wicketAjaxGet('").append(url);
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, Object> e : params.entrySet()) {
				buf.append("&").append(e.getKey()).append("=");
				if (e.getValue() instanceof JQStatement) {
					buf.append("'+")
							.append(((JQStatement) e.getValue()).render(false))
							.append("+'");
				} else {
					buf.append(String.valueOf(e.getValue()));
				}
			}
		}

		buf.append("',");
		if (successHandler != null) {
			buf.append(successHandler.render());
		} else {
			buf.append("function(){}");
		}
		buf.append(", ");

		if (failureHandler != null) {
			buf.append(failureHandler.render());
		} else {
			buf.append("function(){}");
		}

		buf.append(")");
		return js(buf);
	}

	/**
	 * Converts given array of {@link JQStatement}s into the comma-separated
	 * chain of anonymous function calls.
	 * 
	 * @param statements
	 * @return
	 */
	public static final JQFunction chainAsFunctions(
			final JQStatement... statements) {

		if (isEmpty(statements))
			return null;

		final CharSequence js = js( //
				join(statements, ",", new Utils.IJoinCallback<JQStatement>() {
					public CharSequence toCharSequence(JQStatement obj) {
						return function(obj).toString();
					}
				})).render();

		return new JQFunction(js) {
			private static final long serialVersionUID = 1L;

			@Override
			public CharSequence render() {
				return js;
			}
		};
	}
}
