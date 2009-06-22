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
import com.google.gwt.core.client.JsArray;

/**
 * Describes a list of attribute for an item type.
 */
public class GmAttribute extends JavaScriptObject {

  /**
   * The attribute is optional.
   */
  public static final String IMPORTANCE_OPTIONAL = getConstant("IMPORTANCE_OPTIONAL");

  /**
   * The attribute is recommended.
   */
  public static final String IMPORTANCE_RECOMMENDED = getConstant("IMPORTANCE_RECOMMENDED");

  /**
   * The attribute is required.
   */
  public static final String IMPORTANCE_REQUIRED = getConstant("IMPORTANCE_REQUIRED");

  /**
   * Constructs a list of attribute for an item type using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: count, importance, name, type, and values.
   */
  public static native GmAttribute newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.GmAttribute(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.GmAttribute[name];
  }-*/;

  protected GmAttribute() { }

  /**
   * Adds a new gm value.
   * 
   * @param value Gm value to add, or object to use as a parameter to the google.gdata.gbase.GmValue constructor.
   */
  public final native void addValue(GmValue value) /*-{
    this.addValue(
      value
    );
  }-*/;

  /**
   * Returns the count. This attribute is optional.
   * 
   * @return Count or undefined for none.
   */
  public final native double getCount() /*-{
    return this.getCount();
  }-*/;

  /**
   * Returns the importance. This attribute is optional.
   * 
   * @return Importance or undefined for none.
   */
  public final native String getImportance() /*-{
    return this.getImportance();
  }-*/;

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name or undefined for none.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the type. This attribute is required.
   * 
   * @return Type or undefined for none.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the gm values.
   * 
   * @return Gm values.
   */
  public final native JsArray<GmValue> getValues() /*-{
    return this.getValues();
  }-*/;

  /**
   * Sets the count. This attribute is optional.
   */
  public final native void setCount() /*-{
    this.setCount();
  }-*/;

  /**
   * Sets the count. This attribute is optional.
   * 
   * @param count Count or undefined for none.
   */
  public final native void setCount(double count) /*-{
    this.setCount(
      count
    );
  }-*/;

  /**
   * Sets the importance. This attribute is optional.
   */
  public final native void setImportance() /*-{
    this.setImportance();
  }-*/;

  /**
   * Sets the importance. This attribute is optional.
   * 
   * @param importance Importance or undefined for none.
   */
  public final native void setImportance(String importance) /*-{
    this.setImportance(
      importance
    );
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
   * Sets the type. This attribute is required.
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the type. This attribute is required.
   * 
   * @param type Type or undefined for none.
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the gm values.
   */
  public final native void setValues() /*-{
    this.setValues();
  }-*/;

  /**
   * Sets the gm values.
   * 
   * @param values Gm values, where each gm value is added using the addValue() function, or undefined to clear the gm values.
   */
  public final native void setValues(JsArray<GmValue> values) /*-{
    this.setValues(
      values
    );
  }-*/;

}
