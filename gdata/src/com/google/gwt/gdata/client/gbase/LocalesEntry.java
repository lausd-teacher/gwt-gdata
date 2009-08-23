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

package com.google.gwt.gdata.client.gbase;

/**
 * Describes an entry in the feed of locales.
 */
public class LocalesEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a Google Base locale entry.
   * @return A LocalesEntry object.
   */
  public static native LocalesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.LocalesEntry();
  }-*/;

  protected LocalesEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(LocalesEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry.
   */
  public final native com.google.gwt.gdata.client.atom.Link
      getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final LocalesEntry getSelf(LocalesEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(LocalesEntryCallback callback) {
    this.update(callback);
  }

}