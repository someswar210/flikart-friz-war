package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class DynamicEntityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.DynamicEntityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.DynamicEntityService";
  private static final String SERIALIZATION_POLICY ="4CB763B18B0C711403B72BC16E7898E1";
  private static final org.broadleafcommerce.openadmin.client.service.DynamicEntityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.DynamicEntityService_TypeSerializer();
  
  public DynamicEntityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void add(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.add", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("add");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
      streamWriter.writeObject(persistencePackage);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.add",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "DynamicEntityService_Proxy.add", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void fetch(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.anasoft.os.daofusion.cto.client.CriteriaTransferObject cto, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.fetch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("fetch");
      streamWriter.writeInt(2);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
      streamWriter.writeString("com.anasoft.os.daofusion.cto.client.CriteriaTransferObject/741446597");
      streamWriter.writeObject(persistencePackage);
      streamWriter.writeObject(cto);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.fetch",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "DynamicEntityService_Proxy.fetch", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void inspect(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.inspect", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("inspect");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
      streamWriter.writeObject(persistencePackage);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.inspect",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "DynamicEntityService_Proxy.inspect", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void remove(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.remove", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("remove");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
      streamWriter.writeObject(persistencePackage);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.remove",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "DynamicEntityService_Proxy.remove", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void update(org.broadleafcommerce.openadmin.client.dto.PersistencePackage persistencePackage, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.update", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("update");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.broadleafcommerce.openadmin.client.dto.PersistencePackage/963608924");
      streamWriter.writeObject(persistencePackage);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("DynamicEntityService_Proxy.update",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "DynamicEntityService_Proxy.update", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
}
