package org.broadleafcommerce.openadmin.client.presentation;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SupportedFieldType_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType)object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType[] values = org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
}
