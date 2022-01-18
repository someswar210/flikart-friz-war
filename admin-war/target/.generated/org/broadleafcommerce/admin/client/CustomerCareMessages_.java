package org.broadleafcommerce.admin.client;

public class CustomerCareMessages_ implements org.broadleafcommerce.admin.client.CustomerCareMessages {
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String baseOrder() {
    return "Base Order";
  }
  
  public java.lang.String baseCountry() {
    return "Country";
  }
  
  public java.lang.String paymentAttributeKeyDefault() {
    return "Untitled";
  }
  
  public java.lang.String baseOfferCode() {
    return "Offer Code";
  }
  
  public java.lang.String customerCareModuleTitle() {
    return "Customer Care";
  }
  
  public java.lang.String paymentAttributeValueDefault() {
    return "Untitled";
  }
  
  public java.lang.String orderDetailsTitle() {
    return "Order Details";
  }
  
  public java.lang.String baseFulfillmentGroup() {
    return "Base Fulfillment Group";
  }
  
  public java.lang.String baseOrderAdjustment() {
    return "Order Adjustment";
  }
  
  public java.lang.String orderMainTitle() {
    return "Order";
  }
  
  public java.lang.String newFGAdjustmentTitle() {
    return "Add A Fulfillment Group Adjustment";
  }
  
  public java.lang.String fgAdjustmentsListTitle() {
    return "Fulfillment Group Adjustments";
  }
  
  public java.lang.String usernameDefault() {
    return "Untitled";
  }
  
  public java.lang.String challengeQuestionSearchPrompt() {
    return "Search For A Challenge Question";
  }
  
  public java.lang.String confirmResetPassword() {
    return "Are you sure you want to reset the customer's password?";
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String countrySearchPrompt() {
    return "Search For A Country";
  }
  
  public java.lang.String fgListTitle() {
    return "Fulfillment Groups";
  }
  
  public java.lang.String bundleOrderItem() {
    return "Bundle Order Item";
  }
  
  public java.lang.String orderItemsTabTitle() {
    return "Order Items";
  }
  
  public java.lang.String additionalAttributesListTitle() {
    return "Additional Attributes";
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String dynamicPriceOrderItem() {
    return "Dynamically Priced Order Item";
  }
  
  public java.lang.String ordersListTitle() {
    return "Orders";
  }
  
  public java.lang.String customerDetailsTitle() {
    return "Customer Details";
  }
  
  public java.lang.String localeSearchPrompt() {
    return "Select a Locale";
  }
  
  public java.lang.String giftWrapOrderItem() {
    return "Gift Wrap Order Item";
  }
  
  public java.lang.String orderDetailsTabTitle() {
    return "Details";
  }
  
  public java.lang.String offerCodeListTitle() {
    return "Offer Codes";
  }
  
  public java.lang.String baseOrderItemAdjustment() {
    return "Order Item Adjustment";
  }
  
  public java.lang.String orderItemsListTitle() {
    return "Order Items";
  }
  
  public java.lang.String paymentInfoListTitle() {
    return "Payment Infos";
  }
  
  public java.lang.String orderItemAdjustmentsListTitle() {
    return "Order Item Adjustments";
  }
  
  public java.lang.String customerMainTitle() {
    return "Customer";
  }
  
  public java.lang.String baseCustomer() {
    return "Base Customer";
  }
  
  public java.lang.String stateSearchPrompt() {
    return "Search For A State";
  }
  
  public java.lang.String newOrderItemAdjustmentTitle() {
    return "Add An Order Item Adjustment";
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String offerCodeTabTitle() {
    return "Offer Codes";
  }
  
  public java.lang.String orderAdjustmentsTitle() {
    return "Order Adjustments";
  }
  
  public java.lang.String orderItemFeeListTitle() {
    return "Order Item Additional Fees";
  }
  
  public java.lang.String discreteOrderItem() {
    return "Order Item";
  }
  
  public java.lang.String newOrderAdjustmentTitle() {
    return "Add An Order Ajustment";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String blcProjectPage() {
    return "Broadleaf Commerce Project Page";
  }
  
  public java.lang.String baseOrderItem() {
    return "Base Order Item";
  }
  
  public java.lang.String baseState() {
    return "State";
  }
  
  public java.lang.String baseChallengeQuestion() {
    return "Challenge Question";
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("baseOrder")) {
      String answer = baseOrder();
      cache.put("baseOrder",answer);
      return answer;
    }
    if(arg0.equals("baseCountry")) {
      String answer = baseCountry();
      cache.put("baseCountry",answer);
      return answer;
    }
    if(arg0.equals("paymentAttributeKeyDefault")) {
      String answer = paymentAttributeKeyDefault();
      cache.put("paymentAttributeKeyDefault",answer);
      return answer;
    }
    if(arg0.equals("baseOfferCode")) {
      String answer = baseOfferCode();
      cache.put("baseOfferCode",answer);
      return answer;
    }
    if(arg0.equals("customerCareModuleTitle")) {
      String answer = customerCareModuleTitle();
      cache.put("customerCareModuleTitle",answer);
      return answer;
    }
    if(arg0.equals("paymentAttributeValueDefault")) {
      String answer = paymentAttributeValueDefault();
      cache.put("paymentAttributeValueDefault",answer);
      return answer;
    }
    if(arg0.equals("orderDetailsTitle")) {
      String answer = orderDetailsTitle();
      cache.put("orderDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("baseFulfillmentGroup")) {
      String answer = baseFulfillmentGroup();
      cache.put("baseFulfillmentGroup",answer);
      return answer;
    }
    if(arg0.equals("baseOrderAdjustment")) {
      String answer = baseOrderAdjustment();
      cache.put("baseOrderAdjustment",answer);
      return answer;
    }
    if(arg0.equals("orderMainTitle")) {
      String answer = orderMainTitle();
      cache.put("orderMainTitle",answer);
      return answer;
    }
    if(arg0.equals("newFGAdjustmentTitle")) {
      String answer = newFGAdjustmentTitle();
      cache.put("newFGAdjustmentTitle",answer);
      return answer;
    }
    if(arg0.equals("fgAdjustmentsListTitle")) {
      String answer = fgAdjustmentsListTitle();
      cache.put("fgAdjustmentsListTitle",answer);
      return answer;
    }
    if(arg0.equals("usernameDefault")) {
      String answer = usernameDefault();
      cache.put("usernameDefault",answer);
      return answer;
    }
    if(arg0.equals("challengeQuestionSearchPrompt")) {
      String answer = challengeQuestionSearchPrompt();
      cache.put("challengeQuestionSearchPrompt",answer);
      return answer;
    }
    if(arg0.equals("confirmResetPassword")) {
      String answer = confirmResetPassword();
      cache.put("confirmResetPassword",answer);
      return answer;
    }
    if(arg0.equals("countrySearchPrompt")) {
      String answer = countrySearchPrompt();
      cache.put("countrySearchPrompt",answer);
      return answer;
    }
    if(arg0.equals("fgListTitle")) {
      String answer = fgListTitle();
      cache.put("fgListTitle",answer);
      return answer;
    }
    if(arg0.equals("bundleOrderItem")) {
      String answer = bundleOrderItem();
      cache.put("bundleOrderItem",answer);
      return answer;
    }
    if(arg0.equals("orderItemsTabTitle")) {
      String answer = orderItemsTabTitle();
      cache.put("orderItemsTabTitle",answer);
      return answer;
    }
    if(arg0.equals("additionalAttributesListTitle")) {
      String answer = additionalAttributesListTitle();
      cache.put("additionalAttributesListTitle",answer);
      return answer;
    }
    if(arg0.equals("dynamicPriceOrderItem")) {
      String answer = dynamicPriceOrderItem();
      cache.put("dynamicPriceOrderItem",answer);
      return answer;
    }
    if(arg0.equals("ordersListTitle")) {
      String answer = ordersListTitle();
      cache.put("ordersListTitle",answer);
      return answer;
    }
    if(arg0.equals("customerDetailsTitle")) {
      String answer = customerDetailsTitle();
      cache.put("customerDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("localeSearchPrompt")) {
      String answer = localeSearchPrompt();
      cache.put("localeSearchPrompt",answer);
      return answer;
    }
    if(arg0.equals("giftWrapOrderItem")) {
      String answer = giftWrapOrderItem();
      cache.put("giftWrapOrderItem",answer);
      return answer;
    }
    if(arg0.equals("orderDetailsTabTitle")) {
      String answer = orderDetailsTabTitle();
      cache.put("orderDetailsTabTitle",answer);
      return answer;
    }
    if(arg0.equals("offerCodeListTitle")) {
      String answer = offerCodeListTitle();
      cache.put("offerCodeListTitle",answer);
      return answer;
    }
    if(arg0.equals("baseOrderItemAdjustment")) {
      String answer = baseOrderItemAdjustment();
      cache.put("baseOrderItemAdjustment",answer);
      return answer;
    }
    if(arg0.equals("orderItemsListTitle")) {
      String answer = orderItemsListTitle();
      cache.put("orderItemsListTitle",answer);
      return answer;
    }
    if(arg0.equals("paymentInfoListTitle")) {
      String answer = paymentInfoListTitle();
      cache.put("paymentInfoListTitle",answer);
      return answer;
    }
    if(arg0.equals("orderItemAdjustmentsListTitle")) {
      String answer = orderItemAdjustmentsListTitle();
      cache.put("orderItemAdjustmentsListTitle",answer);
      return answer;
    }
    if(arg0.equals("customerMainTitle")) {
      String answer = customerMainTitle();
      cache.put("customerMainTitle",answer);
      return answer;
    }
    if(arg0.equals("baseCustomer")) {
      String answer = baseCustomer();
      cache.put("baseCustomer",answer);
      return answer;
    }
    if(arg0.equals("stateSearchPrompt")) {
      String answer = stateSearchPrompt();
      cache.put("stateSearchPrompt",answer);
      return answer;
    }
    if(arg0.equals("newOrderItemAdjustmentTitle")) {
      String answer = newOrderItemAdjustmentTitle();
      cache.put("newOrderItemAdjustmentTitle",answer);
      return answer;
    }
    if(arg0.equals("offerCodeTabTitle")) {
      String answer = offerCodeTabTitle();
      cache.put("offerCodeTabTitle",answer);
      return answer;
    }
    if(arg0.equals("orderAdjustmentsTitle")) {
      String answer = orderAdjustmentsTitle();
      cache.put("orderAdjustmentsTitle",answer);
      return answer;
    }
    if(arg0.equals("orderItemFeeListTitle")) {
      String answer = orderItemFeeListTitle();
      cache.put("orderItemFeeListTitle",answer);
      return answer;
    }
    if(arg0.equals("discreteOrderItem")) {
      String answer = discreteOrderItem();
      cache.put("discreteOrderItem",answer);
      return answer;
    }
    if(arg0.equals("newOrderAdjustmentTitle")) {
      String answer = newOrderAdjustmentTitle();
      cache.put("newOrderAdjustmentTitle",answer);
      return answer;
    }
    if(arg0.equals("blcProjectPage")) {
      String answer = blcProjectPage();
      cache.put("blcProjectPage",answer);
      return answer;
    }
    if(arg0.equals("baseOrderItem")) {
      String answer = baseOrderItem();
      cache.put("baseOrderItem",answer);
      return answer;
    }
    if(arg0.equals("baseState")) {
      String answer = baseState();
      cache.put("baseState",answer);
      return answer;
    }
    if(arg0.equals("baseChallengeQuestion")) {
      String answer = baseChallengeQuestion();
      cache.put("baseChallengeQuestion",answer);
      return answer;
    }
    if(arg0.equals("resetPasswordPrompt")) {
      String answer = resetPasswordPrompt();
      cache.put("resetPasswordPrompt",answer);
      return answer;
    }
    if(arg0.equals("resetPasswordSuccessful")) {
      String answer = resetPasswordSuccessful();
      cache.put("resetPasswordSuccessful",answer);
      return answer;
    }
    if(arg0.equals("basePaymentInfo")) {
      String answer = basePaymentInfo();
      cache.put("basePaymentInfo",answer);
      return answer;
    }
    if(arg0.equals("newOrderItemFeeTitle")) {
      String answer = newOrderItemFeeTitle();
      cache.put("newOrderItemFeeTitle",answer);
      return answer;
    }
    if(arg0.equals("baseFulfillmentGroupAdjustment")) {
      String answer = baseFulfillmentGroupAdjustment();
      cache.put("baseFulfillmentGroupAdjustment",answer);
      return answer;
    }
    if(arg0.equals("customerListTitle")) {
      String answer = customerListTitle();
      cache.put("customerListTitle",answer);
      return answer;
    }
    if(arg0.equals("newCustomerTitle")) {
      String answer = newCustomerTitle();
      cache.put("newCustomerTitle",answer);
      return answer;
    }
    if(arg0.equals("fgTabTitle")) {
      String answer = fgTabTitle();
      cache.put("fgTabTitle",answer);
      return answer;
    }
    if(arg0.equals("baseDiscreteOrderItemFreePrice")) {
      String answer = baseDiscreteOrderItemFreePrice();
      cache.put("baseDiscreteOrderItemFreePrice",answer);
      return answer;
    }
    if(arg0.equals("paymentInfoTabTitle")) {
      String answer = paymentInfoTabTitle();
      cache.put("paymentInfoTabTitle",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String resetPasswordPrompt() {
    return "Reset Password";
  }
  
  public java.lang.String resetPasswordSuccessful() {
    return "Customer password reset was successful.";
  }
  
  public java.lang.String basePaymentInfo() {
    return "Payment Info";
  }
  
  public java.lang.String newOrderItemFeeTitle() {
    return "Add An Order Item Fee";
  }
  
  public java.lang.String baseFulfillmentGroupAdjustment() {
    return "Fulfillment Group Adjustment";
  }
  
  public java.lang.String customerListTitle() {
    return "Customers";
  }
  
  public java.lang.String newCustomerTitle() {
    return "Create New Customer";
  }
  
  public java.lang.String fgTabTitle() {
    return "Fulfillment Groups";
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.CustomerCareMessages", arg0);
  }
  
  public java.lang.String baseDiscreteOrderItemFreePrice() {
    return "Order Item Fee Price";
  }
  
  public java.lang.String paymentInfoTabTitle() {
    return "Payment Infos";
  }
  
  java.util.Map cache = new java.util.HashMap();
  }
