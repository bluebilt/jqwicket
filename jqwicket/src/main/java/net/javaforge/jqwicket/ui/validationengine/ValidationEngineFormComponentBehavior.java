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

import net.javaforge.jqwicket.Utils;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.model.Model;

/**
 * @author mkalina
 * 
 */
public class ValidationEngineFormComponentBehavior extends AttributeModifier {

	private static final long serialVersionUID = 1L;

	public ValidationEngineFormComponentBehavior(CharSequence ruleSequence) {
		super("class", true, new Model<String>(String.valueOf(ruleSequence)));
	}

	public ValidationEngineFormComponentBehavior(CharSequence... rules) {
		super("class", true, new Model<String>(String.valueOf(Utils.join(rules,
				","))));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.behavior.AbstractBehavior#bind(org.apache.wicket.Component)
	 */
	@Override
	public void bind(Component component) {
		super.bind(component);
		component.setOutputMarkupId(true);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.AttributeModifier#newValue(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	protected String newValue(String currentValue, String replacementValue) {
		StringBuffer buf = new StringBuffer();
		if (Utils.isNotBlank(currentValue)) {
			buf.append(currentValue).append(" ");
		}
		buf.append("validate[").append(replacementValue).append("]");
		return buf.toString();
	}

}
