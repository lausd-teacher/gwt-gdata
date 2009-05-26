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
import com.google.gwt.gdata.client.EventFeed;

/**
 * Comment unavailable.
 */
public class CalendarEventFeed extends EventFeed {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarEventFeed;
  }-*/;

  /**
   * Constructs a Calendar event feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEventFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarEventFeed(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar event feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEventFeed newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEventFeed();
  }-*/;

  protected CalendarEventFeed() { }

  /**
   * Returns the link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed.
   * 
   * @return
   */
  public final native CalendarLink getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return
   */
  public final native CalendarLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return
   */
  public final native CalendarLink getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the times cleaned property.
   * 
   * @return
   */
  public final native TimesCleanedProperty getTimesCleaned() /*-{
    return this.getTimesCleaned();
  }-*/;

  /**
   * Returns the time zone.
   * 
   * @return
   */
  public final native TimeZoneProperty getTimeZone() /*-{
    return this.getTimeZone();
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned(JavaScriptObject timesCleaned) /*-{
    this.setTimesCleaned(
      timesCleaned
    );
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned() /*-{
    this.setTimesCleaned();
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned(TimesCleanedProperty timesCleaned) /*-{
    this.setTimesCleaned(
      timesCleaned
    );
  }-*/;

  /**
   * Sets the time zone.
   * 
   * @param timeZone
   */
  public final native void setTimeZone(JavaScriptObject timeZone) /*-{
    this.setTimeZone(
      timeZone
    );
  }-*/;

  /**
   * Sets the time zone.
   * 
   * @param timeZone
   */
  public final native void setTimeZone() /*-{
    this.setTimeZone();
  }-*/;

  /**
   * Sets the time zone.
   * 
   * @param timeZone
   */
  public final native void setTimeZone(TimeZoneProperty timeZone) /*-{
    this.setTimeZone(
      timeZone
    );
  }-*/;

}
