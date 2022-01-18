package org.broadleafcommerce.admin.client;

public class MerchandisingMessages_ implements org.broadleafcommerce.admin.client.MerchandisingMessages {
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String productDetailsTitle() {
    return "Product Details";
  }
  
  public java.lang.String allChildCategoriesListTitle() {
    return "All Child Categories";
  }
  
  public java.lang.String mediaNameDefault() {
    return "Untitled";
  }
  
  public java.lang.String mediaSizeMedium() {
    return "Medium";
  }
  
  public java.lang.String crossSaleProductsTitle() {
    return "Cross Sale Products";
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String saveButtonTitle() {
    return "Save";
  }
  
  public java.lang.String productSearchTitle() {
    return "Product Search";
  }
  
  public java.lang.String baseCategory() {
    return "Base Category";
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String mediaListTitle() {
    return "Media";
  }
  
  public java.lang.String productsListTitle() {
    return "Products";
  }
  
  public java.lang.String cancelButtonTitle() {
    return "Cancel";
  }
  
  public java.lang.String categoryDetailsTitle() {
    return "Category Details";
  }
  
  public java.lang.String skuProduct() {
    return "One to One Product Sku";
  }
  
  public java.lang.String categoryMainTitle() {
    return "Category";
  }
  
  public java.lang.String newMediaTitle() {
    return "Edit Media";
  }
  
  public java.lang.String mediaTabTitle() {
    return "Media";
  }
  
  public java.lang.String productsTabTitle() {
    return "Products";
  }
  
  public java.lang.String defaultCategoryName() {
    return "Untitled";
  }
  
  public java.lang.String baseProduct() {
    return "Base Product";
  }
  
  public java.lang.String orphanCategoryListTitle() {
    return "Orphaned Categories";
  }
  
  public java.lang.String productAttributesTitle() {
    return "Product Attributes";
  }
  
  public java.lang.String featuredProductsListTitle() {
    return "Featured Products";
  }
  
  public java.lang.String productSearchPrompt() {
    return "Search For a Product";
  }
  
  public java.lang.String confirmDelete() {
    return "Are your sure you want to delete this entity?";
  }
  
  public java.lang.String upsaleProductsTitle() {
    return "UpSale Products";
  }
  
  public java.lang.String defaultProductName() {
    return "Untitled";
  }
  
  public java.lang.String categorySearchTitle() {
    return "Category Search";
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String newProductTitle() {
    return "Create New Product";
  }
  
  public java.lang.String merchandisingModuleTitle() {
    return "Catalog and Merchandising";
  }
  
  public java.lang.String productMainTitle() {
    return "Product";
  }
  
  public java.lang.String newCategoryTitle() {
    return "Create New Category";
  }
  
  public java.lang.String mediaSizeSmall() {
    return "Small";
  }
  
  public java.lang.String allParentCategoriesListTitle() {
    return "All Parent Categories";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String blcProjectPage() {
    return "Broadleaf Commerce Project Page";
  }
  
  public java.lang.String allProductsListTitle() {
    return "All Products";
  }
  
  public java.lang.String setPromotionMessageTitle() {
    return "Set Promotion Message";
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("productDetailsTitle")) {
      String answer = productDetailsTitle();
      cache.put("productDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("allChildCategoriesListTitle")) {
      String answer = allChildCategoriesListTitle();
      cache.put("allChildCategoriesListTitle",answer);
      return answer;
    }
    if(arg0.equals("mediaNameDefault")) {
      String answer = mediaNameDefault();
      cache.put("mediaNameDefault",answer);
      return answer;
    }
    if(arg0.equals("mediaSizeMedium")) {
      String answer = mediaSizeMedium();
      cache.put("mediaSizeMedium",answer);
      return answer;
    }
    if(arg0.equals("crossSaleProductsTitle")) {
      String answer = crossSaleProductsTitle();
      cache.put("crossSaleProductsTitle",answer);
      return answer;
    }
    if(arg0.equals("saveButtonTitle")) {
      String answer = saveButtonTitle();
      cache.put("saveButtonTitle",answer);
      return answer;
    }
    if(arg0.equals("productSearchTitle")) {
      String answer = productSearchTitle();
      cache.put("productSearchTitle",answer);
      return answer;
    }
    if(arg0.equals("baseCategory")) {
      String answer = baseCategory();
      cache.put("baseCategory",answer);
      return answer;
    }
    if(arg0.equals("mediaListTitle")) {
      String answer = mediaListTitle();
      cache.put("mediaListTitle",answer);
      return answer;
    }
    if(arg0.equals("productsListTitle")) {
      String answer = productsListTitle();
      cache.put("productsListTitle",answer);
      return answer;
    }
    if(arg0.equals("cancelButtonTitle")) {
      String answer = cancelButtonTitle();
      cache.put("cancelButtonTitle",answer);
      return answer;
    }
    if(arg0.equals("categoryDetailsTitle")) {
      String answer = categoryDetailsTitle();
      cache.put("categoryDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("skuProduct")) {
      String answer = skuProduct();
      cache.put("skuProduct",answer);
      return answer;
    }
    if(arg0.equals("categoryMainTitle")) {
      String answer = categoryMainTitle();
      cache.put("categoryMainTitle",answer);
      return answer;
    }
    if(arg0.equals("newMediaTitle")) {
      String answer = newMediaTitle();
      cache.put("newMediaTitle",answer);
      return answer;
    }
    if(arg0.equals("mediaTabTitle")) {
      String answer = mediaTabTitle();
      cache.put("mediaTabTitle",answer);
      return answer;
    }
    if(arg0.equals("productsTabTitle")) {
      String answer = productsTabTitle();
      cache.put("productsTabTitle",answer);
      return answer;
    }
    if(arg0.equals("defaultCategoryName")) {
      String answer = defaultCategoryName();
      cache.put("defaultCategoryName",answer);
      return answer;
    }
    if(arg0.equals("baseProduct")) {
      String answer = baseProduct();
      cache.put("baseProduct",answer);
      return answer;
    }
    if(arg0.equals("orphanCategoryListTitle")) {
      String answer = orphanCategoryListTitle();
      cache.put("orphanCategoryListTitle",answer);
      return answer;
    }
    if(arg0.equals("productAttributesTitle")) {
      String answer = productAttributesTitle();
      cache.put("productAttributesTitle",answer);
      return answer;
    }
    if(arg0.equals("featuredProductsListTitle")) {
      String answer = featuredProductsListTitle();
      cache.put("featuredProductsListTitle",answer);
      return answer;
    }
    if(arg0.equals("productSearchPrompt")) {
      String answer = productSearchPrompt();
      cache.put("productSearchPrompt",answer);
      return answer;
    }
    if(arg0.equals("confirmDelete")) {
      String answer = confirmDelete();
      cache.put("confirmDelete",answer);
      return answer;
    }
    if(arg0.equals("upsaleProductsTitle")) {
      String answer = upsaleProductsTitle();
      cache.put("upsaleProductsTitle",answer);
      return answer;
    }
    if(arg0.equals("defaultProductName")) {
      String answer = defaultProductName();
      cache.put("defaultProductName",answer);
      return answer;
    }
    if(arg0.equals("categorySearchTitle")) {
      String answer = categorySearchTitle();
      cache.put("categorySearchTitle",answer);
      return answer;
    }
    if(arg0.equals("newProductTitle")) {
      String answer = newProductTitle();
      cache.put("newProductTitle",answer);
      return answer;
    }
    if(arg0.equals("merchandisingModuleTitle")) {
      String answer = merchandisingModuleTitle();
      cache.put("merchandisingModuleTitle",answer);
      return answer;
    }
    if(arg0.equals("productMainTitle")) {
      String answer = productMainTitle();
      cache.put("productMainTitle",answer);
      return answer;
    }
    if(arg0.equals("newCategoryTitle")) {
      String answer = newCategoryTitle();
      cache.put("newCategoryTitle",answer);
      return answer;
    }
    if(arg0.equals("mediaSizeSmall")) {
      String answer = mediaSizeSmall();
      cache.put("mediaSizeSmall",answer);
      return answer;
    }
    if(arg0.equals("allParentCategoriesListTitle")) {
      String answer = allParentCategoriesListTitle();
      cache.put("allParentCategoriesListTitle",answer);
      return answer;
    }
    if(arg0.equals("blcProjectPage")) {
      String answer = blcProjectPage();
      cache.put("blcProjectPage",answer);
      return answer;
    }
    if(arg0.equals("allProductsListTitle")) {
      String answer = allProductsListTitle();
      cache.put("allProductsListTitle",answer);
      return answer;
    }
    if(arg0.equals("setPromotionMessageTitle")) {
      String answer = setPromotionMessageTitle();
      cache.put("setPromotionMessageTitle",answer);
      return answer;
    }
    if(arg0.equals("mediaSizeLarge")) {
      String answer = mediaSizeLarge();
      cache.put("mediaSizeLarge",answer);
      return answer;
    }
    if(arg0.equals("otherProduct")) {
      String answer = otherProduct();
      cache.put("otherProduct",answer);
      return answer;
    }
    if(arg0.equals("baseProductAttribute")) {
      String answer = baseProductAttribute();
      cache.put("baseProductAttribute",answer);
      return answer;
    }
    if(arg0.equals("newAttributeTitle")) {
      String answer = newAttributeTitle();
      cache.put("newAttributeTitle",answer);
      return answer;
    }
    if(arg0.equals("categoryListTitle")) {
      String answer = categoryListTitle();
      cache.put("categoryListTitle",answer);
      return answer;
    }
    if(arg0.equals("mediaLabelDefault")) {
      String answer = mediaLabelDefault();
      cache.put("mediaLabelDefault",answer);
      return answer;
    }
    if(arg0.equals("categorySearchPrompt")) {
      String answer = categorySearchPrompt();
      cache.put("categorySearchPrompt",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String mediaSizeLarge() {
    return "Large";
  }
  
  public java.lang.String otherProduct() {
    return "Other Product";
  }
  
  public java.lang.String baseProductAttribute() {
    return "Base Product Attribute";
  }
  
  public java.lang.String newAttributeTitle() {
    return "Edit Attribute";
  }
  
  public java.lang.String categoryListTitle() {
    return "Categories";
  }
  
  public java.lang.String mediaLabelDefault() {
    return "untitled";
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.MerchandisingMessages", arg0);
  }
  
  public java.lang.String categorySearchPrompt() {
    return "Search For a Category";
  }
  
  java.util.Map cache = new java.util.HashMap();
  }
