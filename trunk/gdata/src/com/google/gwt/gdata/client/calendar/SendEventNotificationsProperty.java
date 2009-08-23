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
 * Describes whether to send event notifications to other participants of the
 * event.
 */
public class SendEventNotificationsProperty extends JavaScriptObject {

  /**
   * Constructs a send event notifications property.
   */
  public static native SendEventNotificationsProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.SendEventNotificationsProperty();
  }-*/;

  protected SendEventNotificationsProperty() { }

  /**
   * Returns whether to send event notifications to other participants of the
   * event. This attribute is required.
   * 
   * @return Whether to send event notifications to other participants of the
   * event.
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets whether to send event notifications to other participants of the
   * event. This attribute is required.
   * 
   * @param value Whether to send event notifications to other participants of
   * the event.
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(value);
  }-*/;

}