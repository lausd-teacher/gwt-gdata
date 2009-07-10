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
 * Describes the role of an entry in an access control list.
 */
public class AclRole extends JavaScriptObject {

  /**
   * Predefined value 'none' to indicate that a user has no rights.
   */
  public static final String VALUE_NONE = getConstant("VALUE_NONE");

  /**
   * Predefined value 'owner' to indicate that a user has the right to read, modify and delete the controlled object.
   */
  public static final String VALUE_OWNER = getConstant("VALUE_OWNER");

  /**
   * Predefined value 'peeker' to indicate that a user has the right to know of the existance of the controlled object.
   */
  public static final String VALUE_PEEKER = getConstant("VALUE_PEEKER");

  /**
   * Predefined value 'reader' to indicate that a user has the right to read the controlled object.
   */
  public static final String VALUE_READER = getConstant("VALUE_READER");

  /**
   * Predefined value 'writer' to indicate that a user has the right to read and modify the controlled object.
   */
  public static final String VALUE_WRITER = getConstant("VALUE_WRITER");

  /**
   * Constructs a role.
   * @return An AclRole object.
   */
  public static native AclRole newInstance() /*-{
    return new $wnd.google.gdata.acl.AclRole();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.acl.AclRole[name];
  }-*/;

  protected AclRole() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}