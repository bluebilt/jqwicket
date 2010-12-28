package net.javaforge.jqwicket.ui.ckeditor;

import java.util.UUID;

import net.javaforge.jqwicket.ui.GenericJQComponentBehaivor;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;

/**
 * Generic, selector based CKEditor behavior.
 * 
 * @author mkalina
 */
public class GenericCKEditorBehavior extends
		GenericJQComponentBehaivor<CKEditorOptions> implements ICKEditor,
		IHeaderContributor {

	private static final long serialVersionUID = 1L;

	private static final ResourceReference baseRef = new ResourceReference(
			CKEditorOptions.class, "");

	public GenericCKEditorBehavior(CharSequence selector) {
		this(selector, new CKEditorOptions());
	}

	public GenericCKEditorBehavior(CharSequence selector,
			CKEditorOptions options) {
		super(selector, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.apache.wicket.behavior.AbstractBehavior#renderHead(org.apache.wicket.markup.html.IHeaderResponse)
	 */
	@Override
	public void renderHead(IHeaderResponse response) {
		CharSequence baseUrl = RequestCycle.get().urlFor(baseRef);
		StringBuffer buf = new StringBuffer();
		buf.append(String.format("var CKEDITOR_BASEPATH = '%s';\n", baseUrl));
		buf.append(String
				.format("function CKEDITOR_GETURL(resource){\n"
						+ " return resource.indexOf('%s') >= 0 ? resource : '%s' + resource;\n"
						+ "}", baseUrl, baseUrl));
		response.renderJavascript(buf, UUID.randomUUID().toString());
	}

}
