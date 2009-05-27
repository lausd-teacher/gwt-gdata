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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class CalendarLink extends com.google.gwt.gdata.client.acl.Link {

  /**
   * Link that provides the URI of the web content.
   */
  public static final String REL_WEB_CONTENT = getConstant("REL_WEB_CONTENT");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarLink;
  }-*/;

  /**
   * Constructs a Calendar Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarLink(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar Link class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarLink newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarLink[name];
  }-*/;

  protected CalendarLink() { }

  /**
   * Create a new Calendar link using the typical parameters.
   * 
   * @param webContent
   * @param iconHref
   * @param title
   * @param mimeType
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link create(WebContent webContent, String iconHref, String title, String mimeType) /*-{
    return this.create(
      webContent,
      iconHref,
      title,
      mimeType
    );
  }-*/;

  /**
   * Returns the web content.
   * 
   * @return
   */
  public final native WebContent getWebContent() /*-{
    return this.getWebContent();
  }-*/;

  /**
   * Sets the web content.
   * 
   * @param webContent
   */
  public final native void setWebContent(WebContent webContent) /*-{
    this.setWebContent(
      webContent
    );
  }-*/;

  /**
   * Sets the web content.
   * 
   * @param webContent
   */
  public final native void setWebContent() /*-{
    this.setWebContent();
  }-*/;

}
