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
package net.javaforge.jqwicket.ui;

import static net.javaforge.jqwicket.Utils.isNotBlank;

import java.util.LinkedHashMap;
import java.util.Map;

import net.javaforge.jqwicket.IJsonAware;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.Utils;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * Base abstract {@link IJQOptions} implementation.
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
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setCssResourceReferences(org.apache.wicket.ResourceReference[])
	 */
	public T setCssResourceReferences(ResourceReference... refs) {
		this.cssResourceReferences = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getCssResourceReferences()
	 */
	public ResourceReference[] getCssResourceReferences() {
		return this.cssResourceReferences;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getJsResourceReferences()
	 */
	public JavascriptResourceReference[] getJsResourceReferences() {
		return this.jsResourceReferences;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setJsResourceReferences(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T setJsResourceReferences(JavascriptResourceReference... refs) {
		this.jsResourceReferences = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getJsResourceReferencesMin()
	 */
	public JavascriptResourceReference[] getJsResourceReferencesMin() {
		return this.jsResourceReferencesMin;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setJsResourceReferencesMin(org.apache.wicket.markup.html.resources.JavascriptResourceReference[])
	 */
	public T setJsResourceReferencesMin(JavascriptResourceReference... refs) {
		this.jsResourceReferencesMin = refs;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setCssResourceUrls(java.lang.CharSequence[])
	 */
	public T setCssResourceUrls(CharSequence... urls) {
		this.cssResourceUrls = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getCssResourceUrls()
	 */
	public CharSequence[] getCssResourceUrls() {
		return this.cssResourceUrls;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setJsResourceUrlsMin(java.lang.String[])
	 */
	public T setJsResourceUrlsMin(CharSequence... urls) {
		this.jsResourceUrlsMin = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getJsResourceUrlsMin()
	 */
	public CharSequence[] getJsResourceUrlsMin() {
		return this.jsResourceUrlsMin;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#setJsResourceUrls(java.lang.CharSequence[])
	 */
	public T setJsResourceUrls(CharSequence... urls) {
		this.jsResourceUrls = urls;
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getJsResourceUrls()
	 */
	public CharSequence[] getJsResourceUrls() {
		return this.jsResourceUrls;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#isEmpty()
	 */
	public boolean isEmpty() {
		return this.options.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#get(java.lang.CharSequence)
	 */
	public CharSequence get(CharSequence key) {
		return this.get(key, null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#get(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public CharSequence get(CharSequence key, CharSequence defaultValue) {
		Object object = options.get(key);
		return object != null ? object.toString() : defaultValue;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getString(java.lang.CharSequence)
	 */
	public String getString(CharSequence key) {
		return String.valueOf(this.get(key));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getString(java.lang.CharSequence,
	 *      java.lang.String)
	 */
	public String getString(CharSequence key, String defaultValue) {
		return String.valueOf(this.get(key, defaultValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getObject(java.lang.CharSequence)
	 */
	public Object getObject(CharSequence key) {
		return options.get(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getJQStatement(java.lang.CharSequence)
	 */
	public JQStatement getJQStatement(CharSequence key) {
		return (JQStatement) options.get(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getInt(java.lang.CharSequence)
	 */
	public int getInt(CharSequence key) {
		return this.getInt(key, (Integer) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getInt(java.lang.CharSequence,
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
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getOptions(java.lang.CharSequence)
	 */
	public AbstractJQOptions<?> getOptions(CharSequence key) {
		Object object = this.options.get(key);
		return (AbstractJQOptions<?>) object;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getShort(java.lang.CharSequence)
	 */
	public short getShort(CharSequence key) {
		return this.getShort(key, (Short) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getShort(java.lang.CharSequence,
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
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getDouble(java.lang.CharSequence)
	 */
	public double getDouble(CharSequence key) {
		return this.getDouble(key, (Double) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getDouble(java.lang.CharSequence,
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
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getFloat(java.lang.CharSequence)
	 */
	public float getFloat(CharSequence key) {
		return this.getFloat(key, (Float) null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getFloat(java.lang.CharSequence,
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
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getBoolean(java.lang.CharSequence)
	 */
	public boolean getBoolean(CharSequence key) {
		return ((Boolean) this.options.get(key)).booleanValue();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#getBoolean(java.lang.CharSequence,
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
	 * @see net.javaforge.jqwicket.ui.IJQOptions#putUnquoted(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public T putUnquoted(CharSequence key, CharSequence value) {
		if (isNotBlank(value)) {
			options.put(key, value);
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#putDblquoted(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public T putDblquoted(CharSequence key, CharSequence value) {
		if (isNotBlank(value)) {
			options.put(key, Utils.dblquote(value));
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      net.javaforge.jqwicket.ui.IJQOptions)
	 */
	public T put(CharSequence key, IJQOptions<?> options) {
		if (options != null) {
			this.options.put(key, options);
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.Enum)
	 */
	public T put(CharSequence key, Enum<?> enumVal) {
		return putEnumInternal(key, enumVal, true);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#putUnquoted(java.lang.CharSequence,
	 *      java.lang.Enum)
	 */
	public T putUnquoted(CharSequence key, Enum<?> enumVal) {
		return putEnumInternal(key, enumVal, false);
	}

	private T putEnumInternal(CharSequence key, Enum<?> enumVal, boolean quoted) {
		if (enumVal == null)
			return (T) this;

		CharSequence val = null;

		if (enumVal instanceof IJsonAware)
			val = ((IJsonAware) enumVal).toJson();
		else
			val = enumVal.name().toLowerCase();

		val = quoted ? Utils.quote(val) : val;
		options.put(key, val);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      net.javaforge.jqwicket.JQStatement)
	 */
	public T put(CharSequence name, JQStatement value) {
		options.put(name, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      net.javaforge.jqwicket.JQFunction)
	 */
	public T put(CharSequence name, JQFunction value) {
		options.put(name, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence)
	 */
	public T put(CharSequence key, CharSequence value) {
		if (isNotBlank(value)) {
			options.put(key, Utils.quote(value));
		}
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      int)
	 */
	public T put(CharSequence key, int value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      int[])
	 */
	public T put(CharSequence key, int... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      double)
	 */
	public T put(CharSequence key, double value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      double[])
	 */
	public T put(CharSequence key, double... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      float)
	 */
	public T put(CharSequence key, float value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      float[])
	 */
	public T put(CharSequence key, float... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      boolean)
	 */
	public T put(CharSequence key, boolean value) {
		options.put(key, value);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      boolean[])
	 */
	public T put(CharSequence key, boolean... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      net.javaforge.jqwicket.IJsonAware[])
	 */
	public T put(CharSequence key, IJsonAware... values) {
		options.put(key, values);
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence[])
	 */
	public T put(CharSequence key, CharSequence... values) {

		if (Utils.isEmpty(values))
			return (T) this;

		options.put(key, Utils.quote(values));
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#put(java.lang.CharSequence,
	 *      java.lang.CharSequence[][])
	 */
	public T put(CharSequence key, CharSequence[][] values) {
		if (values == null)
			return (T) this;

		options.put(key, Utils.toJson(values));
		return (T) this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#removeOption(java.lang.CharSequence)
	 */
	public void removeOption(CharSequence key) {
		this.options.remove(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.IJQOptions#containsKey(java.lang.CharSequence)
	 */
	public boolean containsKey(CharSequence key) {
		return options.containsKey(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJsonAware#toJson()
	 */
	public CharSequence toJson() {
		return Utils.toJson(this.options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new StringBuffer().append("[")
				.append(Utils.toJson(this.options)).append("]").toString();
	}

}
