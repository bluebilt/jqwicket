package com.google.code.jqwicket;


import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.link.Link;

import com.google.code.jqwicket.ui.button.ButtonBehaivor;
import com.google.code.jqwicket.ui.button.ButtonOptions;

public class ButtonPage extends BaseJQueryUIPage {

	@SuppressWarnings("serial")
	public ButtonPage() {
 
		add(new Button("button1").add(new ButtonBehaivor()));

		Button b2 = new Button("button2");
		b2.add(new ButtonBehaivor());
		add(b2);

		Link<Void> b3 = new Link<Void>("button3") {
			@Override
			public void onClick() {
				// do something here
			}
		};
		b3.add(new ButtonBehaivor(new ButtonOptions().label("my label").disabled(true)));
		add(b3);
	}

}
