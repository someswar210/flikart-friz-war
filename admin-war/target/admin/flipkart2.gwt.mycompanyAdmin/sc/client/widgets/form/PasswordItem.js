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

 





//>	@class	PasswordItem
// FormItem for password fields, where text input by the user should not be shown in readable text.
// @visibility external
//<
isc.ClassFactory.defineClass("PasswordItem", "TextItem");
isc.PasswordItem.addProperties({
	_elementType:"PASSWORD"
});

