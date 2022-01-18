package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class OperationTypes_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.OperationTypes)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.OperationTypes)object);
    }
  }
  private static native org.broadleafcommerce.openadmin.client.dto.OperationType getAddType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::addType;
  }-*/;
  
  private static native void  setAddType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.openadmin.client.dto.OperationType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::addType = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.OperationType getFetchType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::fetchType;
  }-*/;
  
  private static native void  setFetchType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.openadmin.client.dto.OperationType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::fetchType = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.OperationType getInspectType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::inspectType;
  }-*/;
  
  private static native void  setInspectType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.openadmin.client.dto.OperationType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::inspectType = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.OperationType getRemoveType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::removeType;
  }-*/;
  
  private static native void  setRemoveType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.openadmin.client.dto.OperationType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::removeType = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.OperationType getUpdateType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::updateType;
  }-*/;
  
  private static native void  setUpdateType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.openadmin.client.dto.OperationType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::updateType = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.OperationTypes.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) throws SerializationException {
    setAddType(instance, (org.broadleafcommerce.openadmin.client.dto.OperationType) streamReader.readObject());
    setFetchType(instance, (org.broadleafcommerce.openadmin.client.dto.OperationType) streamReader.readObject());
    setInspectType(instance, (org.broadleafcommerce.openadmin.client.dto.OperationType) streamReader.readObject());
    setRemoveType(instance, (org.broadleafcommerce.openadmin.client.dto.OperationType) streamReader.readObject());
    setUpdateType(instance, (org.broadleafcommerce.openadmin.client.dto.OperationType) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.OperationTypes instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.OperationTypes();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) throws SerializationException {
    streamWriter.writeObject(getAddType(instance));
    streamWriter.writeObject(getFetchType(instance));
    streamWriter.writeObject(getInspectType(instance));
    streamWriter.writeObject(getRemoveType(instance));
    streamWriter.writeObject(getUpdateType(instance));
    
  }
  
}
