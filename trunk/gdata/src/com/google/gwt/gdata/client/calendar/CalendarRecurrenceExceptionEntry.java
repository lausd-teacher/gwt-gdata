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
 * Describes an entry used by a Calendar recurrence exception entry link.
 */
public class CalendarRecurrenceExceptionEntry extends RecurrenceExceptionEntry {

  /**
   * Constructs a Calendar recurrence exception entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, comments, content, contributors, eventStatus, id, links, originalEvent, published, sequence, title, transparency, uid, updated, visibility, when, where, and who.
   */
  public static native CalendarRecurrenceExceptionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarRecurrenceExceptionEntry(
      params
    );
  }-*/;

  protected CalendarRecurrenceExceptionEntry() { }

  /**
   * Returns the sequence number property. This element is optional.
   * 
   * @return Sequence number property or undefined for none.
   */
  public final native SequenceNumberProperty getSequence() /*-{
    return this.getSequence();
  }-*/;

  /**
   * Returns the ical export UID property. This element is optional.
   * 
   * @return Ical export UID property or undefined for none.
   */
  public final native IcalUIDProperty getUid() /*-{
    return this.getUid();
  }-*/;

  /**
   * Sets the sequence number property. This element is optional.
   */
  public final native void setSequence() /*-{
    this.setSequence();
  }-*/;

  /**
   * Sets the sequence number property. This element is optional.
   * 
   * @param sequence Sequence number property, or object to use as a parameter to the google.gdata.calendar.SequenceNumberProperty constructor, or undefined for none.
   */
  public final native void setSequence(SequenceNumberProperty sequence) /*-{
    this.setSequence(
      sequence
    );
  }-*/;

  /**
   * Sets the ical export UID property. This element is optional.
   */
  public final native void setUid() /*-{
    this.setUid();
  }-*/;

  /**
   * Sets the ical export UID property. This element is optional.
   * 
   * @param uid Ical export UID property, or object to use as a parameter to the google.gdata.calendar.IcalUIDProperty constructor, or undefined for none.
   */
  public final native void setUid(IcalUIDProperty uid) /*-{
    this.setUid(
      uid
    );
  }-*/;

}
