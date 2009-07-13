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
 * Describes a "web content" extension. For example: <atom:link rel"http://schemas.google.com/gCal/2005/webContent" title"World Cup" href"http://www.google.com/calendar/images/google-holiday.gif" type"image/gif"> <gCal:webContent width"276" height"120" url"http://www.google.com/logos/worldcup06.gif"/> </atom:link>
 */
public class WebContent extends JavaScriptObject {

  /**
   * Constructs a web content.
   * @return A WebContent object.
   */
  public static native WebContent newInstance() /*-{
    return new $wnd.google.gdata.calendar.WebContent();
  }-*/;

  protected WebContent() { }

  /**
   * Adds a new web content gadget preference.
   * 
   * @param gadgetPref Web content gadget preference to add.
   */
  public final native void addGadgetPref(WebContentGadgetPref gadgetPref) /*-{
    this.addGadgetPref(gadgetPref);
  }-*/;

  /**
   * Returns the web content gadget preference of a given name.
   * 
   * @param name Preference name.
   * 
   * @return First web content gadget preference whose name is a match.
   */
  public final native WebContentGadgetPref getGadgetPref(String name) /*-{
    return this.getGadgetPref(name);
  }-*/;

  /**
   * Returns the web content gadget preferences.
   * 
   * @return Web content gadget preferences.
   */
  public final native WebContentGadgetPref[] getGadgetPrefs() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getGadgetPrefs());
  }-*/;

  /**
   * Returns the height (in pixels) of the <iframe> or <img> element. This attribute is required.
   * 
   * @return Height (in pixels) of the <iframe> or <img> element.
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns the URL of the content to display in the pop-up window. This attribute is required.
   * 
   * @return URL of the content to display in the pop-up window or undefined for none.
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width (in pixels) of the <iframe> or <img> element. This attribute is required.
   * 
   * @return Width (in pixels) of the <iframe> or <img> element.
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the web content gadget preferences.
   * 
   * @param gadgetPrefs Web content gadget preferences, where each web content gadget preference is added using addGadgetPref().
   */
  public final native void setGadgetPrefs(WebContentGadgetPref[] gadgetPrefs) /*-{
    this.setGadgetPrefs(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(gadgetPrefs)
    );
  }-*/;

  /**
   * Sets the height (in pixels) of the <iframe> or <img> element. This attribute is required.
   * 
   * @param height Height (in pixels) of the <iframe> or <img> element.
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(height);
  }-*/;

  /**
   * Sets the URL of the content to display in the pop-up window. This attribute is required.
   * 
   * @param url URL of the content to display in the pop-up window.
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(url);
  }-*/;
  /**
   * Sets the width (in pixels) of the <iframe> or <img> element. This attribute is required.
   * 
   * @param width Width (in pixels) of the <iframe> or <img> element.
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(width);
  }-*/;

}