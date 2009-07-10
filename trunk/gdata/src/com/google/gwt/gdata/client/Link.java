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

/**
 * Extends the base Link class with GData extensions.
 */
public class Link extends com.google.gwt.gdata.client.atom.Link {

  /**
   * Link that provides the URI that can be used to post new entries to the feed.
   */
  public static final String REL_ENTRY_POST = getConstant("REL_ENTRY_POST");

  /**
   * Link that provides the URI of the full feed (without any query parameters).
   */
  public static final String REL_FEED = getConstant("REL_FEED");

  /**
   * Link that provides the URI that can be used to batch operations to query, insert, update and delete entries on this feed.
   */
  public static final String REL_FEED_BATCH = getConstant("REL_FEED_BATCH");

  /**
   * Constructs a GData Link.
   * @return A Link object.
   */
  public static native Link newInstance() /*-{
    return new $wnd.google.gdata.Link();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Link[name];
  }-*/;

  protected Link() { }

}