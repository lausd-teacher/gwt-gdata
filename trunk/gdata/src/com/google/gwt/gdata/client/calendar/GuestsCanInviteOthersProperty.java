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
 * Comment unavailable.
 */
public class GuestsCanInviteOthersProperty extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.GuestsCanInviteOthersProperty;
  }-*/;

  /**
   * Constructs a guests can invite others property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GuestsCanInviteOthersProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.GuestsCanInviteOthersProperty(
      params
    );
  }-*/;

  /**
   * Constructs a guests can invite others property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GuestsCanInviteOthersProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.GuestsCanInviteOthersProperty();
  }-*/;

  protected GuestsCanInviteOthersProperty() { }

  /**
   * Returns value.
   * 
   * @return
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets value.
   * 
   * @param value
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
