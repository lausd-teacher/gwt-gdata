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
import com.google.gwt.gdata.client.RecurrenceExceptionEntry;

/**
 * Comment unavailable.
 */
public class CalendarRecurrenceExceptionEntry extends RecurrenceExceptionEntry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarRecurrenceExceptionEntry;
  }-*/;

  /**
   * Constructs a Calendar recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarRecurrenceExceptionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarRecurrenceExceptionEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarRecurrenceExceptionEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarRecurrenceExceptionEntry();
  }-*/;

  protected CalendarRecurrenceExceptionEntry() { }

  /**
   * Returns the sequence number property.
   * 
   * @return
   */
  public final native SequenceNumberProperty getSequence() /*-{
    return this.getSequence();
  }-*/;

  /**
   * Returns the ical export UID property.
   * 
   * @return
   */
  public final native IcalUIDProperty getUid() /*-{
    return this.getUid();
  }-*/;

  /**
   * Sets the sequence number property.
   * 
   * @param sequence
   */
  public final native void setSequence(SequenceNumberProperty sequence) /*-{
    this.setSequence(
      sequence
    );
  }-*/;

  /**
   * Sets the sequence number property.
   * 
   * @param sequence
   */
  public final native void setSequence() /*-{
    this.setSequence();
  }-*/;

  /**
   * Sets the ical export UID property.
   * 
   * @param uid
   */
  public final native void setUid(IcalUIDProperty uid) /*-{
    this.setUid(
      uid
    );
  }-*/;

  /**
   * Sets the ical export UID property.
   * 
   * @param uid
   */
  public final native void setUid() /*-{
    this.setUid();
  }-*/;

}