package com.anasoft.os.daofusion.cto.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class FilterAndSortCriteria_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer.deserialize(reader, (com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria_FieldSerializer.serialize(writer, (com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria)object);
    }
  }
  private static native java.util.List getFilterValues(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::filterValues;
  }-*/;
  
  private static native void  setFilterValues(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance, java.util.List value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::filterValues = value;
  }-*/;
  
  private static native java.lang.Boolean getIgnoreCase(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::ignoreCase;
  }-*/;
  
  private static native void  setIgnoreCase(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance, java.lang.Boolean value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::ignoreCase = value;
  }-*/;
  
  private static native java.lang.String getPropertyId(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::propertyId;
  }-*/;
  
  private static native void  setPropertyId(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance, java.lang.String value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::propertyId = value;
  }-*/;
  
  private static native java.lang.Boolean getSortAscending(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::sortAscending;
  }-*/;
  
  private static native void  setSortAscending(com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance, java.lang.Boolean value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria::sortAscending = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) throws SerializationException {
    setFilterValues(instance, (java.util.List) streamReader.readObject());
    setIgnoreCase(instance, (java.lang.Boolean) streamReader.readObject());
    setPropertyId(instance, streamReader.readString());
    setSortAscending(instance, (java.lang.Boolean) streamReader.readObject());
    
  }
  
  public static com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.anasoft.os.daofusion.cto.client.FilterAndSortCriteria instance) throws SerializationException {
    streamWriter.writeObject(getFilterValues(instance));
    streamWriter.writeObject(getIgnoreCase(instance));
    streamWriter.writeString(getPropertyId(instance));
    streamWriter.writeObject(getSortAscending(instance));
    
  }
  
}
