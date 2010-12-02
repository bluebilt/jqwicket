package net.javaforge.jqwicket.ui.liscroll;

import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * 
 * @author cschaedel
 */
public class LiScrollBehavior extends JQComponentBehaivor<LiScrollOptions>
		implements ILiScroll {

	private static final long serialVersionUID = 1L;

	public LiScrollBehavior() {
		this(new LiScrollOptions());
	}

	public LiScrollBehavior(LiScrollOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

}
