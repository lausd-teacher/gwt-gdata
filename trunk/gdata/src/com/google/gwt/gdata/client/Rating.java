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

/**
 * Comment unavailable.
 */
public class Rating extends JavaScriptObject {

  /**
   * Overall rating, higher values mean better ratings.
   */
  public static final String REL_OVERALL = getConstant("REL_OVERALL");

  /**
   * Price rating, higher values mean better ratings.
   */
  public static final String REL_PRICE = getConstant("REL_PRICE");

  /**
   * Quality rating, higher values mean better ratings.
   */
  public static final String REL_QUALITY = getConstant("REL_QUALITY");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Rating;
  }-*/;

  /**
   * Constructs a rating using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Rating newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Rating(
      params
    );
  }-*/;

  /**
   * Constructs a rating using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Rating newInstance() /*-{
    return new $wnd.google.gdata.Rating();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Rating[name];
  }-*/;

  protected Rating() { }

  /**
   * Returns the average rating.
   * 
   * @return
   */
  public final native double getAverage() /*-{
    return this.getAverage();
  }-*/;

  /**
   * Returns the rating scales maximum value.
   * 
   * @return
   */
  public final native double getMax() /*-{
    return this.getMax();
  }-*/;

  /**
   * Returns the rating scales minimum value.
   * 
   * @return
   */
  public final native double getMin() /*-{
    return this.getMin();
  }-*/;

  /**
   * Returns the number of ratings taken into account when computing the average value.
   * 
   * @return
   */
  public final native double getNumRaters() /*-{
    return this.getNumRaters();
  }-*/;

  /**
   * Returns the programmatic value that describes the aspect thats being rated, if not specified, the rating is an overall rating.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the rating value.
   * 
   * @return
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the average rating.
   * 
   * @param average
   */
  public final native void setAverage(double average) /*-{
    this.setAverage(
      average
    );
  }-*/;

  /**
   * Sets the average rating.
   * 
   * @param average
   */
  public final native void setAverage() /*-{
    this.setAverage();
  }-*/;

  /**
   * Sets the rating scales maximum value.
   * 
   * @param max
   */
  public final native void setMax(double max) /*-{
    this.setMax(
      max
    );
  }-*/;

  /**
   * Sets the rating scales maximum value.
   * 
   * @param max
   */
  public final native void setMax() /*-{
    this.setMax();
  }-*/;

  /**
   * Sets the rating scales minimum value.
   * 
   * @param min
   */
  public final native void setMin(double min) /*-{
    this.setMin(
      min
    );
  }-*/;

  /**
   * Sets the rating scales minimum value.
   * 
   * @param min
   */
  public final native void setMin() /*-{
    this.setMin();
  }-*/;

  /**
   * Sets the number of ratings taken into account when computing the average value.
   * 
   * @param numRaters
   */
  public final native void setNumRaters(double numRaters) /*-{
    this.setNumRaters(
      numRaters
    );
  }-*/;

  /**
   * Sets the number of ratings taken into account when computing the average value.
   * 
   * @param numRaters
   */
  public final native void setNumRaters() /*-{
    this.setNumRaters();
  }-*/;

  /**
   * Sets the programmatic value that describes the aspect thats being rated, if not specified, the rating is an overall rating.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the programmatic value that describes the aspect thats being rated, if not specified, the rating is an overall rating.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the rating value.
   * 
   * @param value
   */
  public final native void setValue(double value) /*-{
    this.setValue(
      value
    );
  }-*/;

  /**
   * Sets the rating value.
   * 
   * @param value
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

}
