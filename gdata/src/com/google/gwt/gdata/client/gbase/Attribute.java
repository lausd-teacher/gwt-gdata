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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes an arbitrary attribute in a Google Base item.
 */
public class Attribute extends JavaScriptObject {

  /**
   * Constructs an attribute.
   * @return An Attribute object.
   */
  public static native Attribute newInstance() /*-{
    return new $wnd.google.gdata.gbase.Attribute();
  }-*/;

  protected Attribute() { }

  /**
   * Returns the type of the attribute. This attribute is required.
   * 
   * @return Type of the attribute.
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
   * Sets the type of the attribute. This attribute is required.
   * 
   * @param type Type of the attribute.
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