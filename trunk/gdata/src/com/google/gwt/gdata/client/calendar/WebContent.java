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
public class WebContent extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.WebContent;
  }-*/;

  /**
   * Constructs a web content using an object parameter whose property names match the setter method to use for each property.
   */
  public static native WebContent newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.WebContent(
      params
    );
  }-*/;

  /**
   * Constructs a web content using an object parameter whose property names match the setter method to use for each property.
   */
  public static native WebContent newInstance() /*-{
    return new $wnd.google.gdata.calendar.WebContent();
  }-*/;

  protected WebContent() { }

  /**
   * Adds a new web content gadget preference.
   * 
   * @param gadgetPref
   */
  public final native void addGadgetPref(JavaScriptObject gadgetPref) /*-{
    this.addGadgetPref(
      gadgetPref
    );
  }-*/;

  /**
   * Adds a new web content gadget preference.
   * 
   * @param gadgetPref
   */
  public final native void addGadgetPref(WebContentGadgetPref gadgetPref) /*-{
    this.addGadgetPref(
      gadgetPref
    );
  }-*/;

  /**
   * Returns the web content gadget preference of a given name.
   * 
   * @param name
   * 
   * @return
   */
  public final native WebContentGadgetPref getGadgetPref(String name) /*-{
    return this.getGadgetPref(
      name
    );
  }-*/;

  /**
   * Returns the web content gadget preferences.
   * 
   * @return
   */
  public final native WebContentGadgetPref[] getGadgetPrefs() /*-{
    return this.getGadgetPrefs();
  }-*/;

  /**
   * Returns the height (in pixels) of the <iframe> or <img> element.
   * 
   * @return
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns the URL of the content to display in the pop-up window.
   * 
   * @return
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width (in pixels) of the <iframe> or <img> element.
   * 
   * @return
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the web content gadget preferences.
   * 
   * @param gadgetPrefs
   */
  public final native void setGadgetPrefs(JavaScriptObject[] gadgetPrefs) /*-{
    this.setGadgetPrefs(
      gadgetPrefs
    );
  }-*/;

  /**
   * Sets the web content gadget preferences.
   * 
   * @param gadgetPrefs
   */
  public final native void setGadgetPrefs() /*-{
    this.setGadgetPrefs();
  }-*/;

  /**
   * Sets the web content gadget preferences.
   * 
   * @param gadgetPrefs
   */
  public final native void setGadgetPrefs(WebContentGadgetPref[] gadgetPrefs) /*-{
    this.setGadgetPrefs(
      gadgetPrefs
    );
  }-*/;

  /**
   * Sets the height (in pixels) of the <iframe> or <img> element.
   * 
   * @param height
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(
      height
    );
  }-*/;

  /**
   * Sets the height (in pixels) of the <iframe> or <img> element.
   * 
   * @param height
   */
  public final native void setHeight() /*-{
    this.setHeight();
  }-*/;

  /**
   * Sets the URL of the content to display in the pop-up window.
   * 
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(
      url
    );
  }-*/;

  /**
   * Sets the URL of the content to display in the pop-up window.
   * 
   * @param url
   */
  public final native void setUrl() /*-{
    this.setUrl();
  }-*/;

  /**
   * Sets the width (in pixels) of the <iframe> or <img> element.
   * 
   * @param width
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(
      width
    );
  }-*/;

  /**
   * Sets the width (in pixels) of the <iframe> or <img> element.
   * 
   * @param width
   */
  public final native void setWidth() /*-{
    this.setWidth();
  }-*/;

}
