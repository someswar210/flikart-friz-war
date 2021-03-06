package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ForeignKey_Array_Rank_1_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.ForeignKey[])object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.ForeignKey[])object);
    }
  }
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.ForeignKey[].class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.ForeignKey[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.ForeignKey[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.broadleafcommerce.openadmin.client.dto.ForeignKey[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.ForeignKey[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
