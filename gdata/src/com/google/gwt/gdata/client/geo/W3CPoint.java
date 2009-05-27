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
public class W3CPoint extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.geo.W3CPoint;
  }-*/;

  /**
   * Constructs a W3C geographical location using an object parameter whose property names match the setter method to use for each property.
   */
  public static native W3CPoint newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.W3CPoint(
      params
    );
  }-*/;

  /**
   * Constructs a W3C geographical location using an object parameter whose property names match the setter method to use for each property.
   */
  public static native W3CPoint newInstance() /*-{
    return new $wnd.google.gdata.geo.W3CPoint();
  }-*/;

  protected W3CPoint() { }

  /**
   * Returns the W3C latitude.
   * 
   * @return
   */
  public final native GeoLat getGeoLatitude() /*-{
    return this.getGeoLatitude();
  }-*/;

  /**
   * Returns the W3C longitude.
   * 
   * @return
   */
  public final native GeoLong getGeoLongitude() /*-{
    return this.getGeoLongitude();
  }-*/;

  /**
   * Sets the W3C latitude.
   * 
   * @param geoLatitude
   */
  public final native void setGeoLatitude(GeoLat geoLatitude) /*-{
    this.setGeoLatitude(
      geoLatitude
    );
  }-*/;

  /**
   * Sets the W3C latitude.
   * 
   * @param geoLatitude
   */
  public final native void setGeoLatitude() /*-{
    this.setGeoLatitude();
  }-*/;

  /**
   * Sets the W3C longitude.
   * 
   * @param geoLongitude
   */
  public final native void setGeoLongitude(GeoLong geoLongitude) /*-{
    this.setGeoLongitude(
      geoLongitude
    );
  }-*/;

  /**
   * Sets the W3C longitude.
   * 
   * @param geoLongitude
   */
  public final native void setGeoLongitude() /*-{
    this.setGeoLongitude();
  }-*/;

}
