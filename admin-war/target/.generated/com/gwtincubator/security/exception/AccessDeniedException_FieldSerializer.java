package com.gwtincubator.security.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class AccessDeniedException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer.deserialize(reader, (com.gwtincubator.security.exception.AccessDeniedException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer.serialize(writer, (com.gwtincubator.security.exception.AccessDeniedException)object);
    }
  }
  public static Class<?> concreteType() {
    return com.gwtincubator.security.exception.AccessDeniedException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtincubator.security.exception.AccessDeniedException instance) throws SerializationException {
    
    com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwtincubator.security.exception.AccessDeniedException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtincubator.security.exception.AccessDeniedException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtincubator.security.exception.AccessDeniedException instance) throws SerializationException {
    
    com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
