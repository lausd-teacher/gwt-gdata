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
import com.google.gwt.gdata.client.Who;

/**
 * Comment unavailable.
 */
public class CalendarWho extends Who {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarWho;
  }-*/;

  /**
   * Constructs a Calendar Who class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarWho newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarWho(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar Who class using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarWho newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarWho();
  }-*/;

  protected CalendarWho() { }

  /**
   * Returns the resource property.
   * 
   * @return
   */
  public final native ResourceProperty getResource() /*-{
    return this.getResource();
  }-*/;

  /**
   * Sets the resource property.
   * 
   * @param resource
   */
  public final native void setResource(ResourceProperty resource) /*-{
    this.setResource(
      resource
    );
  }-*/;

  /**
   * Sets the resource property.
   * 
   * @param resource
   */
  public final native void setResource() /*-{
    this.setResource();
  }-*/;

}
