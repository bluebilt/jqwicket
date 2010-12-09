package net.javaforge.jqwicket;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see net.javaforge.jqwicket.Start#main(String[])
 */
public class WicketApplication extends WebApplication {

	@Override
	protected void init() {

		addPreComponentOnBeforeRenderListener(new JQComponentOnBeforeRenderListener());

		getMarkupSettings().setStripWicketTags(true);

		mountBookmarkablePage("jquery", JQueryPage.class);
		mountBookmarkablePage("genericjqbehavior", GenericJQBehaviorPage.class);
		mountBookmarkablePage("resizable", ResizablePage.class);
		mountBookmarkablePage("selectable", SelectablePage.class);
		mountBookmarkablePage("sortable", SortablePage.class);
		mountBookmarkablePage("accordion", AccordionPage.class);
		mountBookmarkablePage("button", ButtonPage.class);
		mountBookmarkablePage("datepicker", DatePickerPage.class);
		mountBookmarkablePage("dialog", DialogPage.class);
		mountBookmarkablePage("progressbar", ProgressbarPage.class);
		mountBookmarkablePage("notifier", NotifierPage.class);
		mountBookmarkablePage("uniform", UniformPage.class);
		mountBookmarkablePage("uploadify", UploadifyPage.class);
		mountBookmarkablePage("nivoslider", NivoSliderPage.class);
		mountBookmarkablePage("maskedinput", MaskedInputPage.class);
		mountBookmarkablePage("colorpicker", ColorPickerPage.class);
		mountBookmarkablePage("jcarousel", JCarouselPage.class);
		mountBookmarkablePage("tabs", TabsPage.class);
		mountBookmarkablePage("sparkline", SparklinePage.class);
		mountBookmarkablePage("dnd", DNDPage.class);
		mountBookmarkablePage("tiptip", TipTipPage.class);
		mountBookmarkablePage("cjimageflipbox", CJImageFlipboxPage.class);
		mountBookmarkablePage("liscroll", LiScrollPage.class);
		mountBookmarkablePage("fancybox", FancyBoxPage.class);
		mountBookmarkablePage("cloudzoom", CloudZoomPage.class);
		mountBookmarkablePage("gmap", GMapPage.class);
		mountBookmarkablePage("fliptext", FlipTextPage.class);
		mountBookmarkablePage("extruder", ExtruderPage.class);
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

}
