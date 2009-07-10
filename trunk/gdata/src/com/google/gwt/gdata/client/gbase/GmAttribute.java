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
   * Constructs a list of attribute for an item type.
   * A GmAttribute object.
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
   * @param value Gm value to add.
   */
  public final native void addValue(GmValue value) /*-{
    this.addValue(value);
  }-*/;

  /**
   * Returns the count. This attribute is optional.
   * 
   * @return Count.
   */
  public final native double getCount() /*-{
    return this.getCount();
  }-*/;

  /**
   * Returns the importance. This attribute is optional.
   * 
   * @return Importance.
   */
  public final native String getImportance() /*-{
    return this.getImportance();
  }-*/;

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the type. This attribute is required.
   * 
   * @return Type.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the gm values.
   * 
   * @return Gm values.
   */
  public final native GmValue[] getValues() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getValues());
  }-*/;

  /**
   * Sets the count. This attribute is optional.
   * 
   * @param count Count.
   */
  public final native void setCount(double count) /*-{
    this.setCount(count);
  }-*/;

  /**
   * Sets the importance. This attribute is optional.
   * 
   * @param importance Importance.
   */
  public final native void setImportance(String importance) /*-{
    this.setImportance(importance);
  }-*/;

  /**
   * Sets the name. This attribute is required.
   * 
   * @param name Name.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
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
   * Sets the gm values.
   * 
   * @param values Gm values, where each gm value is added using addValue().
   */
  public final native void setValues(GmValue[] values) /*-{
    this.setValues(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(values)
    );
  }-*/;

}