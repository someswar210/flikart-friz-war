var $intern_2627 = 'AsyncLoader16', $intern_2626 = 'runCallbacks16';
function com_google_gwt_lang_asyncloaders_AsyncLoader16_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader16_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader16_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader16_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader16_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$16_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_cms_admin_client_presenter_sandbox_SandBoxPresenter_SandBoxPresenter__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader16_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$16_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_cms_admin_client_presenter_sandbox_SandBoxPresenter_SandBoxPresenter__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader16_AsyncLoader16__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader16_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader16_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader16_AsyncLoader16__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 16);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2626, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader16_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2626, $intern_120, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader16(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader16_AsyncLoader16__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader16.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader16_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader16_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader16_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader16_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader16_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader16_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1466, $intern_2627);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader16_onLoad__V)();
