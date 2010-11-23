package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.uploadify.UploadifyBehavior;
import net.javaforge.jqwicket.ui.uploadify.UploadifyOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class UploadifyPage extends WebPage {

	public UploadifyPage() {
		add(new WebMarkupContainer("file_upload").add(new UploadifyBehavior(
				new UploadifyOptions().script("http://localhost:8080/_up")
						.scriptAccess("always").auto(true).multi(true))));

	}

}
