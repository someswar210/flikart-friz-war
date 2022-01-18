package org.broadleafcommerce.openadmin.client.security;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class AdminUser_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.security.AdminUser)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.security.AdminUser)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.security.AdminUser.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.security.AdminUser instance) throws SerializationException {
    instance.currentSandBoxId = streamReader.readString();
    instance.permissions = (java.util.List) streamReader.readObject();
    instance.roles = (java.util.List) streamReader.readObject();
    instance.userName = streamReader.readString();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.security.AdminUser instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.security.AdminUser();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.security.AdminUser instance) throws SerializationException {
    streamWriter.writeString(instance.currentSandBoxId);
    streamWriter.writeObject(instance.permissions);
    streamWriter.writeObject(instance.roles);
    streamWriter.writeString(instance.userName);
    
  }
  
}
