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
public class GeoRssWhere extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.geo.GeoRssWhere;
  }-*/;

  /**
   * Constructs a geographical location or region using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GeoRssWhere newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GeoRssWhere(
      params
    );
  }-*/;

  /**
   * Constructs a geographical location or region using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GeoRssWhere newInstance() /*-{
    return new $wnd.google.gdata.geo.GeoRssWhere();
  }-*/;

  protected GeoRssWhere() { }

  /**
   * Returns the Gml geographical region.
   * 
   * @return
   */
  public final native GmlEnvelope getEnvelope() /*-{
    return this.getEnvelope();
  }-*/;

  /**
   * Returns the particular geographical point.
   * 
   * @return
   */
  public final native GmlPoint getPoint() /*-{
    return this.getPoint();
  }-*/;

  /**
   * Sets the Gml geographical region.
   * 
   * @param envelope
   */
  public final native void setEnvelope(JavaScriptObject envelope) /*-{
    this.setEnvelope(
      envelope
    );
  }-*/;

  /**
   * Sets the Gml geographical region.
   * 
   * @param envelope
   */
  public final native void setEnvelope() /*-{
    this.setEnvelope();
  }-*/;

  /**
   * Sets the Gml geographical region.
   * 
   * @param envelope
   */
  public final native void setEnvelope(GmlEnvelope envelope) /*-{
    this.setEnvelope(
      envelope
    );
  }-*/;

  /**
   * Sets the particular geographical point.
   * 
   * @param point
   */
  public final native void setPoint(JavaScriptObject point) /*-{
    this.setPoint(
      point
    );
  }-*/;

  /**
   * Sets the particular geographical point.
   * 
   * @param point
   */
  public final native void setPoint() /*-{
    this.setPoint();
  }-*/;

  /**
   * Sets the particular geographical point.
   * 
   * @param point
   */
  public final native void setPoint(GmlPoint point) /*-{
    this.setPoint(
      point
    );
  }-*/;

}
