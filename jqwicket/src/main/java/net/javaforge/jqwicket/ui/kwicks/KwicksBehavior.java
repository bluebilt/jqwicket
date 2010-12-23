package net.javaforge.jqwicket.ui.kwicks;

import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class KwicksBehavior extends JQComponentBehaivor<KwicksOptions>
		implements IKwicks {

	private static final long serialVersionUID = 1L;

	public KwicksBehavior() {
		this(new KwicksOptions());
	}

	public KwicksBehavior(KwicksOptions options) {
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
