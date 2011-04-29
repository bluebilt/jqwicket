package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.liscroll.LiScrollWebMarkupContainer;

public class LiScrollPage extends WebPage {

	public LiScrollPage() {
		add(new LiScrollWebMarkupContainer("ticker01"));
		add(new LiScrollWebMarkupContainer("ticker02"));
	}
}
