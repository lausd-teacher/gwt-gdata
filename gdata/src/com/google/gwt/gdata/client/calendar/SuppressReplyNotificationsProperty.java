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
 * Lists notification methods to be suppressed for this reply.
 */
public class SuppressReplyNotificationsProperty extends JavaScriptObject {

  /**
   * Constructs a suppress reply notifications property.
   * @return A SuppressReplyNotificationsProperty object.
   */
  public static native SuppressReplyNotificationsProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.SuppressReplyNotificationsProperty();
  }-*/;

  protected SuppressReplyNotificationsProperty() { }

  /**
   * Returns the comma separated list of methods. This attribute is required.
   * 
   * @return Comma separated list of methods.
   */
  public final native String getMethods() /*-{
    return this.getMethods();
  }-*/;

  /**
   * Sets the comma separated list of methods. This attribute is required.
   * 
   * @param methods Comma separated list of methods.
   */
  public final native void setMethods(String methods) /*-{
    this.setMethods(methods);
  }-*/;

}