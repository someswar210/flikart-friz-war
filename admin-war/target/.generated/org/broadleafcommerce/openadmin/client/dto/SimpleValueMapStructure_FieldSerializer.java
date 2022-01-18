package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SimpleValueMapStructure_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure)object);
    }
  }
  private static native java.lang.String getValuePropertyFriendlyName(org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::valuePropertyFriendlyName;
  }-*/;
  
  private static native void  setValuePropertyFriendlyName(org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::valuePropertyFriendlyName = value;
  }-*/;
  
  private static native java.lang.String getValuePropertyName(org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::valuePropertyName;
  }-*/;
  
  private static native void  setValuePropertyName(org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::valuePropertyName = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance) throws SerializationException {
    setValuePropertyFriendlyName(instance, streamReader.readString());
    setValuePropertyName(instance, streamReader.readString());
    
    org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure instance) throws SerializationException {
    streamWriter.writeString(getValuePropertyFriendlyName(instance));
    streamWriter.writeString(getValuePropertyName(instance));
    
    org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
