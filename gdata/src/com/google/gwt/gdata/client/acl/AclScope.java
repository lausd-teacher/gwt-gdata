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
 * Describes the scope of an entry in an access control list.
 */
public class AclScope extends JavaScriptObject {

  /**
   * Default scope.
   */
  public static final String TYPE_DEFAULT = getConstant("TYPE_DEFAULT");

  /**
   * Domain scope.
   */
  public static final String TYPE_DOMAIN = getConstant("TYPE_DOMAIN");

  /**
   * Group scope.
   */
  public static final String TYPE_GROUP = getConstant("TYPE_GROUP");

  /**
   * User scope.
   */
  public static final String TYPE_USER = getConstant("TYPE_USER");

  /**
   * Constructs a scope.
   * @return An AclScope object.
   */
  public static native AclScope newInstance() /*-{
    return new $wnd.google.gdata.acl.AclScope();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.acl.AclScope[name];
  }-*/;

  protected AclScope() { }

  /**
   * Returns the type. This attribute is required.
   * 
   * @return Type.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the type. This attribute is required.
   * 
   * @param type Type.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}