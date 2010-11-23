package net.javaforge.jqwicket;

import org.apache.wicket.markup.html.WebPage;

public class JQueryPage extends WebPage {

	public JQueryPage() {
		add(JQBehaviors.js("alert('this page uses only jquery!')"));
	}

	@Override
	protected void onBeforeRender() {
		JQContributionRenderer
				.setJQueryContributionConfig(new JQContributionConfig()
						.withJQueryCoreJsUrlOnly("http://ajax.googleapis.com/ajax/libs/jquery/1.4.3/jquery.min.js"));
		super.onBeforeRender();
	}

	@Override
	protected void onAfterRender() {
		super.onAfterRender();
		JQContributionRenderer
				.setJQueryContributionConfig(new JQContributionConfig());
	}

}
