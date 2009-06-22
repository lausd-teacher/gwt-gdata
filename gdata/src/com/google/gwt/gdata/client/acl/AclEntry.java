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
 * Describes an entry in a feed of an access control list (ACL).
 */
public class AclEntry extends com.google.gwt.gdata.client.Entry<AclEntry> {

  /**
   * Constructs an ACL entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, contributors, id, links, role, scope, title, and updated.
   */
  public static native AclEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.acl.AclEntry(
      params
    );
  }-*/;

  protected AclEntry() { }

  /**
   * Returns the role. This element is required.
   * 
   * @return Role or undefined for none.
   */
  public final native AclRole getRole() /*-{
    return this.getRole();
  }-*/;

  /**
   * Returns the scope. This element is required.
   * 
   * @return Scope or undefined for none.
   */
  public final native AclScope getScope() /*-{
    return this.getScope();
  }-*/;

  /**
   * Sets the role. This element is required.
   */
  public final native void setRole() /*-{
    this.setRole();
  }-*/;

  /**
   * Sets the role. This element is required.
   * 
   * @param role Role, or object to use as a parameter to the google.gdata.acl.AclRole constructor, or undefined for none.
   */
  public final native void setRole(AclRole role) /*-{
    this.setRole(
      role
    );
  }-*/;

  /**
   * Sets the scope. This element is required.
   */
  public final native void setScope() /*-{
    this.setScope();
  }-*/;

  /**
   * Sets the scope. This element is required.
   * 
   * @param scope Scope, or object to use as a parameter to the google.gdata.acl.AclScope constructor, or undefined for none.
   */
  public final native void setScope(AclScope scope) /*-{
    this.setScope(
      scope
    );
  }-*/;

}
