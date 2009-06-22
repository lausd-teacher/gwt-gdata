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
 * Describes whether gd:content is for quick-add processing.
 */
public class QuickAddProperty extends JavaScriptObject {

  /**
   * Constructs a quick-add property using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: value.
   */
  public static native QuickAddProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.QuickAddProperty(
      params
    );
  }-*/;

  protected QuickAddProperty() { }

  /**
   * Returns whether gd:content is for quick-add processing. This attribute is required.
   * 
   * @return Whether gd:content is for quick-add processing or undefined for none.
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets whether gd:content is for quick-add processing. This attribute is required.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets whether gd:content is for quick-add processing. This attribute is required.
   * 
   * @param value Whether gd:content is for quick-add processing or undefined for none.
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
