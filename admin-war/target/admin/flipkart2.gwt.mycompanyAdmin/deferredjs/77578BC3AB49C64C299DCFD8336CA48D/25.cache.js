var $intern_2754 = 'AdminCreateRoleListDataSourceFactory', $intern_2755 = 'AdminPermissionRelatedToUserListDataSourceFactory', $intern_2753 = 'AsyncLoader25', $intern_2756 = 'RoleManagementPresenter', $intern_2757 = 'RoleManagementPresenter$1', $intern_2758 = 'RoleManagementPresenter$2', $intern_2751 = 'createNewRole', $intern_2747 = 'runCallbacks25';
function com_google_gwt_lang_asyncloaders_AsyncLoader25_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader25_2V(){
  var $e0, handler, next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksHead) {
    handler = com_google_gwt_core_client_GWT_sUncaughtExceptionHandler;
    next = com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader25_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader25_callbacksTail = null);
    if (!handler) {
      next.com_google_gwt_lang_asyncloaders_AsyncLoader25_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$25_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V);
    }
     else {
      try {
        next.com_google_gwt_lang_asyncloaders_AsyncLoader25_1_1Callback_callback.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$25_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V);
      }
       catch ($e0) {
        $e0 = com_google_gwt_lang_Exceptions_caught__Ljava_lang_Object_2Ljava_lang_Object_2($e0);
        if (!com_google_gwt_lang_Cast_instanceOf__Ljava_lang_Object_2IZ($e0, 78))
          throw $e0;
      }
    }
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader25_AsyncLoader25__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader25_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader25_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader25_AsyncLoader25__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 25);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2747, $intern_14, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader25_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_2747, $intern_117, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader25(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader25_AsyncLoader25__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader25.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader25_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader25_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader25_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader25_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader25_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V(){
}

function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory(){
}

_ = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V.prototype = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory.prototype = new java_lang_Object;
_.createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(name, operationTypes, additionalItems, cb){
  var modules, persistencePerspective;
  if (!org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource) {
    operationTypes = new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2V((org_broadleafcommerce_openadmin_client_dto_OperationType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY), org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY);
    persistencePerspective = new org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_PersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_String_2_3Lorg_broadleafcommerce_openadmin_client_dto_ForeignKey_2V(operationTypes, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, []), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1dto_1ForeignKey_12_1classLit, {65:1, 72:1, 75:1}, 150, []));
    persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_persistencePerspectiveItems.put__Ljava_lang_Object_2Ljava_lang_Object_2Ljava_lang_Object_2((org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_FOREIGNKEY), new org_broadleafcommerce_openadmin_client_dto_ForeignKey_ForeignKey__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2V($intern_2748, $intern_2749));
    modules = com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1dynamic_1module_1DataSourceModule_12_1classLit, {65:1, 75:1, 261:1}, 69, [new org_broadleafcommerce_openadmin_client_datasource_dynamic_module_BasicClientEntityModule_BasicClientEntityModule__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2V($intern_2750, persistencePerspective, (org_broadleafcommerce_openadmin_client_service_AppServices_$clinit__V() , org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY))]);
    org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource = new org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_CustomCriteriaListGridDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2_3Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_2ZZZZZV(name, persistencePerspective, org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY, modules, true, true, true);
    org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource.org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_customCriteria = com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_2751]);
    org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_$buildFields__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource, null, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), cb);
  }
   else {
    !!cb && org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_$onSuccess__Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2Lcom_smartgwt_client_data_DataSource_2V(cb, org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource);
  }
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreateRoleListDataSourceFactory_12_1classLit;
}
;
_.java_lang_Object_castableTypeMap$ = {};
var org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource = null;
function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V(){
  this.org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_entityClassName = $intern_2736;
}

function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory(){
}

_ = org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V.prototype = org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory.prototype = new org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminPermissionRelatedToUserListDataSourceFactory_12_1classLit;
}
;
_.setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2 = function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(persistencePerspective){
  persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_persistencePerspectiveItems.put__Ljava_lang_Object_2Ljava_lang_Object_2Ljava_lang_Object_2((org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItemType_FOREIGNKEY), new org_broadleafcommerce_openadmin_client_dto_ForeignKey_ForeignKey__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2V($intern_2738, $intern_2739));
  persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_operationTypes = new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2Lorg_broadleafcommerce_openadmin_client_dto_OperationType_2V((org_broadleafcommerce_openadmin_client_dto_OperationType_$clinit__V() , org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY), org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_FOREIGNKEY, org_broadleafcommerce_openadmin_client_dto_OperationType_ENTITY);
  return persistencePerspective;
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_DynamicEntityPresenter__V.call(this);
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter;
_.addClicked__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_addClicked__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$addClicked__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Ljava_lang_String_2V(this, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1225));
}
;
_.bind__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_bind__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2V(this);
  org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchJoinStructurePresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchJoinStructurePresenter_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter);
}
;
_.changeSelection__Lcom_smartgwt_client_data_Record_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_changeSelection__Lcom_smartgwt_client_data_Record_2V(selectedRecord){
  var dataSource;
  dataSource = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_smartgwt_client_data_DataSource_getOrCreateRef__Lcom_google_gwt_core_client_JavaScriptObject_2Lcom_smartgwt_client_data_DataSource_2(com_smartgwt_client_widgets_BaseWidget_$getAttributeAsJavaScriptObject__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2().getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(), $intern_1388)), 206);
  org_broadleafcommerce_openadmin_client_presenter_entity_AbstractSubPresentable_$load__Lorg_broadleafcommerce_openadmin_client_presenter_entity_AbstractSubPresentable_2Lcom_smartgwt_client_data_Record_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_2Lcom_smartgwt_client_data_DSCallback_2Z(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter, selectedRecord, dataSource, null);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter_12_1classLit;
}
;
_.getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2 = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2(){
  return com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, 274);
}
;
_.setup__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_2752, new org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V, new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this)));
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_2740, new org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V, new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = {281:1};
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter = null;
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$setupDisplayItems__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0, top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, {65:1, 75:1}, 95, []));
  com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(top, 207).setupGridFields___3Ljava_lang_String_2_3Ljava_lang_Boolean_2V(com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_1947]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, {65:1, 72:1, 74:1, 75:1}, 133, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE)]));
}
;
_.java_lang_Object_castableTypeMap$ = {};
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0 = null;
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$2_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(dataSource){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter = new org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchJoinStructurePresenter_SimpleSearchJoinStructurePresenter__Lorg_broadleafcommerce_openadmin_client_view_dynamic_grid_GridStructureDisplay_2Lorg_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntitySearchDialog_2_3Ljava_lang_String_2Ljava_lang_String_2V(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, 274), 275).org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_permissionsDisplay, new org_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntitySearchDialog_EntitySearchDialog__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource_2V(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(dataSource, 207)), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_2739]), org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1150));
  org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchJoinStructurePresenter_$setDataSource__Lorg_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchJoinStructurePresenter_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource_2_3Ljava_lang_String_2_3Ljava_lang_Boolean_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter, com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(dataSource, 207), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, {65:1, 72:1, 73:1, 74:1, 75:1, 76:1}, 1, [$intern_7, $intern_1947, $intern_2084]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, {65:1, 72:1, 74:1, 75:1}, 133, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), java_lang_Boolean_FALSE, java_lang_Boolean_FALSE]));
}
;
_.java_lang_Object_castableTypeMap$ = {};
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0 = null;
var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader25_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1458, $intern_2753), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreateRoleListDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2742, $intern_2754), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminPermissionRelatedToUserListDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2742, $intern_2755), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2744, $intern_2756), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2744, $intern_2757), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$2_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_2744, $intern_2758);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader25_onLoad__V)();
