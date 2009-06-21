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
import com.google.gwt.core.client.JsArray;

/**
 * Comment unavailable.
 */
public class AccountEntry extends com.google.gwt.gdata.client.Entry<AccountEntry> {

  /**
   * Constructs an account entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccountEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.AccountEntry(
      params
    );
  }-*/;

  /**
   * Constructs an account entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccountEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.AccountEntry();
  }-*/;

  protected AccountEntry() { }

  /**
   * Adds a new property.
   * 
   * @param property
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(
      property
    );
  }-*/;

  /**
   * Returns the properties.
   * 
   * @return
   */
  public final native JsArray<Property> getProperties() /*-{
    return this.getProperties();
  }-*/;

  /**
   * Gets the value of the named account property.
   * 
   * @param name
   * 
   * @return
   */
  public final native String getPropertyValue(String name) /*-{
    return this.getPropertyValue(
      name
    );
  }-*/;

  /**
   * Returns the data source ID.
   * 
   * @return
   */
  public final native TableId getTableId() /*-{
    return this.getTableId();
  }-*/;

  /**
   * Sets the properties.
   * 
   * @param properties
   */
  public final native void setProperties(JsArray<Property> properties) /*-{
    this.setProperties(
      properties
    );
  }-*/;

  /**
   * Sets the properties.
   * 
   * @param properties
   */
  public final native void setProperties() /*-{
    this.setProperties();
  }-*/;

  /**
   * Sets the data source ID.
   * 
   * @param tableId
   */
  public final native void setTableId(TableId tableId) /*-{
    this.setTableId(
      tableId
    );
  }-*/;

  /**
   * Sets the data source ID.
   * 
   * @param tableId
   */
  public final native void setTableId() /*-{
    this.setTableId();
  }-*/;

}
