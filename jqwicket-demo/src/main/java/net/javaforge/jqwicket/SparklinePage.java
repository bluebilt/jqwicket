package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.sparkline.SparklineOptions;
import net.javaforge.jqwicket.ui.sparkline.SparklineOptions.Type;
import net.javaforge.jqwicket.ui.sparkline.SparklineWebMarkupContainer;

import org.apache.wicket.markup.html.WebPage;

public class SparklinePage extends WebPage {

	public SparklinePage() {

		add(new SparklineWebMarkupContainer("inlinesparkline"));

		add(new SparklineWebMarkupContainer("dynamicsparkline",
				new SparklineOptions(new float[] { 10, 8, 5, 7, 4, 4, 1 })));
		add(new SparklineWebMarkupContainer("dynamicbar", new SparklineOptions(
				new float[] { 10, 8, 5, 7, 4, 4, 1 }).type(Type.BAR).barColor(
				"green")));
		add(new SparklineWebMarkupContainer("inlinebar", new SparklineOptions()
				.type(Type.BAR).barColor("red")));
	}

}
