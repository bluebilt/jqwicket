package com.google.code.jqwicket.ui.ckeditor;

import static com.google.code.jqwicket.api.JQuery.js;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.ResourceReference;

import com.google.code.jqwicket.JQHeaderContributionTarget;
import com.google.code.jqwicket.api.IJQStatement;
import com.google.code.jqwicket.ui.JQComponentBehaivor;

/**
 * 
 * @author mkalina
 */
public class CKEditorBehavior extends JQComponentBehaivor<CKEditorOptions>
		implements ICKEditor {

	private static final long serialVersionUID = 1L;

	private static final ResourceReference baseRef = new ResourceReference(
			CKEditorOptions.class, "");

	public CKEditorBehavior() {
		this(new CKEditorOptions());
	}

	public CKEditorBehavior(CKEditorOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQComponentBehaivor#contributeInternal(com.google.code.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		super.contributeInternal(target);
		CharSequence baseUrl = RequestCycle.get().urlFor(baseRef);
		target.addJQStatements(
				new IJQStatement[] {
						js(String.format("var CKEDITOR_BASEPATH = '%s';\n",
								baseUrl)),
						js(String
								.format("function CKEDITOR_GETURL(resource){\n"
										+ " return resource.indexOf('%s') >= 0 ? resource : '%s' + resource;\n"
										+ "}", baseUrl, baseUrl)) }, false);
	}

}
