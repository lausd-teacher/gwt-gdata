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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
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
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Link;
  }-*/;

  /**
   * Constructs a GData Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Link newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Link(
      params
    );
  }-*/;

  /**
   * Constructs a GData Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Link newInstance() /*-{
    return new $wnd.google.gdata.Link();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Link[name];
  }-*/;

  protected Link() { }

  /**
   * Create a new link using the typical parameters.
   * 
   * @param rel
   * @param type
   * @param href
   * @param opt_title
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link create(String rel, String type, String href, String title) /*-{
    return this.create(
      rel,
      type,
      href,
      title
    );
  }-*/;

  /**
   * Create a new link using the typical parameters.
   * 
   * @param rel
   * @param type
   * @param href
   * @param opt_title
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link create(String rel, String type, String href) /*-{
    return this.create(
      rel,
      type,
      href,
      undefined
    );
  }-*/;

}
