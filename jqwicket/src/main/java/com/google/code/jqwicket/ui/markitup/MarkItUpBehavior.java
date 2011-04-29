package com.google.code.jqwicket.ui.markitup;

import static com.google.code.jqwicket.JQuery.$;

import org.apache.wicket.Page;

import com.google.code.jqwicket.JQHeaderContributionTarget;
import com.google.code.jqwicket.ui.JQComponentBehaivor;


/**
 * 
 * @author mkalina
 */
public class MarkItUpBehavior extends JQComponentBehaivor<MarkItUpOptions>
		implements IMarkItUp {

	private static final long serialVersionUID = 1L;

	public MarkItUpBehavior() {
		this(new MarkItUpOptions());
	}

	public MarkItUpBehavior(MarkItUpOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.ui.JQComponentBehaivor#contributeInternal(com.google.code.jqwicket.JQHeaderContributionTarget)
	 */
	@Override
	protected void contributeInternal(JQHeaderContributionTarget target) {
		if (!Page.class.isAssignableFrom(this.component.getClass())) {
			if (this.options.hasSet())
				target.addJQStatements($(this.component).chain(this.getName(),
						this.options.getSet().getName()));
			else
				target.addJQStatements($(this.component).chain(this.getName(),
						this.options.toJson()));
		}
	}
}
