package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class VisibilityEnum_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.VisibilityEnum)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.VisibilityEnum_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.VisibilityEnum)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.VisibilityEnum.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.VisibilityEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.VisibilityEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.broadleafcommerce.openadmin.client.dto.VisibilityEnum[] values = org.broadleafcommerce.openadmin.client.dto.VisibilityEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.VisibilityEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
}
