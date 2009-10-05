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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.Rating;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Describes a Sidewiki entry in the feed of Sidewiki entries. Defined in gdata.js
 */
public class SidewikiEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a sidewiki entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native SidewikiEntry newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiEntry();
  }-*/;

  protected SidewikiEntry() { }

  /**
   * Returns the Sidewiki entry source. This element is optional.
   * 
   * @return Sidewiki entry source or undefined for none.
   */
  public final native Source getEntrySource() /*-{
    return this.getEntrySource();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native SidewikiLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the Entry ratings given by all users and by the user issued the request. This element is optional.
   * 
   * @return Entry ratings given by all users and by the user issued the request or undefined for none.
   */
  public final native Rating getRating() /*-{
    return this.getRating();
  }-*/;

  /**
   * Returns the Sidewiki author id. This element is required.
   * 
   * @return Sidewiki author id or undefined for none.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Sets the Sidewiki entry source. This element is optional.
   */
  public final native void setEntrySource() /*-{
    this.setEntrySource();
  }-*/;

  /**
   * Sets the Sidewiki entry source. This element is optional.
   * 
   * @param entrySource Sidewiki entry source, or object to use as a parameter to the google.gdata.sidewiki.Source constructor, or undefined for none.
   */
  public final native void setEntrySource(Source entrySource) /*-{
    this.setEntrySource(
      entrySource
    );
  }-*/;

  /**
   * Sets the Entry ratings given by all users and by the user issued the request. This element is optional.
   */
  public final native void setRating() /*-{
    this.setRating();
  }-*/;

  /**
   * Sets the Entry ratings given by all users and by the user issued the request. This element is optional.
   * 
   * @param rating Entry ratings given by all users and by the user issued the request, or object to use as a parameter to the google.gdata.Rating constructor, or undefined for none.
   */
  public final native void setRating(Rating rating) /*-{
    this.setRating(
      rating
    );
  }-*/;

  /**
   * Sets the Sidewiki author id. This element is required.
   */
  public final native void setResourceId() /*-{
    this.setResourceId();
  }-*/;

  /**
   * Sets the Sidewiki author id. This element is required.
   * 
   * @param resourceId Sidewiki author id, or object to use as a parameter to the google.gdata.ResourceId constructor, or undefined for none.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(
      resourceId
    );
  }-*/;

}