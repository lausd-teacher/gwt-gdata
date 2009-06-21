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
import com.google.gwt.core.client.JsArray;

import java.util.Date;

/**
 * Comment unavailable.
 */
public class When extends JavaScriptObject {

  /**
   * Constructs a time period description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native When newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.When(
      params
    );
  }-*/;

  /**
   * Constructs a time period description using an object parameter whose property names match the setter method to use for each property.
   */
  public static native When newInstance() /*-{
    return new $wnd.google.gdata.When();
  }-*/;

  protected When() { }

  /**
   * Adds a new event reminder.
   * 
   * @param reminder
   */
  public final native void addReminder(Reminder reminder) /*-{
    this.addReminder(
      reminder
    );
  }-*/;

  /**
   * Returns the event end time.
   * 
   * @return
   */
  public final native DateTime getEndTime() /*-{
    return this.getEndTime();
  }-*/;

  /**
   * Returns the event reminders.
   * 
   * @return
   */
  public final native JsArray<Reminder> getReminder() /*-{
    return this.getReminder();
  }-*/;

  /**
   * Returns the event start time.
   * 
   * @return
   */
  public final native DateTime getStartTime() /*-{
    return this.getStartTime();
  }-*/;

  /**
   * Returns the string description of the event times.
   * 
   * @return
   */
  public final native String getValueString() /*-{
    return this.getValueString();
  }-*/;

  /**
   * Sets the event end time.
   * 
   * @param endTime
   */
  public final native void setEndTime(Date endTime) /*-{
    this.setEndTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(endTime))
    );
  }-*/;

  /**
   * Sets the event end time.
   * 
   * @param endTime
   */
  public final native void setEndTime() /*-{
    this.setEndTime();
  }-*/;

  /**
   * Sets the event end time.
   * 
   * @param endTime
   */
  public final native void setEndTime(DateTime endTime) /*-{
    this.setEndTime(
      endTime
    );
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminder
   */
  public final native void setReminder(JsArray<Reminder> reminder) /*-{
    this.setReminder(
      reminder
    );
  }-*/;

  /**
   * Sets the event reminders.
   * 
   * @param reminder
   */
  public final native void setReminder() /*-{
    this.setReminder();
  }-*/;

  /**
   * Sets the event start time.
   * 
   * @param startTime
   */
  public final native void setStartTime(Date startTime) /*-{
    this.setStartTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(startTime))
    );
  }-*/;

  /**
   * Sets the event start time.
   * 
   * @param startTime
   */
  public final native void setStartTime() /*-{
    this.setStartTime();
  }-*/;

  /**
   * Sets the event start time.
   * 
   * @param startTime
   */
  public final native void setStartTime(DateTime startTime) /*-{
    this.setStartTime(
      startTime
    );
  }-*/;

  /**
   * Sets the string description of the event times.
   * 
   * @param valueString
   */
  public final native void setValueString(String valueString) /*-{
    this.setValueString(
      valueString
    );
  }-*/;

  /**
   * Sets the string description of the event times.
   * 
   * @param valueString
   */
  public final native void setValueString() /*-{
    this.setValueString();
  }-*/;

}
