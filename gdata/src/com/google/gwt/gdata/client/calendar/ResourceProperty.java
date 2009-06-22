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
 * Describes whether gd:who is a resource such as a conference room.
 */
public class ResourceProperty extends JavaScriptObject {

  /**
   * Constructs a resource property using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: id and value.
   */
  public static native ResourceProperty newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.ResourceProperty(
      params
    );
  }-*/;

  protected ResourceProperty() { }

  /**
   * Returns the resource ID. This attribute is optional.
   * 
   * @return Resource ID or undefined for none.
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns whether gd:who describes a resource. This attribute is optional.
   * 
   * @return Whether gd:who describes a resource or undefined for none.
   */
  public final native boolean getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the resource ID. This attribute is optional.
   */
  public final native void setId() /*-{
    this.setId();
  }-*/;

  /**
   * Sets the resource ID. This attribute is optional.
   * 
   * @param id Resource ID or undefined for none.
   */
  public final native void setId(String id) /*-{
    this.setId(
      id
    );
  }-*/;

  /**
   * Sets whether gd:who describes a resource. This attribute is optional.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets whether gd:who describes a resource. This attribute is optional.
   * 
   * @param value Whether gd:who describes a resource or undefined for none.
   */
  public final native void setValue(boolean value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
