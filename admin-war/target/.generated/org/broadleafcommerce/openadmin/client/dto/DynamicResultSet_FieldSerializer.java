package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class DynamicResultSet_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.DynamicResultSet)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.DynamicResultSet)object);
    }
  }
  private static native org.broadleafcommerce.openadmin.client.dto.ClassMetadata getClassMetaData(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::classMetaData;
  }-*/;
  
  private static native void  setClassMetaData(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance, org.broadleafcommerce.openadmin.client.dto.ClassMetadata value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::classMetaData = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.Entity[] getRecords(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::records;
  }-*/;
  
  private static native void  setRecords(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance, org.broadleafcommerce.openadmin.client.dto.Entity[] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::records = value;
  }-*/;
  
  private static native java.lang.Integer getTotalRecords(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::totalRecords;
  }-*/;
  
  private static native void  setTotalRecords(org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::totalRecords = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.DynamicResultSet.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance) throws SerializationException {
    setClassMetaData(instance, (org.broadleafcommerce.openadmin.client.dto.ClassMetadata) streamReader.readObject());
    setRecords(instance, (org.broadleafcommerce.openadmin.client.dto.Entity[]) streamReader.readObject());
    setTotalRecords(instance, (java.lang.Integer) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.DynamicResultSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.DynamicResultSet instance) throws SerializationException {
    streamWriter.writeObject(getClassMetaData(instance));
    streamWriter.writeObject(getRecords(instance));
    streamWriter.writeObject(getTotalRecords(instance));
    
  }
  
}
