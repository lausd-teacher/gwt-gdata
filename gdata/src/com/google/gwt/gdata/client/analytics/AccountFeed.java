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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class AccountFeed extends com.google.gwt.gdata.client.Feed<AccountEntry> {

  /**
   * Constructs an account feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccountFeed newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.analytics.AccountFeed(
      params
    );
  }-*/;

  /**
   * Constructs an account feed using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AccountFeed newInstance() /*-{
    return new $wnd.google.gdata.analytics.AccountFeed();
  }-*/;

  protected AccountFeed() { }

  /**
   * Returns the link that provides the URI of next page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getNextLink() /*-{
    return this.getNextLink();
  }-*/;

  /**
   * Returns the link that provides the URI of previous page in a paged feed.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getPreviousLink() /*-{
    return this.getPreviousLink();
  }-*/;

}