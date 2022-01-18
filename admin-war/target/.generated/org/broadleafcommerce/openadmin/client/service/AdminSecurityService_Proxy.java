package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class AdminSecurityService_Proxy extends RemoteServiceProxy implements org.broadleafcommerce.openadmin.client.service.AdminSecurityServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.broadleafcommerce.openadmin.client.service.AdminSecurityService";
  private static final String SERIALIZATION_POLICY ="8D7C0280981F20EF5D7CFFE75468F712";
  private static final org.broadleafcommerce.openadmin.client.service.AdminSecurityService_TypeSerializer SERIALIZER = new org.broadleafcommerce.openadmin.client.service.AdminSecurityService_TypeSerializer();
  
  public AdminSecurityService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAdminUser(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AdminSecurityService_Proxy.getAdminUser", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAdminUser");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AdminSecurityService_Proxy.getAdminUser",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AdminSecurityService_Proxy.getAdminUser", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
}
