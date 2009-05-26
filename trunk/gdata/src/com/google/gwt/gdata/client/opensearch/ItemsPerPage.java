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

package com.google.gwt.gdata.client.opensearch;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class ItemsPerPage extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.opensearch.ItemsPerPage;
  }-*/;

  /**
   * Constructs an items-per-page count using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsPerPage newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.opensearch.ItemsPerPage(
      params
    );
  }-*/;

  /**
   * Constructs an items-per-page count using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemsPerPage newInstance() /*-{
    return new $wnd.google.gdata.opensearch.ItemsPerPage();
  }-*/;

  protected ItemsPerPage() { }

  /**
   * Returns the value.
   * 
   * @return
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value.
   * 
   * @param value
   */
  public final native void setValue(double value) /*-{
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
