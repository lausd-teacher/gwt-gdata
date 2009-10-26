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

/**
 * Entry element for account feed.
 */
public class AccountEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs an account entry.
   * @return An AccountEntry object.
   */
  public static native AccountEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.AccountEntry();
  }-*/;

  protected AccountEntry() { }

  /**
   * Adds a new property.
   * 
   * @param property Property to add.
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(property);
  }-*/;

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(AccountEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the properties.
   * 
   * @return Properties.
   */
  public final native Property[] getProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getProperties());
  }-*/;

  /**
   * Gets the value of the named account property.
   * 
   * @param name The name of the property to retrieve.
   * 
   * @return The corresponding property value, or null if the named property is
   * not present in this entry.
   */
  public final native String getPropertyValue(String name) /*-{
    return this.getPropertyValue(name);
  }-*/;
  
  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final AccountEntry getSelf(AccountEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Returns the data source ID. This element is required.
   * 
   * @return Data source ID.
   */
  public final native TableId getTableId() /*-{
    return this.getTableId();
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
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(AccountEntryCallback callback) {
    this.update(callback);
  }
  
}