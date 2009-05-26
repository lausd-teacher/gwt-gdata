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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class BloggerLink extends com.google.gwt.gdata.client.Link {

  /**
   * Link that provides the URI of the web content.
   */
  public static final String REL_REPLIES = getConstant("REL_REPLIES");

  /**
   * Link to blog settings feed.
   */
  public static final String REL_SETTINGS = getConstant("REL_SETTINGS");

  /**
   * Link to blog templates feed.
   */
  public static final String REL_TEMPLATE = getConstant("REL_TEMPLATE");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.blogger.BloggerLink;
  }-*/;

  /**
   * Constructs a Blogger Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native BloggerLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.blogger.BloggerLink(
      params
    );
  }-*/;

  /**
   * Constructs a Blogger Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native BloggerLink newInstance() /*-{
    return new $wnd.google.gdata.blogger.BloggerLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.blogger.BloggerLink[name];
  }-*/;

  protected BloggerLink() { }

}
