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

	private CharSequence[] args;

	private CharSequence body;

	JQFunction(CharSequence bodyJs) {
		this(bodyJs, (CharSequence[]) null);
	}

	JQFunction(CharSequence bodyJs, CharSequence... args) {
		this.body = semicolon(bodyJs);
		this.args = args;
	}

	JQFunction(IJQStatement bodyStatement, CharSequence... args) {
		this(new IJQStatement[] { bodyStatement }, args);
	}

	JQFunction(IJQStatement[] bodyStatements) {
		this(bodyStatements, (CharSequence[]) null);
	}

	JQFunction(IJQStatement[] bodyStatements, CharSequence[] args) {
		this.body = Utils.join(bodyStatements, "\n");
		this.args = args;
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
		if (isNotEmpty(args)) {
			sb.append(Utils.join(args, ","));
		}
		sb.append("){").append(toStringBodyOnly()).append("}");
		return sb.toString();
	}

	public CharSequence[] getArgs() {
		return args;
	}

	public CharSequence toStringBodyOnly() {
		return body;
	}

	public IJQStatement toStatementBodyOnly() {
		return JQuery.js(this.body);
	}

}
