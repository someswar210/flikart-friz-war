var $intern_2769 = 'AdminCreatePermissionListDataSourceFactory', $intern_2767 = 'AsyncLoader24', $intern_2771 = 'PermissionManagementPresenter', $intern_2772 = 'PermissionManagementPresenter$1', $intern_2763 = 'createNewPermission', $intern_2761 = 'runCallbacks24';
function com_google_gwt_lang_asyncloaders_AsyncLoader24_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader24_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader24_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader24_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader24_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$24_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_PermissionManagementPresenter__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader24_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$24_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_PermissionManagementPresenter__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader24_AsyncLoader24__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader24_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader24_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader24_AsyncLoader24__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 24);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2761, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader24_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2761, $intern_120, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader24(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader24_AsyncLoader24__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader24.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader24_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader24_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader24_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader24_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader24_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_AdminCreatePermissionListDataSourceFactory__V(){
  this.org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_entityClassName = $intern_2762;
}

function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory(){
}

_ = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_AdminCreatePermissionListDataSourceFactory__V.prototype = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory.prototype = new org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory;
_.createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(name, operationTypes, additionalItems, cb){
  var dataSource, modules, persistencePerspective, org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2_persistencePerspective_0;
  persistencePerspective = (org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2_persistencePerspective_0 = new org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_PersistencePerspective__V , this.setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2_persistencePerspective_0));
  modules = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(java_util_ArrayList_$toArray__Ljava_util_ArrayList_2_3Ljava_lang_Object_2_3Ljava_lang_Object_2(org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createDataSourceModules__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Ljava_util_List_2(this), com_google_gwt_lang_Array_initDim__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2IIILcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1dynamic_1module_1DataSourceModule_12_1classLit, {65:1, 75:1, 261:1}, 69, 0, 0)), 261);
  dataSource = new org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_CustomCriteriaListGridDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2_3Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_2ZZZZZV(name, persistencePerspective, (org_broadleafcommerce_openadmin_client_service_AppServices_$clinit__V() , org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY), modules, true, true, true);
  dataSource.org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_customCriteria = com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_2763]);
  org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_$buildFields__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(dataSource, null, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), cb);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreatePermissionListDataSourceFactory_12_1classLit;
}
;
_.setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2 = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(persistencePerspective){
  persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_persistencePerspectiveItems.put__Ljava_lang_Object_2Ljava_lang_Object_2Ljava_lang_Object_2((org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_FOREIGNKEY), new org_broadleafcommerce_openadmin_client_dto_ForeignKey_ForeignKey__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2V($intern_2764, $intern_2765));
  persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_operationTypes = new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2V((org_broadleafcommerce_openadmin_client_dto_OperationType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY), org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY);
  return persistencePerspective;
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_PermissionManagementPresenter__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_DynamicEntityPresenter__V.call(this);
}

function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_PermissionManagementPresenter__V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter;
_.addClicked__V = function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_addClicked__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$addClicked__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Ljava_lang_String_2V(this, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1182));
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1PermissionManagementPresenter_12_1classLit;
}
;
_.setup__V = function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_2766, new org_broadleafcommerce_openadmin_client_datasource_user_AdminCreatePermissionListDataSourceFactory_AdminCreatePermissionListDataSourceFactory__V, new org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_PermissionManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = {281:1};
function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_PermissionManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_PermissionManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1PermissionManagementPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$setupDisplayItems__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_this$0, top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, {65:1, 75:1}, 95, []));
  com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(top, 207).setupGridFields___3Ljava_lang_String_2_3Ljava_lang_Boolean_2V(com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_7, $intern_1952]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, {65:1, 72:1, 74:1, 75:1}, 133, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE), java_lang_Boolean_TRUE]));
}
;
_.java_lang_Object_castableTypeMap$ = {};
_.org_broadleafcommerce_openadmin_client_presenter_user_PermissionManagementPresenter$1_this$0 = null;
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader24_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1466, $intern_2767), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreatePermissionListDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2768, $intern_2769), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1PermissionManagementPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2770, $intern_2771), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1PermissionManagementPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2770, $intern_2772);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader24_onLoad__V)();
