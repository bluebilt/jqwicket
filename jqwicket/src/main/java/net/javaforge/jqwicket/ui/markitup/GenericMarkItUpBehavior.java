package net.javaforge.jqwicket.ui.markitup;

import static net.javaforge.jqwicket.JQuery.$;
import net.javaforge.jqwicket.JQHeaderContributionTarget;
import net.javaforge.jqwicket.ui.GenericJQComponentBehaivor;

/**
 * Generic, selector based MarkItUp behavior.
 * 
 * @author mkalina
 */
public class GenericMarkItUpBehavior extends
		GenericJQComponentBehaivor<MarkItUpOptions> implements IMarkItUp {

	private static final long serialVersionUID = 1L;

	public GenericMarkItUpBehavior(CharSequence selector) {
		this(selector, new MarkItUpOptions());
	}

	public GenericMarkItUpBehavior(CharSequence selector,
			MarkItUpOptions options) {
		super(selector, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.JQComponentBehaivor#contributeInternal(net.javaforge.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		if (this.options.hasSet())
			target.addJQStatements($(getSelector()).chain(this.getName(),
					this.options.getSet().getName()));
		else
			target.addJQStatements($(getSelector()).chain(this.getName(),
					this.options.toJson()));
	}
}
