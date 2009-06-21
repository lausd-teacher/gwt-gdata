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
 * Comment unavailable.
 */
public class GmlPoint extends JavaScriptObject {

  /**
   * Constructs a particular geographical point using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmlPoint newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GmlPoint(
      params
    );
  }-*/;

  /**
   * Constructs a particular geographical point using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmlPoint newInstance() /*-{
    return new $wnd.google.gdata.geo.GmlPoint();
  }-*/;

  protected GmlPoint() { }

  /**
   * Returns the latitude and longitude.
   * 
   * @return
   */
  public final native GmlPos getPos() /*-{
    return this.getPos();
  }-*/;

  /**
   * Sets the latitude and longitude.
   * 
   * @param pos
   */
  public final native void setPos(GmlPos pos) /*-{
    this.setPos(
      pos
    );
  }-*/;

  /**
   * Sets the latitude and longitude.
   * 
   * @param pos
   */
  public final native void setPos() /*-{
    this.setPos();
  }-*/;

}
