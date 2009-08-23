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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

import java.util.Date;

/**
 * Describes a period of time.
 */
public class When extends JavaScriptObject {

  /**
   * Constructs a time period description.
   */
  public static native When newInstance() /*-{
    return new $wnd.google.gdata.When();
  }-*/;

  protected When() { }

  /**
   * Adds a new event reminder.
   * 
   * @param reminder Event reminder to add.
   */
  public final native void addReminder(Reminder reminder) /*-{
    this.addReminder(reminder);
  }-*/;

  /**
   * Returns the event end time. This attribute is optional.
   * 
   * @return Event end time.
   */
  public final native DateTime getEndTime() /*-{
    return this.getEndTime();
  }-*/;

  /**
   * Returns the event reminders.
   * 
   * @return Event reminders.
   */
  public final native Reminder[] getReminder() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getReminder());
  }-*/;

  /**
   * Returns the event start time. This attribute is required.
   * 
   * @return Event start time.
   */
  public final native DateTime getStartTime() /*-{
    return this.getStartTime();
  }-*/;

  /**
   * Returns the string description of the event times.
   * This attribute is optional.
   * 
   * @return String description of the event times.
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the event end time. This attribute is optional.
   * 
   * @param endTime Event end time.
   */
  public final native void setEndTime(Date endTime) /*-{
    this.setEndTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(endTime))
    );
  }-*/;

  /**
   * Sets the event end time. This attribute is optional.
   * 
   * @param endTime Event end time.
   */
  public final native void setEndTime(DateTime endTime) /*-{
    this.setEndTime(endTime);
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminder Event reminders, where each event reminder is added using
   * addReminder().
   */
  public final native void setReminder(Reminder[] reminder) /*-{
    this.setReminder(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(reminder)
    );
  }-*/;

  /**
   * Sets the event start time. This attribute is required.
   * 
   * @param startTime Event start time.
   */
  public final native void setStartTime(Date startTime) /*-{
    this.setStartTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(startTime))
    );
  }-*/;

  /**
   * Sets the event start time. This attribute is required.
   * 
   * @param startTime Event start time.
   */
  public final native void setStartTime(DateTime startTime) /*-{
    this.setStartTime(startTime);
  }-*/;

  /**
   * Sets the string description of the event times.
   * This attribute is optional.
   * 
   * @param valueString String description of the event times.
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(valueString);
  }-*/;

}