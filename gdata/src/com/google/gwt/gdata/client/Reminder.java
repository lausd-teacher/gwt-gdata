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
 * Describes a reminder on an event.
 */
public class Reminder extends JavaScriptObject {

  /**
   * Causes an alert to appear when a user is viewing the calendar in a browser.
   */
  public static final String METHOD_ALERT = getConstant("METHOD_ALERT");

  /**
   * All reminder methods.
   */
  public static final String METHOD_ALL = getConstant("METHOD_ALL");

  /**
   * Sends the user an email message.
   */
  public static final String METHOD_EMAIL = getConstant("METHOD_EMAIL");

  /**
   * No reminder methods.
   */
  public static final String METHOD_NONE = getConstant("METHOD_NONE");

  /**
   * Sends the user an SMS text message.
   */
  public static final String METHOD_SMS = getConstant("METHOD_SMS");

  /**
   * Constructs a reminder.
   * @return A Reminder object.
   */
  public static native Reminder newInstance() /*-{
    return new $wnd.google.gdata.Reminder();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Reminder[name];
  }-*/;

  protected Reminder() { }

  /**
   * Returns the absolute time of the reminder. This attribute is optional.
   * 
   * @return Absolute time of the reminder.
   */
  public final native DateTime getAbsoluteTime() /*-{
    return this.getAbsoluteTime();
  }-*/;

  /**
   * Returns the number of days before the start time. This attribute is optional.
   * 
   * @return Number of days before the start time.
   */
  public final native double getDays() /*-{
    return this.getDays();
  }-*/;

  /**
   * Returns the number of hours before the start time. This attribute is optional.
   * 
   * @return Number of hours before the start time.
   */
  public final native double getHours() /*-{
    return this.getHours();
  }-*/;

  /**
   * Returns the method. This attribute is optional.
   * 
   * @return Method.
   */
  public final native String getMethod() /*-{
    return this.getMethod();
  }-*/;

  /**
   * Returns the number of minute before the start times. This attribute is optional.
   * 
   * @return Number of minute before the start times.
   */
  public final native double getMinutes() /*-{
    return this.getMinutes();
  }-*/;


  /**
   * Sets the absolute time of the reminder. This attribute is optional.
   * 
   * @param absoluteTime Absolute time of the reminder.
   */
  public final native void setAbsoluteTime(Date absoluteTime) /*-{
    this.setAbsoluteTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(absoluteTime))
    );
  }-*/;

  /**
   * Sets the absolute time of the reminder. This attribute is optional.
   * 
   * @param absoluteTime Absolute time of the reminder.
   */
  public final native void setAbsoluteTime(DateTime absoluteTime) /*-{
    this.setAbsoluteTime(absoluteTime);
  }-*/;

  /**
   * Sets the number of days before the start time. This attribute is optional.
   * 
   * @param days Number of days before the start time.
   */
  public final native void setDays(double days) /*-{
    this.setDays(days);
  }-*/;

  /**
   * Sets the number of hours before the start time. This attribute is optional.
   * 
   * @param hours Number of hours before the start time.
   */
  public final native void setHours(double hours) /*-{
    this.setHours(hours);
  }-*/;

  /**
   * Sets the method. This attribute is optional.
   * 
   * @param method Method.
   */
  public final native void setMethod(String method) /*-{
    this.setMethod(method);
  }-*/;

  /**
   * Sets the number of minute before the start times. This attribute is optional.
   * 
   * @param minutes Number of minute before the start times.
   */
  public final native void setMinutes(double minutes) /*-{
    this.setMinutes(minutes);
  }-*/;

}