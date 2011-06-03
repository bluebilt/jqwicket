package com.google.code.jqwicket.api;

import java.io.Serializable;

import com.google.code.jqwicket.Utils;

/**
 * This class represents a single javascript literal. By setting the
 * {@link #mode} property you can surround the wrapped character sequence with
 * quotes, double quotes or let it as it is.
 * 
 * @author max
 * 
 */
public class JQLiteral implements CharSequence, Serializable {

	private static final long serialVersionUID = 1L;

	public static enum Mode {

		QUOTED, DBLQUOTED, RAW;
	}

	private Mode mode = Mode.QUOTED;

	protected CharSequence buf;

	private JQLiteral(CharSequence s, Mode mode) {
		this.buf = s;
		this.mode = mode;
	}

	public int length() {
		return buf.length();
	}

	public char charAt(int index) {
		return buf.charAt(index);
	}

	@Override
	public String toString() {
		return buf.toString();
	}

	public CharSequence subSequence(int start, int end) {
		return buf.subSequence(start, end);
	}

	public Mode getMode() {
		return mode;
	}

	/**
	 * Builds new literal instance with default mode {@link Mode#DBLQUOTED}.
	 * 
	 * @param literal
	 * @return
	 */
	public static final JQLiteral _(Object literal) {
		return _dblquoted(literal);
	}

	public static final JQLiteral _quoted(Object literal) {
		return _(literal, Mode.QUOTED);
	}

	public static final JQLiteral _dblquoted(Object literal) {
		return _(literal, Mode.DBLQUOTED);
	}

	public static final JQLiteral _raw(Object literal) {
		return _(literal, Mode.RAW);
	}

	public static final JQLiteral _(final Object literal, final Mode mode) {

		if (literal == null)
			return null;

		if (literal instanceof JQLiteral)
			return (JQLiteral) literal;

		if (literal instanceof IJQStatement) {
			return new JQLiteral(((IJQStatement) literal).toString(), Mode.RAW);
		}

		if (literal instanceof IJQFunction) {
			return new JQLiteral(((IJQFunction) literal).toString(), Mode.RAW);
		}

		if (literal instanceof IJQOptions<?>) {
			return new JQLiteral(((IJQOptions<?>) literal).toString(), Mode.RAW);
		}

		CharSequence str = String.valueOf(literal);

		if (mode == Mode.QUOTED)
			return new JQLiteral(Utils.quote(str), mode);

		if (mode == Mode.DBLQUOTED)
			return new JQLiteral(Utils.dblquote(str), mode);

		return new JQLiteral(str, Mode.RAW);
	}

}
