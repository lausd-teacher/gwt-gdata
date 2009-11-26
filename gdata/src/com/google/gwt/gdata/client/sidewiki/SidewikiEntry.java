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

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.Rating;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Describes a Sidewiki entry in the feed of Sidewiki entries.
 */
public class SidewikiEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a sidewiki entry.
   * 
   * @return A SidewikiEntry object.
   */
  public static native SidewikiEntry newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiEntry();
  }-*/;

  protected SidewikiEntry() { }
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(SidewikiEntryCallback callback) {
    this.delete(callback, null);
  }
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteEntry(SidewikiEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the Sidewiki entry source. This element is optional.
   * 
   * @return Sidewiki entry source.
   */
  public final native Source getEntrySource() /*-{
    return this.getEntrySource();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents or undefined for none.
   */
  public final native SidewikiLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the Entry ratings given by all users and by the user issued the
   * request. This element is optional.
   * 
   * @return Entry ratings given by all users and by the user issued the
   * request or undefined for none.
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
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(SidewikiEntryCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(SidewikiEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Returns the usefulness of entry. This element is optional.
   * 
   * @return Usefulness of entry.
   */
  public final native Usefulness getUsefulness() /*-{
    return this.getUsefulness();
  }-*/;

  /**
   * Sets the Sidewiki entry source. This element is optional.
   * 
   * @param entrySource Sidewiki entry source.
   */
  public final native void setEntrySource(Source entrySource) /*-{
    this.setEntrySource(entrySource);
  }-*/;

  /**
   * Sets the Entry ratings given by all users and by the user issued the
   * request. This element is optional.
   * 
   * @param rating Entry ratings given by all users and by the user issued the
   * request.
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
   * Sets the usefulness of entry. This element is optional.
   * 
   * @param usefulness Usefulness of entry.
   */
  public final native void setUsefulness(Usefulness usefulness) /*-{
    this.setUsefulness(usefulness);
  }-*/;

  /**
   * Updates the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(SidewikiEntryCallback callback) {
    this.update(callback, null);
  }

  /**
   * Updates the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(SidewikiEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }

}