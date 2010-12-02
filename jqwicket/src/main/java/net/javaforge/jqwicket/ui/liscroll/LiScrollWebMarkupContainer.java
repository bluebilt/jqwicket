package net.javaforge.jqwicket.ui.liscroll;

import org.apache.wicket.model.IModel;

import net.javaforge.jqwicket.ui.JQWebMarkupContainer;

/**
 * 
 * @author cschaedel
 */
public class LiScrollWebMarkupContainer extends
		JQWebMarkupContainer<LiScrollBehavior, LiScrollOptions> implements
		ILiScroll {

	private static final long serialVersionUID = 1L;

	public LiScrollWebMarkupContainer(String id) {
		this(id, new LiScrollOptions());
	}

	public LiScrollWebMarkupContainer(String id, IModel<?> model) {
		this(id, model, new LiScrollOptions());
	}

	public LiScrollWebMarkupContainer(String id, LiScrollOptions options) {
		super(id, options);
	}

	public LiScrollWebMarkupContainer(String id, IModel<?> model,
			LiScrollOptions options) {
		super(id, model, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQWebMarkupContainer#newJQComponentBehavior(net.javaforge.jqwicket.ui.IJQOptions)
	 */
	@Override
	protected LiScrollBehavior newJQComponentBehavior(LiScrollOptions options) {
		return new LiScrollBehavior(options);
	}

}
