package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PersistencePerspective_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.PersistencePerspective.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instance) throws SerializationException {
    instance.additionalForeignKeys = (org.broadleafcommerce.openadmin.client.dto.ForeignKey[]) streamReader.readObject();
    instance.additionalNonPersistentProperties = (java.lang.String[]) streamReader.readObject();
    instance.configurationKey = streamReader.readString();
    instance.excludeFields = (java.lang.String[]) streamReader.readObject();
    instance.includeFields = (java.lang.String[]) streamReader.readObject();
    instance.operationTypes = (org.broadleafcommerce.openadmin.client.dto.OperationTypes) streamReader.readObject();
    instance.persistencePerspectiveItems = (java.util.Map) streamReader.readObject();
    instance.populateToOneFields = (java.lang.Boolean) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.PersistencePerspective();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instance) throws SerializationException {
    streamWriter.writeObject(instance.additionalForeignKeys);
    streamWriter.writeObject(instance.additionalNonPersistentProperties);
    streamWriter.writeString(instance.configurationKey);
    streamWriter.writeObject(instance.excludeFields);
    streamWriter.writeObject(instance.includeFields);
    streamWriter.writeObject(instance.operationTypes);
    streamWriter.writeObject(instance.persistencePerspectiveItems);
    streamWriter.writeObject(instance.populateToOneFields);
    
  }
  
}
