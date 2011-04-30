package com.google.code.jqwicket;

import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.mobilymap.MobilyMapOptions;
import com.google.code.jqwicket.ui.mobilymap.MobilyMapWebMarkupContainer;

public class MobilyMapPage extends WebPage {

	public MobilyMapPage() {
		add(new MobilyMapWebMarkupContainer("europeMap",
				new MobilyMapOptions().outsideButtons(".map_buttons a")));
	}
}
