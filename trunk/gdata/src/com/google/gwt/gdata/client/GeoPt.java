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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

import java.util.Date;

/**
 * GData schema extension describing a geographic location.
 */
public class GeoPt extends JavaScriptObject {

  /**
   * Constructs a geo pt.
   * 
   * @return A GeoPt object.
   */
  public static native GeoPt newInstance() /*-{
    return new $wnd.google.gdata.GeoPt();
  }-*/;

  protected GeoPt() { }

  /**
   * Returns the Elevation. This attribute is optional.
   * 
   * @return Elevation.
   */
  public final native double getElev() /*-{
    return this.getElev();
  }-*/;

  /**
   * Returns the Label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the Latitude. This attribute is optional.
   * 
   * @return Latitude.
   */
  public final native double getLat() /*-{
    return this.getLat();
  }-*/;

  /**
   * Returns the Longitude. This attribute is optional.
   * 
   * @return Longitude.
   */
  public final native double getLon() /*-{
    return this.getLon();
  }-*/;

  /**
   * Returns the Time. This attribute is optional.
   * 
   * @return Time.
   */
  public final native DateTime getTime() /*-{
    return this.getTime();
  }-*/;

  /**
   * Sets the Elevation. This attribute is optional.
   * 
   * @param elev Elevation.
   */
  public final native void setElev(double elev) /*-{
    this.setElev(elev);
  }-*/;

  /**
   * Sets the Label. This attribute is optional.
   * 
   * @param label Label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets the Latitude. This attribute is optional.
   * 
   * @param lat Latitude.
   */
  public final native void setLat(double lat) /*-{
    this.setLat(lat);
  }-*/;

  /**
   * Sets the Longitude. This attribute is optional.
   * 
   * @param lon Longitude.
   */
  public final native void setLon(double lon) /*-{
    this.setLon(lon);
  }-*/;

  /**
   * Sets the Time. This attribute is optional.
   * 
   * @param time Time.
   */
  public final native void setTime(Date time) /*-{
    this.setTime(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(time))
    );
  }-*/;

  /**
   * Sets the Time. This attribute is optional.
   * 
   * @param time Time.
   */
  public final native void setTime(DateTime time) /*-{
    this.setTime(time);
  }-*/;

}