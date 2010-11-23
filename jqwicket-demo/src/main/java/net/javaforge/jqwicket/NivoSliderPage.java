package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.nivoslider.NivoSliderOptions;
import net.javaforge.jqwicket.ui.nivoslider.NivoSliderOptions.Effect;
import net.javaforge.jqwicket.ui.nivoslider.NivoSliderWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class NivoSliderPage extends WebPage {

	public NivoSliderPage() {
		add(new NivoSliderWebMarkupContainer("slider", new NivoSliderOptions()
				.effect(Effect.FOLD, Effect.SLICE_UP_DOWN_LEFT).captionOpacity(
						0.2f)).setMarkupId("slider"));
	}

}
