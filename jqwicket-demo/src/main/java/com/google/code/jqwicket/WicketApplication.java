package com.google.code.jqwicket;

import com.google.code.jqwicket.dnd.DND2Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;

/**
 *
 */
public class WicketApplication extends WebApplication {

    @Override
    protected void init() {

        addPreComponentOnBeforeRenderListener(new JQComponentOnBeforeRenderListener(
                new JQContributionConfig().withDefaultJQueryUi()));

        getResourceSettings().setResourcePollFrequency(null);
        getMarkupSettings().setStripWicketTags(true);

        mountBookmarkablePage("genericjqbehavior", GenericJQBehaviorPage.class);
        mountBookmarkablePage("resizable", ResizablePage.class);
        mountBookmarkablePage("selectable", SelectablePage.class);
        mountBookmarkablePage("sortable", SortablePage.class);
        mountBookmarkablePage("accordion", AccordionPage.class);
        mountBookmarkablePage("dynamicaccordion", DynamicAccordionPage.class);
        mountBookmarkablePage("button", ButtonPage.class);
        mountBookmarkablePage("datepicker", DatePickerPage.class);
        mountBookmarkablePage("datetimepicker", DateTimePickerPage.class);
        mountBookmarkablePage("dialog", DialogPage.class);
        mountBookmarkablePage("progressbar", ProgressbarPage.class);
        mountBookmarkablePage("slider", SliderPage.class);
        mountBookmarkablePage("notifier", NotifierPage.class);
        mountBookmarkablePage("uniform", UniformPage.class);
        mountBookmarkablePage("uploadify", UploadifyPage.class);
        mountBookmarkablePage("nivoslider", NivoSliderPage.class);
        mountBookmarkablePage("maskedinput", MaskedInputPage.class);
        mountBookmarkablePage("colorpicker", ColorPickerPage.class);
        mountBookmarkablePage("jcarousel", JCarouselPage.class);
        mountBookmarkablePage("tabs", TabsPage.class);
        mountBookmarkablePage("sparkline", SparklinePage.class);
        mountBookmarkablePage("tiptip", TipTipPage.class);
        mountBookmarkablePage("cjimageflipbox", CJImageFlipboxPage.class);
        mountBookmarkablePage("liscroll", LiScrollPage.class);
        mountBookmarkablePage("fancybox", FancyBoxPage.class);
        mountBookmarkablePage("cloudzoom", CloudZoomPage.class);
        mountBookmarkablePage("gmap", GMapPage.class);
        mountBookmarkablePage("fliptext", FlipTextPage.class);
        mountBookmarkablePage("extruder", ExtruderPage.class);
        mountBookmarkablePage("kwicks", KwicksPage.class);
        mountBookmarkablePage("markitup", MarkItUpPage.class);
        mountBookmarkablePage("lwrte", LWRTEPage.class);
        mountBookmarkablePage("ckeditor", CKEditorPage.class);
        mountBookmarkablePage("prettyloader", PrettyLoaderPage.class);
        mountBookmarkablePage("prettycomments", PrettyCommentsPage.class);
        mountBookmarkablePage("prettypopin", PrettyPopinPage.class);
        mountBookmarkablePage("prettygallery", PrettyGalleryPage.class);
        mountBookmarkablePage("validationengine", ValidationEnginePage.class);
        mountBookmarkablePage("blockui", BlockUIPage.class);
        mountBookmarkablePage("mobilymap", MobilyMapPage.class);
        mountBookmarkablePage("guider", GuiderPage.class);

        mountBookmarkablePage("dnd", DNDPage.class);
        mountBookmarkablePage("dnd2", DND2Page.class);
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<GenericJQBehaviorPage> getHomePage() {
        return GenericJQBehaviorPage.class;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.apache.wicket.protocol.http.WebApplication#newSessionStore()
     */
    @Override
    protected ISessionStore newSessionStore() {
        return new HttpSessionStore(this);
    }

}
