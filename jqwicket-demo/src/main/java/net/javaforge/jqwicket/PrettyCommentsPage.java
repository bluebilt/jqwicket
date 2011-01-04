package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.prettycomments.PrettyCommentsBehavior;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextArea;

public class PrettyCommentsPage extends WebPage {

	public PrettyCommentsPage() {
		add(new TextArea<String>("commentBox1").add(new PrettyCommentsBehavior()));
		add(new TextArea<String>("commentBox2").add(new PrettyCommentsBehavior()));
	}
}
