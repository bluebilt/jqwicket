package com.google.code.jqwicket.api;

import static com.google.code.jqwicket.Utils.isNotEmpty;
import static com.google.code.jqwicket.Utils.semicolon;

import java.io.Serializable;

import com.google.code.jqwicket.Utils;

/**
 * See {@link IJQFunction}.
 * 
 * @author max
 * 
 */
class JQFunction implements IJQFunction, Serializable {

	private static final long serialVersionUID = 1L;

	private CharSequence[] params;

	private CharSequence body;

	JQFunction(CharSequence... bodyStatements) {
		this.body = Utils.join(Utils.walk(bodyStatements,
				new Utils.IArrayWalkCallback<CharSequence>() {
					public CharSequence onElement(int index, CharSequence obj) {
						return semicolon(obj);
					}
				}), "\n");
	}

	public IJQFunction withParams(CharSequence... params) {
		this.params = params;
		return this;
	}

	public int length() {
		return this.toString().length();
	}

	public char charAt(int index) {
		return this.toString().charAt(index);
	}

	public CharSequence subSequence(int start, int end) {
		return this.toString().subSequence(start, end);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("function(");
		if (isNotEmpty(params)) {
			sb.append(Utils.join(params, ","));
		}
		sb.append("){").append(toStringBodyOnly()).append("}");
		return sb.toString();
	}

	public CharSequence[] getArgs() {
		return params;
	}

	public CharSequence toStringBodyOnly() {
		return body;
	}

	public IJQStatement toStatementBodyOnly() {
		return JQuery.js(this.body);
	}

}
