package net.javaforge.jqwicket;

import static net.javaforge.jqwicket.JQuery.js;
import static net.javaforge.jqwicket.JQuery.wicketAjaxGet;
import net.javaforge.jqwicket.ui.slider.SliderBehavior;
import net.javaforge.jqwicket.ui.slider.SliderOptions;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;

public class SliderPage extends BaseJQueryUIPage {

	public SliderPage() {

		add(new WebMarkupContainer("slider").add(new SliderBehavior(
				new SliderOptions().min(10).max(100).value(20))));

		add(new AjaxSlider("ajaxSlider") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onValueChanged(AjaxRequestTarget target, int newValue) {
				target.prependJavascript("alert('Value received on server: "
						+ newValue + "');");
			}
		});

	}

	public abstract static class AjaxSlider extends WebMarkupContainer {

		private static final long serialVersionUID = 1L;

		public AjaxSlider(String id) {
			super(id);
			super.setOutputMarkupId(true);
		}

		public abstract void onValueChanged(AjaxRequestTarget target,
				int newValue);

		@Override
		protected void onInitialize() {
			super.onInitialize();
			AbstractDefaultAjaxBehavior ajaxBehavior = new AbstractDefaultAjaxBehavior() {
				private static final long serialVersionUID = 1L;

				@Override
				protected void respond(AjaxRequestTarget target) {
					String sliderValue = RequestCycle.get().getRequest()
							.getParameter("sv");
					if (Utils.isNotBlank(sliderValue)) {
						onValueChanged(target, Integer.valueOf(sliderValue));
					}
				}
			};
			super.add(ajaxBehavior);
			super.add(new SliderBehavior(new SliderOptions()
					.changeEvent(wicketAjaxGet(
							ajaxBehavior,
							new MapBuilder<String, Object>().add("sv",
									js("ui.value")).build()))));
		}

	}

}
