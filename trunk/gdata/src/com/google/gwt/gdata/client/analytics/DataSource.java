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
 * Describes a data source.
 */
public class DataSource extends JavaScriptObject {

  /**
   * Constructs a data source.
   * @return A DataSource object.
   */
  public static native DataSource newInstance() /*-{
    return new $wnd.google.gdata.analytics.DataSource();
  }-*/;

  protected DataSource() { }

  /**
   * Adds a new property.
   * 
   * @param property Property to add.
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(property);
  }-*/;

  /**
   * Returns the properties.
   * 
   * @return Properties.
   */
  public final native Property[] getProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getProperties());
  }-*/;

  /**
   * Gets the property with the given name from this data source.
   * 
   * @param name The name of the property to retrieve
   * 
   * @return The value of the named property.
   */
  public final native String getPropertyValue(String name) /*-{
    return this.getPropertyValue(name);
  }-*/;

  /**
   * Returns the data source ID. This element is required.
   * 
   * @return Data source ID.
   */
  public final native TableId getTableId() /*-{
    return this.getTableId();
  }-*/;

  /**
   * Returns the table name. This element is required.
   * 
   * @return Table name.
   */
  public final native TableName getTableName() /*-{
    return this.getTableName();
  }-*/;

  /**
   * Sets the properties.
   * 
   * @param properties Properties, where each property is added using
   * addProperty().
   */
  public final native void setProperties(Property[] properties) /*-{
    this.setProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(properties)
    );
  }-*/;
  
  /**
   * Sets the data source ID. This element is required.
   * 
   * @param tableId Data source ID.
   */
  public final native void setTableId(TableId tableId) /*-{
    this.setTableId(tableId);
  }-*/;

  /**
   * Sets the table name. This element is required.
   * 
   * @param tableName Table name.
   */
  public final native void setTableName(TableName tableName) /*-{
    this.setTableName(tableName);
  }-*/;

}