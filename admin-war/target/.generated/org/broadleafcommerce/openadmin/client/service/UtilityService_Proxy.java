package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class UtilityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.UtilityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.UtilityService";
  private static final String SERIALIZATION_POLICY ="9C4A24CB9EB9709E7449E9F1051BBD1B";
  private static final org.broadleafcommerce.openadmin.client.service.UtilityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.UtilityService_TypeSerializer();
  
  public UtilityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAllItems(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getAllItems", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAllItems");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getAllItems",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UtilityService_Proxy.getAllItems", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getAssetServerUrlPrefix(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getAssetServerUrlPrefix", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAssetServerUrlPrefix");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getAssetServerUrlPrefix",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "UtilityService_Proxy.getAssetServerUrlPrefix", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getStoreFrontWebAppPrefix(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getStoreFrontWebAppPrefix", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getStoreFrontWebAppPrefix");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getStoreFrontWebAppPrefix",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "UtilityService_Proxy.getStoreFrontWebAppPrefix", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getWebAppContext(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getWebAppContext", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWebAppContext");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UtilityService_Proxy.getWebAppContext",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "UtilityService_Proxy.getWebAppContext", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
}
