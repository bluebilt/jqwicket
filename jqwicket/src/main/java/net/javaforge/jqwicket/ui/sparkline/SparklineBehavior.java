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
package net.javaforge.jqwicket.ui.sparkline;

import static net.javaforge.jqwicket.JQuery.$;
import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.Utils;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class SparklineBehavior extends JQComponentBehaivor<SparklineOptions>
		implements ISparkline {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "sparkline";

	public SparklineBehavior() {
		this(new SparklineOptions());
	}

	public SparklineBehavior(SparklineOptions options) {
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
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#initComponentJavascript(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void initComponentJavascript(JQHeaderContributionTarget target) {
		target.addJsStatement($(this.component).chain(
				this.getName(),
				this.options.hasValues() ? Utils.toJson(this.options
						.getValues()) : Utils.quote("html"),
				this.options.toJson()));
	}
}
