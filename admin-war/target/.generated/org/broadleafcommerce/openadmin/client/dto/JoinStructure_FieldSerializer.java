package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class JoinStructure_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.JoinStructure)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.JoinStructure_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.JoinStructure)object);
    }
  }
  private static native java.lang.Boolean getInverse(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::inverse;
  }-*/;
  
  private static native void  setInverse(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::inverse = value;
  }-*/;
  
  private static native java.lang.String getJoinStructureEntityClassname(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::joinStructureEntityClassname;
  }-*/;
  
  private static native void  setJoinStructureEntityClassname(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::joinStructureEntityClassname = value;
  }-*/;
  
  private static native java.lang.String getLinkedIdProperty(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::linkedIdProperty;
  }-*/;
  
  private static native void  setLinkedIdProperty(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::linkedIdProperty = value;
  }-*/;
  
  private static native java.lang.String getLinkedObjectPath(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::linkedObjectPath;
  }-*/;
  
  private static native void  setLinkedObjectPath(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::linkedObjectPath = value;
  }-*/;
  
  private static native java.lang.String getName(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::name;
  }-*/;
  
  private static native void  setName(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::name = value;
  }-*/;
  
  private static native java.lang.Boolean getSortAscending(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::sortAscending;
  }-*/;
  
  private static native void  setSortAscending(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::sortAscending = value;
  }-*/;
  
  private static native java.lang.String getSortField(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::sortField;
  }-*/;
  
  private static native void  setSortField(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::sortField = value;
  }-*/;
  
  private static native java.lang.String getTargetIdProperty(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::targetIdProperty;
  }-*/;
  
  private static native void  setTargetIdProperty(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::targetIdProperty = value;
  }-*/;
  
  private static native java.lang.String getTargetObjectPath(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::targetObjectPath;
  }-*/;
  
  private static native void  setTargetObjectPath(org.broadleafcommerce.openadmin.client.dto.JoinStructure instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.JoinStructure::targetObjectPath = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.JoinStructure.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) throws SerializationException {
    setInverse(instance, (java.lang.Boolean) streamReader.readObject());
    setJoinStructureEntityClassname(instance, streamReader.readString());
    setLinkedIdProperty(instance, streamReader.readString());
    setLinkedObjectPath(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setSortAscending(instance, (java.lang.Boolean) streamReader.readObject());
    setSortField(instance, streamReader.readString());
    setTargetIdProperty(instance, streamReader.readString());
    setTargetObjectPath(instance, streamReader.readString());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.JoinStructure instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.JoinStructure();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.JoinStructure instance) throws SerializationException {
    streamWriter.writeObject(getInverse(instance));
    streamWriter.writeString(getJoinStructureEntityClassname(instance));
    streamWriter.writeString(getLinkedIdProperty(instance));
    streamWriter.writeString(getLinkedObjectPath(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getSortAscending(instance));
    streamWriter.writeString(getSortField(instance));
    streamWriter.writeString(getTargetIdProperty(instance));
    streamWriter.writeString(getTargetObjectPath(instance));
    
  }
  
}
