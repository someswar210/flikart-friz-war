package org.broadleafcommerce.cms.admin.client;

public class ContentManagementMessages_ implements org.broadleafcommerce.cms.admin.client.ContentManagementMessages {
  public java.lang.String newPageTitle() {
    return "New Page";
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String assetListTitle() {
    return "Static Content";
  }
  
  public java.lang.String scRequestRule() {
    return "Request Url Rule";
  }
  
  public java.lang.String assetUploadFullUrlHint() {
    return "(e.g.&nbsp;/untitled.gif)";
  }
  
  public java.lang.String contentTypeFilterTitle() {
    return "Content Type Filter";
  }
  
  public java.lang.String basePage() {
    return "Page";
  }
  
  public java.lang.String pagesTitle() {
    return "Pages";
  }
  
  public java.lang.String staticAssetsTitle() {
    return "Assets";
  }
  
  public java.lang.String approverSandBoxTitle() {
    return "Approver SandBox";
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String scRulesTabTitle() {
    return "Rules";
  }
  
  public java.lang.String baseStructuredContent() {
    return "Structured Content";
  }
  
  public java.lang.String defaultPageName() {
    return "Untitled";
  }
  
  public java.lang.String basePageTemplate() {
    return "Page Template";
  }
  
  public java.lang.String allChildItemsTitle() {
    return "All Child Items";
  }
  
  public java.lang.String baseStructuredContentItemCriteria() {
    return "Structured Content Item Criteria";
  }
  
  public java.lang.String deleteStructuredContentTitle() {
    return "Structured Content";
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String pendingApprovalTitle() {
    return "Pending Approval";
  }
  
  public java.lang.String pageListTitle() {
    return "Pages";
  }
  
  public java.lang.String scProductRule() {
    return "Product Rule";
  }
  
  public java.lang.String assetUploadNameHint() {
    return "(e.g.&nbsp;Untitled)";
  }
  
  public java.lang.String baseStructuredContentFieldTemplate() {
    return "Structured Content Field Template";
  }
  
  public java.lang.String assetDescriptionTitle() {
    return "Asset Descriptions";
  }
  
  public java.lang.String scTimeRule() {
    return "Time Schedule Rule";
  }
  
  public java.lang.String userSandBoxTitle() {
    return "My SandBox";
  }
  
  public java.lang.String newItemTitle() {
    return "New Item";
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String scOrderItemRule() {
    return "Cart Item Targeting Rule";
  }
  
  public java.lang.String staticAssetFoldersTitle() {
    return "Asset Folders";
  }
  
  public java.lang.String cmsModuleTitle() {
    return "Content Management";
  }
  
  public java.lang.String newStructuredContentTitle() {
    return "New Content Item";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String scCustomerRule() {
    return "Customer Rule";
  }
  
  public java.lang.String newAssetTitle() {
    return "New Item";
  }
  
  public java.lang.String baseStructuredContentType() {
    return "Structured Content Type";
  }
  
  public java.lang.String structuredContentListTitle() {
    return "Structured Content";
  }
  
  public java.lang.String structuredContentTitle() {
    return "Structured Content";
  }
  
  public java.lang.String detailsTitle() {
    return "Details";
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("newPageTitle")) {
      String answer = newPageTitle();
      cache.put("newPageTitle",answer);
      return answer;
    }
    if(arg0.equals("assetListTitle")) {
      String answer = assetListTitle();
      cache.put("assetListTitle",answer);
      return answer;
    }
    if(arg0.equals("scRequestRule")) {
      String answer = scRequestRule();
      cache.put("scRequestRule",answer);
      return answer;
    }
    if(arg0.equals("assetUploadFullUrlHint")) {
      String answer = assetUploadFullUrlHint();
      cache.put("assetUploadFullUrlHint",answer);
      return answer;
    }
    if(arg0.equals("contentTypeFilterTitle")) {
      String answer = contentTypeFilterTitle();
      cache.put("contentTypeFilterTitle",answer);
      return answer;
    }
    if(arg0.equals("basePage")) {
      String answer = basePage();
      cache.put("basePage",answer);
      return answer;
    }
    if(arg0.equals("pagesTitle")) {
      String answer = pagesTitle();
      cache.put("pagesTitle",answer);
      return answer;
    }
    if(arg0.equals("staticAssetsTitle")) {
      String answer = staticAssetsTitle();
      cache.put("staticAssetsTitle",answer);
      return answer;
    }
    if(arg0.equals("approverSandBoxTitle")) {
      String answer = approverSandBoxTitle();
      cache.put("approverSandBoxTitle",answer);
      return answer;
    }
    if(arg0.equals("scRulesTabTitle")) {
      String answer = scRulesTabTitle();
      cache.put("scRulesTabTitle",answer);
      return answer;
    }
    if(arg0.equals("baseStructuredContent")) {
      String answer = baseStructuredContent();
      cache.put("baseStructuredContent",answer);
      return answer;
    }
    if(arg0.equals("defaultPageName")) {
      String answer = defaultPageName();
      cache.put("defaultPageName",answer);
      return answer;
    }
    if(arg0.equals("basePageTemplate")) {
      String answer = basePageTemplate();
      cache.put("basePageTemplate",answer);
      return answer;
    }
    if(arg0.equals("allChildItemsTitle")) {
      String answer = allChildItemsTitle();
      cache.put("allChildItemsTitle",answer);
      return answer;
    }
    if(arg0.equals("baseStructuredContentItemCriteria")) {
      String answer = baseStructuredContentItemCriteria();
      cache.put("baseStructuredContentItemCriteria",answer);
      return answer;
    }
    if(arg0.equals("deleteStructuredContentTitle")) {
      String answer = deleteStructuredContentTitle();
      cache.put("deleteStructuredContentTitle",answer);
      return answer;
    }
    if(arg0.equals("pendingApprovalTitle")) {
      String answer = pendingApprovalTitle();
      cache.put("pendingApprovalTitle",answer);
      return answer;
    }
    if(arg0.equals("pageListTitle")) {
      String answer = pageListTitle();
      cache.put("pageListTitle",answer);
      return answer;
    }
    if(arg0.equals("scProductRule")) {
      String answer = scProductRule();
      cache.put("scProductRule",answer);
      return answer;
    }
    if(arg0.equals("assetUploadNameHint")) {
      String answer = assetUploadNameHint();
      cache.put("assetUploadNameHint",answer);
      return answer;
    }
    if(arg0.equals("baseStructuredContentFieldTemplate")) {
      String answer = baseStructuredContentFieldTemplate();
      cache.put("baseStructuredContentFieldTemplate",answer);
      return answer;
    }
    if(arg0.equals("assetDescriptionTitle")) {
      String answer = assetDescriptionTitle();
      cache.put("assetDescriptionTitle",answer);
      return answer;
    }
    if(arg0.equals("scTimeRule")) {
      String answer = scTimeRule();
      cache.put("scTimeRule",answer);
      return answer;
    }
    if(arg0.equals("userSandBoxTitle")) {
      String answer = userSandBoxTitle();
      cache.put("userSandBoxTitle",answer);
      return answer;
    }
    if(arg0.equals("newItemTitle")) {
      String answer = newItemTitle();
      cache.put("newItemTitle",answer);
      return answer;
    }
    if(arg0.equals("scOrderItemRule")) {
      String answer = scOrderItemRule();
      cache.put("scOrderItemRule",answer);
      return answer;
    }
    if(arg0.equals("staticAssetFoldersTitle")) {
      String answer = staticAssetFoldersTitle();
      cache.put("staticAssetFoldersTitle",answer);
      return answer;
    }
    if(arg0.equals("cmsModuleTitle")) {
      String answer = cmsModuleTitle();
      cache.put("cmsModuleTitle",answer);
      return answer;
    }
    if(arg0.equals("newStructuredContentTitle")) {
      String answer = newStructuredContentTitle();
      cache.put("newStructuredContentTitle",answer);
      return answer;
    }
    if(arg0.equals("scCustomerRule")) {
      String answer = scCustomerRule();
      cache.put("scCustomerRule",answer);
      return answer;
    }
    if(arg0.equals("newAssetTitle")) {
      String answer = newAssetTitle();
      cache.put("newAssetTitle",answer);
      return answer;
    }
    if(arg0.equals("baseStructuredContentType")) {
      String answer = baseStructuredContentType();
      cache.put("baseStructuredContentType",answer);
      return answer;
    }
    if(arg0.equals("structuredContentListTitle")) {
      String answer = structuredContentListTitle();
      cache.put("structuredContentListTitle",answer);
      return answer;
    }
    if(arg0.equals("structuredContentTitle")) {
      String answer = structuredContentTitle();
      cache.put("structuredContentTitle",answer);
      return answer;
    }
    if(arg0.equals("detailsTitle")) {
      String answer = detailsTitle();
      cache.put("detailsTitle",answer);
      return answer;
    }
    if(arg0.equals("deleteAssetTitle")) {
      String answer = deleteAssetTitle();
      cache.put("deleteAssetTitle",answer);
      return answer;
    }
    if(arg0.equals("lockedMessage")) {
      String answer = lockedMessage();
      cache.put("lockedMessage",answer);
      return answer;
    }
    if(arg0.equals("newItemRuleButtonTitle")) {
      String answer = newItemRuleButtonTitle();
      cache.put("newItemRuleButtonTitle",answer);
      return answer;
    }
    if(arg0.equals("deletePageTitle")) {
      String answer = deletePageTitle();
      cache.put("deletePageTitle",answer);
      return answer;
    }
    if(arg0.equals("baseSandBoxItem")) {
      String answer = baseSandBoxItem();
      cache.put("baseSandBoxItem",answer);
      return answer;
    }
    if(arg0.equals("newAssetDescriptionTitle")) {
      String answer = newAssetDescriptionTitle();
      cache.put("newAssetDescriptionTitle",answer);
      return answer;
    }
    if(arg0.equals("scDetailsTabTitle")) {
      String answer = scDetailsTabTitle();
      cache.put("scDetailsTabTitle",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String deleteAssetTitle() {
    return "Delete Item";
  }
  
  public java.lang.String lockedMessage() {
    return "Last Updated By <B> ${userName} </B> On <B> ${date} </B>.";
  }
  
  public java.lang.String newItemRuleButtonTitle() {
    return "Add New Item Rule";
  }
  
  public java.lang.String deletePageTitle() {
    return "Delete Page";
  }
  
  public java.lang.String baseSandBoxItem() {
    return "Sand Box Item";
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.cms.admin.client.ContentManagementMessages", arg0);
  }
  
  public java.lang.String newAssetDescriptionTitle() {
    return "Add New AssetDescription";
  }
  
  public java.lang.String scDetailsTabTitle() {
    return "Details";
  }
  
  java.util.Map cache = new java.util.HashMap();
  }
