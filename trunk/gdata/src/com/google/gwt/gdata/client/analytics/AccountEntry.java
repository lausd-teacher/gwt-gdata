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
 * Entry element for account feed.
 */
public class AccountEntry extends com.google.gwt.gdata.client.Entry<AccountEntry> {

  /**
   * Constructs an account entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: id, links, properties, tableId, title, and updated.
   */
  public static native AccountEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.AccountEntry(
      params
    );
  }-*/;

  protected AccountEntry() { }

  /**
   * Adds a new property.
   * 
   * @param property Property to add, or object to use as a parameter to the google.gdata.analytics.Property constructor.
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(
      property
    );
  }-*/;

  /**
   * Returns the properties.
   * 
   * @return Properties.
   */
  public final native JsArray<Property> getProperties() /*-{
    return this.getProperties();
  }-*/;

  /**
   * Gets the value of the named account property.
   * 
   * @param name The name of the property to retrieve.
   * 
   * @return The corresponding property value, or null if the named property is not present in this entry.
   */
  public final native String getPropertyValue(String name) /*-{
    return this.getPropertyValue(
      name
    );
  }-*/;

  /**
   * Returns the data source ID. This element is required.
   * 
   * @return Data source ID or undefined for none.
   */
  public final native TableId getTableId() /*-{
    return this.getTableId();
  }-*/;

  /**
   * Sets the properties.
   */
  public final native void setProperties() /*-{
    this.setProperties();
  }-*/;

  /**
   * Sets the properties.
   * 
   * @param properties Properties, where each property is added using the addProperty() function, or undefined to clear the properties.
   */
  public final native void setProperties(JsArray<Property> properties) /*-{
    this.setProperties(
      properties
    );
  }-*/;

  /**
   * Sets the data source ID. This element is required.
   */
  public final native void setTableId() /*-{
    this.setTableId();
  }-*/;

  /**
   * Sets the data source ID. This element is required.
   * 
   * @param tableId Data source ID, or object to use as a parameter to the google.gdata.analytics.TableId constructor, or undefined for none.
   */
  public final native void setTableId(TableId tableId) /*-{
    this.setTableId(
      tableId
    );
  }-*/;

}
