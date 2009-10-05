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

/**
 * Extension class for manipulating entries of the Message kind. Defined in gdata.js
 */
public class MessageEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a message entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MessageEntry newInstance() /*-{
    return new $wnd.google.gdata.MessageEntry();
  }-*/;

  protected MessageEntry() { }

  /**
   * Adds a new person description.
   * 
   * @param whoList Person description to add, or object to use as a parameter to the google.gdata.Who constructor.
   */
  public final native void addWhoList(Who whoList) /*-{
    this.addWhoList(
      whoList
    );
  }-*/;

  /**
   * Returns the geo pt. This element is optional.
   * 
   * @return Geo pt or undefined for none.
   */
  public final native GeoPt getGeoPt() /*-{
    return this.getGeoPt();
  }-*/;

  /**
   * Returns the rating. This element is optional.
   * 
   * @return Rating or undefined for none.
   */
  public final native Rating getRating() /*-{
    return this.getRating();
  }-*/;

  /**
   * Returns the time period description. This element is optional.
   * 
   * @return Time period description or undefined for none.
   */
  public final native When getTime() /*-{
    return this.getTime();
  }-*/;

  /**
   * Returns the person descriptions.
   * 
   * @return Person descriptions.
   */
  public final native Who[] getWhoList() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWhoList());
  }-*/;

  /**
   * Sets the geo pt. This element is optional.
   */
  public final native void setGeoPt() /*-{
    this.setGeoPt();
  }-*/;

  /**
   * Sets the geo pt. This element is optional.
   * 
   * @param geoPt Geo pt, or object to use as a parameter to the google.gdata.GeoPt constructor, or undefined for none.
   */
  public final native void setGeoPt(GeoPt geoPt) /*-{
    this.setGeoPt(
      geoPt
    );
  }-*/;

  /**
   * Sets the rating. This element is optional.
   */
  public final native void setRating() /*-{
    this.setRating();
  }-*/;

  /**
   * Sets the rating. This element is optional.
   * 
   * @param rating Rating, or object to use as a parameter to the google.gdata.Rating constructor, or undefined for none.
   */
  public final native void setRating(Rating rating) /*-{
    this.setRating(
      rating
    );
  }-*/;

  /**
   * Sets the time period description. This element is optional.
   */
  public final native void setTime() /*-{
    this.setTime();
  }-*/;

  /**
   * Sets the time period description. This element is optional.
   * 
   * @param time Time period description, or object to use as a parameter to the google.gdata.When constructor, or undefined for none.
   */
  public final native void setTime(When time) /*-{
    this.setTime(
      time
    );
  }-*/;

  /**
   * Sets the person descriptions.
   */
  public final native void setWhoList() /*-{
    this.setWhoList();
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param whoList Person descriptions, where each person description is added using the addWhoList() function, or undefined to clear the person descriptions.
   */
  public final native void setWhoList(Who[] whoList) /*-{
    this.setWhoList(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(whoList)
    );
  }-*/;

}