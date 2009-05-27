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
public class OriginalEvent extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.OriginalEvent;
  }-*/;

  /**
   * Constructs an original event using an object parameter whose property names match the setter method to use for each property.
   */
  public static native OriginalEvent newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.OriginalEvent(
      params
    );
  }-*/;

  /**
   * Constructs an original event using an object parameter whose property names match the setter method to use for each property.
   */
  public static native OriginalEvent newInstance() /*-{
    return new $wnd.google.gdata.OriginalEvent();
  }-*/;

  protected OriginalEvent() { }

  /**
   * Returns the URL of the original recurring event entry.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the event ID of the original recurring event entry.
   * 
   * @return
   */
  public final native String getOriginalId() /*-{
    return this.getOriginalId();
  }-*/;

  /**
   * Returns the original start time.
   * 
   * @return
   */
  public final native When getOriginalStartTime() /*-{
    return this.getOriginalStartTime();
  }-*/;

  /**
   * Sets the URL of the original recurring event entry.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the URL of the original recurring event entry.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the event ID of the original recurring event entry.
   * 
   * @param originalId
   */
  public final native void setOriginalId(String originalId) /*-{
    this.setOriginalId(
      originalId
    );
  }-*/;

  /**
   * Sets the event ID of the original recurring event entry.
   * 
   * @param originalId
   */
  public final native void setOriginalId() /*-{
    this.setOriginalId();
  }-*/;

  /**
   * Sets the original start time.
   * 
   * @param originalStartTime
   */
  public final native void setOriginalStartTime(When originalStartTime) /*-{
    this.setOriginalStartTime(
      originalStartTime
    );
  }-*/;

  /**
   * Sets the original start time.
   * 
   * @param originalStartTime
   */
  public final native void setOriginalStartTime() /*-{
    this.setOriginalStartTime();
  }-*/;

}
