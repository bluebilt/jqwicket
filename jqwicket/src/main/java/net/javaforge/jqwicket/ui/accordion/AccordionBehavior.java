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
package net.javaforge.jqwicket.ui.accordion;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 * 
 */
public class AccordionBehavior extends JQUIComponentBehaivor<AccordionOptions>
		implements IAccordion {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "accordion";

	public AccordionBehavior() {
		this(new AccordionOptions());
	}

	public AccordionBehavior(AccordionOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(int)
	 */
	public JQFunction activate(int index) {
		return chain("'activate'", String.valueOf(index));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      int)
	 */
	public void activate(AjaxRequestTarget ajaxRequestTarget, int index) {
		chain(ajaxRequestTarget, this.activate(index));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(java.lang.String)
	 */
	public JQFunction activate(String selector) {
		return chain("'activate'", selector);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      java.lang.String)
	 */
	public void activate(AjaxRequestTarget ajaxRequestTarget, String selector) {
		chain(ajaxRequestTarget, this.activate(selector));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(boolean)
	 */
	public JQFunction activate(boolean activate) {
		return chain("'activate'", String.valueOf(activate));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#activate(org.apache.wicket.ajax.AjaxRequestTarget,
	 *      boolean)
	 */
	public void activate(AjaxRequestTarget ajaxRequestTarget, boolean activate) {
		chain(ajaxRequestTarget, this.activate(activate));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#resize()
	 */
	public JQFunction resize() {
		return chain("'resize'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.accordion.IAccordion#resize(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void resize(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.resize());
	}

}
