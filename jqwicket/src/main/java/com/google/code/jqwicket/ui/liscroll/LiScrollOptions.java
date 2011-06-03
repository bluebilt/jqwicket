package com.google.code.jqwicket.ui.liscroll;


import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

import com.google.code.jqwicket.api.AbstractJQOptions;

/**
 * 
 * @author cschaedel
 */
public class LiScrollOptions extends AbstractJQOptions<LiScrollOptions> {

	private static final long serialVersionUID = 1L;

	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			LiScrollOptions.class, "jquery.li-scroller.1.0.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			LiScrollOptions.class, "li-scroller.css");

	public LiScrollOptions() {
		this.setJsResourceReferences(JS_RESOURCE);
		this.setCssResourceReferences(CSS_RESOURCE);
	}

	public LiScrollOptions travelocity(float travelocity) {
		return super.put("travelocity", travelocity);
	}
}
