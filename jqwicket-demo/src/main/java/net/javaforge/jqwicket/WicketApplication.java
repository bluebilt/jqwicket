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
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

}
