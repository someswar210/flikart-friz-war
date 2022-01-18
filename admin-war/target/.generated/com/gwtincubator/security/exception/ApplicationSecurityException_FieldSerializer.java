package com.gwtincubator.security.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ApplicationSecurityException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.deserialize(reader, (com.gwtincubator.security.exception.ApplicationSecurityException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.serialize(writer, (com.gwtincubator.security.exception.ApplicationSecurityException)object);
    }
  }
  public static Class<?> concreteType() {
    return com.gwtincubator.security.exception.ApplicationSecurityException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtincubator.security.exception.ApplicationSecurityException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwtincubator.security.exception.ApplicationSecurityException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtincubator.security.exception.ApplicationSecurityException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtincubator.security.exception.ApplicationSecurityException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
