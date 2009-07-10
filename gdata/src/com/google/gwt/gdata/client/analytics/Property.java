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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Generic account-level property.
 */
public class Property extends JavaScriptObject {

  /**
   * Constructs a property.
   * @return A Property object.
   */
  public static native Property newInstance() /*-{
    return new $wnd.google.gdata.analytics.Property();
  }-*/;

  protected Property() { }

  /**
   * Returns the name of the property. This attribute is required.
   * 
   * @return Name of the property.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the value of the property. This attribute is required.
   * 
   * @return Value of the property.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the name of the property. This attribute is required.
   * 
   * @param name Name of the property.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the value of the property. This attribute is required.
   * 
   * @param value Value of the property.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}