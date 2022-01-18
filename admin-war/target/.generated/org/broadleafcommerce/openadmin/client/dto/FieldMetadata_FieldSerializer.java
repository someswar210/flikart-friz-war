package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class FieldMetadata_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.FieldMetadata)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.FieldMetadata)object);
    }
  }
  private static native java.lang.String[] getAvailableToTypes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::availableToTypes;
  }-*/;
  
  private static native void  setAvailableToTypes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String[] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::availableToTypes = value;
  }-*/;
  
  private static native java.lang.Boolean getCollection(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::collection;
  }-*/;
  
  private static native void  setCollection(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::collection = value;
  }-*/;
  
  private static native java.lang.String getEnumerationClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::enumerationClass;
  }-*/;
  
  private static native void  setEnumerationClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::enumerationClass = value;
  }-*/;
  
  private static native java.lang.String[][] getEnumerationValues(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::enumerationValues;
  }-*/;
  
  private static native void  setEnumerationValues(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String[][] value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::enumerationValues = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType getFieldType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::fieldType;
  }-*/;
  
  private static native void  setFieldType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::fieldType = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyClass;
  }-*/;
  
  private static native void  setForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyClass = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyDisplayValueProperty;
  }-*/;
  
  private static native void  setForeignKeyDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyDisplayValueProperty = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyProperty;
  }-*/;
  
  private static native void  setForeignKeyProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::foreignKeyProperty = value;
  }-*/;
  
  private static native java.lang.String getInheritedFromType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::inheritedFromType;
  }-*/;
  
  private static native void  setInheritedFromType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::inheritedFromType = value;
  }-*/;
  
  private static native java.lang.Integer getLength(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::length;
  }-*/;
  
  private static native void  setLength(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::length = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.MergedPropertyType getMergedPropertyType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::mergedPropertyType;
  }-*/;
  
  private static native void  setMergedPropertyType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, org.broadleafcommerce.openadmin.client.dto.MergedPropertyType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::mergedPropertyType = value;
  }-*/;
  
  private static native java.lang.Boolean getMutable(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::mutable;
  }-*/;
  
  private static native void  setMutable(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::mutable = value;
  }-*/;
  
  private static native java.lang.Integer getPrecision(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::precision;
  }-*/;
  
  private static native void  setPrecision(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::precision = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes getPresentationAttributes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::presentationAttributes;
  }-*/;
  
  private static native void  setPresentationAttributes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::presentationAttributes = value;
  }-*/;
  
  private static native java.lang.Boolean getRequired(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::required;
  }-*/;
  
  private static native void  setRequired(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::required = value;
  }-*/;
  
  private static native java.lang.Integer getScale(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::scale;
  }-*/;
  
  private static native void  setScale(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::scale = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType getSecondaryType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::secondaryType;
  }-*/;
  
  private static native void  setSecondaryType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::secondaryType = value;
  }-*/;
  
  private static native java.lang.Boolean getUnique(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::unique;
  }-*/;
  
  private static native void  setUnique(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::unique = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.FieldMetadata.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) throws SerializationException {
    setAvailableToTypes(instance, (java.lang.String[]) streamReader.readObject());
    setCollection(instance, (java.lang.Boolean) streamReader.readObject());
    setEnumerationClass(instance, streamReader.readString());
    setEnumerationValues(instance, (java.lang.String[][]) streamReader.readObject());
    setFieldType(instance, (org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType) streamReader.readObject());
    setForeignKeyClass(instance, streamReader.readString());
    setForeignKeyDisplayValueProperty(instance, streamReader.readString());
    setForeignKeyProperty(instance, streamReader.readString());
    setInheritedFromType(instance, streamReader.readString());
    setLength(instance, (java.lang.Integer) streamReader.readObject());
    setMergedPropertyType(instance, (org.broadleafcommerce.openadmin.client.dto.MergedPropertyType) streamReader.readObject());
    setMutable(instance, (java.lang.Boolean) streamReader.readObject());
    setPrecision(instance, (java.lang.Integer) streamReader.readObject());
    setPresentationAttributes(instance, (org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes) streamReader.readObject());
    setRequired(instance, (java.lang.Boolean) streamReader.readObject());
    setScale(instance, (java.lang.Integer) streamReader.readObject());
    setSecondaryType(instance, (org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType) streamReader.readObject());
    setUnique(instance, (java.lang.Boolean) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.FieldMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.FieldMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) throws SerializationException {
    streamWriter.writeObject(getAvailableToTypes(instance));
    streamWriter.writeObject(getCollection(instance));
    streamWriter.writeString(getEnumerationClass(instance));
    streamWriter.writeObject(getEnumerationValues(instance));
    streamWriter.writeObject(getFieldType(instance));
    streamWriter.writeString(getForeignKeyClass(instance));
    streamWriter.writeString(getForeignKeyDisplayValueProperty(instance));
    streamWriter.writeString(getForeignKeyProperty(instance));
    streamWriter.writeString(getInheritedFromType(instance));
    streamWriter.writeObject(getLength(instance));
    streamWriter.writeObject(getMergedPropertyType(instance));
    streamWriter.writeObject(getMutable(instance));
    streamWriter.writeObject(getPrecision(instance));
    streamWriter.writeObject(getPresentationAttributes(instance));
    streamWriter.writeObject(getRequired(instance));
    streamWriter.writeObject(getScale(instance));
    streamWriter.writeObject(getSecondaryType(instance));
    streamWriter.writeObject(getUnique(instance));
    
  }
  
}
