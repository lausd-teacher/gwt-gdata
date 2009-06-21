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
public class Recurrence extends JavaScriptObject {

  /**
   * Constructs a recurrence rule using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Recurrence newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Recurrence(
      params
    );
  }-*/;

  /**
   * Constructs a recurrence rule using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Recurrence newInstance() /*-{
    return new $wnd.google.gdata.Recurrence();
  }-*/;

  protected Recurrence() { }

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(String value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}