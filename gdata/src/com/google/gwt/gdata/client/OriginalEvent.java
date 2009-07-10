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
   * Constructs an original event.
   * @return An OriginalEvent object.
   */
  public static native OriginalEvent newInstance() /*-{
    return new $wnd.google.gdata.OriginalEvent();
  }-*/;

  protected OriginalEvent() { }

  /**
   * Returns the URL of the original recurring event entry. This attribute is required.
   * 
   * @return URL of the original recurring event entry.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the event ID of the original recurring event entry. This attribute is required.
   * 
   * @return Event ID of the original recurring event entry.
   */
  public final native String getOriginalId() /*-{
    return this.getOriginalId();
  }-*/;

  /**
   * Returns the original start time. This element is required.
   * 
   * @return Original start time.
   */
  public final native When getOriginalStartTime() /*-{
    return this.getOriginalStartTime();
  }-*/;

  /**
   * Sets the URL of the original recurring event entry. This attribute is required.
   * 
   * @param href URL of the original recurring event entry.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the event ID of the original recurring event entry. This attribute is required.
   * 
   * @param originalId Event ID of the original recurring event entry.
   */
  public final native void setOriginalId(String originalId) /*-{
    this.setOriginalId(originalId);
  }-*/;

  /**
   * Sets the original start time. This element is required.
   * 
   * @param originalStartTime Original start time.
   */
  public final native void setOriginalStartTime(When originalStartTime) /*-{
    this.setOriginalStartTime(originalStartTime);
  }-*/;

}