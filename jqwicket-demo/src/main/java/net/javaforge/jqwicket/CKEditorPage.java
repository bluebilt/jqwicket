package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.ckeditor.CKEditorOptions;
import net.javaforge.jqwicket.ui.ckeditor.CKEditorTextArea;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

public class CKEditorPage extends WebPage {

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

}
