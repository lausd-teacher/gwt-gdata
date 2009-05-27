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
public class GmlEnvelope extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.geo.GmlEnvelope;
  }-*/;

  /**
   * Constructs a Gml geographical region using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmlEnvelope newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GmlEnvelope(
      params
    );
  }-*/;

  /**
   * Constructs a Gml geographical region using an object parameter whose property names match the setter method to use for each property.
   */
  public static native GmlEnvelope newInstance() /*-{
    return new $wnd.google.gdata.geo.GmlEnvelope();
  }-*/;

  protected GmlEnvelope() { }

  /**
   * Returns the lower corner of a region.
   * 
   * @return
   */
  public final native GmlLowerCorner getLowerCorner() /*-{
    return this.getLowerCorner();
  }-*/;

  /**
   * Returns the upper corner of a region.
   * 
   * @return
   */
  public final native GmlUpperCorner getUpperCorner() /*-{
    return this.getUpperCorner();
  }-*/;

  /**
   * Sets the lower corner of a region.
   * 
   * @param lowerCorner
   */
  public final native void setLowerCorner(GmlLowerCorner lowerCorner) /*-{
    this.setLowerCorner(
      lowerCorner
    );
  }-*/;

  /**
   * Sets the lower corner of a region.
   * 
   * @param lowerCorner
   */
  public final native void setLowerCorner() /*-{
    this.setLowerCorner();
  }-*/;

  /**
   * Sets the upper corner of a region.
   * 
   * @param upperCorner
   */
  public final native void setUpperCorner(GmlUpperCorner upperCorner) /*-{
    this.setUpperCorner(
      upperCorner
    );
  }-*/;

  /**
   * Sets the upper corner of a region.
   * 
   * @param upperCorner
   */
  public final native void setUpperCorner() /*-{
    this.setUpperCorner();
  }-*/;

}
