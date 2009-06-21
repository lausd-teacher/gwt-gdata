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
public class CustomProperty extends JavaScriptObject {

  /**
   * Constructs a custom property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CustomProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.CustomProperty(
      params
    );
  }-*/;

  /**
   * Constructs a custom property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CustomProperty newInstance() /*-{
    return new $wnd.google.gdata.CustomProperty();
  }-*/;

  protected CustomProperty() { }

  /**
   * Returns the can be a URI to indicate a specific ontology.
   * 
   * @return
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the datatype such as string, integer, and date, or an ontology-specific URI.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the units of data - can also be a URI to indicate a specific ontology.
   * 
   * @return
   */
  public final native String getUnit() /*-{
    return this.getUnit();
  }-*/;

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the can be a URI to indicate a specific ontology.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the can be a URI to indicate a specific ontology.
   * 
   * @param name
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the datatype such as string, integer, and date, or an ontology-specific URI.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the datatype such as string, integer, and date, or an ontology-specific URI.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the units of data - can also be a URI to indicate a specific ontology.
   * 
   * @param unit
   */
  public final native void setUnit(String unit) /*-{
    this.setUnit(
      unit
    );
  }-*/;

  /**
   * Sets the units of data - can also be a URI to indicate a specific ontology.
   * 
   * @param unit
   */
  public final native void setUnit() /*-{
    this.setUnit();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
