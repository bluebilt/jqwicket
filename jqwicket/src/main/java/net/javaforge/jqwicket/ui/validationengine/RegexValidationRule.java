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
package net.javaforge.jqwicket.ui.validationengine;

import static net.javaforge.jqwicket.Utils.isBlank;
import static net.javaforge.jqwicket.Utils.quote;

/**
 * Validation rule implementation defining regex to check against on field
 * validation.
 * 
 * @author mkalina
 * 
 */
public class RegexValidationRule extends ValidationRule<RegexValidationRule> {

	private static final long serialVersionUID = 1L;

	private CharSequence regex;

	public RegexValidationRule(CharSequence name, CharSequence regex,
			CharSequence... alertTextErrors) {
		super(name, alertTextErrors);
		this.regex = regex;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.validationengine.ValidationRule#customPayloadToJson()
	 */
	@Override
	protected CharSequence customPayloadToJson() {
		StringBuffer buf = new StringBuffer();
		buf.append(quote("regex")).append(":");
		if (isBlank(this.regex))
			buf.append("'none'");
		else
			buf.append(quote(this.regex));
		return buf;
	}

}
