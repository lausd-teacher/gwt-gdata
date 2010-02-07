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
public class AccountEntry
    extends com.google.gwt.gdata.client.Entry<AccountEntry> {

  /**
   * Analytics account entry.
   */
  public static final String KIND_ANALYTICS_ACCOUNT = 
    getConstant("KIND_ANALYTICS_ACCOUNT");

  /**
   * Constructs an account entry.
   * @return An AccountEntry object.
   */
  public static native AccountEntry newInstance() /*-{
    return new $wnd.google.gdata.analytics.AccountEntry();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.AccountEntry[name];
  }-*/;

  protected AccountEntry() { }

  /**
   * Adds a new custom variable.
   * 
   * @param customVariable Custom variable to add.
   */
  public final native void addCustomVariable(CustomVariable customVariable) /*-{
    this.addCustomVariable(customVariable);
  }-*/;

  /**
   * Adds a new goal.
   * 
   * @param goal Goal to add.
   */
  public final native void addGoal(Goal goal) /*-{
    this.addGoal(goal);
  }-*/;

  /**
   * Adds a new property.
   * 
   * @param property Property to add.
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(property);
  }-*/;

  /**
   * Returns the custom variables.
   * 
   * @return Custom variables.
   */
  public final native CustomVariable[] getCustomVariables() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCustomVariables());
  }-*/;

  /**
   * Returns the goals.
   * 
   * @return Goals.
   */
  public final native Goal[] getGoals() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getGoals());
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
   * Returns the data source ID. This element is required.
   * 
   * @return Data source ID.
   */
  public final native TableId getTableId() /*-{
    return this.getTableId();
  }-*/;

  /**
   * Sets the custom variables.
   * 
   * @param customVariables Custom variables, where each custom variable is
   * added using addCustomVariable().
   */
  public final native void setCustomVariables(CustomVariable[] customVariables) /*-{
    this.setCustomVariables(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(customVariables)
    );
  }-*/;

  /**
   * Sets the goals.
   * 
   * @param goals Goals, where each goal is added using addGoal().
   */
  public final native void setGoals(Goal[] goals) /*-{
    this.setGoals(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(goals)
    );
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
  
}