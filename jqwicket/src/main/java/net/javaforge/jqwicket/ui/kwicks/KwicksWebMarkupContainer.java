package net.javaforge.jqwicket.ui.kwicks;

import org.apache.wicket.model.IModel;

import net.javaforge.jqwicket.ui.JQWebMarkupContainer;

/**
 * @author mkalina
 * 
 */
public class KwicksWebMarkupContainer extends
		JQWebMarkupContainer<KwicksBehavior, KwicksOptions> implements IKwicks {

	private static final long serialVersionUID = 1L;

	public KwicksWebMarkupContainer(String id) {
		this(id, new KwicksOptions());
	}

	public KwicksWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new KwicksOptions());
	}

	public KwicksWebMarkupContainer(String id, KwicksOptions options) {
		super(id, options);
	}

	public KwicksWebMarkupContainer(String id, IModel<?> model,
			KwicksOptions options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected KwicksBehavior newJQComponentBehavior(KwicksOptions options) {
		return new KwicksBehavior(options);
	}

}
