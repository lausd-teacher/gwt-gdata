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

/**
 * Describes a Calendar Settings property entry.
 */
public class SettingsEntry
    extends com.google.gwt.gdata.client.Entry<SettingsEntry> {

  /**
   * Constructs a Calendar Settings property entry.
   * @return A SettingsEntry object.
   */
  public static native SettingsEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.SettingsEntry();
  }-*/;

  protected SettingsEntry() { }

  /**
   * Returns the settings property. This element is required.
   * 
   * @return Settings property.
   */
  public final native SettingsProperty getSettingsProperty() /*-{
    return this.getSettingsProperty();
  }-*/;

  /**
   * Sets the settings property. This element is required.
   * 
   * @param settingsProperty Settings property.
   */
  public final native void setSettingsProperty(
      SettingsProperty settingsProperty) /*-{
    this.setSettingsProperty(settingsProperty);
  }-*/;

}