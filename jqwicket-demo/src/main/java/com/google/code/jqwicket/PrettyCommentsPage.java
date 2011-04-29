package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextArea;

import com.google.code.jqwicket.ui.prettycomments.PrettyCommentsBehavior;

public class PrettyCommentsPage extends WebPage {

	public PrettyCommentsPage() {
		add(new TextArea<String>("commentBox1").add(new PrettyCommentsBehavior()));
		add(new TextArea<String>("commentBox2").add(new PrettyCommentsBehavior()));
	}
}
