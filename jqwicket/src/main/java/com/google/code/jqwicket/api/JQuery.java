package com.google.code.jqwicket.api;

import static com.google.code.jqwicket.Utils.isEmpty;
import static com.google.code.jqwicket.Utils.join;
import static com.google.code.jqwicket.api.JQLiteral._;

import java.util.Collection;
import java.util.Map;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.AbstractAjaxBehavior;

import com.google.code.jqwicket.JQContributionConfig;
import com.google.code.jqwicket.Utils;

/**
 * Collection of static methods to interoperate with the JQuery API.
 * 
 * @author max
 * 
 */
public abstract class JQuery {

	JQuery() {
	}

	private static final CharSequence defaultJQueryPrefix = "$";

	private static final CharSequence jqueryPrefix() {

		if (JQContributionConfig.get() == null)
			return defaultJQueryPrefix;

		CharSequence alias = JQContributionConfig.get().getNonConflictAlias();
		return alias != null ? alias : defaultJQueryPrefix;
	}

	/**
	 * Generates: $
	 * 
	 * @return
	 */
	public static final IJQStatement $() {
		return new JQStatement().appendRawCharSequence(jqueryPrefix());
	}

	/**
	 * Generates: $("selector")
	 * 
	 * @param selector
	 * @return
	 */
	public static final IJQStatement $(CharSequence selector) {
		return new JQStatement().appendRawCharSequence(jqueryPrefix())
				.appendRawCharSequence("(").appendRawCharSequence(_(selector))
				.appendRawCharSequence(")");
	}

	/**
	 * Generates: $("componentId")
	 * 
	 * @param component
	 * @return
	 */
	public static final IJQStatement $(Component component) {
		return $(selector(component));
	}

	/**
	 * Generates: $(this)
	 * 
	 * @return
	 */
	public static final IJQStatement $this() {
		return new JQStatement().appendRawCharSequence(jqueryPrefix())
				.appendRawCharSequence("(this)");
	}

	/**
	 * Generates selector for the component using:
	 * {@link Component#getMarkupId()}
	 * 
	 * @param component
	 * @return
	 */
	public static final CharSequence selector(Component component) {
		return component == null ? "" : new StringBuffer().append("#").append(
				component.getMarkupId());
	}

	/**
	 * Generates: $('#componentId selector')
	 * 
	 * @param component
	 * @param selector
	 * @return
	 */
	public static final IJQStatement $(Component component,
			CharSequence selector) {
		CharSequence _selector = component == null ? selector
				: new StringBuffer().append(selector(component)).append(" ")
						.append(selector);
		return $(_selector);
	}

	/**
	 * Generates: $.ns
	 * 
	 * @param ns
	 * @return
	 */
	public static final IJQStatement $ns(CharSequence ns) {
		return $().appendProperty(ns);
	}

	/**
	 * Generates: $(document)
	 * 
	 * @return
	 */
	public static final IJQStatement $document() {
		return new JQStatement().appendRawCharSequence(jqueryPrefix())
				.appendRawCharSequence("(document)");
	}

	/**
	 * @param js
	 *            is a javascript block
	 * @param args
	 *            (optional) array of arguments used to replace placeholder with
	 *            "js" string.
	 * @return
	 */
	public static final IJQStatement js(CharSequence js, Object... args) {
		if (js == null || js.length() == 0)
			return null;

		JQStatement s = new JQStatement();
		if (Utils.isNotEmpty(args))
			s.appendRawCharSequence(String.format(String.valueOf(js), args));
		else
			s.appendRawCharSequence(js);

		return s;
	}

	public static final IJQStatement js(IJQStatement... statements) {
		if (isEmpty(statements))
			return null;

		StringBuffer buf = new StringBuffer();
		for (IJQStatement stmt : statements) {
			buf.append(stmt);
		}
		return js(buf);
	}

	public static final IJQStatement documentReady(
			Collection<IJQStatement> statements) {
		return documentReady(statements.toArray(new JQStatement[statements
				.size()]));
	}

	public static final IJQStatement documentReady(IJQStatement... statements) {
		return $document().chain("ready", new JQFunction(statements));
	}

	//
	// public static final IJQFunction $f(CharSequence stmt1, CharSequence
	// stmt2) {
	// return function(stmt1, stmt2);
	// }
	//
	// public static final IJQFunction function(CharSequence stmt1,
	// CharSequence stmt2) {
	// return function(stmt1, stmt2, (CharSequence[]) null);
	// }
	//
	// public static final IJQFunction $f(CharSequence stmt1, CharSequence
	// stmt2,
	// CharSequence stmt3) {
	// return function(stmt1, stmt2, stmt3);
	// }
	//
	// public static final IJQFunction function(CharSequence stmt1,
	// CharSequence stmt2, CharSequence stmt3) {
	// return function(stmt1, stmt2, stmt3, (CharSequence[]) null);
	// }
	//
	// public static final IJQFunction $f(CharSequence[] statements) {
	// return function(statements);
	// }
	//
	// public static final IJQFunction function(CharSequence[] statements) {
	// return function(statements, (CharSequence[]) null);
	// }
	//
	// public static final IJQFunction $f(CharSequence stmt, CharSequence...
	// args) {
	// return function(stmt, args);
	// }
	//
	// public static final IJQFunction $f(CharSequence stmt1, CharSequence
	// stmt2,
	// CharSequence... args) {
	// return function(stmt1, stmt2, args);
	// }
	//
	// public static final IJQFunction function(CharSequence stmt1,
	// CharSequence stmt2, CharSequence... args) {
	// return function(new CharSequence[] { stmt1, stmt2 }, args);
	// }
	//
	// public static final IJQFunction $f(CharSequence stmt1, CharSequence
	// stmt2,
	// CharSequence stmt3, CharSequence... args) {
	// return function(stmt1, stmt2, stmt3, args);
	// }
	//
	// public static final IJQFunction function(CharSequence stmt1,
	// CharSequence stmt2, CharSequence stmt3, CharSequence... args) {
	// return function(new CharSequence[] { stmt1, stmt2, stmt3 }, args);
	// }
	//
	// public static final IJQFunction $f(CharSequence[] statements,
	// CharSequence... args) {
	// return function(statements, args);
	// }
	//
	// public static final IJQFunction function(CharSequence[] statements,
	// CharSequence... args) {
	// return new JQFunction(join(statements, "\n"), args);
	// }
	//
	// public static final IJQFunction $f(CharSequence js) {
	// return function(js);
	// }
	//
	// public static final IJQFunction function(CharSequence js) {
	// return function(js, (CharSequence[]) null);
	// }
	//
	// public static final IJQFunction function(CharSequence js,
	// CharSequence... args) {
	// return new JQFunction(js, args);
	// }

	public static final IJQFunction $f(CharSequence body, CharSequence... args) {
		return new JQFunction(body, args);
	}

	public static final IJQFunction $f(IJQStatement body, CharSequence... args) {
		return new JQFunction(body, args);
	}

	public static final IJQFunction $f(IJQStatement[] body) {
		return new JQFunction(body);
	}

	public static final IJQFunction $f(IJQStatement[] body, CharSequence[] args) {
		return new JQFunction(body, args);
	}

	/**
	 * Creates JQStatement to invoke the respond method of the given
	 * {@link AbstractAjaxBehavior} via ajax.
	 * 
	 * @param behave
	 * @return
	 */
	public static final IJQStatement wicketAjaxGet(AbstractAjaxBehavior behave) {
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
	public static final IJQStatement wicketAjaxGet(AbstractAjaxBehavior behave,
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
	public static final IJQStatement wicketAjaxGet(AbstractAjaxBehavior behave,
			Map<String, Object> params, IJQFunction successHandler,
			IJQFunction failureHandler) {
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
	public static final IJQStatement wicketAjaxGet(CharSequence url) {
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
	public static final IJQStatement wicketAjaxGet(CharSequence url,
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
	public static final IJQStatement wicketAjaxGet(CharSequence url,
			Map<String, Object> params, IJQFunction successHandler,
			IJQFunction failureHandler) {

		StringBuffer buf = new StringBuffer();
		buf.append("wicketAjaxGet('").append(url);
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, Object> e : params.entrySet()) {
				buf.append("&").append(e.getKey()).append("=");
				if (e.getValue() instanceof IJQStatement) {
					buf.append("'+")
							.append(((IJQStatement) e.getValue())
									.toStringWithoutTrailingSemicolon())
							.append("+'");
				} else {
					buf.append(String.valueOf(e.getValue()));
				}
			}
		}

		buf.append("',");
		if (successHandler != null) {
			buf.append(successHandler);
		} else {
			buf.append("function(){}");
		}
		buf.append(", ");

		if (failureHandler != null) {
			buf.append(failureHandler);
		} else {
			buf.append("function(){}");
		}

		buf.append(")");
		return js(buf);
	}

	/**
	 * Converts given array of {@link JQStatement}s into the comma-separated
	 * chain of anonymous function calls. Each anonymous function surrounds
	 * corresponding {@link IJQStatement}.
	 * 
	 * @param statements
	 * @return
	 */
	public static final IJQFunction asFunctionChain(
			final IJQStatement... statements) {

		if (isEmpty(statements))
			return null;

		final CharSequence js = js(join(statements, ",",
				new Utils.IJoinCallback<IJQStatement>() {
					public CharSequence toCharSequence(IJQStatement obj) {
						return $f(obj).toString();
					}
				}));

		return new JQFunction(js);
	}

}
