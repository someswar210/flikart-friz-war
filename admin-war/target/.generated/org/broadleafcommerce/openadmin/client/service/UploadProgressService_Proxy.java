package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class UploadProgressService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.UploadProgressServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.UploadProgressService";
  private static final String SERIALIZATION_POLICY ="2E4845779A6D6F0708A49572D1BEF8B9";
  private static final org.broadleafcommerce.openadmin.client.service.UploadProgressService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.UploadProgressService_TypeSerializer();
  
  public UploadProgressService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getPercentUploadComplete(java.lang.String callbackName, java.lang.String csrfToken, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UploadProgressService_Proxy.getPercentUploadComplete", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPercentUploadComplete");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(callbackName);
      streamWriter.writeString(csrfToken);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UploadProgressService_Proxy.getPercentUploadComplete",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UploadProgressService_Proxy.getPercentUploadComplete", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
}
