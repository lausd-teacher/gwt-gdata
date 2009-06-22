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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a single web content gadget preference.
 */
public class WebContentGadgetPref extends JavaScriptObject {

  /**
   * Constructs a web content gadget preference using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: name and value.
   */
  public static native WebContentGadgetPref newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.WebContentGadgetPref(
      params
    );
  }-*/;

  protected WebContentGadgetPref() { }

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name or undefined for none.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value or undefined for none.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the name. This attribute is required.
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the name. This attribute is required.
   * 
   * @param name Name or undefined for none.
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the value. This attribute is required.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value or undefined for none.
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
