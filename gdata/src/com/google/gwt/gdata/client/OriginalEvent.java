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
 * Describes a link to a recurring event.
 */
public class OriginalEvent extends JavaScriptObject {

  /**
   * Constructs an original event using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: href, originalId, and originalStartTime.
   */
  public static native OriginalEvent newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.OriginalEvent(
      params
    );
  }-*/;

  protected OriginalEvent() { }

  /**
   * Returns the URL of the original recurring event entry. This attribute is required.
   * 
   * @return URL of the original recurring event entry or undefined for none.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the event ID of the original recurring event entry. This attribute is required.
   * 
   * @return Event ID of the original recurring event entry or undefined for none.
   */
  public final native String getOriginalId() /*-{
    return this.getOriginalId();
  }-*/;

  /**
   * Returns the original start time. This element is required.
   * 
   * @return Original start time or undefined for none.
   */
  public final native When getOriginalStartTime() /*-{
    return this.getOriginalStartTime();
  }-*/;

  /**
   * Sets the URL of the original recurring event entry. This attribute is required.
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the URL of the original recurring event entry. This attribute is required.
   * 
   * @param href URL of the original recurring event entry or undefined for none.
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the event ID of the original recurring event entry. This attribute is required.
   */
  public final native void setOriginalId() /*-{
    this.setOriginalId();
  }-*/;

  /**
   * Sets the event ID of the original recurring event entry. This attribute is required.
   * 
   * @param originalId Event ID of the original recurring event entry or undefined for none.
   */
  public final native void setOriginalId(String originalId) /*-{
    this.setOriginalId(
      originalId
    );
  }-*/;

  /**
   * Sets the original start time. This element is required.
   */
  public final native void setOriginalStartTime() /*-{
    this.setOriginalStartTime();
  }-*/;

  /**
   * Sets the original start time. This element is required.
   * 
   * @param originalStartTime Original start time, or object to use as a parameter to the google.gdata.When constructor, or undefined for none.
   */
  public final native void setOriginalStartTime(When originalStartTime) /*-{
    this.setOriginalStartTime(
      originalStartTime
    );
  }-*/;

}
