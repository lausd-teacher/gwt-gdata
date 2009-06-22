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

package com.google.gwt.gdata.client.geo;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a particular geographical point.
 */
public class GmlPoint extends JavaScriptObject {

  /**
   * Constructs a particular geographical point using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: pos.
   */
  public static native GmlPoint newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GmlPoint(
      params
    );
  }-*/;

  protected GmlPoint() { }

  /**
   * Returns the latitude and longitude. This element is optional.
   * 
   * @return Latitude and longitude or undefined for none.
   */
  public final native GmlPos getPos() /*-{
    return this.getPos();
  }-*/;

  /**
   * Sets the latitude and longitude. This element is optional.
   */
  public final native void setPos() /*-{
    this.setPos();
  }-*/;

  /**
   * Sets the latitude and longitude. This element is optional.
   * 
   * @param pos Latitude and longitude, or object to use as a parameter to the google.gdata.geo.GmlPos constructor, or undefined for none.
   */
  public final native void setPos(GmlPos pos) /*-{
    this.setPos(
      pos
    );
  }-*/;

}
