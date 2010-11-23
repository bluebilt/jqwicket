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
package net.javaforge.jqwicket.ui.dialog;

import java.io.Serializable;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.IJsonAware;

/**
 * @author mkalina
 *
 */
public class DialogButton implements Serializable, IJsonAware {

	private static final long serialVersionUID = 1L;

	private String name;

	private JQFunction callback;

	public DialogButton(String name, JQFunction callback) {
		this.name = name;
		this.callback = callback;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJsonAware#toJson()
	 */
	public CharSequence toJson() {
		return new StringBuffer().append("{text:\"").append(this.name)
				.append("\", click:").append(this.callback.render())
				.append("}");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(this.toJson());
	}

}
