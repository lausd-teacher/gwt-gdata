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
 * Describes a rating.
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
   * Constructs a rating using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: average, max, min, numRaters, rel, and value.
   */
  public static native Rating newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Rating(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Rating[name];
  }-*/;

  protected Rating() { }

  /**
   * Returns the average rating. This attribute is optional.
   * 
   * @return Average rating or undefined for none.
   */
  public final native double getAverage() /*-{
    return this.getAverage();
  }-*/;

  /**
   * Returns the rating scale's maximum value. This attribute is optional.
   * 
   * @return Rating scale's maximum value or undefined for none.
   */
  public final native double getMax() /*-{
    return this.getMax();
  }-*/;

  /**
   * Returns the rating scale's minimum value. This attribute is optional.
   * 
   * @return Rating scale's minimum value or undefined for none.
   */
  public final native double getMin() /*-{
    return this.getMin();
  }-*/;

  /**
   * Returns the number of ratings taken into account when computing the average value. This attribute is optional.
   * 
   * @return Number of ratings taken into account when computing the average value or undefined for none.
   */
  public final native double getNumRaters() /*-{
    return this.getNumRaters();
  }-*/;

  /**
   * Returns the programmatic value that describes the aspect that's being rated, if not specified, the rating is an overall rating. This attribute is optional.
   * 
   * @return Programmatic value that describes the aspect that's being rated, if not specified, the rating is an overall rating or undefined for none.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the rating value. This attribute is optional.
   * 
   * @return Rating value or undefined for none.
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the average rating. This attribute is optional.
   */
  public final native void setAverage() /*-{
    this.setAverage();
  }-*/;

  /**
   * Sets the average rating. This attribute is optional.
   * 
   * @param average Average rating or undefined for none.
   */
  public final native void setAverage(double average) /*-{
    this.setAverage(
      average
    );
  }-*/;

  /**
   * Sets the rating scale's maximum value. This attribute is optional.
   */
  public final native void setMax() /*-{
    this.setMax();
  }-*/;

  /**
   * Sets the rating scale's maximum value. This attribute is optional.
   * 
   * @param max Rating scale's maximum value or undefined for none.
   */
  public final native void setMax(double max) /*-{
    this.setMax(
      max
    );
  }-*/;

  /**
   * Sets the rating scale's minimum value. This attribute is optional.
   */
  public final native void setMin() /*-{
    this.setMin();
  }-*/;

  /**
   * Sets the rating scale's minimum value. This attribute is optional.
   * 
   * @param min Rating scale's minimum value or undefined for none.
   */
  public final native void setMin(double min) /*-{
    this.setMin(
      min
    );
  }-*/;

  /**
   * Sets the number of ratings taken into account when computing the average value. This attribute is optional.
   */
  public final native void setNumRaters() /*-{
    this.setNumRaters();
  }-*/;

  /**
   * Sets the number of ratings taken into account when computing the average value. This attribute is optional.
   * 
   * @param numRaters Number of ratings taken into account when computing the average value or undefined for none.
   */
  public final native void setNumRaters(double numRaters) /*-{
    this.setNumRaters(
      numRaters
    );
  }-*/;

  /**
   * Sets the programmatic value that describes the aspect that's being rated, if not specified, the rating is an overall rating. This attribute is optional.
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the programmatic value that describes the aspect that's being rated, if not specified, the rating is an overall rating. This attribute is optional.
   * 
   * @param rel Programmatic value that describes the aspect that's being rated, if not specified, the rating is an overall rating or undefined for none.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the rating value. This attribute is optional.
   */
  public final native void setValue() /*-{
    this.setValue();
  }-*/;

  /**
   * Sets the rating value. This attribute is optional.
   * 
   * @param value Rating value or undefined for none.
   */
  public final native void setValue(double value) /*-{
    this.setValue(
      value
    );
  }-*/;

}
