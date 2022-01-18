package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PersistencePackage_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.PersistencePackage)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.PersistencePackage)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.PersistencePackage.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.PersistencePackage instance) throws SerializationException {
    instance.ceilingEntityFullyQualifiedClassname = streamReader.readString();
    instance.csrfToken = streamReader.readString();
    instance.customCriteria = (java.lang.String[]) streamReader.readObject();
    instance.entity = (org.broadleafcommerce.openadmin.client.dto.Entity) streamReader.readObject();
    instance.persistencePerspective = (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.PersistencePackage instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.PersistencePackage();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.PersistencePackage instance) throws SerializationException {
    streamWriter.writeString(instance.ceilingEntityFullyQualifiedClassname);
    streamWriter.writeString(instance.csrfToken);
    streamWriter.writeObject(instance.customCriteria);
    streamWriter.writeObject(instance.entity);
    streamWriter.writeObject(instance.persistencePerspective);
    
  }
  
}
