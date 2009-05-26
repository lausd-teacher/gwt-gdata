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
 * Comment unavailable.
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
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.GmAttribute;
  }-*/;

  /**
   * Constructs a list of attribute for an item type using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmAttribute newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.GmAttribute(
      params
    );
  }-*/;

  /**
   * Constructs a list of attribute for an item type using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmAttribute newInstance() /*-{
    return new $wnd.google.gdata.gbase.GmAttribute();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.GmAttribute[name];
  }-*/;

  protected GmAttribute() { }

  /**
   * Adds a new gm value.
   * 
   * @param value
   */
  public final native void addValue(JavaScriptObject value) /*-{
    this.addValue(
      value
    );
  }-*/;

  /**
   * Adds a new gm value.
   * 
   * @param value
   */
  public final native void addValue(GmValue value) /*-{
    this.addValue(
      value
    );
  }-*/;

  /**
   * Returns the count.
   * 
   * @return
   */
  public final native double getCount() /*-{
    return this.getCount();
  }-*/;

  /**
   * Returns the importance.
   * 
   * @return
   */
  public final native String getImportance() /*-{
    return this.getImportance();
  }-*/;

  /**
   * Returns the name.
   * 
   * @return
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the type.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the gm values.
   * 
   * @return
   */
  public final native GmValue[] getValues() /*-{
    return this.getValues();
  }-*/;

  /**
   * Sets the count.
   * 
   * @param count
   */
  public final native void setCount(double count) /*-{
    this.setCount(
      count
    );
  }-*/;

  /**
   * Sets the count.
   * 
   * @param count
   */
  public final native void setCount() /*-{
    this.setCount();
  }-*/;

  /**
   * Sets the importance.
   * 
   * @param importance
   */
  public final native void setImportance(String importance) /*-{
    this.setImportance(
      importance
    );
  }-*/;

  /**
   * Sets the importance.
   * 
   * @param importance
   */
  public final native void setImportance() /*-{
    this.setImportance();
  }-*/;

  /**
   * Sets the name.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the name.
   * 
   * @param name
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the type.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the gm values.
   * 
   * @param values
   */
  public final native void setValues(JavaScriptObject[] values) /*-{
    this.setValues(
      values
    );
  }-*/;

  /**
   * Sets the gm values.
   * 
   * @param values
   */
  public final native void setValues() /*-{
    this.setValues();
  }-*/;

  /**
   * Sets the gm values.
   * 
   * @param values
   */
  public final native void setValues(GmValue[] values) /*-{
    this.setValues(
      values
    );
  }-*/;

}
