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

import java.io.Serializable;

/**
 * @author mkalina
 * 
 */
public class CloudZoomImage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bigImageUrl;

	private String smallImageUrl;

	private String imageTitle;

	private String imageAlt;

	public CloudZoomImage(String bigImageUrl, String smallImageUrl) {
		this(bigImageUrl, smallImageUrl, null, null);
	}

	public CloudZoomImage(String bigImageUrl, String smallImageUrl,
			String imageTitle, String imageAlt) {
		this.bigImageUrl = bigImageUrl;
		this.smallImageUrl = smallImageUrl;
		this.imageTitle = imageTitle;
		this.imageAlt = imageAlt;
	}

	public String getBigImageUrl() {
		return bigImageUrl;
	}

	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	public String getImageAlt() {
		return imageAlt;
	}

}
