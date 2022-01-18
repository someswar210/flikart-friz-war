var $intern_2345 = 'AsyncLoader9', $intern_2344 = 'runCallbacks9';
function com_google_gwt_lang_asyncloaders_AsyncLoader9_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader9_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader9_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader9_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$9_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_OneToOneProductSkuView__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader9_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$9_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_OneToOneProductSkuView__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader9_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 9);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2344, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader9_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2344, $intern_124, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader9.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader9_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader9_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader9_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader9_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader9_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader9_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1470, $intern_2345);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader9_onLoad__V)();
