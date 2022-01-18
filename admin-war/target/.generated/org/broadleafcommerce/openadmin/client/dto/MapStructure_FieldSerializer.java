package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class MapStructure_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.MapStructure)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.MapStructure)object);
    }
  }
  private static native java.lang.Boolean getDeleteValueEntity(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::deleteValueEntity;
  }-*/;
  
  private static native void  setDeleteValueEntity(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::deleteValueEntity = value;
  }-*/;
  
  private static native java.lang.String getKeyClassName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyClassName;
  }-*/;
  
  private static native void  setKeyClassName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyClassName = value;
  }-*/;
  
  private static native java.lang.String getKeyPropertyFriendlyName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyPropertyFriendlyName;
  }-*/;
  
  private static native void  setKeyPropertyFriendlyName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyPropertyFriendlyName = value;
  }-*/;
  
  private static native java.lang.String getKeyPropertyName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyPropertyName;
  }-*/;
  
  private static native void  setKeyPropertyName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::keyPropertyName = value;
  }-*/;
  
  private static native java.lang.String getMapProperty(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::mapProperty;
  }-*/;
  
  private static native void  setMapProperty(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::mapProperty = value;
  }-*/;
  
  private static native java.lang.String getValueClassName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::valueClassName;
  }-*/;
  
  private static native void  setValueClassName(org.broadleafcommerce.openadmin.client.dto.MapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapStructure::valueClassName = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.MapStructure.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.MapStructure instance) throws SerializationException {
    setDeleteValueEntity(instance, (java.lang.Boolean) streamReader.readObject());
    setKeyClassName(instance, streamReader.readString());
    setKeyPropertyFriendlyName(instance, streamReader.readString());
    setKeyPropertyName(instance, streamReader.readString());
    setMapProperty(instance, streamReader.readString());
    setValueClassName(instance, streamReader.readString());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.MapStructure instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.MapStructure();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.MapStructure instance) throws SerializationException {
    streamWriter.writeObject(getDeleteValueEntity(instance));
    streamWriter.writeString(getKeyClassName(instance));
    streamWriter.writeString(getKeyPropertyFriendlyName(instance));
    streamWriter.writeString(getKeyPropertyName(instance));
    streamWriter.writeString(getMapProperty(instance));
    streamWriter.writeString(getValueClassName(instance));
    
  }
  
}
