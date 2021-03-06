package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DisclosurePanel_DefaultImages_en_US_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages {
  public com.google.gwt.resources.client.ImageResource disclosurePanelClosed() {
    return disclosurePanelClosed;
  }
  public com.google.gwt.resources.client.ImageResource disclosurePanelOpen() {
    return disclosurePanelOpen;
  }
  private void _init0() {
    disclosurePanelClosed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "disclosurePanelClosed",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None,
    16, 0, 16, 16, false, false
  );
    disclosurePanelOpen = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "disclosurePanelOpen",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None,
    0, 0, 16, 16, false, false
  );
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "E44767377485D18D6B6864F65BA8EF73.cache.png";
  private static final java.lang.String bundledImage_None_rtl = GWT.getModuleBaseURL() + "0A9476898799A150D840F0B1C3672921.cache.png";
  private static com.google.gwt.resources.client.ImageResource disclosurePanelClosed;
  private static com.google.gwt.resources.client.ImageResource disclosurePanelOpen;
  
  static {
    new DisclosurePanel_DefaultImages_en_US_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      disclosurePanelClosed(), 
      disclosurePanelOpen(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("disclosurePanelClosed", disclosurePanelClosed());
        resourceMap.put("disclosurePanelOpen", disclosurePanelOpen());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'disclosurePanelClosed': return this.@com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages::disclosurePanelClosed()();
      case 'disclosurePanelOpen': return this.@com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages::disclosurePanelOpen()();
    }
    return null;
  }-*/;
}
