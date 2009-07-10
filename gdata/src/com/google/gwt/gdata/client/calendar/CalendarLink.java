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

/**
 * Extends the base Link class with Calendar extensions.
 */
public class CalendarLink extends com.google.gwt.gdata.client.acl.Link {

  /**
   * Link that provides the URI of the web content.
   */
  public static final String REL_WEB_CONTENT = getConstant("REL_WEB_CONTENT");

  /**
   * Constructs a Calendar Link class.
   * @return A CalendarLink object.
   */
  public static native CalendarLink newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarLink();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarLink[name];
  }-*/;

  protected CalendarLink() { }

  /**
   * Returns the web content. This element is optional.
   * 
   * @return Web content.
   */
  public final native WebContent getWebContent() /*-{
    return this.getWebContent();
  }-*/;

  /**
   * Sets the web content. This element is optional.
   * 
   * @param webContent Web content.
   */
  public final native void setWebContent(WebContent webContent) /*-{
    this.setWebContent(webContent);
  }-*/;

}