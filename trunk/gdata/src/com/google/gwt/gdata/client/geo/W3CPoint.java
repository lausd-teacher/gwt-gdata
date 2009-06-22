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
 * Describes a W3C geographical location.
 */
public class W3CPoint extends JavaScriptObject {

  /**
   * Constructs a W3C geographical location using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: geoLatitude and geoLongitude.
   */
  public static native W3CPoint newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.W3CPoint(
      params
    );
  }-*/;

  protected W3CPoint() { }

  /**
   * Returns the W3C latitude. This element is optional.
   * 
   * @return W3C latitude or undefined for none.
   */
  public final native GeoLat getGeoLatitude() /*-{
    return this.getGeoLatitude();
  }-*/;

  /**
   * Returns the W3C longitude. This element is optional.
   * 
   * @return W3C longitude or undefined for none.
   */
  public final native GeoLong getGeoLongitude() /*-{
    return this.getGeoLongitude();
  }-*/;

  /**
   * Sets the W3C latitude. This element is optional.
   */
  public final native void setGeoLatitude() /*-{
    this.setGeoLatitude();
  }-*/;

  /**
   * Sets the W3C latitude. This element is optional.
   * 
   * @param geoLatitude W3C latitude, or object to use as a parameter to the google.gdata.geo.GeoLat constructor, or undefined for none.
   */
  public final native void setGeoLatitude(GeoLat geoLatitude) /*-{
    this.setGeoLatitude(
      geoLatitude
    );
  }-*/;

  /**
   * Sets the W3C longitude. This element is optional.
   */
  public final native void setGeoLongitude() /*-{
    this.setGeoLongitude();
  }-*/;

  /**
   * Sets the W3C longitude. This element is optional.
   * 
   * @param geoLongitude W3C longitude, or object to use as a parameter to the google.gdata.geo.GeoLong constructor, or undefined for none.
   */
  public final native void setGeoLongitude(GeoLong geoLongitude) /*-{
    this.setGeoLongitude(
      geoLongitude
    );
  }-*/;

}
