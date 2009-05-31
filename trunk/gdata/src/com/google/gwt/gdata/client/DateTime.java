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
 * Comment unavailable.
 */
public class DateTime extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.DateTime;
  }-*/;

  /**
   * Constructs a timestamp.
   */
  public static native DateTime newInstance(Date date, boolean dateOnly) /*-{
    return new $wnd.google.gdata.DateTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMiliseconds(Ljava/util/Date;)(date)),
      dateOnly
    );
  }-*/;

  /**
   * Constructs a timestamp.
   */
  public static native DateTime newInstance(Date date) /*-{
    return new $wnd.google.gdata.DateTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMiliseconds(Ljava/util/Date;)(date)),
      undefined
    );
  }-*/;

  protected DateTime() { }

  /**
   * Returns whether the given timestamp is equal to this timestamp.
   * 
   * @param otherDateTime
   * 
   * @return
   */
  public final native boolean equals2(DateTime otherDateTime) /*-{
    return this.equals(
      otherDateTime
    );
  }-*/;

  /**
   * Returns the GData timestamp for the ISO 8601 string representation.
   * 
   * @param isoString
   * 
   * @return
   */
  public final native DateTime fromIso8601(String isoString) /*-{
    return this.fromIso8601(
      isoString
    );
  }-*/;

  /**
   * Returns the Date value.
   * 
   * @return
   */
  public final native Date getDate() /*-{
    return @com.google.gwt.gdata.client.impl.DateHelper::milisecondsToDate(D)(this.getDate().getTime());
  }-*/;

  /**
   * Returns whether this timestamp represents a calendar date.
   * 
   * @return
   */
  public final native boolean isDateOnly() /*-{
    return this.isDateOnly();
  }-*/;

  /**
   * Sets the Date value.
   * 
   * @param date
   */
  public final native void setDate(Date date) /*-{
    this.setDate(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMiliseconds(Ljava/util/Date;)(date))
    );
  }-*/;

  /**
   * Sets whether this timestamp represents a calendar date.
   * 
   * @param dateOnly
   */
  public final native void setDateOnly(boolean dateOnly) /*-{
    this.setDateOnly(
      dateOnly
    );
  }-*/;

  /**
   * Returns the ISO 8601 string representation of the GData timestamp or Date class.
   * 
   * @param dateTime
   * 
   * @return
   */
  public final native String toIso8601(Date dateTime) /*-{
    return this.toIso8601(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMiliseconds(Ljava/util/Date;)(dateTime))
    );
  }-*/;

  /**
   * Returns the ISO 8601 string representation of the GData timestamp or Date class.
   * 
   * @param dateTime
   * 
   * @return
   */
  public final native String toIso8601(DateTime dateTime) /*-{
    return this.toIso8601(
      dateTime
    );
  }-*/;

}
