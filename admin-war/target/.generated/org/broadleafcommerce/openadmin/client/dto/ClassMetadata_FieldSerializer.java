package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ClassMetadata_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.ClassMetadata)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.ClassMetadata)object);
    }
  }
  private static native java.lang.String getCeilingType(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::ceilingType;
  }-*/;
  
  private static native void  setCeilingType(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::ceilingType = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.ClassTree getPolymorphicEntities(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::polymorphicEntities;
  }-*/;
  
  private static native void  setPolymorphicEntities(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance, org.broadleafcommerce.openadmin.client.dto.ClassTree value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::polymorphicEntities = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.Property[] getProperties(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::properties;
  }-*/;
  
  private static native void  setProperties(org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance, org.broadleafcommerce.openadmin.client.dto.Property[] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::properties = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.ClassMetadata.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance) throws SerializationException {
    setCeilingType(instance, streamReader.readString());
    setPolymorphicEntities(instance, (org.broadleafcommerce.openadmin.client.dto.ClassTree) streamReader.readObject());
    setProperties(instance, (org.broadleafcommerce.openadmin.client.dto.Property[]) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.ClassMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.ClassMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.ClassMetadata instance) throws SerializationException {
    streamWriter.writeString(getCeilingType(instance));
    streamWriter.writeObject(getPolymorphicEntities(instance));
    streamWriter.writeObject(getProperties(instance));
    
  }
  
}
