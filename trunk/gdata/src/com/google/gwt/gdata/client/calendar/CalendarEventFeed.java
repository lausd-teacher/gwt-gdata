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

import com.google.gwt.gdata.client.EventFeed;

/**
 * Describes a Calendar event feed.
 */
public class CalendarEventFeed extends EventFeed {

  /**
   * Constructs a Calendar event feed.
   * @return A CalendarEventFeed object.
   */
  public static native CalendarEventFeed newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEventFeed();
  }-*/;

  protected CalendarEventFeed() { }
  
  /**
   * Returns the whether the user is permitted to use Google Apps Sync.
   * This element is optional.
   * 
   * @return Whether the user is permitted to use Google Apps Sync.
   */
  public final native AllowGSyncProperty getAllowGSync() /*-{
    return this.getAllowGSync();
  }-*/;

  /**
   * Returns the whether the user is permitted to use Google Apps Sync.
   * This element is optional.
   * 
   * @return Whether the user is permitted to use Google Apps Sync.
   */
  public final native AllowGSync2Property getAllowGSync2() /*-{
    return this.getAllowGSync2();
  }-*/;
  
  /**
   * Returns the link that provides the URI that can be used to batch
   * operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations
   * to query, insert, update and delete entries on this feed.
   */
  public final native CalendarLink getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native CalendarLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed.
   */
  public final native CalendarLink getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the times cleaned property. This element is optional.
   * 
   * @return Times cleaned property.
   */
  public final native TimesCleanedProperty getTimesCleaned() /*-{
    return this.getTimesCleaned();
  }-*/;

  /**
   * Returns the time zone. This element is required.
   * 
   * @return Time zone.
   */
  public final native TimeZoneProperty getTimeZone() /*-{
    return this.getTimeZone();
  }-*/;

  /**
   * Sets the whether the user is permitted to use Google Apps Sync. This
   * element is optional.
   * 
   * @param allowGSync Whether the user is permitted to use Google Apps Sync.
   */
  public final native void setAllowGSync(AllowGSyncProperty allowGSync) /*-{
    this.setAllowGSync(allowGSync);
  }-*/;

  /**
   * Sets the whether the user is permitted to use Google Apps Sync. This
   * element is optional.
   * 
   * @param allowGSync2 Whether the user is permitted to use Google Apps Sync.
   */
  public final native void setAllowGSync2(AllowGSync2Property allowGSync2) /*-{
    this.setAllowGSync2(allowGSync2);
  }-*/;
  
  /**
   * Sets the times cleaned property. This element is optional.
   * 
   * @param timesCleaned Times cleaned property.
   */
  public final native void setTimesCleaned(
      TimesCleanedProperty timesCleaned) /*-{
    this.setTimesCleaned(timesCleaned);
  }-*/;

  /**
   * Sets the time zone. This element is required.
   * 
   * @param timeZone Time zone.
   */
  public final native void setTimeZone(TimeZoneProperty timeZone) /*-{
    this.setTimeZone(timeZone);
  }-*/;

}