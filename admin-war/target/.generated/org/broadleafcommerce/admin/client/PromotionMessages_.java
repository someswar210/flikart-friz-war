package org.broadleafcommerce.admin.client;

public class PromotionMessages_ implements org.broadleafcommerce.admin.client.PromotionMessages {
  public java.lang.String buildFGRadioChoice() {
    return "Build A Fulfillment Group Selection Rule";
  }
  
  public java.lang.String offerObtainSettingsHelpTitle() {
    return "Offer Obtain Settings Help";
  }
  
  public java.lang.String deliveryTypeEnumManual() {
    return "System";
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String customerSectionViewTitle() {
    return "Customer Qualification";
  }
  
  public java.lang.String receiveFromAnotherPromoTargetLabel() {
    return "Allow These Items To Receive A Discount From Another Offer?";
  }
  
  public java.lang.String bogoQuestionLabel() {
    return "Is This A Buy One/Get One Style Offer?";
  }
  
  public java.lang.String offerCodeFieldTitle() {
    return "Offer Code";
  }
  
  public java.lang.String noRadioChoice() {
    return "No";
  }
  
  public java.lang.String baseOffer() {
    return "Base Promotion";
  }
  
  public java.lang.String fgCombineLabel() {
    return "Can this fulfillment group discount be combined with other FG discounts?";
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String orderQualificationSectionViewTitle() {
    return "Order Qualification";
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String promotionsListTitle() {
    return "Promotions";
  }
  
  public java.lang.String noneItemRadioChoice() {
    return "None";
  }
  
  public java.lang.String mvelTranslationProblem() {
    return "<B>Note: </B>Not all rules associated with this offer are compatible with the rules builder. Showing the raw MVEL code for one or more incompatible rules.";
  }
  
  public java.lang.String receiveFromAnotherPromoLabel() {
    return "Allow These Items To Receive A Discount From Another Offer?";
  }
  
  public java.lang.String yesRadioChoice() {
    return "Yes";
  }
  
  public java.lang.String itemQualificationSectionTitle() {
    return "Item Qualification";
  }
  
  public java.lang.String qualifiyForAnotherPromoTargetLabel() {
    return "Allow These Items To Be Used As Qualifiers For Another Offer?";
  }
  
  public java.lang.String buildOrderRadioChoice() {
    return "Build An Order Selection Rule";
  }
  
  public java.lang.String offerObtainSettingsHelpContent() {
    return "<B>Automatic</B> Offer is always made available to eligible customers and carts.<br><B>Shared Code</B> Offer is made available to all customers who enter the correct code.<br><B>Limited-Use Code</B> Offer is made available to a single customer who enters the correct code. This type of code may be used only up to a specified number of times.<br><B>System</B> Offer is made available to one or more customers via a separate process that the Broadleaf admin is unaware of. Some customers may wish to create a custom feature outside of the Broadleaf Commerce admin to associate offers with customers.";
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String allFGRadioChoice() {
    return "All Fulfillment Groups";
  }
  
  public java.lang.String bogoHelpTitle() {
    return "Buy One/Get One Help";
  }
  
  public java.lang.String deliveryTypeEnumAutomatic() {
    return "Automatic";
  }
  
  public java.lang.String fgSectionViewTitle() {
    return "Fulfillment Group Qualification";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String blcProjectPage() {
    return "Broadleaf Commerce Project Page";
  }
  
  public java.lang.String whichCustomerLabel() {
    return "Which Customers Should Receive This Offer?";
  }
  
  public java.lang.String clonePromotionHelp() {
    return "Duplicate This Promotion";
  }
  
  public java.lang.String advancedRestrictionsViewTitle() {
    return "Advanced Restrictions";
  }
  
  public java.lang.String targetItemsLabel() {
    return "What Items Get The Discount?";
  }
  
  public java.lang.String qualifiyForAnotherPromoLabel() {
    return "Allow These Items To Be Used As Qualifiers For Another Offer?";
  }
  
  public java.lang.String customerObtainLabel() {
    return "How Should Customers Obtain This Offer?";
  }
  
  public java.lang.String advancedCriteriaButtonTitle() {
    return "Advanced Criteria";
  }
  
  public java.lang.String offerNameDefault() {
    return "Untitled";
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("buildFGRadioChoice")) {
      String answer = buildFGRadioChoice();
      cache.put("buildFGRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("offerObtainSettingsHelpTitle")) {
      String answer = offerObtainSettingsHelpTitle();
      cache.put("offerObtainSettingsHelpTitle",answer);
      return answer;
    }
    if(arg0.equals("deliveryTypeEnumManual")) {
      String answer = deliveryTypeEnumManual();
      cache.put("deliveryTypeEnumManual",answer);
      return answer;
    }
    if(arg0.equals("customerSectionViewTitle")) {
      String answer = customerSectionViewTitle();
      cache.put("customerSectionViewTitle",answer);
      return answer;
    }
    if(arg0.equals("receiveFromAnotherPromoTargetLabel")) {
      String answer = receiveFromAnotherPromoTargetLabel();
      cache.put("receiveFromAnotherPromoTargetLabel",answer);
      return answer;
    }
    if(arg0.equals("bogoQuestionLabel")) {
      String answer = bogoQuestionLabel();
      cache.put("bogoQuestionLabel",answer);
      return answer;
    }
    if(arg0.equals("offerCodeFieldTitle")) {
      String answer = offerCodeFieldTitle();
      cache.put("offerCodeFieldTitle",answer);
      return answer;
    }
    if(arg0.equals("noRadioChoice")) {
      String answer = noRadioChoice();
      cache.put("noRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("baseOffer")) {
      String answer = baseOffer();
      cache.put("baseOffer",answer);
      return answer;
    }
    if(arg0.equals("fgCombineLabel")) {
      String answer = fgCombineLabel();
      cache.put("fgCombineLabel",answer);
      return answer;
    }
    if(arg0.equals("orderQualificationSectionViewTitle")) {
      String answer = orderQualificationSectionViewTitle();
      cache.put("orderQualificationSectionViewTitle",answer);
      return answer;
    }
    if(arg0.equals("promotionsListTitle")) {
      String answer = promotionsListTitle();
      cache.put("promotionsListTitle",answer);
      return answer;
    }
    if(arg0.equals("noneItemRadioChoice")) {
      String answer = noneItemRadioChoice();
      cache.put("noneItemRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("mvelTranslationProblem")) {
      String answer = mvelTranslationProblem();
      cache.put("mvelTranslationProblem",answer);
      return answer;
    }
    if(arg0.equals("receiveFromAnotherPromoLabel")) {
      String answer = receiveFromAnotherPromoLabel();
      cache.put("receiveFromAnotherPromoLabel",answer);
      return answer;
    }
    if(arg0.equals("yesRadioChoice")) {
      String answer = yesRadioChoice();
      cache.put("yesRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("itemQualificationSectionTitle")) {
      String answer = itemQualificationSectionTitle();
      cache.put("itemQualificationSectionTitle",answer);
      return answer;
    }
    if(arg0.equals("qualifiyForAnotherPromoTargetLabel")) {
      String answer = qualifiyForAnotherPromoTargetLabel();
      cache.put("qualifiyForAnotherPromoTargetLabel",answer);
      return answer;
    }
    if(arg0.equals("buildOrderRadioChoice")) {
      String answer = buildOrderRadioChoice();
      cache.put("buildOrderRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("offerObtainSettingsHelpContent")) {
      String answer = offerObtainSettingsHelpContent();
      cache.put("offerObtainSettingsHelpContent",answer);
      return answer;
    }
    if(arg0.equals("allFGRadioChoice")) {
      String answer = allFGRadioChoice();
      cache.put("allFGRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("bogoHelpTitle")) {
      String answer = bogoHelpTitle();
      cache.put("bogoHelpTitle",answer);
      return answer;
    }
    if(arg0.equals("deliveryTypeEnumAutomatic")) {
      String answer = deliveryTypeEnumAutomatic();
      cache.put("deliveryTypeEnumAutomatic",answer);
      return answer;
    }
    if(arg0.equals("fgSectionViewTitle")) {
      String answer = fgSectionViewTitle();
      cache.put("fgSectionViewTitle",answer);
      return answer;
    }
    if(arg0.equals("blcProjectPage")) {
      String answer = blcProjectPage();
      cache.put("blcProjectPage",answer);
      return answer;
    }
    if(arg0.equals("whichCustomerLabel")) {
      String answer = whichCustomerLabel();
      cache.put("whichCustomerLabel",answer);
      return answer;
    }
    if(arg0.equals("clonePromotionHelp")) {
      String answer = clonePromotionHelp();
      cache.put("clonePromotionHelp",answer);
      return answer;
    }
    if(arg0.equals("advancedRestrictionsViewTitle")) {
      String answer = advancedRestrictionsViewTitle();
      cache.put("advancedRestrictionsViewTitle",answer);
      return answer;
    }
    if(arg0.equals("targetItemsLabel")) {
      String answer = targetItemsLabel();
      cache.put("targetItemsLabel",answer);
      return answer;
    }
    if(arg0.equals("qualifiyForAnotherPromoLabel")) {
      String answer = qualifiyForAnotherPromoLabel();
      cache.put("qualifiyForAnotherPromoLabel",answer);
      return answer;
    }
    if(arg0.equals("customerObtainLabel")) {
      String answer = customerObtainLabel();
      cache.put("customerObtainLabel",answer);
      return answer;
    }
    if(arg0.equals("advancedCriteriaButtonTitle")) {
      String answer = advancedCriteriaButtonTitle();
      cache.put("advancedCriteriaButtonTitle",answer);
      return answer;
    }
    if(arg0.equals("offerNameDefault")) {
      String answer = offerNameDefault();
      cache.put("offerNameDefault",answer);
      return answer;
    }
    if(arg0.equals("orderSectionLabel")) {
      String answer = orderSectionLabel();
      cache.put("orderSectionLabel",answer);
      return answer;
    }
    if(arg0.equals("requiredItemsLabel")) {
      String answer = requiredItemsLabel();
      cache.put("requiredItemsLabel",answer);
      return answer;
    }
    if(arg0.equals("baseOfferItemCriteria")) {
      String answer = baseOfferItemCriteria();
      cache.put("baseOfferItemCriteria",answer);
      return answer;
    }
    if(arg0.equals("itemTargetSectionTitle")) {
      String answer = itemTargetSectionTitle();
      cache.put("itemTargetSectionTitle",answer);
      return answer;
    }
    if(arg0.equals("noneOrderRadioChoice")) {
      String answer = noneOrderRadioChoice();
      cache.put("noneOrderRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("promotionDetailsTitle")) {
      String answer = promotionDetailsTitle();
      cache.put("promotionDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("deliveryTypeEnumCode")) {
      String answer = deliveryTypeEnumCode();
      cache.put("deliveryTypeEnumCode",answer);
      return answer;
    }
    if(arg0.equals("restrictOnlyPromotionLabel")) {
      String answer = restrictOnlyPromotionLabel();
      cache.put("restrictOnlyPromotionLabel",answer);
      return answer;
    }
    if(arg0.equals("orderCombineLabel")) {
      String answer = orderCombineLabel();
      cache.put("orderCombineLabel",answer);
      return answer;
    }
    if(arg0.equals("allCustomerRadioChoice")) {
      String answer = allCustomerRadioChoice();
      cache.put("allCustomerRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("newItemRuleButtonTitle")) {
      String answer = newItemRuleButtonTitle();
      cache.put("newItemRuleButtonTitle",answer);
      return answer;
    }
    if(arg0.equals("bogoHelpContent")) {
      String answer = bogoHelpContent();
      cache.put("bogoHelpContent",answer);
      return answer;
    }
    if(arg0.equals("basicPromotionLabel")) {
      String answer = basicPromotionLabel();
      cache.put("basicPromotionLabel",answer);
      return answer;
    }
    if(arg0.equals("orderItemCombineLabel")) {
      String answer = orderItemCombineLabel();
      cache.put("orderItemCombineLabel",answer);
      return answer;
    }
    if(arg0.equals("promotionMainTitle")) {
      String answer = promotionMainTitle();
      cache.put("promotionMainTitle",answer);
      return answer;
    }
    if(arg0.equals("buildCustomerRadioChoice")) {
      String answer = buildCustomerRadioChoice();
      cache.put("buildCustomerRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("buildItemRadioChoice")) {
      String answer = buildItemRadioChoice();
      cache.put("buildItemRadioChoice",answer);
      return answer;
    }
    if(arg0.equals("stepFGLabel")) {
      String answer = stepFGLabel();
      cache.put("stepFGLabel",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String orderSectionLabel() {
    return "What Order Criteria Is Required To Receive This Offer?";
  }
  
  public java.lang.String requiredItemsLabel() {
    return "What Items Are Required To Receive This Offer?";
  }
  
  public java.lang.String baseOfferItemCriteria() {
    return "Base Offer Item Criteria";
  }
  
  public java.lang.String itemTargetSectionTitle() {
    return "Item Discount Target";
  }
  
  public java.lang.String noneOrderRadioChoice() {
    return "None";
  }
  
  public java.lang.String promotionDetailsTitle() {
    return "Offer Details";
  }
  
  public java.lang.String deliveryTypeEnumCode() {
    return "Shared Code";
  }
  
  public java.lang.String restrictOnlyPromotionLabel() {
    return "Restrict this promotion such that it is the only promotion in the order?";
  }
  
  public java.lang.String orderCombineLabel() {
    return "Can this order discount be combined with other order discounts?";
  }
  
  public java.lang.String allCustomerRadioChoice() {
    return "All Customers";
  }
  
  public java.lang.String newItemRuleButtonTitle() {
    return "Add New Item Rule";
  }
  
  public java.lang.String bogoHelpContent() {
    return "<B>Buy One/Get One</B> style offers allows promotion administrators to specify offers that are triggered by detection of a certain quantity of one or more items in the cart. Rules are entered that match any combination of items and a quantity is entered for how many times the rule must match. Also, a subsequent target rule is entered that matches any combination of discount target items in the cart and a quantity. As a result, the system will search for any qualifying items and matching quantities in the cart, and if found, will apply the defined discount to the matched target items and quantities.";
  }
  
  public java.lang.String basicPromotionLabel() {
    return "Basic Promotion Information";
  }
  
  public java.lang.String orderItemCombineLabel() {
    return "Can this order item discount be combined with other order item discounts?";
  }
  
  public java.lang.String promotionMainTitle() {
    return "Promotion";
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.admin.client.PromotionMessages", arg0);
  }
  
  public java.lang.String buildCustomerRadioChoice() {
    return "Build A Customer Selection Rule";
  }
  
  public java.lang.String buildItemRadioChoice() {
    return "Build Item Selection Rules";
  }
  
  public java.lang.String stepFGLabel() {
    return "Which Fulfillment Groups Are Eligible To Receive The Discount?";
  }
  
  java.util.Map cache = new java.util.HashMap();
  }
