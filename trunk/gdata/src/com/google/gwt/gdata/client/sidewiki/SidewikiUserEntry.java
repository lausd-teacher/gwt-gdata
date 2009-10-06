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

package com.google.gwt.gdata.client.sidewiki;

/**
 * Describes a Sidewiki user entry.
 */
public class SidewikiUserEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a sidewiki user entry.
   * 
   * @return A SidewikiUserEntry object.
   */
  public static native SidewikiUserEntry newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiUserEntry();
  }-*/;

  protected SidewikiUserEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(SidewikiEntryCallback callback) {
    this.delete(callback);
  }
  
  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native SidewikiLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final SidewikiUserEntry getSelf(SidewikiUserEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Updates the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(SidewikiUserEntryCallback callback) {
    this.update(callback);
  }

}