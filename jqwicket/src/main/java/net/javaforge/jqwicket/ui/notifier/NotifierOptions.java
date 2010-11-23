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
package net.javaforge.jqwicket.ui.notifier;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;
import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.JQStatement;
import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.ResourceReference;

/**
 * @author mkalina
 * 
 */
public class NotifierOptions extends AbstractJQOptions<NotifierOptions> {

	private static final long serialVersionUID = 1L;

	private ResourceReference[] cssResourceReferences = new ResourceReference[] { INotifier.CSS_RESOURCE };

	public enum Stack {
		BELOW, ABOVE;
	}

	public NotifierOptions cssResourceReferences(ResourceReference... refs) {
		this.cssResourceReferences = refs;
		return this;
	}

	public ResourceReference[] cssResourceReferences() {
		return this.cssResourceReferences;
	}

	/**
	 * The amount of time in milliseconds to fade notifications in and out.
	 * Default: 500
	 * 
	 * @param speed
	 * @return
	 */
	public NotifierOptions speed(int speed) {
		super.put("speed", speed);
		return this;
	}

	/**
	 * Notifications will automatically close after this amount of time, in
	 * milliseconds. Set to 0 or false to create a “sticky” notifications.
	 * Default: 5000
	 * 
	 * @param expires
	 * @return
	 */
	public NotifierOptions expires(int expires) {
		super.put("expires", expires);
		return this;
	}

	/**
	 * Notifications will automatically close after this amount of time, in
	 * milliseconds. Set to 0 or false to create a “sticky” notifications.
	 * Default: 5000
	 * 
	 * @param expires
	 * @return
	 */
	public NotifierOptions expires(boolean expires) {
		super.put("expires", expires);
		return this;
	}

	/**
	 * Notifications will stack downwards if set to “below” (default), or
	 * upwards if set to “above.” Default: below
	 * 
	 * @param stack
	 * @return
	 */
	public NotifierOptions stack(Stack stack) {
		super.put("stack", stack);
		return this;
	}

	/**
	 * A boolean value denoting whether or not the widget should apply its own
	 * styling classes. Set to false to roll your own notification themes
	 * (including ThemeRoller). You could simply overwrite the included CSS, but
	 * using this option allows you to create default AND custom notifications
	 * within the same containers, as well as maintain a clear upgrade path as
	 * you won’t have to touch any of the included files. Default: false
	 * 
	 * @param custom
	 * @return
	 */
	public NotifierOptions custom(boolean custom) {
		super.put("custom", custom);
		return this;
	}

	/**
	 * Fires before the notification opens. If false is returned inside this
	 * callback, the notification will not open.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions beforeOpenEvent(CharSequence callbackBody) {
		return this.beforeOpenEvent(js(callbackBody));
	}

	/**
	 * Fires before the notification opens. If false is returned inside this
	 * callback, the notification will not open.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions beforeOpenEvent(JQStatement callbackBody) {
		return this.beforeOpenEvent($f(callbackBody));
	}

	/**
	 * Fires before the notification opens. If false is returned inside this
	 * callback, the notification will not open.
	 * 
	 * @param callback
	 * @return
	 */
	public NotifierOptions beforeOpenEvent(JQFunction callback) {
		super.put("beforeopen", callback);
		return this;
	}

	/**
	 * Fires after the notifcation opens.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions openEvent(CharSequence callbackBody) {
		return this.openEvent(js(callbackBody));
	}

	/**
	 * Fires after the notifcation opens.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions openEvent(JQStatement callbackBody) {
		return this.openEvent($f(callbackBody));
	}

	/**
	 * Fires after the notifcation opens.
	 * 
	 * @param callback
	 * @return
	 */
	public NotifierOptions openEvent(JQFunction callback) {
		super.put("open", callback);
		return this;
	}

	/**
	 * Fires after the notifcation closes.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions closeEvent(CharSequence callbackBody) {
		return this.closeEvent(js(callbackBody));
	}

	/**
	 * Fires after the notifcation closes.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions closeEvent(JQStatement callbackBody) {
		return this.closeEvent($f(callbackBody));
	}

	/**
	 * Fires after the notifcation closes.
	 * 
	 * @param callback
	 * @return
	 */
	public NotifierOptions closeEvent(JQFunction callback) {
		super.put("close", callback);
		return this;
	}

	/**
	 * Fires if the user clicks anywhere in the notification itself (not on the
	 * close link(s), if present). Useful if you want to close the notification
	 * or perform some other action once the user has acknowledged the notice.
	 * The callback receives two parameters as arguments: the event object, and
	 * the notification instance object.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions clickEvent(CharSequence callbackBody) {
		return this.clickEvent(js(callbackBody));
	}

	/**
	 * Fires if the user clicks anywhere in the notification itself (not on the
	 * close link(s), if present). Useful if you want to close the notification
	 * or perform some other action once the user has acknowledged the notice.
	 * The callback receives two parameters as arguments: the event object, and
	 * the notification instance object.
	 * 
	 * @param callbackBody
	 * @return
	 */
	public NotifierOptions clickEvent(JQStatement callbackBody) {
		return this.clickEvent($f(callbackBody, "e", "instance"));
	}

	/**
	 * Fires if the user clicks anywhere in the notification itself (not on the
	 * close link(s), if present). Useful if you want to close the notification
	 * or perform some other action once the user has acknowledged the notice.
	 * The callback receives two parameters as arguments: the event object, and
	 * the notification instance object.
	 * 
	 * @param callback
	 * @return
	 */
	public NotifierOptions clickEvent(JQFunction callback) {
		super.put("click", callback);
		return this;
	}

}
