var $intern_2783 = 'AsyncLoader27', $intern_2785 = 'BasicListDetailView', $intern_2786 = 'PermissionManagementView', $intern_2782 = 'permissionDetailsTab', $intern_2781 = 'permissionTopTabSet', $intern_2780 = 'permissionpermissionLeftVerticalLayout', $intern_2779 = 'runCallbacks27';
function com_google_gwt_lang_asyncloaders_AsyncLoader27_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader27_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader27_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader27_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader27_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$27_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView_PermissionManagementView__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader27_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$27_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView_PermissionManagementView__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader27_AsyncLoader27__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader27_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader27_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader27_AsyncLoader27__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 27);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2779, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader27_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2779, $intern_116, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader27(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader27_AsyncLoader27__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader27.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader27_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader27_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader27_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader27_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader27_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView(){
}

_ = org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView.prototype = new com_smartgwt_client_widgets_layout_HLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var detailsTab, leftVerticalLayout, topTabSet, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_2, com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_3;
  leftVerticalLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_id = $intern_2780;
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?undefined:(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_160] = $intern_2780 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0 = leftVerticalLayout.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0.setProperty($intern_593, $intern_1370) , undefined):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_593] = $intern_1370 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1 = leftVerticalLayout.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1.setProperty($intern_598, $intern_2305) , undefined):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_598] = $intern_2305 , undefined);
  com_smartgwt_client_widgets_Canvas_$setShowResizeBar__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(leftVerticalLayout, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_listDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_DynamicEntityListView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1177) , entityDataSource), java_lang_Boolean_FALSE, java_lang_Boolean_FALSE);
  leftVerticalLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_listDisplay);
  topTabSet = new org_broadleafcommerce_openadmin_client_view_TabSet_TabSet__V;
  topTabSet.com_smartgwt_client_widgets_BaseWidget_id = $intern_2781;
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?undefined:(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_160] = $intern_2781 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(topTabSet, $intern_2313, (com_smartgwt_client_types_Side_$clinit__V() , com_smartgwt_client_types_Side_TOP).com_smartgwt_client_types_Side_value, false);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(topTabSet, $intern_2314, (com_smartgwt_client_types_Overflow_$clinit__V() , com_smartgwt_client_types_Overflow_HIDDEN).com_smartgwt_client_types_Overflow_value, true);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_2 = topTabSet.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_2.setProperty($intern_598, $intern_2305) , undefined):(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_598] = $intern_2305 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?(com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_3 = topTabSet.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_3.setProperty($intern_593, $intern_1370) , undefined):(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_593] = $intern_1370 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(topTabSet)?undefined:(topTabSet.com_smartgwt_client_widgets_BaseWidget_config[$intern_2315] = $intern_67 , undefined);
  detailsTab = new com_smartgwt_client_widgets_tab_Tab_Tab__Ljava_lang_String_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1167));
  detailsTab.com_smartgwt_client_core_JsObject_jsObj[$intern_160] = $intern_2782;
  this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_dynamicFormDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_DynamicFormView__Ljava_lang_String_2Lcom_smartgwt_client_data_DataSource_2V((org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1167) , entityDataSource));
  detailsTab.com_smartgwt_client_core_JsObject_jsObj[$intern_2317] = com_smartgwt_client_widgets_BaseWidget_$getOrCreateJsObj__Lcom_smartgwt_client_widgets_BaseWidget_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_dynamicFormDisplay);
  com_smartgwt_client_widgets_tab_TabSet_$addTab__Lcom_smartgwt_client_widgets_tab_TabSet_2Lcom_smartgwt_client_widgets_tab_Tab_2V(topTabSet, detailsTab);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, leftVerticalLayout);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, topTabSet);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1BasicListDetailView_12_1classLit;
}
;
_.getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2 = function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2(){
  return this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_dynamicFormDisplay;
}
;
_.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2 = function org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2(){
  return this.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_listDisplay;
}
;
_.java_lang_Object_castableTypeMap$ = {3:1, 4:1, 6:1, 7:1, 10:1, 11:1, 12:1, 13:1, 14:1, 15:1, 16:1, 17:1, 18:1, 19:1, 20:1, 21:1, 22:1, 23:1, 24:1, 25:1, 26:1, 27:1, 28:1, 29:1, 30:1, 31:1, 32:1, 33:1, 34:1, 35:1, 36:1, 37:1, 38:1, 39:1, 40:1, 41:1, 86:1, 87:1, 120:1, 121:1, 127:1, 128:1};
_.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_dynamicFormDisplay = null;
_.org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_listDisplay = null;
function org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView_PermissionManagementView__V(){
  var org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0_0, org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1_0;
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_HLayout_HLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?(org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0_0 = this.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_0_0.setProperty($intern_593, $intern_1370) , undefined):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_593] = $intern_1370 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?(org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1_0 = this.getJsObj__Lcom_google_gwt_core_client_JavaScriptObject_2() , org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView_BasicListDetailView__V_com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V_widget_1_0.setProperty($intern_598, $intern_1370) , undefined):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_598] = $intern_1370 , undefined);
}

function org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView(){
}

_ = org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView_PermissionManagementView__V.prototype = org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView.prototype = new org_broadleafcommerce_openadmin_client_view_user_BasicListDetailView;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_view_user_PermissionManagementView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1PermissionManagementView_12_1classLit;
}
;
_.java_lang_Object_castableTypeMap$ = {3:1, 4:1, 6:1, 7:1, 10:1, 11:1, 12:1, 13:1, 14:1, 15:1, 16:1, 17:1, 18:1, 19:1, 20:1, 21:1, 22:1, 23:1, 24:1, 25:1, 26:1, 27:1, 28:1, 29:1, 30:1, 31:1, 32:1, 33:1, 34:1, 35:1, 36:1, 37:1, 38:1, 39:1, 40:1, 41:1, 86:1, 87:1, 120:1, 121:1, 127:1, 128:1, 272:1, 280:1};
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader27_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1456, $intern_2783), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1BasicListDetailView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2784, $intern_2785), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1view_1user_1PermissionManagementView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2784, $intern_2786);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader27_onLoad__V)();
