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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Contact's gender.
 */
public class Gender extends JavaScriptObject {

  /**
   * Female gender.
   */
  public static final String VALUE_FEMALE = getConstant("VALUE_FEMALE");

  /**
   * Male gender.
   */
  public static final String VALUE_MALE = getConstant("VALUE_MALE");

  /**
   * Constructs a gender.
   * 
   * @return A Gender object.
   */
  public static native Gender newInstance() /*-{
    return new $wnd.google.gdata.contacts.Gender();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.Gender[name];
  }-*/;

  protected Gender() { }

  /**
   * Returns the Gender. This attribute is required.
   * 
   * @return Gender.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the Gender. This attribute is required.
   * 
   * @param value Gender.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}