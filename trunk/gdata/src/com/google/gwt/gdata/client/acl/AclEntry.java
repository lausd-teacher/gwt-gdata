/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.gdata.client.acl;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class AclEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.acl.AclEntry;
  }-*/;

  /**
   * Constructs an ACL entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AclEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.acl.AclEntry(
      params
    );
  }-*/;

  /**
   * Constructs an ACL entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AclEntry newInstance() /*-{
    return new $wnd.google.gdata.acl.AclEntry();
  }-*/;

  protected AclEntry() { }

  /**
   * @return
   */
  public final native JavaScriptObject getAclRoleClass() /*-{
    return this.getAclRoleClass();
  }-*/;

  /**
   * Returns the role.
   * 
   * @return
   */
  public final native AclRole getRole() /*-{
    return this.getRole();
  }-*/;

  /**
   * Returns the scope.
   * 
   * @return
   */
  public final native AclScope getScope() /*-{
    return this.getScope();
  }-*/;

  /**
   * Sets the role.
   * 
   * @param role
   */
  public final native void setRole(JavaScriptObject role) /*-{
    this.setRole(
      role
    );
  }-*/;

  /**
   * Sets the role.
   * 
   * @param role
   */
  public final native void setRole() /*-{
    this.setRole();
  }-*/;

  /**
   * Sets the role.
   * 
   * @param role
   */
  public final native void setRole(AclRole role) /*-{
    this.setRole(
      role
    );
  }-*/;

  /**
   * Sets the scope.
   * 
   * @param scope
   */
  public final native void setScope(JavaScriptObject scope) /*-{
    this.setScope(
      scope
    );
  }-*/;

  /**
   * Sets the scope.
   * 
   * @param scope
   */
  public final native void setScope() /*-{
    this.setScope();
  }-*/;

  /**
   * Sets the scope.
   * 
   * @param scope
   */
  public final native void setScope(AclScope scope) /*-{
    this.setScope(
      scope
    );
  }-*/;

}
