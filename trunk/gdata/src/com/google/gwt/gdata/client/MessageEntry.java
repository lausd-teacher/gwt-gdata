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
 * Extension class for manipulating entries of the Message kind.
 */
public class MessageEntry
    extends com.google.gwt.gdata.client.Entry<MessageEntry> {

  /**
   * Constructs a message entry.
   * 
   * @return A MessageEntry object.
   */
  public static native MessageEntry newInstance() /*-{
    return new $wnd.google.gdata.MessageEntry();
  }-*/;

  protected MessageEntry() { }

  /**
   * Adds a new person description.
   * 
   * @param whoList Person description to add.
   */
  public final native void addWhoList(Who whoList) /*-{
    this.addWhoList(whoList);
  }-*/;

  /**
   * Returns the geo pt. This element is optional.
   * 
   * @return Geo pt.
   */
  public final native GeoPt getGeoPt() /*-{
    return this.getGeoPt();
  }-*/;

  /**
   * Returns the rating. This element is optional.
   * 
   * @return Rating.
   */
  public final native Rating getRating() /*-{
    return this.getRating();
  }-*/;

  /**
   * Returns the time period description. This element is optional.
   * 
   * @return Time period description.
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
   * 
   * @param geoPt Geo pt.
   */
  public final native void setGeoPt(GeoPt geoPt) /*-{
    this.setGeoPt(geoPt);
  }-*/;

  /**
   * Sets the rating. This element is optional.
   * 
   * @param rating Rating.
   */
  public final native void setRating(Rating rating) /*-{
    this.setRating(rating);
  }-*/;

  /**
   * Sets the time period description. This element is optional.
   * 
   * @param time Time period description.
   */
  public final native void setTime(When time) /*-{
    this.setTime(time);
  }-*/;

  /**
   * Sets the person descriptions.
   * 
   * @param whoList Person descriptions, where each person description is added
   * using addWhoList().
   */
  public final native void setWhoList(Who[] whoList) /*-{
    this.setWhoList(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(whoList)
    );
  }-*/;

}