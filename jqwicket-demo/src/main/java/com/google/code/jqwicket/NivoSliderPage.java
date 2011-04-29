package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebPage;

import com.google.code.jqwicket.ui.nivoslider.NivoSliderOptions;
import com.google.code.jqwicket.ui.nivoslider.NivoSliderWebMarkupContainer;
import com.google.code.jqwicket.ui.nivoslider.NivoSliderOptions.Effect;

public class NivoSliderPage extends WebPage {

	public NivoSliderPage() {
		add(new NivoSliderWebMarkupContainer("slider", new NivoSliderOptions()
				.effect(Effect.FOLD, Effect.SLICE_UP_DOWN_LEFT).captionOpacity(
						0.2f)).setMarkupId("slider"));
	}

}
