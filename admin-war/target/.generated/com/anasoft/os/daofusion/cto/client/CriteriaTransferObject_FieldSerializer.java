package com.anasoft.os.daofusion.cto.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class CriteriaTransferObject_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer.deserialize(reader, (com.anasoft.os.daofusion.cto.client.CriteriaTransferObject)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.anasoft.os.daofusion.cto.client.CriteriaTransferObject_FieldSerializer.serialize(writer, (com.anasoft.os.daofusion.cto.client.CriteriaTransferObject)object);
    }
  }
  private static native java.util.Map getCriteriaMap(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::criteriaMap;
  }-*/;
  
  private static native void  setCriteriaMap(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance, java.util.Map value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::criteriaMap = value;
  }-*/;
  
  private static native java.lang.Integer getFirstResult(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::firstResult;
  }-*/;
  
  private static native void  setFirstResult(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance, java.lang.Integer value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::firstResult = value;
  }-*/;
  
  private static native java.lang.Integer getMaxResults(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance) /*-{
    return instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::maxResults;
  }-*/;
  
  private static native void  setMaxResults(com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance, java.lang.Integer value) /*-{
    instance.@com.anasoft.os.daofusion.cto.client.CriteriaTransferObject::maxResults = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.anasoft.os.daofusion.cto.client.CriteriaTransferObject.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance) throws SerializationException {
    setCriteriaMap(instance, (java.util.Map) streamReader.readObject());
    setFirstResult(instance, (java.lang.Integer) streamReader.readObject());
    setMaxResults(instance, (java.lang.Integer) streamReader.readObject());
    
  }
  
  public static com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.anasoft.os.daofusion.cto.client.CriteriaTransferObject();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.anasoft.os.daofusion.cto.client.CriteriaTransferObject instance) throws SerializationException {
    streamWriter.writeObject(getCriteriaMap(instance));
    streamWriter.writeObject(getFirstResult(instance));
    streamWriter.writeObject(getMaxResults(instance));
    
  }
  
}
