/*
 * Isomorphic SmartClient
 * Version SC_SNAPSHOT-2010-12-31 (2010-12-31)
 * Copyright(c) 1998 and beyond Isomorphic Software, Inc. All rights reserved.
 * "SmartClient" is a trademark of Isomorphic Software, Inc.
 *
 * licensing@smartclient.com
 *
 * http://smartclient.com/license
 */

 






//>	@class	TextAreaItem
//
//	Class for editable multi-line text areas (uses HTML <code>&lt;TEXTAREA&gt;</code> object)
// @visibility external
// @example textAreaItem
//<
isc.ClassFactory.defineClass("TextAreaItem", "FormItem");

isc.TextAreaItem.addClassProperties({
    

	//>	@type	TEXTAREA_WRAP
    //	@value	isc.TextAreaItem.OFF  don't allow wrapping at all
	OFF : "OFF",                

    //	@value	isc.TextAreaItem.SOFT   when the entered text reaches the edge of the text area,
    //                                  wrap visibly but don't include line breaks in the textarea
    //                                  value
	SOFT : "SOFT",
	VIRTUAL : "SOFT",			

    //	@value	isc.TextAreaItem.HARD   when the entered text reaches the edge of the text area, 
    //                                  insert a line break
	ON : "HARD",				
	HARD : "HARD",			
	PHYSICAL : "HARD"	
    //
    // @visibility external
	//<
});

isc.TextAreaItem.addProperties({
    //>	@attr	textAreaItem.wrap		(TEXTAREA_WRAP : isc.TextAreaItem.VIRTUAL : IRW)
	// Text wrapping style.
	//		@group	appearance
    // @visibility external
	//<
	wrap:isc.TextAreaItem.VIRTUAL,
	
    //>	@attr	textAreaItem.width		(number : 150 : IRW)
	//			default width of this item
	//		@group	appearance
    // @visibility external
	//<
	width:150,

    //>	@attr	textAreaItem.height		(number : 100 : IRW)
	//			default height of this item
	//		@group	appearance
    // @visibility external
	//<
	height:100,

    //>	@attr	textAreaItem.textBoxStyle (FormItemBaseStyle : "textItem" : IRW)
	//  Base CSS class to apply to this item's input element.
    // NOTE: See the +link{group:CompoundFormItem_skinning} discussion for special skinning considerations.    
    // 
	// @group   appearance
    // @visibility external
	//<
	textBoxStyle:"textItem",		

    //>	@attr	textAreaItem.length		(number : null : IRW)
	//			if set, maximum number of characters for this field
	//		@group	validation
	//<
    // FIXME: not currently implemented 
//	length:null,

    // Override redrawOnShowFormIcon - we can handle dynamically updating the item's HTML to
    // show / hide textArea item icons
    redrawOnShowIcon:false,
    // setting clipValue to true ensures we resize the text box when showing/hiding icons
    clipValue:true,


    //> @attr   textAreaItem._hasDataElement    (boolean : true : IRW)
    //      Text areas have a data element.
    // @group formValues
    // @visibility   internal
    // @see     method:FormItem.hasDataElement
    // @see     method:FormItem.getDataElement
    //<
    _hasDataElement:true,
    
    // This flag means updateState will apply the result of this.getTextBoxStyle() to this item's
    // data element - appropriate for native text boxes, text areas and selects.
    _dataElementIsTextBox:true,

    //> @attr   textAreaItem.emptyStringValue   (any : null : IRW)
    // @include textItem.emptyStringValue
    //<
    
    emptyStringValue:null,
    
    //> @attr   textAreaItem.lineBreakValue  (string : "\n" : IRW)
    //  What character string should be used to represent line breaks?<br>
    //  Multi-line values edited in TextAreaItems will use this string
    //  as a line separator.
    // @group formValues
    // @visibility   psft
    //<
    
    lineBreakValue:"\n",
    
    //> @attr   textAreaItem.iconVAlign  (VerticalAlignment : isc.Canvas.TOP : IR)
    //  Align icons with the top edge of text area icons by default.
    //  @group  formIcons
    // @visibility   external
    //<
    iconVAlign:isc.Canvas.TOP,
    
    // _nativeEventHandlers is a place to specify native event handlers to be applied to the
    // form item element once it has been written into the DOM (without having to override 
    // '_applyHandlersToElement()'
    _nativeEventHandlers : {
        
        onmousedown : (
            isc.Browser.isIE ? function () {
                var element = this,
                    itemInfo = isc.DynamicForm._getItemInfoFromElement(element),
                    item = itemInfo.item;
                if (item) item._setupFocusCheck();
    
            } : null
        )
    },
    
    //> @method textAreaItem.getEnteredValue()
    // @include textItem.getEnteredValue()
    // @visibility external
    //<
    getEnteredValue : function () {
        return this.getElementValue();
    },
  
    //>@attr TextAreaItem.browserSpellCheck (boolean : null : IRWA)
    // @include FormItem.browserSpellCheck
    // @visibility internal
    //<
    
    //>@attr TextAreaItem.selectOnFocus (boolean : null : IRW)
    // @include FormItem.selectOnFocus
    // @visibility external
    //<
    
    //>@attr TextAreaItem.changeOnKeypress (boolean : true : IRW)
    // @include FormItem.changeOnKeypress
    // @visibility external
    //<
    
    //>@method TextAreaItem.getSelectionRange()
    // @include FormItem.getSelectionRange()
    // @visibility external
    //<
    
    //>@method TextAreaItem.setSelectionRange()
    // @include FormItem.setSelectionRange()
    // @visibility external
    //<
    
    //>@method TextAreaItem.selectValue()
    // @include FormItem.selectValue()
    // @visibility external
    //<
    
    //>@method TextAreaItem.deselectValue()
    // @include FormItem.deselectValue()
    // @visibility external
    //<
    
    
    //>@attr TextAreaItem.readOnly  (boolean : null : IRWA)
    // Setter for the standard HTML readonly property of the textArea element.
    // If set to true, text will be non editable (though it can still be selected and copied etc)
    // @visibility internal
    //<
    
    // supportsSelectionRange - does getSelectionRange() return null on this item? (IE only)
    // See FormItem._getIESelectionRange() for background on this
    // May cause poor performance determining selection range (for example on redraw) in 
    // items with a lot of content
    supportsSelectionRange:true,

    //>@attr TextAreaItem.showHintInField (boolean : null : IRWA)
    // If showing hint for this form item, should it be shown within the field?
    // <P>CSS style for the hint is +link{textAreaItem.textBoxStyle} with the suffix
    // "Hint" appended to it. 
    // @group appearance
    // @see FormItem.hint
    // @visibility external
    //<
    
    //>@attr TextAreaItem.printFullText (boolean : true : IRW)
    // When generating a print-view of the component containing this TextArea, should
    // the form item expand to accomodate its value? If set to false the text box not expand
    // to fit its content in the print view, instead showing exactly as it does in the
    // live form, possibly with scrollbars.
    // @visibility external
    // @group printing
    //<
    printFullText:true    
    
    
});

isc.TextAreaItem.addMethods({

    // Don't allow any valueIcon to appear on a different line from the text area
    getTextBoxCellCSS : function () {
        return this._$nowrapCSS;
    },
    
    
    _sizeTextBoxAsContentBox : function () {
        return isc.Browser.isStrict;
    },


    // NOTE: this is here for doc generation
    //>	@method textAreaItem.keyPress		(A)
    //		@group	event handling
    //			event handler for keys pressed in this item
    //<

    
    
    // _willHandleInput()
    // Can we use the "input" event in this browser / form item?
    // True for Moz and Safari, but not IE. See comments near FormItem._handleInput()
    _willHandleInput : function () {
        return !isc.Browser.isIE;
    },
    
	//>	@method	textAreaItem.getElementHTML()	(A)
	//		@group	drawing
	//			output the HTML for a text field element
	//
	//		@param	value	(string)	Value of the element [Unused because it is more reliably set by setValue].
	//		@return	(HTML)	HTML output for this element
	//<
	getElementHTML : function (value, dataValue) {
		// remember which element number we wrote this out as
		var form = this.form,
			formID = form.getID(),
			itemID = this.getItemID(),
            
		    output = isc.StringBuffer.create(),
            valueIconHTML = this._getValueIconHTML(dataValue);
        if (valueIconHTML != null) output.append(valueIconHTML);
        if (!this.showValueIconOnly) {
            if (!this.printFullText || !this._isPrinting()) {
                output.append(
                    "<TEXTAREA NAME=" , this.getElementName(),
                    " ID=", this.getDataElementId(),
        
                    // hang a flag on the element marking it as the data element for the
                    // appropriate form item.
                    this._getItemElementAttributeHTML(),
                    
                    this.getElementStyleHTML(),
                    (this.isDisabled() ? " DISABLED " : ""),
        
                    // disable native autoComplete 
                    (this._getAutoCompleteSetting() != "native" ? " AUTOCOMPLETE=OFF " : ""),
            
                    // enable / disable native spellcheck in Moz
                    // Same setting in Safari - see comments in TextItem.js
                    ((isc.Browser.isMoz || isc.Browser.isSafari) ? 
                        (this.getBrowserSpellCheck() ? " spellcheck=true" : " spellcheck=false") :
                        null),
            
                    " WRAP=", this.wrap,
        
                    " TABINDEX=", this._getElementTabIndex(),
                    (this.showTitle == false && this.accessKey != null ? 
                        " ACCESSKEY=" + this.accessKey : ""),
                        
                    // If this browser supports the "input" event write out a handler for it.
                    (this._willHandleInput ? " ONINPUT='" + this.getID() + "._handleInput()'" 
                                           : null),
                                           
                    // If the readonly property is set, set it on the handle too
                    (this.readOnly || this.isInactiveHTML() ? " READONLY=TRUE" : null),
                                            
                    // Ensure we pass events through the ISC event handling system.
                    " handleNativeEvents=false>",
                    (this.isInactiveHTML() ? value : null),
                    "</TEXTAREA>"
                );
            } else {
                if (value == null) value ="";
                // use a div with no sizing info specified. This'll fill the available
                // space in the form cell (and expand vertically as required)
                // note asHTML() to convert \n to <br> etc.
                output.append(
                    "<DIV style='",
                    // if width is specified as a number write it out
                    // if it's specified as "*" etc don't (we can't size based on the
                    // DyanmicForm's rendered width since printHTML is not rendered into
                    // the form!)
                    (isc.isA.Number(this.width) ? "width:" + this.width + "px;" : null)
                    ,"' class='", this.getTextBoxStyle(), "'>", value.asHTML(), "</DIV>"
                );
            }
        }
            
        //this.logWarn("textArea HTML:"+ output);
		return output.release();
	},
    
    // When focus is received, the hint should be hidden if TextAreaItem.showHintInField is true.
    _nativeElementFocus : function (element, itemID) {
        var returnVal = this.Super("_nativeElementFocus", arguments);

        // Hide in-field hint if being shown
        this._hideInFieldHint();

        return returnVal;
    },

    // Override _nativeElementBlur to fire 'change' explicitly in response to blur rather than
    // relying on the native 'ONCHANGE' handler method
    // (as with textItem)
    _nativeElementBlur : function (element, itemID) {
        var returnVal = this.Super("_nativeElementBlur", arguments);
        
        if (this.changeOnBlur) this.form.elementChanged(this);
        else {
            var elementValue = this.getElementValue();
            // unmap the value if necessary 
            if (this.mapDisplayToValue) {
                elementValue = this.mapDisplayToValue(elementValue);
            }
            if (this._value != elementValue) this.form.elementChanged(this);
        }
        
        // If showing hint within data field, see if it should be shown now.
        if (this.showHintInField) {
            var undef;
            var value = this.getElementValue();
            if (value === undef || value == null || isc.is.emptyString(value)) {
                this._showInFieldHint();
            }
        }

        return returnVal;
    },

	//>	@method	textAreaItem.getElementStyleHTML()	(I)
    //      	Get the HTML string used to set the visual characteristics for a textArea item.
    //          This includes the STYLE=... & CLASS=... properties to be written into this
    //          form item's element.
	//			This varies by platform, as we attempt to make Netscape think in pixels rather than 
    //          characters and rows
	//
	//		@group	appearance
	//		@return	(string)    String of HTML containing STYLE=... & CLASS=... properties for 
    //                          this items element.
	//
	//<
	getElementStyleHTML : function () {
        
        var width = this.getTextBoxWidth(),
            height = this.getTextBoxHeight();

        return isc.StringBuffer.concat(
            " CLASS='" + this.getTextBoxStyle(),
            
            (isc.Browser.isMoz && isc.isA.String(this.wrap) && this.wrap.toLowerCase() != "off" ? 
                      "' ROWS=10 COLS=10" : "'"),
            " STYLE='",
            this.getElementCSSText(width,height),
            "' ");
    },
    
    //> @attr TextAreaItem.minHeight (integer : 16 : IRW)
    // Minimum valid height for this TextAreaItem in px. If the specified +link{TextAreaItem.height}
    // is less than this value, the text area will still render at this height.
    // @visibility external
    //<
    minHeight:16,
    
    // helper to return the content of the "style" tag in the text box / data element
    getElementCSSText : function (width, height) {
        
        if (isc.isA.Number(width) && width <= 0) width = 1;
        if (isc.isA.Number(height) && height < this.minHeight) height = this.minHeight;
    
        return isc.StringBuffer.concat(
            // Ensure there's no margin(helps with sizing and v-alignment with icons)
            
            (isc.Browser.isIE ? "margin-top:-1px;margin-bottom:-1px;margin-left:0px;margin-right:0px;" 
                              : "margin:0px;"),                    
            (isc.isA.Number(width) 	? "WIDTH:" + width + "px;" : ""),
            (isc.isA.Number(height)	? "HEIGHT:" + height + "px;" : ""),
            // text align property, known to be supported in IE6 and Moz/Firefox on
            // Windows, not supported on Safari 1.2
            (this.textAlign ? "text-align:" + this.textAlign + ";" : ""),
             // In Mozilla we must use the 'moz-user-focus' css property to govern
             // whether this element can recieve focus or not.
             (isc.Browser.isMoz ? 
                    "-moz-user-focus:" + (this._getElementTabIndex() > 0 ? "normal;" 
                                                                        : "ignore;") :
                    "")
        );
    },
                    
	
	//>	@method	textAreaItem.mapValueToDisplay()	(A)
	//	Map from the internal value for this item to the display value.
	//		@group	drawing
	//		@param	internalValue		(string)	Internal value for this item.
	//		@return	(string)	Displayed value corresponding to internal value.
	//<
	mapValueToDisplay : function (internalValue, a,b,c,d) {
        var value = this.invokeSuper(isc.TextAreaItem, "mapValueToDisplay", internalValue, a,b,c,d);
        // always display the empty string for null values, rather than "null" or "undefined"
        if (value == null) value = isc.emptyString;
        return value;
        
	},
	
	//>	@method	textAreaItem.mapDisplayToValue()	(A)
	//	Map from a the display value for this item to the internal value.
	//		@group	drawing
	//
	//		@param	displayValue	(string)	Value displayed to the user.
	//		@return	(string)	Internal value corresponding to that display value.
	//<
	mapDisplayToValue : function (displayValue) {
        if (!this.applyStaticTypeFormat && this.parseEditorValue != null) {
            return this.parseEditorValue(displayValue, this.form, this);
        }

		var value = this._unmapKey(displayValue);
        // if the value to be saved is an empty string, map it to 'null' if necessary
        if (isc.is.emptyString(value)) value = this.emptyStringValue;
        return value;
        
	},
    
    // Don't apply arbitrary formatters specified via SimpleType definitions to this item's
    // display value - we have no way to parse it back to a real data value
    applyStaticTypeFormat:false,
    
    // override 'setValue' to update the data value to store when the element value is set to 
    // the empty string.
    // See Text item setValue override for full description
    setValue : function (value) {

        // Make sure in-field hint is hidden
        this._hideInFieldHint();

        
        var undef;
        if (value !== undef && (value == null || isc.is.emptyString(value))) 
            this.emptyStringValue = value;

        // Also clear out the '_hasEditedValue' flag, used to handle line break conversions
        // (See comments by the 'lineBreakValue' property)
        delete this._hasEditedValue;
            
        // Let parent take care of saving the value
        value = this.Super("setValue", arguments);

        // See if the in-field hint needs to be shown
        if (!this.hasFocus && this.showHint && this.showHintInField && this.getHint()) {
            if (value === undef || value == null || isc.is.emptyString(value)) {
                this._showInFieldHint();
            }
        }

        return value;
    },

    // Override 'updateValue()' to set a flag on this item marking it as having been edited.
    // This is used by 'getValue()' to determine whether we should convert line breaks to
    // the lineBreakValue for this item.
    updateValue : function () {
        this._hasEditedValue = true;
        return this.Super("updateValue", arguments);
    },
    
    // Override getValue() to convert any line break characters to this.lineBreakValue.
    // See comments by this.lineBreakValue definition for why we do this.
    getValue : function () {
        var value = this.Super("getValue", arguments);
        if (this._hasEditedValue && isc.isA.String(value)) {
            // replace every line break with our line break char string
            if (!this._lineBreakValueRegex) 
                this._lineBreakValueRegex = new RegExp("(\\r\\n|[\\r\\n])", "g");
            value = "" + value;    
            value = value.replace(this._lineBreakValueRegex, this.lineBreakValue);
        }
        
        return value;
    },
    
    // SCROLLING
    // Add support for programmatic scrolling of TextAreas
    
    
    
    getScrollHeight : function () {
        var element = this._getTextBoxElement();
        if (element == null) return this.getHeight();
        
        return element.scrollHeight;
    },
    
    getScrollWidth : function () {
        var element = this._getTextBoxElement();
        if (element == null) return this.getWidth();
        
        return element.scrollWidth;    
    },
    
    _hscrollOn : function () {
        var element = this._getTextBoxElement();
        return element && element.scrollWidth > element.clientWidth;
    },

    _vscrollOn : function () {
        var element = this._getTextBoxElement();
        return element && element.scrollHeight > element.clientHeight;
    },    
    
    getScrollTop : function () {
        var element = this._getTextBoxElement();
        if (element == null) return 0;
        return element.scrollTop;
    },
    
    getScrollLeft : function () {
        var element = this._getTextBoxElement();
        if (element == null) return 0;
        return element.scrollLeft;
    },
    
    scrollTo : function (left, top) {
        var element = this._getTextBoxElement();
        if (element == null) return;
        if (left != null) element.scrollLeft = left;
        if (top != null) element.scrollTop = top;        
    },
    
    scrollToTop : function () {
        this.scrollTo(null, 0);
    },

    scrollToBottom : function () {
        var maxScroll = this.getScrollHeight() - this.getInnerHeight();
        if (maxScroll >= 0) {
            if (this._hscrollOn()) maxScroll += this.form.getScrollbarSize();
            this.scrollTo(null, maxScroll);
        }
    }

});
