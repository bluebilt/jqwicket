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

import static net.javaforge.jqwicket.Utils.isNotEmpty;
import static net.javaforge.jqwicket.Utils.semicolon;

import java.io.Serializable;

/**
 * Wrapper for jquery functions.
 * 
 * @author mkalina
 * 
 */
public class JQFunction implements Serializable {

	private static final long serialVersionUID = 1L;

	private CharSequence[] args;

	private CharSequence js;

	JQFunction(CharSequence js) {
		this(js, (CharSequence[]) null);
	}

	JQFunction(CharSequence js, CharSequence... args) {
		this.js = semicolon(js);
		this.args = args;
	}

	JQFunction(JQStatement statement, CharSequence... args) {
		this.js = statement.render();
		this.args = args;
	}

	JQFunction(JQStatement[] statements, CharSequence... args) {
		this.js = Utils.join(statements, "\n");
		this.args = args;
	}

	public CharSequence render() {
		StringBuffer sb = new StringBuffer();
		sb.append("function(");
		if (isNotEmpty(args)) {
			sb.append(Utils.join(args, ","));
		}
		sb.append("){").append(renderBodyOnly()).append("}");
		return sb;
	}

	public String renderBodyOnly() {
		return this.js.toString();
	}

	public JQStatement renderBodyOnlyAsJQStatement() {
		return JQuery.js(this.js);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(this.render());
	}

}
