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

import com.google.gwt.gdata.client.acl.AclFeed;

/**
 * Describes a Calendar access control list (ACL) feed.
 */
public class CalendarAclFeed extends AclFeed<CalendarAclEntry> {

  /**
   * Constructs a Calendar ACL feed.
   * @return A CalendarAclFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native CalendarAclFeed newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarAclFeed();
  }-*/;

  protected CalendarAclFeed() { }

  /**
   * Returns the link that provides the URI of the entry that is controlled by the access control list feed.
   * 
   * @return Link that provides the URI of the entry that is controlled by the access control list feed.
   */
  public final native CalendarLink getControlledObjectLink() /*-{
    return this.getControlledObjectLink();
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void getSelf(CalendarAclFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new calendar acl entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void insertCalendarAclEntry(CalendarAclEntry entry, CalendarAclEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}