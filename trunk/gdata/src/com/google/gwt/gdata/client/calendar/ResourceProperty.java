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
public class ResourceProperty extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.ResourceProperty;
  }-*/;

  /**
   * Constructs a resource property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ResourceProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.ResourceProperty(
      params
    );
  }-*/;

  /**
   * Constructs a resource property using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ResourceProperty newInstance() /*-{
    return new $wnd.google.gdata.calendar.ResourceProperty();
  }-*/;

  protected ResourceProperty() { }

  /**
   * Returns the resource ID.
   * 
   * @return
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns whether gd:who describes a resource.
   * 
   * @return
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the resource ID.
   * 
   * @param id
   */
  public final native void setId(String id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets the resource ID.
   * 
   * @param id
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets whether gd:who describes a resource.
   * 
   * @param value
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets whether gd:who describes a resource.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
