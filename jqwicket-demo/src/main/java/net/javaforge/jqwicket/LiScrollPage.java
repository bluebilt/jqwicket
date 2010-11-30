package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.liscroll.LiScrollWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class LiScrollPage extends WebPage {

	public LiScrollPage() {
		add(new LiScrollWebMarkupContainer("ticker01"));
		add(new LiScrollWebMarkupContainer("ticker02"));
	}
}
