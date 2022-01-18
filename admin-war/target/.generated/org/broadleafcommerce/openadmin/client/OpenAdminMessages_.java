package org.broadleafcommerce.openadmin.client;

public class OpenAdminMessages_ implements org.broadleafcommerce.openadmin.client.OpenAdminMessages {
  public java.lang.String baseLocale() {
    return "Locale";
  }
  
  public java.lang.String promoteTooltip() {
    return "Promote selected changes.";
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String userManagementMainTitle() {
    return "User Management";
  }
  
  public java.lang.String revertAllTitle() {
    return "Revert All";
  }
  
  public java.lang.String newAdminUserTitle() {
    return "Create New Admin User";
  }
  
  public java.lang.String reclaimTitle() {
    return "Reclaim";
  }
  
  public java.lang.String previewTitle() {
    return "Preview";
  }
  
  public java.lang.String emptyMessage() {
    return "Enter Field Search Terms Above To Populate The Grid";
  }
  
  public java.lang.String reclaimAllTitle() {
    return "Reclaim All";
  }
  
  public java.lang.String searchForPermission() {
    return "Search For A Permission";
  }
  
  public java.lang.String rejectAllTooltip() {
    return "Reject all changes and return to the user's sandbox.";
  }
  
  public java.lang.String baseAdminUser() {
    return "Admin User";
  }
  
  public java.lang.String userDetailsTitle() {
    return "User Details";
  }
  
  public java.lang.String confirmResetPassword() {
    return "Are you sure you want to reset the customer's password?";
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String unlockTitle() {
    return "Unlock";
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String roleDetailsTitle() {
    return "Role Details";
  }
  
  public java.lang.String saveTitle() {
    return "Save";
  }
  
  public java.lang.String addTitle() {
    return "Add";
  }
  
  public java.lang.String contactingServerTitle() {
    return "Contacting Server";
  }
  
  public java.lang.String permissionDetailsTitle() {
    return "Permission Details";
  }
  
  public java.lang.String unlockTooltip() {
    return "Unlock selected items.  This will revert all changes to these items made by the submitting user.";
  }
  
  public java.lang.String newPermissionTitle() {
    return "Create New Permission";
  }
  
  public java.lang.String unlockAllTitle() {
    return "Unlock All";
  }
  
  public java.lang.String restoreTitle() {
    return "Restore";
  }
  
  public java.lang.String permissionListTitle() {
    return "Permissions";
  }
  
  public java.lang.String roleName() {
    return "Role";
  }
  
  public java.lang.String newItemTitle() {
    return "Add New Item";
  }
  
  public java.lang.String unlockAllTooltip() {
    return "Unlock all items from this sandbox.   This will revert all changes to these items made by the submitting user.";
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String promoteTitle() {
    return "Promote";
  }
  
  public java.lang.String reclaimAllTooltip() {
    return "Reclaim all items back to your sandbox.";
  }
  
  public java.lang.String rejectAllTitle() {
    return "Reject All";
  }
  
  public java.lang.String selectPolymorphicType() {
    return "Select The Type To Add";
  }
  
  public java.lang.String viewFullSize() {
    return "View Full Size";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String roleManagementMainTitle() {
    return "Role Management";
  }
  
  public java.lang.String blcProjectPage() {
    return "Broadleaf Commerce Project Page";
  }
  
  public java.lang.String roleListTitle() {
    return "Roles";
  }
  
  public java.lang.String userRolesTitle() {
    return "User Roles";
  }
  
  public java.lang.String clonePromotionHelp() {
    return "Duplicate This Promotion";
  }
  
  public java.lang.String revertTooltip() {
    return "Revert selected changes.";
  }
  
  public java.lang.String userAdminModuleTitle() {
    return "User Administration";
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("baseLocale")) {
      String answer = baseLocale();
      cache.put("baseLocale",answer);
      return answer;
    }
    if(arg0.equals("promoteTooltip")) {
      String answer = promoteTooltip();
      cache.put("promoteTooltip",answer);
      return answer;
    }
    if(arg0.equals("userManagementMainTitle")) {
      String answer = userManagementMainTitle();
      cache.put("userManagementMainTitle",answer);
      return answer;
    }
    if(arg0.equals("revertAllTitle")) {
      String answer = revertAllTitle();
      cache.put("revertAllTitle",answer);
      return answer;
    }
    if(arg0.equals("newAdminUserTitle")) {
      String answer = newAdminUserTitle();
      cache.put("newAdminUserTitle",answer);
      return answer;
    }
    if(arg0.equals("reclaimTitle")) {
      String answer = reclaimTitle();
      cache.put("reclaimTitle",answer);
      return answer;
    }
    if(arg0.equals("previewTitle")) {
      String answer = previewTitle();
      cache.put("previewTitle",answer);
      return answer;
    }
    if(arg0.equals("emptyMessage")) {
      String answer = emptyMessage();
      cache.put("emptyMessage",answer);
      return answer;
    }
    if(arg0.equals("reclaimAllTitle")) {
      String answer = reclaimAllTitle();
      cache.put("reclaimAllTitle",answer);
      return answer;
    }
    if(arg0.equals("searchForPermission")) {
      String answer = searchForPermission();
      cache.put("searchForPermission",answer);
      return answer;
    }
    if(arg0.equals("rejectAllTooltip")) {
      String answer = rejectAllTooltip();
      cache.put("rejectAllTooltip",answer);
      return answer;
    }
    if(arg0.equals("baseAdminUser")) {
      String answer = baseAdminUser();
      cache.put("baseAdminUser",answer);
      return answer;
    }
    if(arg0.equals("userDetailsTitle")) {
      String answer = userDetailsTitle();
      cache.put("userDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("confirmResetPassword")) {
      String answer = confirmResetPassword();
      cache.put("confirmResetPassword",answer);
      return answer;
    }
    if(arg0.equals("unlockTitle")) {
      String answer = unlockTitle();
      cache.put("unlockTitle",answer);
      return answer;
    }
    if(arg0.equals("roleDetailsTitle")) {
      String answer = roleDetailsTitle();
      cache.put("roleDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("saveTitle")) {
      String answer = saveTitle();
      cache.put("saveTitle",answer);
      return answer;
    }
    if(arg0.equals("addTitle")) {
      String answer = addTitle();
      cache.put("addTitle",answer);
      return answer;
    }
    if(arg0.equals("contactingServerTitle")) {
      String answer = contactingServerTitle();
      cache.put("contactingServerTitle",answer);
      return answer;
    }
    if(arg0.equals("permissionDetailsTitle")) {
      String answer = permissionDetailsTitle();
      cache.put("permissionDetailsTitle",answer);
      return answer;
    }
    if(arg0.equals("unlockTooltip")) {
      String answer = unlockTooltip();
      cache.put("unlockTooltip",answer);
      return answer;
    }
    if(arg0.equals("newPermissionTitle")) {
      String answer = newPermissionTitle();
      cache.put("newPermissionTitle",answer);
      return answer;
    }
    if(arg0.equals("unlockAllTitle")) {
      String answer = unlockAllTitle();
      cache.put("unlockAllTitle",answer);
      return answer;
    }
    if(arg0.equals("restoreTitle")) {
      String answer = restoreTitle();
      cache.put("restoreTitle",answer);
      return answer;
    }
    if(arg0.equals("permissionListTitle")) {
      String answer = permissionListTitle();
      cache.put("permissionListTitle",answer);
      return answer;
    }
    if(arg0.equals("roleName")) {
      String answer = roleName();
      cache.put("roleName",answer);
      return answer;
    }
    if(arg0.equals("newItemTitle")) {
      String answer = newItemTitle();
      cache.put("newItemTitle",answer);
      return answer;
    }
    if(arg0.equals("unlockAllTooltip")) {
      String answer = unlockAllTooltip();
      cache.put("unlockAllTooltip",answer);
      return answer;
    }
    if(arg0.equals("promoteTitle")) {
      String answer = promoteTitle();
      cache.put("promoteTitle",answer);
      return answer;
    }
    if(arg0.equals("reclaimAllTooltip")) {
      String answer = reclaimAllTooltip();
      cache.put("reclaimAllTooltip",answer);
      return answer;
    }
    if(arg0.equals("rejectAllTitle")) {
      String answer = rejectAllTitle();
      cache.put("rejectAllTitle",answer);
      return answer;
    }
    if(arg0.equals("selectPolymorphicType")) {
      String answer = selectPolymorphicType();
      cache.put("selectPolymorphicType",answer);
      return answer;
    }
    if(arg0.equals("viewFullSize")) {
      String answer = viewFullSize();
      cache.put("viewFullSize",answer);
      return answer;
    }
    if(arg0.equals("roleManagementMainTitle")) {
      String answer = roleManagementMainTitle();
      cache.put("roleManagementMainTitle",answer);
      return answer;
    }
    if(arg0.equals("blcProjectPage")) {
      String answer = blcProjectPage();
      cache.put("blcProjectPage",answer);
      return answer;
    }
    if(arg0.equals("roleListTitle")) {
      String answer = roleListTitle();
      cache.put("roleListTitle",answer);
      return answer;
    }
    if(arg0.equals("userRolesTitle")) {
      String answer = userRolesTitle();
      cache.put("userRolesTitle",answer);
      return answer;
    }
    if(arg0.equals("clonePromotionHelp")) {
      String answer = clonePromotionHelp();
      cache.put("clonePromotionHelp",answer);
      return answer;
    }
    if(arg0.equals("revertTooltip")) {
      String answer = revertTooltip();
      cache.put("revertTooltip",answer);
      return answer;
    }
    if(arg0.equals("userAdminModuleTitle")) {
      String answer = userAdminModuleTitle();
      cache.put("userAdminModuleTitle",answer);
      return answer;
    }
    if(arg0.equals("rejectTitle")) {
      String answer = rejectTitle();
      cache.put("rejectTitle",answer);
      return answer;
    }
    if(arg0.equals("userListTitle")) {
      String answer = userListTitle();
      cache.put("userListTitle",answer);
      return answer;
    }
    if(arg0.equals("revertAllTooltip")) {
      String answer = revertAllTooltip();
      cache.put("revertAllTooltip",answer);
      return answer;
    }
    if(arg0.equals("resetPasswordSuccessful")) {
      String answer = resetPasswordSuccessful();
      cache.put("resetPasswordSuccessful",answer);
      return answer;
    }
    if(arg0.equals("logout")) {
      String answer = logout();
      cache.put("logout",answer);
      return answer;
    }
    if(arg0.equals("removeTitle")) {
      String answer = removeTitle();
      cache.put("removeTitle",answer);
      return answer;
    }
    if(arg0.equals("reclaimTooltip")) {
      String answer = reclaimTooltip();
      cache.put("reclaimTooltip",answer);
      return answer;
    }
    if(arg0.equals("currentUser")) {
      String answer = currentUser();
      cache.put("currentUser",answer);
      return answer;
    }
    if(arg0.equals("rolesTitle")) {
      String answer = rolesTitle();
      cache.put("rolesTitle",answer);
      return answer;
    }
    if(arg0.equals("promoteAllTitle")) {
      String answer = promoteAllTitle();
      cache.put("promoteAllTitle",answer);
      return answer;
    }
    if(arg0.equals("rejectTooltip")) {
      String answer = rejectTooltip();
      cache.put("rejectTooltip",answer);
      return answer;
    }
    if(arg0.equals("refreshTitle")) {
      String answer = refreshTitle();
      cache.put("refreshTitle",answer);
      return answer;
    }
    if(arg0.equals("permissionManagementMainTitle")) {
      String answer = permissionManagementMainTitle();
      cache.put("permissionManagementMainTitle",answer);
      return answer;
    }
    if(arg0.equals("newRoleTitle")) {
      String answer = newRoleTitle();
      cache.put("newRoleTitle",answer);
      return answer;
    }
    if(arg0.equals("baseAdminRole")) {
      String answer = baseAdminRole();
      cache.put("baseAdminRole",answer);
      return answer;
    }
    if(arg0.equals("baseAdminPermission")) {
      String answer = baseAdminPermission();
      cache.put("baseAdminPermission",answer);
      return answer;
    }
    if(arg0.equals("promoteAllTooltip")) {
      String answer = promoteAllTooltip();
      cache.put("promoteAllTooltip",answer);
      return answer;
    }
    if(arg0.equals("revertTitle")) {
      String answer = revertTitle();
      cache.put("revertTitle",answer);
      return answer;
    }
    if(arg0.equals("orderItemCombineLabel")) {
      String answer = orderItemCombineLabel();
      cache.put("orderItemCombineLabel",answer);
      return answer;
    }
    if(arg0.equals("restoreTooltip")) {
      String answer = restoreTooltip();
      cache.put("restoreTooltip",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String rejectTitle() {
    return "Reject";
  }
  
  public java.lang.String userListTitle() {
    return "Users";
  }
  
  public java.lang.String revertAllTooltip() {
    return "Revert all items from this sandbox.";
  }
  
  public java.lang.String resetPasswordSuccessful() {
    return "Customer password reset was successful.";
  }
  
  public java.lang.String logout() {
    return "Logout";
  }
  
  public java.lang.String removeTitle() {
    return "Remove";
  }
  
  public java.lang.String reclaimTooltip() {
    return "Reclaim selected changes back to your sandbox.";
  }
  
  public java.lang.String currentUser() {
    return "Current User";
  }
  
  public java.lang.String rolesTitle() {
    return "Role";
  }
  
  public java.lang.String promoteAllTitle() {
    return "Promote All";
  }
  
  public java.lang.String rejectTooltip() {
    return "Reject selected changes and return to the user's sandbox.";
  }
  
  public java.lang.String refreshTitle() {
    return "Refresh";
  }
  
  public java.lang.String permissionManagementMainTitle() {
    return "Permission Management";
  }
  
  public java.lang.String newRoleTitle() {
    return "Create New Role";
  }
  
  public java.lang.String baseAdminRole() {
    return "Admin Role";
  }
  
  public java.lang.String baseAdminPermission() {
    return "Admin Permission";
  }
  
  public java.lang.String promoteAllTooltip() {
    return "Promote all items from this sandbox.";
  }
  
  public java.lang.String revertTitle() {
    return "Revert";
  }
  
  public java.lang.String orderItemCombineLabel() {
    return "Can this order item discount be combined with other order item discounts?";
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.broadleafcommerce.openadmin.client.OpenAdminMessages", arg0);
  }
  
  public java.lang.String restoreTooltip() {
    return "Restores form to last save point";
  }
  
  java.util.Map cache = new java.util.HashMap();
  }
