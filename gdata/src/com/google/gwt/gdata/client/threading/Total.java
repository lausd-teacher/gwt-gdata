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

package com.google.gwt.gdata.client.threading;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Indicates total number of unique responses to an entry.
 */
public class Total extends JavaScriptObject {

  /**
   * Constructs a total using an object parameter whose property names match
   * the setter method to use for each property.
   */
  public static native Total newInstance() /*-{
    return new $wnd.google.gdata.threading.Total();
  }-*/;

  protected Total() { }

  /**
   * Returns the number of responses. This attribute is required.
   * 
   * @return Number of responses.
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the number of responses. This attribute is required.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the number of responses. This attribute is required.
   * 
   * @param value Number of responses.
   */
  public final native void setValue(double value) /*-{
    this.setValue(
      value
    );
  }-*/;

}