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
 * Describes the UID in the ical export of the event.
 * The value can be an arbitrary string and is described in section 4.8.4.7 of
 * RFC 2445. This value is different from the value of the event ID. Currently
 * a read-only entry.
 */
public class IcalUIDProperty extends JavaScriptObject {

  /**
   * Constructs an ical export UID property.
   * @return An IcalUIDProperty object.
   */
  public static native IcalUIDProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.IcalUIDProperty();
  }-*/;

  protected IcalUIDProperty() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}