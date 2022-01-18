package org.broadleafcommerce.openadmin.client.reflection;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ReflectiveFactoryWrapper_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instance) throws SerializationException {
    
  }
  
  public static org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instance) throws SerializationException {
    
  }
  
}
