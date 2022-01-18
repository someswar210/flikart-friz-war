package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class FieldPresentationAttributes_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes)object);
    }
  }
  private static native java.lang.String getBroadleafEnumeration(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::broadleafEnumeration;
  }-*/;
  
  private static native void  setBroadleafEnumeration(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::broadleafEnumeration = value;
  }-*/;
  
  private static native java.lang.String getColumnWidth(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::columnWidth;
  }-*/;
  
  private static native void  setColumnWidth(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::columnWidth = value;
  }-*/;
  
  private static native java.lang.Boolean getExcluded(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::excluded;
  }-*/;
  
  private static native void  setExcluded(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::excluded = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType getExplicitFieldType(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::explicitFieldType;
  }-*/;
  
  private static native void  setExplicitFieldType(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::explicitFieldType = value;
  }-*/;
  
  private static native java.lang.String getFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::friendlyName;
  }-*/;
  
  private static native void  setFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::friendlyName = value;
  }-*/;
  
  private static native java.lang.String getGroup(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::group;
  }-*/;
  
  private static native void  setGroup(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::group = value;
  }-*/;
  
  private static native java.lang.Boolean getGroupCollapsed(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::groupCollapsed;
  }-*/;
  
  private static native void  setGroupCollapsed(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::groupCollapsed = value;
  }-*/;
  
  private static native java.lang.Integer getGroupOrder(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::groupOrder;
  }-*/;
  
  private static native void  setGroupOrder(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::groupOrder = value;
  }-*/;
  
  private static native java.lang.Boolean getLargeEntry(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::largeEntry;
  }-*/;
  
  private static native void  setLargeEntry(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::largeEntry = value;
  }-*/;
  
  private static native java.lang.String getName(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::name;
  }-*/;
  
  private static native void  setName(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::name = value;
  }-*/;
  
  private static native java.lang.Integer getOrder(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::order;
  }-*/;
  
  private static native void  setOrder(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Integer value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::order = value;
  }-*/;
  
  private static native java.lang.Boolean getProminent(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::prominent;
  }-*/;
  
  private static native void  setProminent(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::prominent = value;
  }-*/;
  
  private static native java.lang.Boolean getReadOnly(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::readOnly;
  }-*/;
  
  private static native void  setReadOnly(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::readOnly = value;
  }-*/;
  
  private static native java.lang.Boolean getRequiredOverride(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::requiredOverride;
  }-*/;
  
  private static native void  setRequiredOverride(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.Boolean value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::requiredOverride = value;
  }-*/;
  
  private static native java.lang.String getSecurityLevel(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::securityLevel;
  }-*/;
  
  private static native void  setSecurityLevel(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.lang.String value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::securityLevel = value;
  }-*/;
  
  private static native java.util.Map getValidationConfigurations(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::validationConfigurations;
  }-*/;
  
  private static native void  setValidationConfigurations(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, java.util.Map value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::validationConfigurations = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.VisibilityEnum getVisibility(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::visibility;
  }-*/;
  
  private static native void  setVisibility(org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance, org.broadleafcommerce.openadmin.client.dto.VisibilityEnum value) /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes::visibility = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) throws SerializationException {
    setBroadleafEnumeration(instance, streamReader.readString());
    setColumnWidth(instance, streamReader.readString());
    setExcluded(instance, (java.lang.Boolean) streamReader.readObject());
    setExplicitFieldType(instance, (org.broadleafcommerce.openadmin.client.presentation.SupportedFieldType) streamReader.readObject());
    setFriendlyName(instance, streamReader.readString());
    setGroup(instance, streamReader.readString());
    setGroupCollapsed(instance, (java.lang.Boolean) streamReader.readObject());
    setGroupOrder(instance, (java.lang.Integer) streamReader.readObject());
    setLargeEntry(instance, (java.lang.Boolean) streamReader.readObject());
    setName(instance, streamReader.readString());
    setOrder(instance, (java.lang.Integer) streamReader.readObject());
    setProminent(instance, (java.lang.Boolean) streamReader.readObject());
    setReadOnly(instance, (java.lang.Boolean) streamReader.readObject());
    setRequiredOverride(instance, (java.lang.Boolean) streamReader.readObject());
    setSecurityLevel(instance, streamReader.readString());
    setValidationConfigurations(instance, (java.util.Map) streamReader.readObject());
    setVisibility(instance, (org.broadleafcommerce.openadmin.client.dto.VisibilityEnum) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.FieldPresentationAttributes instance) throws SerializationException {
    streamWriter.writeString(getBroadleafEnumeration(instance));
    streamWriter.writeString(getColumnWidth(instance));
    streamWriter.writeObject(getExcluded(instance));
    streamWriter.writeObject(getExplicitFieldType(instance));
    streamWriter.writeString(getFriendlyName(instance));
    streamWriter.writeString(getGroup(instance));
    streamWriter.writeObject(getGroupCollapsed(instance));
    streamWriter.writeObject(getGroupOrder(instance));
    streamWriter.writeObject(getLargeEntry(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getOrder(instance));
    streamWriter.writeObject(getProminent(instance));
    streamWriter.writeObject(getReadOnly(instance));
    streamWriter.writeObject(getRequiredOverride(instance));
    streamWriter.writeString(getSecurityLevel(instance));
    streamWriter.writeObject(getValidationConfigurations(instance));
    streamWriter.writeObject(getVisibility(instance));
    
  }
  
}
