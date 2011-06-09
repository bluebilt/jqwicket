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
package com.google.code.jqwicket.api;

import java.io.Serializable;

import org.apache.wicket.Component;

/**
 * Interface representing single javascript statement.
 * 
 * @author max
 * 
 */
public interface IJQStatement extends Serializable, CharSequence {

	/**
	 * Appends raw javascript to this statement.
	 * 
	 * @param js
	 * @return this statement
	 */
	IJQStatement appendRawCharSequence(CharSequence js);

	/**
	 * Appends property to this statement by adding ".propertyName".
	 * 
	 * @param propertyName
	 * @return this statement
	 */
	IJQStatement appendProperty(CharSequence propertyName);

	/**
	 * General method chaining. Adds <tt>.methodName([methodArgs])</tt> to this
	 * statement.
	 * 
	 * @param methodName
	 *            is the name of the chained method
	 * @param methodArgs
	 *            is the array of (optional) method arguments
	 * @return this statement
	 */
	IJQStatement chain(CharSequence methodName, CharSequence... methodArgs);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.jquery</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/.jquery/">http://api.jquery.com/.jquery/</a>
	 * @return this statement
	 */
	IJQStatement jquery();

	/**
	 * Adds one of the following expressions to this statement:<br>
	 * <ul>
	 * <li><tt>.add( selector )</tt></li>
	 * <li><tt>.add( elements )</tt></li>
	 * <li><tt>.add( html )</tt></li>
	 * <li><tt>.add( selector, context )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/add/">http://api.jquery.com/add/</a>
	 * @param selector
	 * @return this statement
	 */
	IJQStatement add(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement:<br>
	 * <ul>
	 * <li><tt>.add( selector )</tt></li>
	 * <li><tt>.add( elements )</tt></li>
	 * <li><tt>.add( html )</tt></li>
	 * <li><tt>.add( selector, context )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/add/">http://api.jquery.com/add/</a>
	 * @param component
	 * @return this statement
	 */
	IJQStatement add(Component component, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.addClass( className )</tt></li>
	 * <li><tt>.addClass( function(index, currentClass) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/addClass/">http://api.jquery.com/addClass/</a>
	 * @return this statement
	 */
	IJQStatement addClass(CharSequence arg);

	/**
	 * 
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.after( content, [ content ] )</tt></li>
	 * <li><tt>.after( function(index) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/after/">http://api.jquery.com/after/</a>
	 * @return this statement
	 */
	IJQStatement after(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>jQuery.ajax( url, [ settings ] )</tt></li>
	 * <li><tt>jQuery.ajax( settings )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.ajax/">http://api.jquery.com/jQuery.ajax/</a>
	 * @return this statement
	 */
	IJQStatement ajax(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ajaxComplete( handler(event, XMLHttpRequest, ajaxOptions) )</tt>
	 * </li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxComplete/">http://api.jquery.com/ajaxComplete/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxComplete(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.ajaxError( handler(event, jqXHR, ajaxSettings, thrownError) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxError/">http://api.jquery.com/ajaxError/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxError(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>jQuery.ajaxPrefilter( [ dataTypes ], handler(options, originalOptions, jqXHR) )</tt>
	 * </li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.ajaxPrefilter/">http://api.jquery.com/jQuery.ajaxPrefilter/</a>
	 * @param dataTypes
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxPrefilter(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ajaxSend( handler(event, jqXHR, ajaxOptions) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxSend/">http://api.jquery.com/ajaxSend/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxSend(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>jQuery.ajaxSetup( options )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.ajaxSetup/">http://api.jquery.com/jQuery.ajaxSetup/</a>
	 * @param options
	 * @return this statement
	 */
	IJQStatement ajaxSetup(CharSequence options);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ajaxStart( handler() )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxStart/">http://api.jquery.com/ajaxStart/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxStart(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ajaxStop( handler() )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxStop/">http://api.jquery.com/ajaxStop/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxStop(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ajaxSuccess( handler(event, XMLHttpRequest, ajaxOptions) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ajaxSuccess/">http://api.jquery.com/ajaxSuccess/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement ajaxSuccess(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.andSelf()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/andSelf/">http://api.jquery.com/andSelf/</a>
	 * @return this statement
	 */
	IJQStatement andSelf();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.animate( properties, [ duration ], [ easing ], [ complete ] )</tt></li>
	 * <li><tt>.animate( properties, options )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/animate/">http://api.jquery.com/animate/</a>
	 * @return this statement
	 */
	IJQStatement animate(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.append( content, [ content ] )</tt></li>
	 * <li><tt>.append( function(index, html) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/append/">http://api.jquery.com/append/</a>
	 * @return this statement
	 */
	IJQStatement append(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.appendTo( target )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/appendTo/">http://api.jquery.com/appendTo/</a>
	 * @param target
	 * @return this statement
	 */
	IJQStatement appendTo(CharSequence target);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.attr( attributeName )</tt></li>
	 * <li><tt>.attr( attributeName, value )</tt></li>
	 * <li><tt>.attr( map )</tt></li>
	 * <li><tt>.attr( attributeName, function(index, attr) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/attr/">http://api.jquery.com/attr/</a>
	 * @return this statement
	 */
	IJQStatement attr(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.before( content, [ content ] )</tt></li>
	 * <li><tt>.before( function )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/before/">http://api.jquery.com/before/</a>
	 * @return this statement
	 */
	IJQStatement before(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.bind( eventType, [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.bind( eventType, [ eventData ], false )</tt></li>
	 * <li><tt>.bind( events )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/bind/">http://api.jquery.com/bind/</a>
	 * @return this statement
	 */
	IJQStatement bind(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.blur( handler(eventObject) )</tt></li>
	 * <li><tt>.blur( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.blur()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/blur/">http://api.jquery.com/blur/</a>
	 * @return this statement
	 */
	IJQStatement blur(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.browser</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.browser/">http://api.jquery.com/jQuery.browser/</a>
	 * @return this statement
	 */
	IJQStatement browser();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.change( handler(eventObject) )</tt></li>
	 * <li><tt>.change( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.change()</tt></li>
	 * </ul>
	 * 
	 * @see <a href=""></a>
	 * @see <a
	 *      href="http://api.jquery.com/change/">http://api.jquery.com/change/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement change(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.children( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/children/">http://api.jquery.com/children/</a>
	 * @return this statement
	 */
	IJQStatement children(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.children( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/children/">http://api.jquery.com/children/</a>
	 * @param component
	 * @return this statement
	 */
	IJQStatement children(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.clearQueue( [ queueName ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/clearQueue/">http://api.jquery.com/clearQueue/</a>
	 * @return this statement
	 */
	IJQStatement clearQueue(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.click( handler(eventObject) )</tt></li>
	 * <li><tt>.click( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.click()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/click/">http://api.jquery.com/click/</a>
	 * @param handler
	 * @return this statement
	 */
	IJQStatement click(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.clone( [ withDataAndEvents ] )</tt></li>
	 * <li><tt>.clone( [ withDataAndEvents ], [ deepWithDataAndEvents ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/clone/">http://api.jquery.com/clone/</a>
	 * @return this statement
	 */
	IJQStatement clone(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.closest( selector )</tt></li>
	 * <li><tt>.closest( selector, [ context ] )</tt></li>
	 * <li><tt>.closest( jQuery object )</tt></li>
	 * <li><tt>.closest( element )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/closest/">http://api.jquery.com/closest/</a>
	 * @return this statement
	 */
	IJQStatement closest(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.closest( #component.id )</tt></li>
	 * <li><tt>.closest( #component.id, [ context ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/closest/">http://api.jquery.com/closest/</a>
	 * @return this statement
	 */
	IJQStatement closest(Component component, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>jQuery.contains( container, contained )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.contains/">http://api.jquery.com/jQuery.contains/</a>
	 * @return this statement
	 */
	IJQStatement contains(CharSequence container, CharSequence contained);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.contents()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/contents/">http://api.jquery.com/contents/</a>
	 * @return this statement
	 */
	IJQStatement contents();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.context</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/context/">http://api.jquery.com/context/</a>
	 * @return this statement
	 */
	IJQStatement context();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.css( propertyName )</tt></li>
	 * <li><tt>.css( propertyName, value )</tt></li>
	 * <li><tt>.css( propertyName, function(index, value) )</tt></li>
	 * <li><tt>.css( map )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/css/">http://api.jquery.com/css/</a>
	 * @return this statement
	 */
	IJQStatement css(CharSequence... args);

	/**
	 * 
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.data( key, value )</tt></li>
	 * <li><tt>.data( obj )</tt></li>
	 * <li><tt>.data( key )</tt></li>
	 * <li><tt>.data()</tt></li>
	 * <li><tt>.data( element, key, value )</tt></li>
	 * <li><tt>.data( element, key )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/data/">http://api.jquery.com/data/</a>
	 * @return this statement
	 */
	IJQStatement data(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.dblclick( handler(eventObject) )</tt></li>
	 * <li><tt>.dblclick( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.dblclick()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/dblclick/">http://api.jquery.com/dblclick/</a>
	 * @return this statement
	 */
	IJQStatement dblclick(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.always( alwaysCallbacks )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.always/">http://api.jquery.com/deferred.always/</a>
	 * @return this statement
	 */
	IJQStatement deferredAlways(CharSequence alwaysCallbacks);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.done( doneCallbacks, [ doneCallbacks ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.done/">http://api.jquery.com/deferred.done/</a>
	 * @return this statement
	 */
	IJQStatement deferredDone(CharSequence... doneCallbacks);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.fail( failCallbacks, [ failCallbacks ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.fail/">http://api.jquery.com/deferred.fail/</a>
	 * @return this statement
	 */
	IJQStatement deferredFail(CharSequence... failCallbacks);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isRejected()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.isRejected/">http://api.jquery.com/deferred.isRejected/</a>
	 * @return this statement
	 */
	IJQStatement deferredIsRejected();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isResolved()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.isResolved/">http://api.jquery.com/deferred.isResolved/</a>
	 * @return this statement
	 */
	IJQStatement deferredIsResolved();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.pipe( [ doneFilter ], [ failFilter ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.pipe/">http://api.jquery.com/deferred.pipe/</a>
	 * @return this statement
	 */
	IJQStatement deferredPipe(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.promise( [ target ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.promise/">http://api.jquery.com/deferred.promise/</a>
	 * @return this statement
	 */
	IJQStatement deferredPromise(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.reject( args )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.reject/">http://api.jquery.com/deferred.reject/</a>
	 * @return this statement
	 */
	IJQStatement deferredReject(CharSequence args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.rejectWith( context, [ args ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.rejectWith/">http://api.jquery.com/deferred.rejectWith/</a>
	 * @return this statement
	 */
	IJQStatement deferredRejectWith(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.resolve( args )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.resolve/">http://api.jquery.com/deferred.resolve/</a>
	 * @return this statement
	 */
	IJQStatement deferredResolve(CharSequence args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.resolveWith( context, [ args ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.resolveWith/">http://api.jquery.com/deferred.resolveWith/</a>
	 * @return this statement
	 */
	IJQStatement deferredResolveWith(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.then( doneCallbacks, failCallbacks )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/deferred.then/">http://api.jquery.com/deferred.then/</a>
	 * @return this statement
	 */
	IJQStatement deferredThen(CharSequence doneCallbacks,
			CharSequence failCallbacks);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.delay( duration, [ queueName ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/delay/">http://api.jquery.com/delay/</a>
	 * @return this statement
	 */
	IJQStatement delay(int duration, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.delegate( selector, eventType, handler )</tt></li>
	 * <li><tt>.delegate( selector, eventType, eventData, handler )</tt></li>
	 * <li><tt>.delegate( selector, events )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/delegate/">http://api.jquery.com/delegate/</a>
	 * @return this statement
	 */
	IJQStatement delegate(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.dequeue( [ queueName ] )</tt></li>
	 * <li><tt>.dequeue( element, [ queueName ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/dequeue/">http://api.jquery.com/dequeue/</a>
	 * @return this statement
	 */
	IJQStatement dequeue(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.detach( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/detach/">http://api.jquery.com/detach/</a>
	 * @return this statement
	 */
	IJQStatement detach(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.detach( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/detach/">http://api.jquery.com/detach/</a>
	 * @return this statement
	 */
	IJQStatement detach(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.die()</tt></li>
	 * <li><tt>.die( eventType, [ handler ] )</tt></li>
	 * <li><tt>.die( eventTypes )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/die/">http://api.jquery.com/die/</a>
	 * @return this statement
	 */
	IJQStatement die(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.each( collection, callback(indexInArray, valueOfElement) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.each/">http://api.jquery.com/jQuery.each/</a>
	 * @return this statement
	 */
	IJQStatement each(CharSequence collection, CharSequence callback);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.each( function(index, Element) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/each/">http://api.jquery.com/each/</a>
	 * @return this statement
	 */
	IJQStatement each(CharSequence function);

	/**
	 * Uses a specific effect on an element (without the show/hide logic).<br>
	 * <ul>
	 * <li><tt>effect( effect, [options], [speed], [callback] )</tt></li>
	 * </ul>
	 * <br>
	 * - <b>effect</b>: The effect to be used. Possible values: 'blind',
	 * 'bounce', 'clip', 'drop', 'explode', 'fold', 'highlight', 'puff',
	 * 'pulsate', 'scale', 'shake', 'size', 'slide', 'transfer'.<br>
	 * - <b>options</b>: A object/hash including specific options for the
	 * effect. (optional)<br>
	 * - <b>speed</b>: A string representing one of the three predefined speeds
	 * ("slow", "normal", or "fast") or the number of milliseconds to run the
	 * animation (e.g. 1000). (optional)<br>
	 * - <b>callback</b>: A function that is called after the effect is
	 * completed. (optional)<br>
	 * 
	 * @param args
	 * @return
	 */
	IJQStatement effect(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.empty()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/empty/">http://api.jquery.com/empty/</a>
	 * @return this statement
	 */
	IJQStatement empty();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.end()</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/end/">http://api.jquery.com/end/</a>
	 * @return this statement
	 */
	IJQStatement end();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.eg( index )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/eq/">http://api.jquery.com/eq/</a>
	 * @return this statement
	 */
	IJQStatement eq(int index);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.error( handler(eventObject) )</tt></li>
	 * <li><tt>.error( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.error( message )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/error/">http://api.jquery.com/error/</a>
	 * @return this statement
	 */
	IJQStatement error(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.extend( target, [ object1 ], [ objectN ] )</tt></li>
	 * <li><tt>y.extend( [ deep ], target, object1, [ objectN ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.extend/">http://api.jquery.com/jQuery.extend/</a>
	 * @return this statement
	 */
	IJQStatement extend(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.fadeIn( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.fadeIn( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/fadeIn/">http://api.jquery.com/fadeIn/</a>
	 * @return this statement
	 */
	IJQStatement fadeIn(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.fadeOut( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.fadeOut( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/fadeOut/">http://api.jquery.com/fadeOut/</a>
	 * @return this statement
	 */
	IJQStatement fadeOut(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.fadeTo( duration, opacity, [ callback ] )</tt></li>
	 * <li><tt>.fadeTo( duration, opacity, [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/fadeTo/">http://api.jquery.com/fadeTo/</a>
	 * @return this statement
	 */
	IJQStatement fadeTo(CharSequence duration, CharSequence opacity,
			CharSequence... other);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.fadeToggle( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/fadeToggle/">http://api.jquery.com/fadeToggle/</a>
	 * @return this statement
	 */
	IJQStatement fadeToggle(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.filter( selector )</tt></li>
	 * <li><tt>.filter( function(index) )</tt></li>
	 * <li><tt>.filter( element )</tt></li>
	 * <li><tt>.filter( jQuery object )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/filter/">http://api.jquery.com/filter/</a>
	 * @return this statement
	 */
	IJQStatement filter(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.filter( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/filter/">http://api.jquery.com/filter/</a>
	 * @return this statement
	 */
	IJQStatement filter(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.find( selector )</tt></li>
	 * <li><tt>.find( jQuery object )</tt></li>
	 * <li><tt>.find( element )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/find/">http://api.jquery.com/find/</a>
	 * @return this statement
	 */
	IJQStatement find(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.find( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/find/">http://api.jquery.com/find/</a>
	 * @return this statement
	 */
	IJQStatement find(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.first()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/first/">http://api.jquery.com/first/</a>
	 * @return this statement
	 */
	IJQStatement first();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.focus( handler(eventObject) )</tt></li>
	 * <li><tt>.focus( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.focus()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/focus/">http://api.jquery.com/focus/</a>
	 * @param args
	 * @return this statement
	 */
	IJQStatement focus(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.focusin( handler(eventObject) )</tt></li>
	 * <li><tt>.focusin( [ eventData ], handler(eventObject) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/focusin/">http://api.jquery.com/focusin/</a>
	 * @param args
	 * @return this statement
	 */
	IJQStatement focusin(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.focusout( handler(eventObject) )</tt></li>
	 * <li><tt>.focusout( [ eventData ], handler(eventObject) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/focusout/">http://api.jquery.com/focusout/</a>
	 * @param args
	 * @return this statement
	 */
	IJQStatement focusout(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.get( url, [ data ], [ success(data, textStatus, jqXHR) ], [ dataType ] )</tt>
	 * </li>
	 * <li><tt>.get( [ index ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.get/">http://api.jquery.com/jQuery.get/</a>
	 * @see <a href="http://api.jquery.com/get/">http://api.jquery.com/get/</a>
	 * @return this statement
	 */
	IJQStatement get(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.getJSON( url, [ data ], [ success(data, textStatus, jqXHR) ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.getJSON/">http://api.jquery.com/jQuery.getJSON/</a>
	 * @return this statement
	 */
	IJQStatement getJSON(CharSequence url, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.getScript( url, [ success(data, textStatus) ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.getScript/">http://api.jquery.com/jQuery.getScript/</a>
	 * @return this statement
	 */
	IJQStatement getScript(CharSequence url, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.globalEval( code )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.globalEval/">http://api.jquery.com/jQuery.globalEval/</a>
	 * @return this statement
	 */
	IJQStatement globalEval(CharSequence code);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.grep( array, function(elementOfArray, indexInArray), [ invert ] )</tt>
	 * </li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.grep/">http://api.jquery.com/jQuery.grep/</a>
	 * @return this statement
	 */
	IJQStatement grep(CharSequence array, CharSequence function);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.grep( array, function(elementOfArray, indexInArray), [ invert ] )</tt>
	 * </li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.grep/">http://api.jquery.com/jQuery.grep/</a>
	 * @return this statement
	 */
	IJQStatement grep(CharSequence array, CharSequence function, boolean invert);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.has( selector )</tt></li>
	 * <li><tt>.has( contained )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/has/">http://api.jquery.com/has/</a>
	 * @return this statement
	 */
	IJQStatement has(CharSequence selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.has( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/has/">http://api.jquery.com/has/</a>
	 * @return this statement
	 */
	IJQStatement has(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.hasClass( className )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/hasClass/">http://api.jquery.com/hasClass/</a>
	 * @return this statement
	 */
	IJQStatement hasClass(CharSequence className);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.hasData( element )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.hasData/">http://api.jquery.com/jQuery.hasData/</a>
	 * @return this statement
	 */
	IJQStatement hasData(CharSequence element);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.height()</tt></li>
	 * <li><tt>.height( value )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/height/">http://api.jquery.com/height/</a>
	 * @return this statement
	 */
	IJQStatement height(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.hide()</tt></li>
	 * <li><tt>.hide( duration, [ callback ] )</tt></li>
	 * <li><tt>.hide( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/hide/">http://api.jquery.com/hide/</a>
	 * @return this statement
	 */
	IJQStatement hide(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.holdReady( hold )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.holdReady/">http://api.jquery.com/jQuery.holdReady/</a>
	 * @return this statement
	 */
	IJQStatement holdReady(boolean hold);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.hover( handlerIn(eventObject), handlerOut(eventObject) )</tt></li>
	 * <li><tt>.hover( handlerInOut(eventObject) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/hover/">http://api.jquery.com/hover/</a>
	 * @return this statement
	 */
	IJQStatement hover(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.html()</tt></li>
	 * <li><tt>.html( htmlString )</tt></li>
	 * <li><tt>.html( function(index, oldhtml) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/html/">http://api.jquery.com/html/</a>
	 * @return this statement
	 */
	IJQStatement html(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.inArray( value, array )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.inArray/">http://api.jquery.com/jQuery.inArray/</a>
	 * @return this statement
	 */
	IJQStatement inArray(CharSequence value, CharSequence array);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.index()</tt></li>
	 * <li><tt>.index( selector )</tt></li>
	 * <li><tt>.index( element )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/index/">http://api.jquery.com/index/</a>
	 * @return this statement
	 */
	IJQStatement index(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.index( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/index/">http://api.jquery.com/index/</a>
	 * @return this statement
	 */
	IJQStatement index(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.innerHeight()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/innerHeight/">http://api.jquery.com/innerHeight/</a>
	 * @return this statement
	 */
	IJQStatement innerHeight();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.innerWidth()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/innerWidth/">http://api.jquery.com/innerWidth/</a>
	 * @return this statement
	 */
	IJQStatement innerWidth();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.insertAfter( target )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/insertAfter/">http://api.jquery.com/insertAfter/</a>
	 * @return this statement
	 */
	IJQStatement insertAfter(CharSequence target);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.insertAfter( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/insertAfter/">http://api.jquery.com/insertAfter/</a>
	 * @return this statement
	 */
	IJQStatement insertAfter(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.insertBefore( target )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/insertBefore/">http://api.jquery.com/insertBefore/</a>
	 * @return this statement
	 */
	IJQStatement insertBefore(CharSequence target);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.insertBefore( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/insertBefore/">http://api.jquery.com/insertBefore/</a>
	 * @return this statement
	 */
	IJQStatement insertBefore(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.is( selector )</tt></li>
	 * <li><tt>.is( function(index) )</tt></li>
	 * <li><tt>.is( jQuery object )</tt></li>
	 * <li><tt>.is( element )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/is/">http://api.jquery.com/is/</a>
	 * @return this statement
	 */
	IJQStatement is(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.is( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/is/">http://api.jquery.com/is/</a>
	 * @return this statement
	 */
	IJQStatement is(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isArray( obj )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isArray/">http://api.jquery.com/jQuery.isArray/</a>
	 * @return this statement
	 */
	IJQStatement isArray(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isEmptyObject( object )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isEmptyObject/">http://api.jquery.com/jQuery.isEmptyObject/</a>
	 * @return this statement
	 */
	IJQStatement isEmptyObject(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isFunction( obj )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isFunction/">http://api.jquery.com/jQuery.isFunction/</a>
	 * @return this statement
	 */
	IJQStatement isFunction(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isPlainObject( object )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isPlainObject/">http://api.jquery.com/jQuery.isPlainObject/</a>
	 * @return this statement
	 */
	IJQStatement isPlainObject(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isWindow( obj )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isWindow/">http://api.jquery.com/jQuery.isWindow/</a>
	 * @return this statement
	 */
	IJQStatement isWindow(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.isXMLDoc( node )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.isXMLDoc/">http://api.jquery.com/jQuery.isXMLDoc/</a>
	 * @return this statement
	 */
	IJQStatement isXMLDoc(CharSequence node);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.keydown( handler(eventObject) )</tt></li>
	 * <li><tt>.keydown( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.keydown()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/keydown/">http://api.jquery.com/keydown/</a>
	 * @return this statement
	 */
	IJQStatement keydown(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.keypress( handler(eventObject) )</tt></li>
	 * <li><tt>.keypress( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.keypress()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/keypress/">http://api.jquery.com/keypress/</a>
	 * @return this statement
	 */
	IJQStatement keypress(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.keyup( handler(eventObject) )</tt></li>
	 * <li><tt>.keyup( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.keyup()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/keyup/">http://api.jquery.com/keyup/</a>
	 * @return this statement
	 */
	IJQStatement keyup(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.last()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/last/">http://api.jquery.com/last/</a>
	 * @return this statement
	 */
	IJQStatement last();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.live( eventType, handler )</tt></li>
	 * <li><tt>.live( eventType, eventData, handler )</tt></li>
	 * <li><tt>.live( events )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/live/">http://api.jquery.com/live/</a>
	 * @return this statement
	 */
	IJQStatement live(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.load( handler(eventObject) )</tt></li>
	 * <li><tt>.load( [ eventData ], handler(eventObject) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/load/">http://api.jquery.com/load/</a>
	 * @return this statement
	 */
	IJQStatement load(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.makeArray( obj )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.makeArray/">http://api.jquery.com/jQuery.makeArray/</a>
	 * @return this statement
	 */
	IJQStatement makeArray(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.map( callback(index, domElement) )</tt></li>
	 * <li><tt>.map( array, callback(elementOfArray, indexInArray) )</tt></li>
	 * <li><tt>.map( arrayOrObject, callback( value, indexOrKey ) )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/map/">http://api.jquery.com/map/</a>
	 * @see <a
	 *      href="http://api.jquery.com/map/">http://api.jquery.com/jQuery.map/</a>
	 * @return this statement
	 */
	IJQStatement map(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.merge( first, second )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.merge/">http://api.jquery.com/jQuery.merge/</a>
	 * @return this statement
	 */
	IJQStatement merge(CharSequence first, CharSequence second);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mousedown( handler(eventObject) )</tt></li>
	 * <li><tt>.mousedown( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mousedown()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mousedown/">http://api.jquery.com/mousedown/</a>
	 * @return this statement
	 */
	IJQStatement mousedown(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mouseenter( handler(eventObject) )</tt></li>
	 * <li><tt>.mouseenter( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mouseenter()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mouseenter/">http://api.jquery.com/mouseenter/</a>
	 * @return this statement
	 */
	IJQStatement mouseenter(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mouseleave( handler(eventObject) )</tt></li>
	 * <li><tt>.mouseleave( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mouseleave()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mouseleave/">http://api.jquery.com/mouseleave/</a>
	 * @return this statement
	 */
	IJQStatement mouseleave(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mousemove( handler(eventObject) )</tt></li>
	 * <li><tt>.mousemove( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mousemove()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mousemove/">http://api.jquery.com/mousemove/</a>
	 * @return this statement
	 */
	IJQStatement mousemove(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mouseout( handler(eventObject) )</tt></li>
	 * <li><tt>.mouseout( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mouseout()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mouseout/">http://api.jquery.com/mouseout/</a>
	 * @return this statement
	 */
	IJQStatement mouseout(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mouseover( handler(eventObject) )</tt></li>
	 * <li><tt>.mouseover( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mouseover()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mouseover/">http://api.jquery.com/mouseover/</a>
	 * @return this statement
	 */
	IJQStatement mouseover(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.mouseup( handler(eventObject) )</tt></li>
	 * <li><tt>.mouseup( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.mouseup()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/mouseup/">http://api.jquery.com/mouseup/</a>
	 * @return this statement
	 */
	IJQStatement mouseup(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.next( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/next/">http://api.jquery.com/next/</a>
	 * @return this statement
	 */
	IJQStatement next(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.next( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/next/">http://api.jquery.com/next/</a>
	 * @return this statement
	 */
	IJQStatement next(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.nextAll( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/nextAll/">http://api.jquery.com/nextAll/</a>
	 * @return this statement
	 */
	IJQStatement nextAll(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.nextAll( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/nextAll/">http://api.jquery.com/nextAll/</a>
	 * @return this statement
	 */
	IJQStatement nextAll(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.nextUntil( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/nextUntil/">http://api.jquery.com/nextUntil/</a>
	 * @return this statement
	 */
	IJQStatement nextUntil(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.nextUntil( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/nextUntil/">http://api.jquery.com/nextUntil/</a>
	 * @return this statement
	 */
	IJQStatement nextUntil(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.noConflict( [ removeAll ] </tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.noConflict/">http://api.jquery.com/jQuery.noConflict/</a>
	 * @return this statement
	 */
	IJQStatement noConflict(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.noop()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.noop/">http://api.jquery.com/jQuery.noop/</a>
	 * @return this statement
	 */
	IJQStatement noop();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.not( selector )</tt></li>
	 * <li><tt>.not( elements )</tt></li>
	 * <li><tt>.not( function(index) )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/not/">http://api.jquery.com/not/</a>
	 * @return this statement
	 */
	IJQStatement not(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.not( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/not/">http://api.jquery.com/not/</a>
	 * @return this statement
	 */
	IJQStatement not(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.now()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.now/">http://api.jquery.com/jQuery.now/</a>
	 * @return this statement
	 */
	IJQStatement now();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.offset()</tt></li>
	 * <li><tt>.offset( coordinates )</tt></li>
	 * <li><tt>.offset( function(index, coords) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/offset/">http://api.jquery.com/offset/</a>
	 * @return this statement
	 */
	IJQStatement offset(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.offsetParent()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/offsetParent/">http://api.jquery.com/offsetParent/</a>
	 * @return this statement
	 */
	IJQStatement offsetParent();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.one( eventType, [ eventData ], handler(eventObject) )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/one/">http://api.jquery.com/one/</a>
	 * @return this statement
	 */
	IJQStatement one(CharSequence eventType, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.outerHeight( [ includeMargin ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/outerHeight/">http://api.jquery.com/outerHeight/</a>
	 * @return this statement
	 */
	IJQStatement outerHeight(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.outerWidth( [ includeMargin ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/outerWidth/">http://api.jquery.com/outerWidth/</a>
	 * @return this statement
	 */
	IJQStatement outerWidth(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.param( obj )</tt></li>
	 * <li><tt>.param( obj, traditional )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.param/">http://api.jquery.com/jQuery.param/</a>
	 * @return this statement
	 */
	IJQStatement param(CharSequence param, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parent( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parent/">http://api.jquery.com/parent/</a>
	 * @return this statement
	 */
	IJQStatement parent(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parent( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parent/">http://api.jquery.com/parent/</a>
	 * @return this statement
	 */
	IJQStatement parent(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parents( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parents/">http://api.jquery.com/parents/</a>
	 * @return this statement
	 */
	IJQStatement parents(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parents( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parents/">http://api.jquery.com/parents/</a>
	 * @return this statement
	 */
	IJQStatement parents(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parentsUntil( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parentsUntil/">http://api.jquery.com/parentsUntil/</a>
	 * @return this statement
	 */
	IJQStatement parentsUntil(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parentsUntil( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/parentsUntil/">http://api.jquery.com/parentsUntil/</a>
	 * @return this statement
	 */
	IJQStatement parentsUntil(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parseJSON( json )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.parseJSON/">http://api.jquery.com/jQuery.parseJSON/</a>
	 * @return this statement
	 */
	IJQStatement parseJSON(CharSequence json);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.parseXML( data )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.parseXML/">http://api.jquery.com/jQuery.parseXML/</a>
	 * @return this statement
	 */
	IJQStatement parseXML(CharSequence data);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.position()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/position/">http://api.jquery.com/position/</a>
	 * @return this statement
	 */
	IJQStatement position();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li>
	 * <tt>.post( url, [ data ], [ success(data, textStatus, jqXHR) ], [ dataType ] )</tt>
	 * </li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.post/">http://api.jquery.com/jQuery.post/</a>
	 * @return this statement
	 */
	IJQStatement post(CharSequence url, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prepend( content, [ content ] )</tt></li>
	 * <li><tt>.prepend( function(index, html) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prepend/">http://api.jquery.com/prepend/</a>
	 * @return this statement
	 */
	IJQStatement prepend(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prependTo( target )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prependTo/">http://api.jquery.com/prependTo/</a>
	 * @return this statement
	 */
	IJQStatement prependTo(CharSequence target);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prependTo( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prependTo/">http://api.jquery.com/prependTo/</a>
	 * @param component
	 * @return this statement
	 */
	IJQStatement prependTo(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prev( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prev/">http://api.jquery.com/prev/</a>
	 * @return this statement
	 */
	IJQStatement prev(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prev( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prev/">http://api.jquery.com/prev/</a>
	 * @return this statement
	 */
	IJQStatement prev(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prevAll( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prevAll/">http://api.jquery.com/prevAll/</a>
	 * @return this statement
	 */
	IJQStatement prevAll(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prevAll( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prevAll/">http://api.jquery.com/prevAll/</a>
	 * @return this statement
	 */
	IJQStatement prevAll(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prevUntil( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prevUntil/">http://api.jquery.com/prevUntil/</a>
	 * @return this statement
	 */
	IJQStatement prevUntil(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prevUntil( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prevUntil/">http://api.jquery.com/prevUntil/</a>
	 * @return this statement
	 */
	IJQStatement prevUntil(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.promise( [ type ], [ target ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/promise/">http://api.jquery.com/promise/</a>
	 * @return this statement
	 */
	IJQStatement promise(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.prop( propertyName )</tt></li>
	 * <li><tt>.prop( propertyName, value )</tt></li>
	 * <li><tt>.prop( map )</tt></li>
	 * <li><tt>.prop( propertyName, function(index, oldPropertyValue) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/prop/">http://api.jquery.com/prop/</a>
	 * @return this statement
	 */
	IJQStatement prop(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.proxy( function, context )</tt></li>
	 * <li><tt>.proxy( context, name )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.proxy/">http://api.jquery.com/jQuery.proxy/</a>
	 * @return this statement
	 */
	IJQStatement proxy(CharSequence first, CharSequence second);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.pushStack( elements )</tt></li>
	 * <li><tt>.pushStack( elements, name, arguments )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/pushStack/">http://api.jquery.com/pushStack/</a>
	 * @return this statement
	 */
	IJQStatement pushStack(CharSequence elements, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.queue( [ queueName ] )</tt></li>
	 * <li><tt>.queue( [ queueName ], newQueue )</tt></li>
	 * <li><tt>.queue( [ queueName ], callback( next ) )</tt></li>
	 * <li><tt>.queue( element, [ queueName ] )</tt></li>
	 * <li><tt>.queue( element, queueName, newQueue )</tt></li>
	 * <li><tt>.queue( element, queueName, callback() )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/queue/">http://api.jquery.com/queue/</a>
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.queue/">http://api.jquery.com/jQuery.queue/</a>
	 * @return this statement
	 */
	IJQStatement queue(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.ready( handler )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/ready/">http://api.jquery.com/ready/</a>
	 * @return this statement
	 */
	IJQStatement ready(CharSequence handler);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.remove( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/remove/">http://api.jquery.com/remove/</a>
	 * @return this statement
	 */
	IJQStatement remove(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.remove( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/remove/">http://api.jquery.com/remove/</a>
	 * @return this statement
	 */
	IJQStatement remove(Component selector);

	/**
	 * 
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.removeAttr( attributeName )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/removeAttr/">http://api.jquery.com/removeAttr/</a>
	 * @return this statement
	 */
	IJQStatement removeAttr(CharSequence attributeName);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.removeClass( [ className ] )</tt></li>
	 * <li><tt>.removeClass( function(index, class) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/removeClass/">http://api.jquery.com/removeClass/</a>
	 * @return this statement
	 */
	IJQStatement removeClass(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.removeData( [ name ] )</tt></li>
	 * <li><tt>.removeData( element, [ name ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/removeData/">http://api.jquery.com/removeData/</a>
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.removeData/">http://api.jquery.com/jQuery.removeData/</a>
	 * @param args
	 * @return this statement
	 */
	IJQStatement removeData(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.removeProp( propertyName, value )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/removeProp/">http://api.jquery.com/removeProp/</a>
	 * @return this statement
	 */
	IJQStatement removeProp(CharSequence propertyName, CharSequence value);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.replaceAll( target )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/replaceAll/">http://api.jquery.com/replaceAll/</a>
	 * @return this statement
	 */
	IJQStatement replaceAll(CharSequence target);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.replaceAll( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/replaceAll/">http://api.jquery.com/replaceAll/</a>
	 * @return this statement
	 */
	IJQStatement replaceAll(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.replaceWith( newContent )</tt></li>
	 * <li><tt>.replaceWith( function )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/replaceWith/">http://api.jquery.com/replaceWith/</a>
	 * @return this statement
	 */
	IJQStatement replaceWith(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.resize( handler(eventObject) )</tt></li>
	 * <li><tt>.resize( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.resize()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/resize/">http://api.jquery.com/resize/</a>
	 * @return this statement
	 */
	IJQStatement resize(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.scroll( handler(eventObject) )</tt></li>
	 * <li><tt>.scroll( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.scroll()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/scroll/">http://api.jquery.com/scroll/</a>
	 * @return this statement
	 */
	IJQStatement scroll(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.scrollLeft( value) )</tt></li>
	 * <li><tt>.scrollLeft()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/scrollLeft/">http://api.jquery.com/scrollLeft/</a>
	 * @return this statement
	 */
	IJQStatement scrollLeft(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.scrollTop( value) )</tt></li>
	 * <li><tt>.scrollTop()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/scrollTop/">http://api.jquery.com/scrollTop/</a>
	 * @return this statement
	 */
	IJQStatement scrollTop(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.select( handler(eventObject) )</tt></li>
	 * <li><tt>.select( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.select()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/select/">http://api.jquery.com/select/</a>
	 * @return this statement
	 */
	IJQStatement select(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.serialize()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/serialize/">http://api.jquery.com/serialize/</a>
	 * @return this statement
	 */
	IJQStatement serialize();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.serializeArray()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/serializeArray/">http://api.jquery.com/serializeArray/</a>
	 * @return this statement
	 */
	IJQStatement serializeArray();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.show()</tt></li>
	 * <li><tt>.show( duration, [ callback ] )</tt></li>
	 * <li><tt>.show( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/show/">http://api.jquery.com/show/</a>
	 * @return this statement
	 */
	IJQStatement show(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.siblings( [ selector ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/siblings/">http://api.jquery.com/siblings/</a>
	 * @return this statement
	 */
	IJQStatement siblings(CharSequence... selector);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.siblings( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/siblings/">http://api.jquery.com/siblings/</a>
	 * @return this statement
	 */
	IJQStatement siblings(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.size()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/size/">http://api.jquery.com/size/</a>
	 * @return this statement
	 */
	IJQStatement size();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.slice( start, [ end ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/slice/">http://api.jquery.com/slice/</a>
	 * @return this statement
	 */
	IJQStatement slice(CharSequence start, CharSequence... end);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.slideDown( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.slideDown( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/slideDown/">http://api.jquery.com/slideDown/</a>
	 * @return this statement
	 */
	IJQStatement slideDown(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.slideToggle( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.slideToggle( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/slideToggle/">http://api.jquery.com/slideToggle/</a>
	 * @return this statement
	 */
	IJQStatement slideToggle(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.slideUp( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.slideUp( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/slideUp/">http://api.jquery.com/slideUp/</a>
	 * @return this statement
	 */
	IJQStatement slideUp(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.stop( [ clearQueue ], [ jumpToEnd ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/stop/">http://api.jquery.com/stop/</a>
	 * @return this statement
	 */
	IJQStatement stop(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.sub()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.sub/">http://api.jquery.com/jQuery.sub/</a>
	 * @return this statement
	 */
	IJQStatement sub();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.submit( handler(eventObject) )</tt></li>
	 * <li><tt>.submit( [ eventData ], handler(eventObject) )</tt></li>
	 * <li><tt>.submit()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/submit/">http://api.jquery.com/submit/</a>
	 * @return this statement
	 */
	IJQStatement submit(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.text()</tt></li>
	 * <li><tt>.text( textString )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/text/">http://api.jquery.com/text/</a>
	 * @return this statement
	 */
	IJQStatement text(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.toArray()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/toArray/">http://api.jquery.com/toArray/</a>
	 * @return this statement
	 */
	IJQStatement toArray();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.toggle( [ duration ], [ callback ] )</tt></li>
	 * <li><tt>.toggle( [ duration ], [ easing ], [ callback ] )</tt></li>
	 * <li><tt>.toggle( showOrHide )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/toggle/">http://api.jquery.com/toggle/</a>
	 * @return this statement
	 */
	IJQStatement toggle(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.toggleClass( className )</tt></li>
	 * <li><tt>.toggleClass( className, switch )</tt></li>
	 * <li><tt>.toggleClass( function(index, class), [ switch ] )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/toggleClass/">http://api.jquery.com/toggleClass/</a>
	 * @return this statement
	 */
	IJQStatement toggleClass(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.trigger( eventType, extraParameters )</tt></li>
	 * <li><tt>.trigger( event )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/trigger/">http://api.jquery.com/trigger/</a>
	 * @return this statement
	 */
	IJQStatement trigger(CharSequence event, CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.triggerHandler( eventType, extraParameters )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/triggerHandler/">http://api.jquery.com/triggerHandler/</a>
	 * @return this statement
	 */
	IJQStatement triggerHandler(CharSequence eventType,
			CharSequence extraParameters);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.trim( str )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.trim/">http://api.jquery.com/jQuery.trim/</a>
	 * @return this statement
	 */
	IJQStatement trim(CharSequence str);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.type( obj )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.type/">http://api.jquery.com/jQuery.type/</a>
	 * @return this statement
	 */
	IJQStatement type(CharSequence obj);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.unbind( [ eventType ], [ handler(eventObject) ] )</tt></li>
	 * <li><tt>.unbind( eventType, false )</tt></li>
	 * <li><tt>.unbind( event )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/unbind/">http://api.jquery.com/unbind/</a>
	 * @return this statement
	 */
	IJQStatement unbind(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.unwrap()</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/unwrap/">http://api.jquery.com/unwrap/</a>
	 * @return this statement
	 */
	IJQStatement unwrap();

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.val()</tt></li>
	 * <li><tt>.val( value )</tt></li>
	 * <li><tt>.val( function(index, value) )</tt></li>
	 * </ul>
	 * 
	 * @see <a href="http://api.jquery.com/val/">http://api.jquery.com/val/</a>
	 * @return this statement
	 */
	IJQStatement val(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.when( deferreds )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/jQuery.when/">http://api.jquery.com/jQuery.when/</a>
	 * @return this statement
	 */
	IJQStatement when(CharSequence deferreds);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.width()</tt></li>
	 * <li><tt>.width( value )</tt></li>
	 * <li><tt>.width( function(index, width) )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/width/">http://api.jquery.com/width/</a>
	 * @return this statement
	 */
	IJQStatement width(CharSequence... args);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.wrapAll( wrappingElement )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/wrapAll/">http://api.jquery.com/wrapAll/</a>
	 * @return this statement
	 */
	IJQStatement wrapAll(CharSequence wrappingElement);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.wrapAll( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/wrapAll/">http://api.jquery.com/wrapAll/</a>
	 * @return this statement
	 */
	IJQStatement wrapAll(Component component);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.wrapInner( wrappingElement )</tt></li>
	 * <li><tt>.wrapInner( wrappingFunction )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/wrapInner/">http://api.jquery.com/wrapInner/</a>
	 * @return this statement
	 */
	IJQStatement wrapInner(CharSequence arg);

	/**
	 * Adds one of the following expressions to this statement<br>
	 * <ul>
	 * <li><tt>.wrapInner( #component.id )</tt></li>
	 * </ul>
	 * 
	 * @see <a
	 *      href="http://api.jquery.com/wrapInner/">http://api.jquery.com/wrapInner/</a>
	 * @return this statement
	 */
	IJQStatement wrapInner(Component component);

	String toString(boolean renderWithTrailingSemicolon);

}
