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
 * Comment unavailable.
 */
public class ExtendedProperty extends JavaScriptObject {

  /**
   * Shared extended property.
   */
  public static final String REALM_SHARED = getConstant("REALM_SHARED");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.ExtendedProperty;
  }-*/;

  /**
   * Constructs an extended property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ExtendedProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.ExtendedProperty(
      params
    );
  }-*/;

  /**
   * Constructs an extended property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ExtendedProperty newInstance() /*-{
    return new $wnd.google.gdata.ExtendedProperty();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.ExtendedProperty[name];
  }-*/;

  protected ExtendedProperty() { }

  /**
   * Returns the name of the property expressed as a URI.
   * 
   * @return
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the limit on who may see and modify this extended property.
   * 
   * @return
   */
  public final native String getRealm() /*-{
    return this.getRealm();
  }-*/;

  /**
   * Returns the property value.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the name of the property expressed as a URI.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the name of the property expressed as a URI.
   * 
   * @param name
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the limit on who may see and modify this extended property.
   * 
   * @param realm
   */
  public final native void setRealm(String realm) /*-{
    this.setRealm(
      realm
    );
  }-*/;

  /**
   * Sets the limit on who may see and modify this extended property.
   * 
   * @param realm
   */
  public final native void setRealm() /*-{
    this.setRealm();
  }-*/;

  /**
   * Sets the property value.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the property value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
