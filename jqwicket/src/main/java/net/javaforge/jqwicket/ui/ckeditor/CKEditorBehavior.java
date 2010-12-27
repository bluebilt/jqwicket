package net.javaforge.jqwicket.ui.ckeditor;

import java.util.UUID;

import net.javaforge.jqwicket.ui.JQComponentBehaivor;

import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;

/**
 * 
 * @author mkalina
 */
public class CKEditorBehavior extends JQComponentBehaivor<CKEditorOptions>
		implements ICKEditor, IHeaderContributor {

	private static final long serialVersionUID = 1L;

	public CKEditorBehavior() {
		this(new CKEditorOptions());
	}

	public CKEditorBehavior(CKEditorOptions options) {
		super(options);
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
		String ckeditorResourcesUrl = new StringBuffer("resources/")
				.append(CKEditorOptions.class.getName()).append("/").toString();
		String script = String
				.format("function CKEDITOR_GETURL(resource){ return resource.indexOf('%s') == 0 ? resource : '%s' + resource; }",
						ckeditorResourcesUrl, ckeditorResourcesUrl);
		response.renderJavascript(script, UUID.randomUUID().toString());
	}

}
