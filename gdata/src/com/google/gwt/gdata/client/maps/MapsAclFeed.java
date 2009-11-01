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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.acl.AclFeed;

/**
 * Describes a Maps access control list (ACL) feed.
 */
public class MapsAclFeed extends AclFeed<MapsAclEntry> {

  /**
   * Constructs a Maps ACL feed.
   * @return A MapsAclFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native MapsAclFeed newInstance() /*-{
    return new $wnd.google.gdata.acl.AclFeed();
  }-*/;

  protected MapsAclFeed() { }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(MapsAclFeedCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the feed by requesting it from the
   * associated service using the feeds self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(MapsAclFeedCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Inserts a new maps acl entry into the feed.
   * 
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertMapsAclEntry(MapsAclEntry entry,
      MapsAclEntryCallback callback) {
    this.insertEntry(entry, callback);
  }

}