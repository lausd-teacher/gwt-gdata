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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class ContactGroupFeed extends com.google.gwt.gdata.client.Feed<ContactGroupEntry> {

  /**
   * Constructs a contact group feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactGroupFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactGroupFeed(
      params
    );
  }-*/;

  /**
   * Constructs a contact group feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactGroupFeed newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactGroupFeed();
  }-*/;

  protected ContactGroupFeed() { }

  /**
   * Returns the link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getFeedBatchLink() /*-{
    return this.getFeedBatchLink();
  }-*/;

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

}
