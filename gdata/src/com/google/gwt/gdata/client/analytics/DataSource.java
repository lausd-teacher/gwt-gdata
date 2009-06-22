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
 * Describes a data source.
 */
public class DataSource extends JavaScriptObject {

  /**
   * Constructs a data source using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: properties, tableId, and tableName.
   */
  public static native DataSource newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.DataSource(
      params
    );
  }-*/;

  protected DataSource() { }

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
   * Gets the property with the given name from this data source.
   * 
   * @param name The name of the property to retrieve
   * 
   * @return The value of the named property, or null if the named property is not present in this data source
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
   * Returns the table name. This element is required.
   * 
   * @return Table name or undefined for none.
   */
  public final native TableName getTableName() /*-{
    return this.getTableName();
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

  /**
   * Sets the table name. This element is required.
   */
  public final native void setTableName() /*-{
    this.setTableName();
  }-*/;

  /**
   * Sets the table name. This element is required.
   * 
   * @param tableName Table name, or object to use as a parameter to the google.gdata.analytics.TableName constructor, or undefined for none.
   */
  public final native void setTableName(TableName tableName) /*-{
    this.setTableName(
      tableName
    );
  }-*/;

}
