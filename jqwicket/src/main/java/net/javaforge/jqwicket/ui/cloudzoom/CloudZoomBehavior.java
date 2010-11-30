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
package net.javaforge.jqwicket.ui.cloudzoom;

import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class CloudZoomBehavior extends JQComponentBehaivor<CloudZoomOptions> {

	private static final long serialVersionUID = 1L;

	public CloudZoomBehavior(CloudZoomImage image,
			CloudZoomGalleryImage... galleryImages) {
		this(new CloudZoomOptions(image, galleryImages));
	}

	public CloudZoomBehavior(CloudZoomOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQUIWidget#getName()
	 */
	public String getName() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#initComponentJavascript(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void initComponentJavascript(JQHeaderContributionTarget target) {
		; // no init javascript
	}

}
