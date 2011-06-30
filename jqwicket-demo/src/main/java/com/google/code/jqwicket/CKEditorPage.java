package com.google.code.jqwicket;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

import com.google.code.jqwicket.ui.ckeditor.CKEditorOptions;
import com.google.code.jqwicket.ui.ckeditor.CKEditorTextArea;

public class CKEditorPage extends DemoPage {

	public CKEditorPage() {
		add(new CKEditorForm("ckeditorform"));
	}

	private static class CKEditorForm extends Form<Void> {

		private static final long serialVersionUID = 1L;

		private String value;

		public CKEditorForm(String id) {
			super(id);
			add(new CKEditorTextArea<String>("ckeditor",

			new CKEditorOptions()
					.dialog_backgroundCoverColor("red")
					.language("ru")
					.toolbar(
							new CharSequence[][] {
									{ "Bold", "Italic", "-", "NumberedList",
											"BulletedList", "-", "Link",
											"Unlink" }, { "UIColor" } }),
					new PropertyModel<String>(this, "value")));

		}

		@Override
		protected void onSubmit() {
			System.out.println("submitted: " + value);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleTitle()
	 */
	@Override
	protected String getExampleTitle() {
		return "CKEditor jqwicket integration example";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.DemoPage#getExampleDescription()
	 */
	@Override
	protected String getExampleDescription() {
		return null;
	}

}
