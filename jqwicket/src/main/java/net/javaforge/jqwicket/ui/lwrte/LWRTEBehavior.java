package net.javaforge.jqwicket.ui.lwrte;

import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 */
public class LWRTEBehavior extends JQComponentBehaivor<LWRTEOptions> implements
		ILWRTEditor {

	private static final long serialVersionUID = 1L;

	public LWRTEBehavior() {
		this(new LWRTEOptions());
	}

	public LWRTEBehavior(LWRTEOptions options) {
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
