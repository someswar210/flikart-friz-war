var $intern_2336 = 'AsyncLoader10', $intern_2338 = 'CustomerView', $intern_2334 = 'customerLeftVerticalLayout', $intern_2337 = 'org.broadleafcommerce.admin.client.view.customer.', $intern_2333 = 'runCallbacks10';
function com_google_gwt_lang_asyncloaders_AsyncLoader10_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader10_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader10_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader10_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader10_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$10_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_view_customer_CustomerView_CustomerView__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader10_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$10_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_view_customer_CustomerView_CustomerView__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader10_AsyncLoader10__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader10_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader10_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader10_AsyncLoader10__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 10);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2333, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader10_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2333, $intern_116, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader10(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader10_AsyncLoader10__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader10.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader10_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader10_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader10_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader10_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader10_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_admin_client_view_customer_CustomerView_CustomerView__V(){
  var com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1;
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_HLayout_HLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0 = this.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0.setProperty($intern_593, $intern_1370) , undefined):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_593] = $intern_1370 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1 = this.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1.setProperty($intern_598, $intern_1370) , undefined):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_598] = $intern_1370 , undefined);
}

function org_broadleafcommerce_admin_client_view_customer_CustomerView(){
}

_ = org_broadleafcommerce_admin_client_view_customer_CustomerView_CustomerView__V.prototype = org_broadleafcommerce_admin_client_view_customer_CustomerView.prototype = new com_smartgwt_client_widgets_layout_HLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_admin_client_view_customer_CustomerView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_admin_client_view_customer_CustomerView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var label, leftVerticalLayout, toolbar, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1;
  leftVerticalLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_id = $intern_2334;
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?undefined:(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_160] = $intern_2334 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0 = leftVerticalLayout.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0.setProperty($intern_593, $intern_1370) , undefined):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_593] = $intern_1370 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1 = leftVerticalLayout.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1.setProperty($intern_598, $intern_2305) , undefined):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_598] = $intern_2305 , undefined);
  com_smartgwt_client_widgets_Canvas_$setShowResizeBar__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(leftVerticalLayout, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  this.org_broadleafcommerce_admin_client_view_customer_CustomerView_listDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_DynamicEntityListView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_814) , entityDataSource), java_lang_Boolean_FALSE, java_lang_Boolean_FALSE);
  leftVerticalLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_admin_client_view_customer_CustomerView_listDisplay);
  this.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_DynamicFormView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_762) , entityDataSource));
  com_smartgwt_client_widgets_Canvas_$setWidth__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_String_2V(this.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay, $intern_2305);
  toolbar = this.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_toolbar;
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(toolbar, new com_smartgwt_client_widgets_layout_LayoutSpacer_LayoutSpacer__V);
  label = new com_smartgwt_client_widgets_Label_Label__V;
  com_smartgwt_client_widgets_Label_$setContents__Lcom_smartgwt_client_widgets_Label_2Ljava_lang_String_2V(label, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_804));
  com_smartgwt_client_widgets_Label_$setWrap__Lcom_smartgwt_client_widgets_Label_2Ljava_lang_Boolean_2V(label, java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(toolbar, label);
  this.org_broadleafcommerce_admin_client_view_customer_CustomerView_updateLoginButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_admin_client_view_customer_CustomerView_updateLoginButton, $moduleBase + $intern_2335);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_Boolean_2ZV(this.org_broadleafcommerce_admin_client_view_customer_CustomerView_updateLoginButton, $intern_2310, java_lang_Boolean_TRUE, true);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(toolbar, this.org_broadleafcommerce_admin_client_view_customer_CustomerView_updateLoginButton);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(toolbar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(6));
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, leftVerticalLayout);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, this.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_view_customer_CustomerView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1view_1customer_1CustomerView_12_1classLit;
}
;
_.getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2 = function org_broadleafcommerce_admin_client_view_customer_CustomerView_getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2(){
  return this.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay;
}
;
_.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2 = function org_broadleafcommerce_admin_client_view_customer_CustomerView_getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2(){
  return this.org_broadleafcommerce_admin_client_view_customer_CustomerView_listDisplay;
}
;
_.java_lang_Object_castableTypeMap$ = {3:1, 4:1, 6:1, 7:1, 10:1, 11:1, 12:1, 13:1, 14:1, 15:1, 16:1, 17:1, 18:1, 19:1, 20:1, 21:1, 22:1, 23:1, 24:1, 25:1, 26:1, 27:1, 28:1, 29:1, 30:1, 31:1, 32:1, 33:1, 34:1, 35:1, 36:1, 37:1, 38:1, 39:1, 40:1, 41:1, 86:1, 87:1, 120:1, 121:1, 127:1, 128:1, 230:1, 231:1, 272:1, 280:1};
_.org_broadleafcommerce_admin_client_view_customer_CustomerView_dynamicFormDisplay = null;
_.org_broadleafcommerce_admin_client_view_customer_CustomerView_listDisplay = null;
_.org_broadleafcommerce_admin_client_view_customer_CustomerView_updateLoginButton = null;
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader10_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1456, $intern_2336), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1view_1customer_1CustomerView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2337, $intern_2338);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader10_onLoad__V)();
