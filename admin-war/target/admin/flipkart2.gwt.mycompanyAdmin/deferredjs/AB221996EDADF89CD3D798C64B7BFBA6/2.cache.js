var $intern_1895 = 'AsyncLoader2', $intern_1897 = 'MyCompanyProductView', $intern_1896 = 'flipkart2.admin.client.view.product.', $intern_1894 = 'runCallbacks2';
function com_google_gwt_lang_asyncloaders_AsyncLoader2_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader2_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader2_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader2_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader2_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$2_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new flipkart2_admin_client_view_product_MyCompanyProductView_MyCompanyProductView__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader2_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$2_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new flipkart2_admin_client_view_product_MyCompanyProductView_MyCompanyProductView__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader2_AsyncLoader2__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader2_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader2_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader2_AsyncLoader2__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 2);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_1894, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader2_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_1894, $intern_117, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader2(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader2_AsyncLoader2__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader2.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader2_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader2_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader2_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader2_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader2_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function flipkart2_admin_client_view_product_MyCompanyProductView_MyCompanyProductView__V(){
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_OneToOneProductSkuView__V.call(this);
}

function flipkart2_admin_client_view_product_MyCompanyProductView(){
}

_ = flipkart2_admin_client_view_product_MyCompanyProductView_MyCompanyProductView__V.prototype = flipkart2_admin_client_view_product_MyCompanyProductView.prototype = new org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function flipkart2_admin_client_view_product_MyCompanyProductView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_$build__Lorg_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this, entityDataSource);
  this.flipkart2_admin_client_view_product_MyCompanyProductView_shippingCountryDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_grid_GridStructureView_GridStructureView__Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V((flipkart2_admin_client_MyCompanyAdminModule_$clinit__V() , $intern_654), (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_admin_client_view_catalog_product_OneToOneProductSkuView_dynamicFormDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_formOnlyView, this.flipkart2_admin_client_view_product_MyCompanyProductView_shippingCountryDisplay);
}
;
_.getClass__Ljava_lang_Class_2$ = function flipkart2_admin_client_view_product_MyCompanyProductView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lflipkart2_1admin_1client_1view_1product_1MyCompanyProductView_12_1classLit;
}
;
_.java_lang_Object_castableTypeMap$ = {3:1, 4:1, 6:1, 7:1, 10:1, 11:1, 12:1, 13:1, 14:1, 15:1, 16:1, 17:1, 18:1, 19:1, 20:1, 21:1, 22:1, 23:1, 24:1, 25:1, 26:1, 27:1, 28:1, 29:1, 30:1, 31:1, 32:1, 33:1, 34:1, 35:1, 36:1, 37:1, 38:1, 39:1, 40:1, 41:1, 86:1, 87:1, 120:1, 121:1, 127:1, 128:1, 208:1, 209:1, 210:1, 272:1, 280:1};
_.flipkart2_admin_client_view_product_MyCompanyProductView_shippingCountryDisplay = null;
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader2_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1458, $intern_1895), com_google_gwt_lang_ClassLiteralHolder_Lflipkart2_1admin_1client_1view_1product_1MyCompanyProductView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1896, $intern_1897);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader2_onLoad__V)();
