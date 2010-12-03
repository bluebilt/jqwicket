package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.button.ButtonBehaivor;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.link.Link;

public class ButtonPage extends BaseJQueryUIPage {

	@SuppressWarnings("serial")
	public ButtonPage() {

		Button b1 = new Button("button1");
		b1.add(new ButtonBehaivor());
		add(b1);

		Button b2 = new Button("button2");
		b2.add(new ButtonBehaivor());
		add(b2);

		Link<Void> b3 = new Link<Void>("button3") {
			@Override
			public void onClick() {
			}
		};
		b3.add(new ButtonBehaivor());
		add(b3);

	}

}
