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
package net.javaforge.jqwicket.ui.uniform;

import net.javaforge.jqwicket.ui.AbstractJQOptions;

import org.apache.wicket.ResourceReference;

/**
 * @author mkalina
 * 
 */
public class UniformOptions extends AbstractJQOptions<UniformOptions> {

	private static final long serialVersionUID = 1L;

	private ResourceReference[] cssResourceReferences = new ResourceReference[] { IUniform.CSS_RESOURCE_DEFAULT };

	public UniformOptions cssResourceReferences(ResourceReference... refs) {
		this.cssResourceReferences = refs;
		return this;
	}

	public ResourceReference[] cssResourceReferences() {
		return this.cssResourceReferences;
	}

	/**
	 * Default: "selector". <br/>
	 * Sets the class given to the wrapper div for select elements.
	 * 
	 * <pre>
	 * $("select").uniform({selectClass: 'mySelectClass'});
	 * </pre>
	 * 
	 * @param selectClass
	 * @return
	 */
	public UniformOptions selectClass(String selectClass) {
		super.put("selectClass", selectClass);
		return this;
	}

	/**
	 * Default: "radio" <br/>
	 * Sets the class given to the wrapper div for radio elements.
	 * 
	 * <pre>
	 * $(":radio").uniform({radioClass: 'myRadioClass'});
	 * </pre>
	 * 
	 * @param radioClass
	 * @return
	 */
	public UniformOptions radioClass(String radioClass) {
		super.put("radioClass", radioClass);
		return this;
	}

	/**
	 * Default: "checker" <br/>
	 * Sets the class given to the wrapper div for checkbox elements.
	 * 
	 * <pre>
	 * $(":checkbox").uniform({checkboxClass: 'myCheckClass'});
	 * </pre>
	 * 
	 * @param checkboxClass
	 * @return
	 */
	public UniformOptions checkboxClass(String checkboxClass) {
		super.put("checkboxClass", checkboxClass);
		return this;
	}

	/**
	 * Default: "uploader"<br/>
	 * Sets the class given to the wrapper div for file upload elements.
	 * 
	 * <pre>
	 * $(":file").uniform({fileClass: 'myFileClass'});
	 * </pre>
	 * 
	 * @param fileClass
	 * @return
	 */
	public UniformOptions fileClass(String fileClass) {
		super.put("fileClass", fileClass);
		return this;
	}

	/**
	 * Default: "filename"<br/>
	 * Sets the class given to div inside a file upload container that spits out
	 * the filename.
	 * 
	 * <pre>
	 * $(":file").uniform({filenameClass: 'myFilenameClass'});
	 * </pre>
	 * 
	 * @param filenameClass
	 * @return
	 */
	public UniformOptions filenameClass(String filenameClass) {
		super.put("filenameClass", filenameClass);
		return this;
	}

	/**
	 * Default: "action"<br/>
	 * Sets the class given to div inside a file upload container that acts as
	 * the "Choose file" button.
	 * 
	 * <pre>
	 * $(":file").uniform({fileBtnClass: 'myFileBtnClass'});
	 * </pre>
	 * 
	 * @param fileBtnClass
	 * @return
	 */
	public UniformOptions fileBtnClass(String fileBtnClass) {
		super.put("fileBtnClass", fileBtnClass);
		return this;
	}

	/**
	 * Default: "No file selected"<br/>
	 * Sets the text written in the filename div of a file upload input when
	 * there is no file selected.
	 * 
	 * <pre>
	 * $(":file").uniform({fileDefaultText: 'Select a file please'});
	 * </pre>
	 * 
	 * @param fileDefaultText
	 * @return
	 */
	public UniformOptions fileDefaultText(String fileDefaultText) {
		super.put("fileDefaultText", fileDefaultText);
		return this;
	}

	/**
	 * Default: "Choose File"<br/>
	 * Sets the text written on the action button inside a file upload input. <br/>
	 * 
	 * <pre>
	 * $(":file").uniform({fileBtnText: 'Choose&hellip;'});
	 * </pre>
	 * 
	 * @param fileBtnText
	 * @return
	 */
	public UniformOptions fileBtnText(String fileBtnText) {
		super.put("fileBtnText", fileBtnText);
		return this;
	}

	/**
	 * Default: "checked"<br/>
	 * Sets the class given to elements when they are checked (radios and
	 * checkboxes).
	 * 
	 * <pre>
	 * $(":radio, :checkbox").uniform({checkedClass: 'myCheckedClass'});
	 * </pre>
	 * 
	 * @param checkedClass
	 * @return
	 */
	public UniformOptions checkedClass(String checkedClass) {
		super.put("checkedClass", checkedClass);
		return this;
	}

	/**
	 * Default: "focus"<br/>
	 * Sets the class given to elements when they are focused.
	 * 
	 * <pre>
	 * $("select").uniform({focusClass: 'myFocusClass'});
	 * </pre>
	 * 
	 * @param focusClass
	 * @return
	 */
	public UniformOptions focusClass(String focusClass) {
		super.put("focusClass", focusClass);
		return this;
	}

	/**
	 * Default: "disabled"<br/>
	 * Sets the class given to elements when they are disabled.
	 * 
	 * <pre>
	 * $("select").uniform({disabledClass: 'myDisabledClass'});
	 * </pre>
	 * 
	 * @param disabledClass
	 * @return
	 */
	public UniformOptions disabledClass(String disabledClass) {
		super.put("disabledClass", disabledClass);
		return this;
	}

	/**
	 * Default: "active"<br/>
	 * Sets the class given to elements when they are active (pressed).
	 * 
	 * <pre>
	 * $("select").uniform({activeClass: 'myActiveClass'});
	 * </pre>
	 * 
	 * @param activeClass
	 * @return
	 */
	public UniformOptions activeClass(String activeClass) {
		super.put("activeClass", activeClass);
		return this;
	}

	/**
	 * Default: "hover"<br/>
	 * Sets the class given to elements when they are currently hovered.
	 * 
	 * <pre>
	 * $("select").uniform({hoverClass: 'myHoverClass'});
	 * </pre>
	 * 
	 * @param hoverClass
	 * @return
	 */
	public UniformOptions hoverClass(String hoverClass) {
		super.put("hoverClass", hoverClass);
		return this;
	}

	/**
	 * Default: true<br/>
	 * If true, sets an ID on the container div of each form element. The ID is
	 * a prefixed version of the same ID of the form element.
	 * 
	 * <pre>
	 * $("select").uniform({useID: false});
	 * </pre>
	 * 
	 * @param useID
	 * @return
	 */
	public UniformOptions useID(boolean useID) {
		super.put("useID", useID);
		return this;
	}

	/**
	 * Default: "uniform"<br/>
	 * If useID is set to true, this string is prefixed to element ID’s and
	 * attached to the container div of each uniformed element. If you have a
	 * checkbox with the ID of “remember-me” the container div would have the ID
	 * “uniform-remember-me”.
	 * 
	 * <pre>
	 * $("select").uniform({idPrefix: 'container'});
	 * </pre>
	 * 
	 * @param idPrefix
	 * @return
	 */
	public UniformOptions idPrefix(String idPrefix) {
		super.put("idPrefix", idPrefix);
		return this;
	}

	/**
	 * Default: false<br/>
	 * This parameter allows you to use a jQuery-style selector to point to a
	 * "reset" button in your form if you have one. Use false if you have no
	 * "reset" button, or a selector string that points to the reset button if
	 * you have one.
	 * 
	 * <pre>
	 * $("select").uniform({resetSelector: 'input[type="reset"]'});
	 * </pre>
	 * 
	 * @param resetSelector
	 * @return
	 */
	public UniformOptions resetSelector(String resetSelector) {
		super.put("resetSelector", resetSelector);
		return this;
	}

	/**
	 * Default: false<br/>
	 * This parameter allows you to use a jQuery-style selector to point to a
	 * "reset" button in your form if you have one. Use false if you have no
	 * "reset" button, or a selector string that points to the reset button if
	 * you have one.
	 * 
	 * <pre>
	 * $("select").uniform({resetSelector: 'input[type="reset"]'});
	 * </pre>
	 * 
	 * @param resetSelector
	 * @return
	 */
	public UniformOptions resetSelector(boolean resetSelector) {
		super.put("resetSelector", resetSelector);
		return this;
	}
}
