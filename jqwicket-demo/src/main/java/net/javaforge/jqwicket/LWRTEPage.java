package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.lwrte.LWRTETextArea;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

public class LWRTEPage extends WebPage {

	public LWRTEPage() {
		add(new LWRTEForm("lwrteform"));
	}

	private static class LWRTEForm extends Form<Void> {

		private static final long serialVersionUID = 1L;

		private String value;

		public LWRTEForm(String id) {
			super(id);
			add(new LWRTETextArea<String>("lwrte", new PropertyModel<String>(
					this, "value")));

		}

		@Override
		protected void onSubmit() {
			System.out.println("submitted: " + value);
		}

	}

}
