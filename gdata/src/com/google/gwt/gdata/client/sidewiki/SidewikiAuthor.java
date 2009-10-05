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

import com.google.gwt.gdata.client.atom.Person;
import com.google.gwt.gdata.client.Rating;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Sidewiki author.
 */
public class SidewikiAuthor extends Person {

  /**
   * Constructs a sidewiki author.
   * 
   * @return A SidewikiAuthor object.
   */
  public static native SidewikiAuthor newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiAuthor();
  }-*/;

  protected SidewikiAuthor() { }

  /**
   * Returns the Sidewiki author description. This element is optional.
   * 
   * @return Sidewiki author description.
   */
  public final native SidewikiUserDescription getDescription() /*-{
    return this.getDescription();
  }-*/;

  /**
   * Returns the entries number. This element is optional.
   * 
   * @return Entries number.
   */
  public final native EntriesNumber getNumEntries() /*-{
    return this.getNumEntries();
  }-*/;

  /**
   * Returns the user rating given by the user issued the request.
   * This element is optional.
   * 
   * @return User rating given by the user issued the request.
   */
  public final native Rating getRating() /*-{
    return this.getRating();
  }-*/;

  /**
   * Returns the Sidewiki author id. This element is required.
   * 
   * @return Sidewiki author id.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Returns the user portrait thumbnail url. This element is optional.
   * 
   * @return User portrait thumbnail url.
   */
  public final native SidewikiThumbnail getThumbnail() /*-{
    return this.getThumbnail();
  }-*/;

  /**
   * Sets the Sidewiki author description. This element is optional.
   * 
   * @param description Sidewiki author description.
   */
  public final native void setDescription(SidewikiUserDescription description) /*-{
    this.setDescription(description);
  }-*/;

  /**
   * Sets the entries number. This element is optional.
   * 
   * @param numEntries Entries number.
   */
  public final native void setNumEntries(EntriesNumber numEntries) /*-{
    this.setNumEntries(numEntries);
  }-*/;

  /**
   * Sets the user rating given by the user issued the request.
   * This element is optional.
   * 
   * @param rating User rating given by the user issued the request.
   */
  public final native void setRating(Rating rating) /*-{
    this.setRating(rating);
  }-*/;

  /**
   * Sets the Sidewiki author id. This element is required.
   * 
   * @param resourceId Sidewiki author id.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(resourceId);
  }-*/;

  /**
   * Sets the user portrait thumbnail url. This element is optional.
   * 
   * @param thumbnail User portrait thumbnail url.
   */
  public final native void setThumbnail(SidewikiThumbnail thumbnail) /*-{
    this.setThumbnail(thumbnail);
  }-*/;

}