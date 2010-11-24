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

import net.javaforge.jqwicket.Utils.IJoinCallback;

import org.apache.wicket.Component;

/**
 * 
 * @author mkalina
 * 
 */
public abstract class JQuery {

	JQuery() {
	}

	public static final JQStatement $(CharSequence selector) {
		return new JQStatement().append("$('").append(selector).append("')");
	}

	public static final JQStatement $(Component component) {
		CharSequence _selector = component == null ? "" : new StringBuffer()
				.append("#").append(component.getMarkupId()).toString();
		return $(_selector);
	}

	public static final JQStatement $(Component component, CharSequence selector) {
		CharSequence _selector = component == null ? selector
				: new StringBuffer().append("#")
						.append(component.getMarkupId()).append(" ")
						.append(selector).toString();
		return $(_selector);
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
		return new JQFunction(join(statements, "\n",
				new IJoinCallback<JQStatement>() {
					public CharSequence toCharSequence(JQStatement obj) {
						return obj.toString();
					}
				}), args);
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

	public static final JQFunction chainAsFunctions(
			final JQStatement... statements) {

		if (isEmpty(statements))
			return null;

		final CharSequence js = js( //
				join(statements, ",", new Utils.IJoinCallback<JQStatement>() {
					public String toCharSequence(JQStatement obj) {
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
