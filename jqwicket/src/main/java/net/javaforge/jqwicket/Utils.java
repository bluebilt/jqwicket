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

import java.util.Collection;
import java.util.Map;

import org.apache.wicket.Application;

/**
 * @author mkalina
 * 
 *         Parts of the source code are taken from Apache's commons-lang
 *         project.
 * 
 */
public class Utils {

	Utils() {
	}

	public static boolean isDevelopmentMode() {
		return Application.DEVELOPMENT.equalsIgnoreCase(Application.get()
				.getConfigurationType());
	}

	public static boolean isEmpty(Object[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty(Object[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

	public static boolean isNotBlank(CharSequence str) {
		return !isBlank(str);
	}

	public static boolean isEmpty(Collection<?> coll) {
		return (coll == null || coll.isEmpty());
	}

	public static boolean isNotEmpty(Collection<?> coll) {
		return !isEmpty(coll);
	}

	public static final boolean isBlank(CharSequence value) {
		return (value == null || isBlank(value.toString()));
	}

	public static final CharSequence quote(CharSequence value) {
		if (isBlank(value))
			return null;
		return new StringBuffer().append("'").append(value).append("'");
	}
	
	public static final CharSequence dblquote(CharSequence value) {
		if (isBlank(value))
			return null;
		return new StringBuffer().append("\"").append(value).append("\"");
	}	

	public static final CharSequence semicolon(CharSequence value) {

		if (isBlank(value))
			return "";

		return value.toString().trim().endsWith(";") ? value : value + ";";
	}

	public static final <T> CharSequence join(T[] objects, String separator) {
		return join(objects, separator, new IJoinCallback<T>() {
			public CharSequence toCharSequence(T obj) {
				return String.valueOf(obj);
			}
		});
	}

	public static final CharSequence join(IRenderable[] statements,
			String separator) {
		return join(statements, separator, new IJoinCallback<IRenderable>() {
			public CharSequence toCharSequence(IRenderable obj) {
				return obj.render();
			}
		});
	}

	public static final CharSequence join(int[] objects, String separator) {

		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < objects.length; i++) {
			buf.append(objects[i]);
			if (i < (objects.length - 1))
				buf.append(separator);
		}
		return buf;
	}

	public static final CharSequence join(float[] objects, String separator) {

		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < objects.length; i++) {
			buf.append(objects[i]);
			if (i < (objects.length - 1))
				buf.append(separator);
		}
		return buf;
	}

	public static final CharSequence join(boolean[] objects, String separator) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < objects.length; i++) {
			buf.append(objects[i]);
			if (i < (objects.length - 1))
				buf.append(separator);
		}
		return buf;
	}

	public static final <T> CharSequence join(T[] objects,
			CharSequence separator, IJoinCallback<T> callback) {

		if (isEmpty(objects))
			return "";

		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] != null)
				buf.append(callback.toCharSequence(objects[i]));

			if (i < (objects.length - 1) && objects[i + 1] != null)
				buf.append(separator);

		}
		return buf;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static CharSequence toJson(Map<CharSequence, ? extends Object> map) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		if (map != null) {
			int count = 0;
			for (Map.Entry<CharSequence, ? extends Object> option : map
					.entrySet()) {
				Object value = option.getValue();
				if (value == null)
					continue;

				CharSequence jsonValue;
				if (value instanceof IRenderable) {
					jsonValue = ((IRenderable) value).render();
				} else if (value instanceof IJsonAware) {
					jsonValue = ((IJsonAware) value).toJson();
				} else if (value instanceof Map) {
					jsonValue = "[" + toJson((Map) value) + "]";
				} else if (value instanceof int[]) {
					jsonValue = toJson((int[]) value);
				} else if (value instanceof float[]) {
					jsonValue = toJson((float[]) value);
				} else if (value instanceof boolean[]) {
					jsonValue = toJson((boolean[]) value);
				} else if (value instanceof String[]) {
					jsonValue = toJson((String[]) value);
				} else if (value instanceof IJsonAware[]) {
					jsonValue = toJson((IJsonAware[]) value);
				} else if (value instanceof Object[]) {
					jsonValue = toJson((Object[]) value);
				} else
					jsonValue = String.valueOf(value);

				sb.append(option.getKey()).append(":").append(jsonValue);
				if (count < (map.size() - 1)) {
					sb.append(", ");
				}
				count++;
			}
		}
		sb.append("}");
		return sb;
	}

	public static CharSequence toJson(int[] args) {
		return new StringBuilder().append("[").append(join(args, ","))
				.append("]");
	}

	public static CharSequence toJson(float[] args) {
		return new StringBuilder().append("[").append(join(args, ","))
				.append("]");
	}

	public static CharSequence toJson(boolean[] args) {
		return new StringBuilder().append("[").append(join(args, ","))
				.append("]");
	}

	public static CharSequence toJson(String[] args) {
		return new StringBuilder().append("[").append(join(args, ","))
				.append("]");
	}

	public static CharSequence toJson(Object[] args) {
		return new StringBuilder().append("[").append(join(args, ","))
				.append("]");
	}

	public static CharSequence toJson(IJsonAware[] args) {
		return new StringBuilder().append("[")
				.append(join(args, ",", new IJoinCallback<IJsonAware>() {
					public CharSequence toCharSequence(IJsonAware obj) {
						return obj.toJson();
					}
				})).append("]");
	}

	public static interface IJoinCallback<T> {

		CharSequence toCharSequence(T obj);
	}

	// Substring between
	// -----------------------------------------------------------------------
	/**
	 * <p>
	 * Gets the String that is nested in between two instances of the same
	 * String.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> input String returns <code>null</code>. A
	 * <code>null</code> tag returns <code>null</code>.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.substringBetween(null, *)            = null
	 * StringUtils.substringBetween("", "")             = ""
	 * StringUtils.substringBetween("", "tag")          = null
	 * StringUtils.substringBetween("tagabctag", null)  = null
	 * StringUtils.substringBetween("tagabctag", "")    = ""
	 * StringUtils.substringBetween("tagabctag", "tag") = "abc"
	 * </pre>
	 * 
	 * @param str
	 *            the String containing the substring, may be null
	 * @param tag
	 *            the String before and after the substring, may be null
	 * @return the substring, <code>null</code> if no match
	 * @since 2.0
	 */
	public static String substringBetween(String str, String tag) {
		return substringBetween(str, tag, tag);
	}

	/**
	 * <p>
	 * Gets the String that is nested in between two Strings. Only the first
	 * match is returned.
	 * </p>
	 * 
	 * <p>
	 * A <code>null</code> input String returns <code>null</code>. A
	 * <code>null</code> open/close returns <code>null</code> (no match). An
	 * empty ("") open and close returns an empty string.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.substringBetween("wx[b]yz", "[", "]") = "b"
	 * StringUtils.substringBetween(null, *, *)          = null
	 * StringUtils.substringBetween(*, null, *)          = null
	 * StringUtils.substringBetween(*, *, null)          = null
	 * StringUtils.substringBetween("", "", "")          = ""
	 * StringUtils.substringBetween("", "", "]")         = null
	 * StringUtils.substringBetween("", "[", "]")        = null
	 * StringUtils.substringBetween("yabcz", "", "")     = ""
	 * StringUtils.substringBetween("yabcz", "y", "z")   = "abc"
	 * StringUtils.substringBetween("yabczyabcz", "y", "z")   = "abc"
	 * </pre>
	 * 
	 * @param str
	 *            the String containing the substring, may be null
	 * @param open
	 *            the String before the substring, may be null
	 * @param close
	 *            the String after the substring, may be null
	 * @return the substring, <code>null</code> if no match
	 * @since 2.0
	 */
	public static String substringBetween(String str, String open, String close) {
		if (str == null || open == null || close == null) {
			return null;
		}
		int start = str.indexOf(open);
		if (start != -1) {
			int end = str.indexOf(close, start + open.length());
			if (end != -1) {
				return str.substring(start + open.length(), end);
			}
		}
		return null;
	}

}
