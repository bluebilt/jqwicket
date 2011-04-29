package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.uploadify.UploadifyBehavior;
import com.google.code.jqwicket.ui.uploadify.UploadifyOptions;

public class UploadifyPage extends WebPage {

	public UploadifyPage() {
		add(new WebMarkupContainer("file_upload").add(new UploadifyBehavior(
				new UploadifyOptions().script("http://localhost:8080/_up")
						.scriptAccess("always").auto(true).multi(true))));

	}

}
