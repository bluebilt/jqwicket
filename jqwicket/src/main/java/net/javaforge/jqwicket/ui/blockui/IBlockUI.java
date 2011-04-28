/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javaforge.jqwicket.ui.blockui;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;

import net.javaforge.jqwicket.IJQWidget;
import net.javaforge.jqwicket.JQFunction;

/**
 * Implementation of <a href="http://jquery.malsup.com/block/>BlockUI</a> jquery
 * plugin.
 * 
 * @author mkalina
 * 
 */
public interface IBlockUI extends IJQWidget<BlockUIOptions> {

	static final CharSequence JQ_COMPONENT_NAME = "block";

	/**
	 * Blocks complete screen using default options.
	 */
	JQFunction block();

	/**
	 * Blocks complete screen using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Blocks complete screen using custom options.
	 */
	JQFunction block(BlockUIOptions options);

	/**
	 * Blocks complete screen using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(BlockUIOptions options, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Blocks specific ui element using default options.
	 */
	JQFunction block(CharSequence selector);

	/**
	 * Blocks specific ui element using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(CharSequence selector, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Blocks specific ui element using custom options.
	 */
	JQFunction block(CharSequence selector, BlockUIOptions options);

	/**
	 * Blocks specific ui element using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(CharSequence selector, BlockUIOptions options,
			AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Blocks specific ui element using default options.
	 */
	JQFunction block(Component component);

	/**
	 * Blocks specific ui element using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(Component component, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Blocks specific ui element using custom options.
	 */
	JQFunction block(Component component, BlockUIOptions options);

	/**
	 * Blocks specific ui element using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void block(Component component, BlockUIOptions options,
			AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks complete screen using default options.
	 */
	JQFunction unblock();

	/**
	 * Unblocks complete screen using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks complete screen using custom options.
	 */
	JQFunction unblock(BlockUIOptions options);

	/**
	 * Unblocks complete screen using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(BlockUIOptions options, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks specific ui element using default options.
	 */
	JQFunction unblock(CharSequence selector);

	/**
	 * Unblocks specific ui element using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(CharSequence selector, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks specific ui element using custom options.
	 */
	JQFunction unblock(CharSequence selector, BlockUIOptions options);

	/**
	 * Unblocks specific ui element using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(CharSequence selector, BlockUIOptions options,
			AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks specific ui element using default options.
	 */
	JQFunction unblock(Component component);

	/**
	 * Unblocks specific ui element using default options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(Component component, AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Unblocks specific ui element using custom options.
	 */
	JQFunction unblock(Component component, BlockUIOptions options);

	/**
	 * Unblocks specific ui element using custom options.
	 * 
	 * @param ajaxRequestTarget
	 */
	void unblock(Component component, BlockUIOptions options,
			AjaxRequestTarget ajaxRequestTarget);
}
