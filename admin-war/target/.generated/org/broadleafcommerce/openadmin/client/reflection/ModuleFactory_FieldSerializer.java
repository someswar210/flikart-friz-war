package org.broadleafcommerce.openadmin.client.reflection;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ModuleFactory_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.reflection.ModuleFactory)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.reflection.ModuleFactory)object);
    }
  }
  private static native org.broadleafcommerce.openadmin.client.reflection.Factory getFactory(org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::factory;
  }-*/;
  
  private static native void  setFactory(org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance, org.broadleafcommerce.openadmin.client.reflection.Factory value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::factory = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.reflection.ModuleFactory.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance) throws SerializationException {
    setFactory(instance, (org.broadleafcommerce.openadmin.client.reflection.Factory) streamReader.readObject());
    
    com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance) throws SerializationException {
    streamWriter.writeObject(getFactory(instance));
    
    com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
