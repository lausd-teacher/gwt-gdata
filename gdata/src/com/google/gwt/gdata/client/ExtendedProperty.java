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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Stores a limited amount of custom data as an auxiliary property of the enclosing entity.
 */
public class ExtendedProperty extends JavaScriptObject {

  /**
   * Shared extended property.
   */
  public static final String REALM_SHARED = getConstant("REALM_SHARED");

  /**
   * Constructs an extended property using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: name, realm, and value.
   */
  public static native ExtendedProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.ExtendedProperty(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.ExtendedProperty[name];
  }-*/;

  protected ExtendedProperty() { }

  /**
   * Returns the name of the property expressed as a URI. This attribute is required.
   * 
   * @return Name of the property expressed as a URI or undefined for none.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the limit on who may see and modify this extended property. This attribute is optional.
   * 
   * @return Limit on who may see and modify this extended property or undefined for none.
   */
  public final native String getRealm() /*-{
    return this.getRealm();
  }-*/;

  /**
   * Returns the property value. This attribute is optional.
   * 
   * @return Property value or undefined for none.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the name of the property expressed as a URI. This attribute is required.
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the name of the property expressed as a URI. This attribute is required.
   * 
   * @param name Name of the property expressed as a URI or undefined for none.
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the limit on who may see and modify this extended property. This attribute is optional.
   */
  public final native void setRealm() /*-{
    this.setRealm();
  }-*/;

  /**
   * Sets the limit on who may see and modify this extended property. This attribute is optional.
   * 
   * @param realm Limit on who may see and modify this extended property or undefined for none.
   */
  public final native void setRealm(String realm) /*-{
    this.setRealm(
      realm
    );
  }-*/;

  /**
   * Sets the property value. This attribute is optional.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the property value. This attribute is optional.
   * 
   * @param value Property value or undefined for none.
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
