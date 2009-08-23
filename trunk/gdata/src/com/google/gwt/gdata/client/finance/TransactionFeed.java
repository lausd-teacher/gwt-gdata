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

package com.google.gwt.gdata.client.finance;

/**
 * Describes a Finance transaction feed.
 */
public class TransactionFeed
    extends com.google.gwt.gdata.client.Feed<TransactionEntry> {

  /**
   * Constructs a Finance transaction feed.
   * @return A TransactionFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native TransactionFeed newInstance() /*-{
    return new $wnd.google.gdata.finance.TransactionFeed();
  }-*/;

  protected TransactionFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(TransactionFeedCallback callback) {
    this.get(callback);
  }

  /**
   * Inserts a new transaction entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertTransactionEntry(TransactionEntry entry,
      TransactionEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}