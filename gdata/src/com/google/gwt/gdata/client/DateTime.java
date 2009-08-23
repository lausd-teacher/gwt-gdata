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
 * Represents a timestamp that is either a calendar date or a more specific
 * time with millisecond precision.
 */
public class DateTime extends JavaScriptObject {

  /**
   * Constructs a timestamp.
   * @param date Date value.
   * @param dateOnly Whether this timestamp represents a calendar date.
   * @return A DateTime object.
   */
  public static native DateTime newInstance(Date date, boolean dateOnly) /*-{
    return new $wnd.google.gdata.DateTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(date)),
      dateOnly
    );
  }-*/;

  /**
   * Constructs a timestamp.
   * @param date Date value.
   * @return A DateTime object.
   */
  public static native DateTime newInstance(Date date) /*-{
    return new $wnd.google.gdata.DateTime(new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(date)));
  }-*/;

  protected DateTime() { }

  /**
   * Returns whether the given timestamp is equal to this timestamp.
   * 
   * @param otherDateTime Other timestamp. 
   * 
   * @return Whether they are equal.
   */
  public final native boolean equalsTo(DateTime otherDateTime) /*-{
    return this.equals(otherDateTime);
  }-*/;

  /**
   * Returns the GData timestamp for the ISO 8601 string representation.
   * 
   * @param isoString ISO 8601 string representation.
   * 
   * @return GData timestamp.
   */
  public final native DateTime fromIso8601(String isoString) /*-{
    return this.fromIso8601(isoString);
  }-*/;

  /**
   * Returns the Date value.
   * 
   * @return Date value
   */
  public final native Date getDate() /*-{
    return @com.google.gwt.gdata.client.impl.DateHelper::millisecondsToDate(D)(this.getDate().getTime());
  }-*/;

  /**
   * Returns whether this timestamp represents a calendar date.
   * 
   * @return Whether this timestamp represents a calendar date.
   */
  public final native boolean isDateOnly() /*-{
    return this.isDateOnly();
  }-*/;

  /**
   * Sets the Date value.
   * 
   * @param date Date value.
   */
  public final native void setDate(Date date) /*-{
    this.setDate(new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(date)));
  }-*/;

  /**
   * Sets whether this timestamp represents a calendar date.
   * 
   * @param dateOnly Whether this timestamp represents a calendar date.
   */
  public final native void setDateOnly(boolean dateOnly) /*-{
    this.setDateOnly(dateOnly);
  }-*/;

  /**
   * Returns the ISO 8601 string representation of the Date object.
   * 
   * @param dateTime GData timestamp to represent a timestamp with millesecond
   * precision.
   * 
   * @return ISO 8601 string representation.
   */
  public final native String toIso8601(Date dateTime) /*-{
    return this.toIso8601(new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(dateTime)));
  }-*/;

  /**
   * Returns the ISO 8601 string representation of the GData timestamp.
   * 
   * @param dateTime Date value to represent a timestamp with millesecond
   * precision.
   * 
   * @return ISO 8601 string representation.
   */
  public final native String toIso8601(DateTime dateTime) /*-{
    return this.toIso8601(dateTime);
  }-*/;

}
