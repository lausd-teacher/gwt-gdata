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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The processing status of this item/feed.
 */
public class ProcessingStatus extends JavaScriptObject {

  /**
   * Indicates that no items were able to be processed.
   */
  public static final String STATUS_FAILURE = getConstant("STATUS_FAILURE");

  /**
   * Indicates that the current item/feed is being processed.
   */
  public static final String STATUS_IN_PROGRESS = getConstant("STATUS_IN_PROGRESS");

  /**
   * Indicates that one or more (but not all) items had a processing error.
   */
  public static final String STATUS_PARTIAL_SUCCESS = getConstant("STATUS_PARTIAL_SUCCESS");

  /**
   * Indicates that all of the item(s) was/were processed successfully.
   */
  public static final String STATUS_SUCCESS = getConstant("STATUS_SUCCESS");

  /**
   * Indicates that the processing status information is not currently known.
   */
  public static final String STATUS_UNKNOWN = getConstant("STATUS_UNKNOWN");

  /**
   * Indicates that the current item/feed has not been processed yet (for instance, if it has never been uploaded).
   */
  public static final String STATUS_UNPROCESSED = getConstant("STATUS_UNPROCESSED");

  /**
   * Constructs a processing status using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: feedErrors, itemsInserted, itemsProcessed, and status.
   */
  public static native ProcessingStatus newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ProcessingStatus(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.ProcessingStatus[name];
  }-*/;

  protected ProcessingStatus() { }

  /**
   * Returns the feed errors. This element is optional.
   * 
   * @return Feed errors or undefined for none.
   */
  public final native FeedErrors getFeedErrors() /*-{
    return this.getFeedErrors();
  }-*/;

  /**
   * Returns the items inserted. This element is optional.
   * 
   * @return Items inserted or undefined for none.
   */
  public final native ItemsInserted getItemsInserted() /*-{
    return this.getItemsInserted();
  }-*/;

  /**
   * Returns the items processed. This element is optional.
   * 
   * @return Items processed or undefined for none.
   */
  public final native ItemsProcessed getItemsProcessed() /*-{
    return this.getItemsProcessed();
  }-*/;

  /**
   * Returns the status. This attribute is required.
   * 
   * @return Status or undefined for none.
   */
  public final native String getStatus() /*-{
    return this.getStatus();
  }-*/;

  /**
   * Sets the feed errors. This element is optional.
   */
  public final native void setFeedErrors() /*-{
    this.setFeedErrors();
  }-*/;

  /**
   * Sets the feed errors. This element is optional.
   * 
   * @param feedErrors Feed errors, or object to use as a parameter to the google.gdata.gbase.FeedErrors constructor, or undefined for none.
   */
  public final native void setFeedErrors(FeedErrors feedErrors) /*-{
    this.setFeedErrors(
      feedErrors
    );
  }-*/;

  /**
   * Sets the items inserted. This element is optional.
   */
  public final native void setItemsInserted() /*-{
    this.setItemsInserted();
  }-*/;

  /**
   * Sets the items inserted. This element is optional.
   * 
   * @param itemsInserted Items inserted, or object to use as a parameter to the google.gdata.gbase.ItemsInserted constructor, or undefined for none.
   */
  public final native void setItemsInserted(ItemsInserted itemsInserted) /*-{
    this.setItemsInserted(
      itemsInserted
    );
  }-*/;

  /**
   * Sets the items processed. This element is optional.
   */
  public final native void setItemsProcessed() /*-{
    this.setItemsProcessed();
  }-*/;

  /**
   * Sets the items processed. This element is optional.
   * 
   * @param itemsProcessed Items processed, or object to use as a parameter to the google.gdata.gbase.ItemsProcessed constructor, or undefined for none.
   */
  public final native void setItemsProcessed(ItemsProcessed itemsProcessed) /*-{
    this.setItemsProcessed(
      itemsProcessed
    );
  }-*/;

  /**
   * Sets the status. This attribute is required.
   */
  public final native void setStatus() /*-{
    this.setStatus();
  }-*/;

  /**
   * Sets the status. This attribute is required.
   * 
   * @param status Status or undefined for none.
   */
  public final native void setStatus(String status) /*-{
    this.setStatus(
      status
    );
  }-*/;

}
