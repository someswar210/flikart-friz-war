var $intern_2763 = 'AsyncLoader23', $intern_2764 = 'PassthroughEntityPresenter', $intern_2765 = 'PassthroughEntityPresenter$1', $intern_2762 = 'passthroughEntityPresenter', $intern_2761 = 'runCallbacks23';
function com_google_gwt_lang_asyncloaders_AsyncLoader23_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader23_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader23_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader23_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader23_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$23_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_PassthroughEntityPresenter__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader23_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$23_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_PassthroughEntityPresenter__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader23_AsyncLoader23__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader23_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader23_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader23_AsyncLoader23__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 23);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2761, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader23_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2761, $intern_124, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader23(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader23_AsyncLoader23__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader23.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader23_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader23_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader23_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader23_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader23_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_PassthroughEntityPresenter__V(){
  this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_loaded = (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE);
  this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_presenterSequenceSetupManager = new org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_PresenterSequenceSetupManager__Lorg_broadleafcommerce_openadmin_client_presenter_entity_EntityPresenter_2V(this);
}

function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_PassthroughEntityPresenter__V.prototype = org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1PassthroughEntityPresenter_12_1classLit;
}
;
_.getLoaded__Ljava_lang_Boolean_2 = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_getLoaded__Ljava_lang_Boolean_2(){
  return this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_loaded;
}
;
_.getPresenterSequenceSetupManager__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2 = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_getPresenterSequenceSetupManager__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2(){
  return this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_presenterSequenceSetupManager;
}
;
_.postSetup__Lcom_smartgwt_client_widgets_Canvas_2V = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_postSetup__Lcom_smartgwt_client_widgets_Canvas_2V(container){
  org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V();
  org_broadleafcommerce_openadmin_client_BLCMain_ISNEW = false;
  if (com_smartgwt_client_widgets_Canvas_$contains__Lcom_smartgwt_client_widgets_Canvas_2Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2(container, this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2()).java_lang_Boolean_value) {
    this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display.show__V();
  }
   else {
    com_smartgwt_client_widgets_Canvas_$addChild__Lcom_smartgwt_client_widgets_Canvas_2Lcom_smartgwt_client_widgets_Canvas_2Lcom_smartgwt_client_widgets_Canvas_2(container, this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2());
    this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_loaded = (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE);
  }
  (java_lang_Boolean_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MODAL_1PROGRESS.org_broadleafcommerce_openadmin_client_view_ProgressWindow_simpleProgress.org_broadleafcommerce_openadmin_client_view_SimpleProgress_isActive?java_lang_Boolean_TRUE:java_lang_Boolean_FALSE).java_lang_Boolean_value && org_broadleafcommerce_openadmin_client_view_ProgressWindow_$stopProgress__Lorg_broadleafcommerce_openadmin_client_view_ProgressWindow_2V(org_broadleafcommerce_openadmin_client_BLCMain_MODAL_1PROGRESS);
  (org_broadleafcommerce_openadmin_client_BLCMain_SPLASH_1PROGRESS.org_broadleafcommerce_openadmin_client_view_SplashWindow_simpleProgress.org_broadleafcommerce_openadmin_client_view_SimpleProgress_isActive?java_lang_Boolean_TRUE:java_lang_Boolean_FALSE).java_lang_Boolean_value && org_broadleafcommerce_openadmin_client_view_SplashWindow_$stopProgress__Lorg_broadleafcommerce_openadmin_client_view_SplashWindow_2V(org_broadleafcommerce_openadmin_client_BLCMain_SPLASH_1PROGRESS);
}
;
_.setDisplay__Lorg_broadleafcommerce_openadmin_client_view_Display_2V = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_setDisplay__Lorg_broadleafcommerce_openadmin_client_view_Display_2V(display){
  this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display = display;
}
;
_.setEventBus__Lcom_google_gwt_event_shared_HandlerManager_2V = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_setEventBus__Lcom_google_gwt_event_shared_HandlerManager_2V(eventBus){
}
;
_.setup__V = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_2762, null, new org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_PassthroughEntityPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = {281:1};
_.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display = null;
function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_PassthroughEntityPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_PassthroughEntityPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1PassthroughEntityPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  this.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter_display.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, {65:1, 75:1}, 95, []));
}
;
_.java_lang_Object_castableTypeMap$ = {};
_.org_broadleafcommerce_openadmin_client_presenter_entity_PassthroughEntityPresenter$1_this$0 = null;
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader23_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1470, $intern_2763), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1PassthroughEntityPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2161, $intern_2764), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1PassthroughEntityPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2161, $intern_2765);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader23_onLoad__V)();
