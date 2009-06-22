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
 * Describes a geographical location or region.
 */
public class GeoRssWhere extends JavaScriptObject {

  /**
   * Constructs a geographical location or region using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: envelope and point.
   */
  public static native GeoRssWhere newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GeoRssWhere(
      params
    );
  }-*/;

  protected GeoRssWhere() { }

  /**
   * Returns the Gml geographical region. This element is optional.
   * 
   * @return Gml geographical region or undefined for none.
   */
  public final native GmlEnvelope getEnvelope() /*-{
    return this.getEnvelope();
  }-*/;

  /**
   * Returns the particular geographical point. This element is optional.
   * 
   * @return Particular geographical point or undefined for none.
   */
  public final native GmlPoint getPoint() /*-{
    return this.getPoint();
  }-*/;

  /**
   * Sets the Gml geographical region. This element is optional.
   */
  public final native void setEnvelope() /*-{
    this.setEnvelope();
  }-*/;

  /**
   * Sets the Gml geographical region. This element is optional.
   * 
   * @param envelope Gml geographical region, or object to use as a parameter to the google.gdata.geo.GmlEnvelope constructor, or undefined for none.
   */
  public final native void setEnvelope(GmlEnvelope envelope) /*-{
    this.setEnvelope(
      envelope
    );
  }-*/;

  /**
   * Sets the particular geographical point. This element is optional.
   */
  public final native void setPoint() /*-{
    this.setPoint();
  }-*/;

  /**
   * Sets the particular geographical point. This element is optional.
   * 
   * @param point Particular geographical point, or object to use as a parameter to the google.gdata.geo.GmlPoint constructor, or undefined for none.
   */
  public final native void setPoint(GmlPoint point) /*-{
    this.setPoint(
      point
    );
  }-*/;

}
