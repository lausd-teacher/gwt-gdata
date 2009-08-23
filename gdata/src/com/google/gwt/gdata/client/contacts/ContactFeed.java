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

package com.google.gwt.gdata.client.contacts;

/**
 * Describes a contact feed.
 */
public class ContactFeed
    extends com.google.gwt.gdata.client.Feed<ContactEntry> {

  /**
   * Constructs a contact feed.
   * @return A ContactFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native ContactFeed newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactFeed();
  }-*/;

  protected ContactFeed() { }

  /**
   * Returns the link that provides the URI that can be used to batch
   * operations to query, insert, update and delete entries on this feed.
   * 
   * @return Link that provides the URI that can be used to batch operations to
   * query, insert, update and delete entries on this feed.
   */
  public final native ContactLink getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return Link that provides the URI of next page in a paged feed.
   */
  public final native ContactLink getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return Link that provides the URI of previous page in a paged feed.
   */
  public final native ContactLink getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(ContactFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new contact entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertContactEntry(ContactEntry entry,
      ContactEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}