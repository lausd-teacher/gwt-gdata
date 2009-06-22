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
 * Describes a Gml geographical region.
 */
public class GmlEnvelope extends JavaScriptObject {

  /**
   * Constructs a Gml geographical region using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: lowerCorner and upperCorner.
   */
  public static native GmlEnvelope newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.geo.GmlEnvelope(
      params
    );
  }-*/;

  protected GmlEnvelope() { }

  /**
   * Returns the lower corner of a region. This element is optional.
   * 
   * @return Lower corner of a region or undefined for none.
   */
  public final native GmlLowerCorner getLowerCorner() /*-{
    return this.getLowerCorner();
  }-*/;

  /**
   * Returns the upper corner of a region. This element is optional.
   * 
   * @return Upper corner of a region or undefined for none.
   */
  public final native GmlUpperCorner getUpperCorner() /*-{
    return this.getUpperCorner();
  }-*/;

  /**
   * Sets the lower corner of a region. This element is optional.
   */
  public final native void setLowerCorner() /*-{
    this.setLowerCorner();
  }-*/;

  /**
   * Sets the lower corner of a region. This element is optional.
   * 
   * @param lowerCorner Lower corner of a region, or object to use as a parameter to the google.gdata.geo.GmlLowerCorner constructor, or undefined for none.
   */
  public final native void setLowerCorner(GmlLowerCorner lowerCorner) /*-{
    this.setLowerCorner(
      lowerCorner
    );
  }-*/;

  /**
   * Sets the upper corner of a region. This element is optional.
   */
  public final native void setUpperCorner() /*-{
    this.setUpperCorner();
  }-*/;

  /**
   * Sets the upper corner of a region. This element is optional.
   * 
   * @param upperCorner Upper corner of a region, or object to use as a parameter to the google.gdata.geo.GmlUpperCorner constructor, or undefined for none.
   */
  public final native void setUpperCorner(GmlUpperCorner upperCorner) /*-{
    this.setUpperCorner(
      upperCorner
    );
  }-*/;

}
