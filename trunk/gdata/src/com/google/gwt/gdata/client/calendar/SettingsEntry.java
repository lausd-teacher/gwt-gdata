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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a Calendar Settings property entry.
 */
public class SettingsEntry extends com.google.gwt.gdata.client.Entry<SettingsEntry> {

  /**
   * Constructs a Calendar Settings property entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, id, settingsProperty, title, and updated.
   */
  public static native SettingsEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.SettingsEntry(
      params
    );
  }-*/;

  protected SettingsEntry() { }

  /**
   * Returns the settings property. This element is required.
   * 
   * @return Settings property or undefined for none.
   */
  public final native SettingsProperty getSettingsProperty() /*-{
    return this.getSettingsProperty();
  }-*/;

  /**
   * Sets the settings property. This element is required.
   */
  public final native void setSettingsProperty() /*-{
    this.setSettingsProperty();
  }-*/;

  /**
   * Sets the settings property. This element is required.
   * 
   * @param settingsProperty Settings property, or object to use as a parameter to the google.gdata.calendar.SettingsProperty constructor, or undefined for none.
   */
  public final native void setSettingsProperty(SettingsProperty settingsProperty) /*-{
    this.setSettingsProperty(
      settingsProperty
    );
  }-*/;

}
