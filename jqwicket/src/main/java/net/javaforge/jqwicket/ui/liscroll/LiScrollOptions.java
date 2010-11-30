package net.javaforge.jqwicket.ui.liscroll;

import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;

/**
 * 
 * @author cschaedel
 */
public class LiScrollOptions extends AbstractJQOptions<LiScrollOptions>{

	private static final long serialVersionUID = 1L;
	
	public static final JavascriptResourceReference JS_RESOURCE = new JavascriptResourceReference(
			LiScrollOptions.class, "jquery.li-scroller.1.0.js");

	public static final ResourceReference CSS_RESOURCE = new ResourceReference(
			LiScrollOptions.class, "li-scroller.css");

	public LiScrollOptions() {
		this.jsResourceReferences(JS_RESOURCE);
		this.cssResourceReferences(CSS_RESOURCE);		
	}

	public LiScrollOptions travelocity(float travelocity) {
		super.put("travelocity", travelocity);
		return this;
	}
}
