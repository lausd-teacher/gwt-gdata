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
   * Constructs a geographical location or region.
   * @return A GeoRssWhere object.
   */
  public static native GeoRssWhere newInstance() /*-{
    return new $wnd.google.gdata.geo.GeoRssWhere();
  }-*/;

  protected GeoRssWhere() { }

  /**
   * Returns the Gml geographical region. This element is optional.
   * 
   * @return Gml geographical region.
   */
  public final native GmlEnvelope getEnvelope() /*-{
    return this.getEnvelope();
  }-*/;

  /**
   * Returns the particular geographical point. This element is optional.
   * 
   * @return Particular geographical point.
   */
  public final native GmlPoint getPoint() /*-{
    return this.getPoint();
  }-*/;

  /**
   * Sets the Gml geographical region. This element is optional.
   * 
   * @param envelope Gml geographical region.
   */
  public final native void setEnvelope(GmlEnvelope envelope) /*-{
    this.setEnvelope(envelope);
  }-*/;

  /**
   * Sets the particular geographical point. This element is optional.
   * 
   * @param point Particular geographical point.
   */
  public final native void setPoint(GmlPoint point) /*-{
    this.setPoint(point);
  }-*/;

}