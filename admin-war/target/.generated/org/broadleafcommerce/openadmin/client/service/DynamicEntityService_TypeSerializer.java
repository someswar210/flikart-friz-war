package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class DynamicEntityService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.anasoft.os.daofusion.cto.client.CriteriaTransferObject/741446597", new com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer.Handler());
    result.put("com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria/2587930064", new com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("com.gwtincubator.security.exception.AccessDeniedException/4287773925", new com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer.Handler());
    result.put("com.gwtincubator.security.exception.ApplicationSecurityException/1480264612", new com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.Handler());
    result.put("com.gwtincubator.security.exception.AuthenticationException/597576682", new com.gwtincubator.security.exception.AuthenticationException_FieldSerializer.Handler());
    result.put("java.lang.Boolean/476441737", new com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer.Handler());
    result.put("java.lang.Integer/3438268394", new com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("[Ljava.lang.String;/2600011424", new com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer.Handler());
    result.put("[[Ljava.lang.String;/4182515373", new com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer.Handler());
    result.put("java.util.ArrayList/3821976829", new com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.Handler());
    result.put("java.util.Arrays$ArrayList/1243019747", new com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptyList/3012082351", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptyMap/2636129644", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyMap_FieldSerializer.Handler());
    result.put("java.util.Collections$SingletonList/833432284", new com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer.Handler());
    result.put("java.util.HashMap/962170901", new com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer.Handler());
    result.put("java.util.IdentityHashMap/3881143367", new com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer.Handler());
    result.put("java.util.LinkedHashMap/1551059846", new com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer.Handler());
    result.put("java.util.LinkedList/1060625595", new com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.Handler());
    result.put("java.util.Stack/1031431137", new com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.Handler());
    result.put("java.util.TreeMap/1575826026", new com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer.Handler());
    result.put("java.util.Vector/3125574444", new com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.ClassMetadata/3525885658", new org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869", new org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer.Handler());
    result.put("[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837", new org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2543939904", new org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.Entity/3466365360", new org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.Handler());
    result.put("[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/3273537220", new org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.FieldMetadata/2489881340", new org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes/1062394969", new org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.ForeignKey/1961004551", new org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType/662154766", new org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType_FieldSerializer.Handler());
    result.put("[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/2003934463", new org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.JoinStructure/106335165", new org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396", new org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142", new org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.OperationType/3190908068", new org.broadleafcommerce.openadmin.client.dto.OperationType_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.OperationTypes/2023242729", new org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924", new org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/3999390788", new org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType/3085618786", new org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.Property/1722188686", new org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer.Handler());
    result.put("[Lorg.broadleafcommerce.openadmin.client.dto.Property;/2356030855", new org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666", new org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.dto.VisibilityEnum/3472628881", new org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType/2679379308", new org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/4027696552", new org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493", new org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.Handler());
    result.put("org.broadleafcommerce.openadmin.client.service.ServiceException/2052708560", new org.broadleafcommerce.openadmin.client.service.ServiceException_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.anasoft.os.daofusion.cto.client.CriteriaTransferObject/741446597"] = [
        ,
        ,
        @com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/anasoft/os/daofusion/cto/client/CriteriaTransferObject;)
      ];
    
    result["com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria/2587930064"] = [
        ,
        ,
        @com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/anasoft/os/daofusion/cto/client/FilterAndSortCriteria;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.gwtincubator.security.exception.AccessDeniedException/4287773925"] = [
        @com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/AccessDeniedException;),
      ];
    
    result["com.gwtincubator.security.exception.ApplicationSecurityException/1480264612"] = [
        @com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/ApplicationSecurityException;),
      ];
    
    result["com.gwtincubator.security.exception.AuthenticationException/597576682"] = [
        @com.gwtincubator.security.exception.AuthenticationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.AuthenticationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/AuthenticationException;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["[[Ljava.lang.String;/4182515373"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[[Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/1243019747"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/3012082351"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/2636129644"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$SingletonList/833432284"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.HashMap/962170901"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.IdentityHashMap/3881143367"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/1551059846"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedList/1060625595"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1031431137"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1575826026"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.Vector/3125574444"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ClassMetadata/3525885658"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ClassMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ClassTree;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/ClassTree;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2543939904"] = [
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/DynamicResultSet;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.Entity/3466365360"] = [
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/Entity;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/Entity;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/3273537220"] = [
        @org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/Entity;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.FieldMetadata/2489881340"] = [
        @org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/FieldMetadata;),
        @org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/FieldMetadata;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes/1062394969"] = [
        @org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/FieldPresentationAttributes;),
        @org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/FieldPresentationAttributes;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ForeignKey/1961004551"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType/662154766"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/ForeignKeyRestrictionType;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/2003934463"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.JoinStructure/106335165"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/JoinStructure;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/MapStructure;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142"] = [
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MergedPropertyType;),
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/MergedPropertyType;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.OperationType/3190908068"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.OperationType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/OperationType;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.OperationTypes/2023242729"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/OperationTypes;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePackage;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/3999390788"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePerspective;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType/3085618786"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePerspectiveItemType;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.Property/1722188686"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/Property;),
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/Property;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.Property;/2356030855"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/Property;),
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/broadleafcommerce/openadmin/client/dto/Property;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/SimpleValueMapStructure;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.VisibilityEnum/3472628881"] = [
        @org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/VisibilityEnum;),
        @org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/VisibilityEnum;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType/2679379308"] = [
        @org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/presentation/SupportedFieldType;),
        @org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/presentation/SupportedFieldType;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/4027696552"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ModuleFactory;),
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/reflection/ModuleFactory;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ReflectiveFactoryWrapper;),
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/reflection/ReflectiveFactoryWrapper;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.service.ServiceException/2052708560"] = [
        @org.broadleafcommerce.openadmin.client.service.ServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.service.ServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/service/ServiceException;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer.concreteType(), "com.anasoft.os.daofusion.cto.client.CriteriaTransferObject/741446597");
    result.put(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer.concreteType(), "com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria/2587930064");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer.concreteType(), "com.gwtincubator.security.exception.AccessDeniedException/4287773925");
    result.put(com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.concreteType(), "com.gwtincubator.security.exception.ApplicationSecurityException/1480264612");
    result.put(com.gwtincubator.security.exception.AuthenticationException_FieldSerializer.concreteType(), "com.gwtincubator.security.exception.AuthenticationException/597576682");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer.concreteType(), "java.lang.Boolean/476441737");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer.concreteType(), "java.lang.Integer/3438268394");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer.concreteType(), "[Ljava.lang.String;/2600011424");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer.concreteType(), "[[Ljava.lang.String;/4182515373");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.concreteType(), "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyMap/2636129644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put(com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer.concreteType(), "java.util.HashMap/962170901");
    result.put(com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer.concreteType(), "java.util.IdentityHashMap/3881143367");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer.concreteType(), "java.util.LinkedHashMap/1551059846");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.concreteType(), "java.util.LinkedList/1060625595");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.concreteType(), "java.util.Stack/1031431137");
    result.put(com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer.concreteType(), "java.util.TreeMap/1575826026");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.concreteType(), "java.util.Vector/3125574444");
    result.put(org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.ClassMetadata/3525885658");
    result.put(org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869");
    result.put(org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer.concreteType(), "[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837");
    result.put(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2543939904");
    result.put(org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.Entity/3466365360");
    result.put(org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer.concreteType(), "[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/3273537220");
    result.put(org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.FieldMetadata/2489881340");
    result.put(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes/1062394969");
    result.put(org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.ForeignKey/1961004551");
    result.put(org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType/662154766");
    result.put(org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer.concreteType(), "[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/2003934463");
    result.put(org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.JoinStructure/106335165");
    result.put(org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396");
    result.put(org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142");
    result.put(org.broadleafcommerce.openadmin.client.dto.OperationType_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.OperationType/3190908068");
    result.put(org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.OperationTypes/2023242729");
    result.put(org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
    result.put(org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/3999390788");
    result.put(org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType/3085618786");
    result.put(org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.Property/1722188686");
    result.put(org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer.concreteType(), "[Lorg.broadleafcommerce.openadmin.client.dto.Property;/2356030855");
    result.put(org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666");
    result.put(org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.dto.VisibilityEnum/3472628881");
    result.put(org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType/2679379308");
    result.put(org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/4027696552");
    result.put(org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493");
    result.put(org.broadleafcommerce.openadmin.client.service.ServiceException_FieldSerializer.concreteType(), "org.broadleafcommerce.openadmin.client.service.ServiceException/2052708560");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::class)] = "com.anasoft.os.daofusion.cto.client.CriteriaTransferObject/741446597";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::class)] = "com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria/2587930064";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.AccessDeniedException::class)] = "com.gwtincubator.security.exception.AccessDeniedException/4287773925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.ApplicationSecurityException::class)] = "com.gwtincubator.security.exception.ApplicationSecurityException/1480264612";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.AuthenticationException::class)] = "com.gwtincubator.security.exception.AuthenticationException/597576682";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[][]::class)] = "[[Ljava.lang.String;/4182515373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyMap::class)] = "java.util.Collections$EmptyMap/2636129644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/962170901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/3881143367";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/1551059846";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1575826026";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.ClassMetadata/3525885658";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassTree::class)] = "org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassTree[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::class)] = "org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2543939904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Entity::class)] = "org.broadleafcommerce.openadmin.client.dto.Entity/3466365360";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Entity[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/3273537220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.FieldMetadata/2489881340";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::class)] = "org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes/1062394969";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey::class)] = "org.broadleafcommerce.openadmin.client.dto.ForeignKey/1961004551";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType::class)] = "org.broadleafcommerce.openadmin.client.dto.ForeignKeyRestrictionType/662154766";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/2003934463";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.JoinStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.JoinStructure/106335165";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MergedPropertyType::class)] = "org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.OperationType::class)] = "org.broadleafcommerce.openadmin.client.dto.OperationType/3190908068";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.OperationTypes::class)] = "org.broadleafcommerce.openadmin.client.dto.OperationTypes/2023242729";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePackage::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePerspective::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/3999390788";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePerspectiveItemType/3085618786";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property::class)] = "org.broadleafcommerce.openadmin.client.dto.Property/1722188686";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.Property;/2356030855";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.VisibilityEnum::class)] = "org.broadleafcommerce.openadmin.client.dto.VisibilityEnum/3472628881";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType::class)] = "org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType/2679379308";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::class)] = "org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/4027696552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper::class)] = "org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.service.ServiceException::class)] = "org.broadleafcommerce.openadmin.client.service.ServiceException/2052708560";
    return result;
  }-*/;
  
  public DynamicEntityService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
