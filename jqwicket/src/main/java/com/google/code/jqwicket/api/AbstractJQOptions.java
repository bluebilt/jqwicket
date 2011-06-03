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
package com.google.code.jqwicket.api;

import static com.google.code.jqwicket.Utils.isNotBlank;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.Utils;

/**
 * Base abstract {@link IJQOptions} implementation. See {@link IJQOptions} for
 * further details.
 * 
 * @author mkalina
 * 
 * @param <T>
 *            type of options itself.
 */
@SuppressWarnings("unchecked")
public abstract class AbstractJQOptions<T extends AbstractJQOptions<T>>
		implements IJQOptions<T> {

	private static final long serialVersionUID = 1L;

	protected Map<CharSequence, Object> options = new LinkedHashMap<CharSequence, Object>();

	private ResourceReference[] cssResourceReferences;

	private JavascriptResourceReference[] jsResourceReferencesMin;

	private JavascriptResourceReference[] jsResourceReferences;

	private CharSequence[] cssResourceUrls;

	private CharSequence[] jsResourceUrlsMin;

	private CharSequence[] jsResourceUrls;

	public AbstractJQOptions() {
	}

	/**
	 * Creates new options instance from the pure json options definition.<br>
	 * Example usage:<br>
	 * 
	 * <pre>
	 * IJQOptions&lt;?&gt; options = JQOptions.valueOf(&quot;a:1, b:23, c:'2233'&quot;);
	 * </pre>
	 * 
	 * @param options
	 *            is a pure json options definition.
	 * @return new options instance
	 */
	public static final IJQOptions<?> valueOf(final CharSequence options) {
		return valueOf(options, JQOptions.class);
	}

	/**
	 * Creates new type-safe options instance from the pure json options
	 * definition.<br>
	 * Example usage:<br>
	 * 
	 * <pre>
	 * MyOptions o = MyOptions.valueOf(&quot;a:1, b:23, c:'2233'&quot;, MyOptions.class);
	 * </pre>
	 * 
	 * @param <T>
	 *            is a resulting options type
	 * @param options
	 *            is a pure json options definition.
	 * @param targetType
	 *            is a class of the resulting options type
	 * @return new options instance
	 */
	public static final <T extends IJQOptions<?>> T valueOf(
			final CharSequence options, Class<T> targetType) {
		try {
			T opts = targetType.newInstance();
			if (Utils.isBlank(options))
				return opts;

			String[] splitted = String.valueOf(options).split(",");
			for (String s : splitted) {
				opts.put(s.substring(0, s.indexOf(':')).trim(),
						JQLiteral._raw(s.substring(s.indexOf(':') + 1).trim()));
			}

			return opts;

		} catch (Exception e) {
			throw new RuntimeException("Error creating new options instance!",
					e);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setCssResourceReferences(org.apache.wicket.ResourceReference[])
	 */
	public T setCssResourceReferences(ResourceReference... refs) {
		this.cssResourceReferences = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addCssResourceReferences(org.apache.wicket.ResourceReference[])
	 */
	public T addCssResourceReferences(ResourceReference... refs) {
		this.cssResourceReferences = Utils.join(this.cssResourceReferences,
				refs);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getCssResourceReferences()
	 */
	public ResourceReference[] getCssResourceReferences() {
		return this.cssResourceReferences;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getJsResourceReferences()
	 */
	public JavascriptResourceReference[] getJsResourceReferences() {
		return this.jsResourceReferences;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setJsResourceReferences(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T setJsResourceReferences(JavascriptResourceReference... refs) {
		this.jsResourceReferences = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addJsResourceReferences(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T addJsResourceReferences(JavascriptResourceReference... refs) {
		this.jsResourceReferences = Utils.join(this.jsResourceReferences, refs);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getJsResourceReferencesMin()
	 */
	public JavascriptResourceReference[] getJsResourceReferencesMin() {
		return this.jsResourceReferencesMin;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setJsResourceReferencesMin(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T setJsResourceReferencesMin(JavascriptResourceReference... refs) {
		this.jsResourceReferencesMin = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addJsResourceReferencesMin(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T addJsResourceReferencesMin(JavascriptResourceReference... refs) {
		this.jsResourceReferencesMin = Utils.join(this.jsResourceReferencesMin,
				refs);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setCssResourceUrls(java.lang.CharSequence[])
	 */
	public T setCssResourceUrls(CharSequence... urls) {
		this.cssResourceUrls = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addCssResourceUrls(java.lang.CharSequence[])
	 */
	public T addCssResourceUrls(CharSequence... urls) {
		this.cssResourceUrls = Utils.join(this.cssResourceUrls, urls);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getCssResourceUrls()
	 */
	public CharSequence[] getCssResourceUrls() {
		return this.cssResourceUrls;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setJsResourceUrlsMin(java.lang.String[])
	 */
	public T setJsResourceUrlsMin(CharSequence... urls) {
		this.jsResourceUrlsMin = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addJsResourceUrlsMin(java.lang.CharSequence[])
	 */
	public T addJsResourceUrlsMin(CharSequence... urls) {
		this.jsResourceUrlsMin = Utils.join(this.jsResourceUrlsMin, urls);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getJsResourceUrlsMin()
	 */
	public CharSequence[] getJsResourceUrlsMin() {
		return this.jsResourceUrlsMin;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#setJsResourceUrls(java.lang.CharSequence[])
	 */
	public T setJsResourceUrls(CharSequence... urls) {
		this.jsResourceUrls = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#addJsResourceUrls(java.lang.CharSequence[])
	 */
	public T addJsResourceUrls(CharSequence... urls) {
		this.jsResourceUrls = Utils.join(this.jsResourceUrls, urls);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getJsResourceUrls()
	 */
	public CharSequence[] getJsResourceUrls() {
		return this.jsResourceUrls;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#isEmpty()
	 */
	public boolean isEmpty() {
		return this.options.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#get(java.lang.CharSequence)
	 */
	public CharSequence get(CharSequence key) {
		return this.get(key, null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#get(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public CharSequence get(CharSequence key, CharSequence defaultValue) {
		Object object = options.get(key);
		return object != null ? object.toString() : defaultValue;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getString(java.lang.CharSequence)
	 */
	public String getString(CharSequence key) {
		return String.valueOf(this.get(key));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getString(java.lang.CharSequence,
	 *      java.lang.String)
	 */
	public String getString(CharSequence key, String defaultValue) {
		return String.valueOf(this.get(key, defaultValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getObject(java.lang.CharSequence)
	 */
	public Object getObject(CharSequence key) {
		return options.get(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getJQStatement(java.lang.CharSequence)
	 */
	public IJQStatement getJQStatement(CharSequence key) {
		return (IJQStatement) options.get(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getInt(java.lang.CharSequence)
	 */
	public int getInt(CharSequence key) {
		return this.getInt(key, (Integer) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getInt(java.lang.CharSequence,
	 *      int)
	 */
	public int getInt(CharSequence key, int defaultValue) {
		Object object = this.options.get(key);
		if (object == null)
			return defaultValue;

		return ((Integer) object).intValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getOptions(java.lang.CharSequence)
	 */
	public AbstractJQOptions<?> getOptions(CharSequence key) {
		Object object = this.options.get(key);
		return (AbstractJQOptions<?>) object;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getShort(java.lang.CharSequence)
	 */
	public short getShort(CharSequence key) {
		return this.getShort(key, (Short) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getShort(java.lang.CharSequence,
	 *      short)
	 */
	public short getShort(CharSequence key, short defaultValue) {
		Object object = this.options.get(key);
		if (object == null)
			return defaultValue;

		return ((Short) object).shortValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getDouble(java.lang.CharSequence)
	 */
	public double getDouble(CharSequence key) {
		return this.getDouble(key, (Double) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getDouble(java.lang.CharSequence,
	 *      double)
	 */
	public double getDouble(CharSequence key, double defaultValue) {
		Object object = this.options.get(key);
		if (object == null)
			return defaultValue;
		return ((Double) object).doubleValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getFloat(java.lang.CharSequence)
	 */
	public float getFloat(CharSequence key) {
		return this.getFloat(key, (Float) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getFloat(java.lang.CharSequence,
	 *      float)
	 */
	public float getFloat(CharSequence key, float defaultValue) {
		Object object = this.options.get(key);
		if (object == null)
			return defaultValue;
		return ((Float) object).floatValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getBoolean(java.lang.CharSequence)
	 */
	public boolean getBoolean(CharSequence key) {
		return ((Boolean) this.options.get(key)).booleanValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#getBoolean(java.lang.CharSequence,
	 *      boolean)
	 */
	public boolean getBoolean(CharSequence key, boolean defaultValue) {
		if (!this.options.containsKey(key))
			return defaultValue;

		return ((Boolean) this.options.get(key)).booleanValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      com.google.code.jqwicket.JQStatement)
	 */
	public T put(CharSequence name, IJQStatement value) {
		options.put(name, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      com.google.code.jqwicket.api.IJQFunction)
	 */
	public T put(CharSequence name, IJQFunction value) {
		options.put(name, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public T put(CharSequence key, CharSequence value) {
		if (isNotBlank(value)) {
			options.put(key, JQLiteral._(value));
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      int)
	 */
	public T put(CharSequence key, int value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      int[])
	 */
	public T put(CharSequence key, int... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      double)
	 */
	public T put(CharSequence key, double value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      double[])
	 */
	public T put(CharSequence key, double... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      float)
	 */
	public T put(CharSequence key, float value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      float[])
	 */
	public T put(CharSequence key, float... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      boolean)
	 */
	public T put(CharSequence key, boolean value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      boolean[])
	 */
	public T put(CharSequence key, boolean... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence[])
	 */
	public T put(CharSequence key, CharSequence... values) {
		if (Utils.isEmpty(values))
			return (T) this;

		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence[][])
	 */
	public T put(CharSequence key, CharSequence[][] values) {
		if (values == null)
			return (T) this;

		options.put(key, Utils.toJson(values));
		return (T) this;
	}

	public T put(CharSequence key, Enum<?> e) {
		if (e != null) {
			this.options.put(key, JQLiteral._(e.name()));
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#removeOption(java.lang.CharSequence)
	 */
	public void removeOption(CharSequence key) {
		this.options.remove(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.api.IJQOptions#containsKey(java.lang.CharSequence)
	 */
	public boolean containsKey(CharSequence key) {
		return options.containsKey(key);
	}

	private CharSequence toJson() {
		return Utils.toJson(this.options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(toJson());
	}

	public char charAt(int index) {
		return toJson().charAt(index);
	}

	public int length() {
		return toJson().length();
	}

	public CharSequence subSequence(int start, int end) {
		return toJson().subSequence(start, end);
	}

}
