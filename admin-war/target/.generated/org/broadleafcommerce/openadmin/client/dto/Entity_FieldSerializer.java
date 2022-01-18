package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class Entity_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.Entity)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.Entity)object);
    }
  }
  private static native boolean getIsDirty(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDirty;
  }-*/;
  
  private static native void  setIsDirty(org.broadleafcommerce.openadmin.client.dto.Entity instance, boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDirty = value;
  }-*/;
  
  private static native boolean getMultiPartAvailableOnThread(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::multiPartAvailableOnThread;
  }-*/;
  
  private static native void  setMultiPartAvailableOnThread(org.broadleafcommerce.openadmin.client.dto.Entity instance, boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::multiPartAvailableOnThread = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.Property[] getProperties(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::properties;
  }-*/;
  
  private static native void  setProperties(org.broadleafcommerce.openadmin.client.dto.Entity instance, org.broadleafcommerce.openadmin.client.dto.Property[] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::properties = value;
  }-*/;
  
  private static native java.lang.String[] getType(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::type;
  }-*/;
  
  private static native void  setType(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.String[] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::type = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.Entity.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.Entity instance) throws SerializationException {
    setIsDirty(instance, streamReader.readBoolean());
    setMultiPartAvailableOnThread(instance, streamReader.readBoolean());
    setProperties(instance, (org.broadleafcommerce.openadmin.client.dto.Property[]) streamReader.readObject());
    setType(instance, (java.lang.String[]) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.Entity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.Entity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.Entity instance) throws SerializationException {
    streamWriter.writeBoolean(getIsDirty(instance));
    streamWriter.writeBoolean(getMultiPartAvailableOnThread(instance));
    streamWriter.writeObject(getProperties(instance));
    streamWriter.writeObject(getType(instance));
    
  }
  
}
