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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.CustomProperty;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.FeedLink;
import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.ResourceId;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;

/**
 * Describes a map entry.
 */
public class MapEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a map entry.
   * @return A MapEntry object.
   */
  public static native MapEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.MapEntry();
  }-*/;

  protected MapEntry() { }

  /**
   * Adds a new custom property.
   * 
   * @param customProperty Custom property to add. 
   */
  public final native void
      addCustomProperty(CustomProperty customProperty) /*-{
    this.addCustomProperty(customProperty);
  }-*/;
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  
  public final void deleteEntry(MapEntryCallback callback) {
    this.delete(callback, null);
  }
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  
  public final void deleteEntry(MapEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native MapsLink
      getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed
   * (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed
   * (without any query parameters).
   */
  public final native MapsLink getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the batch identifier. This element is optional.
   * 
   * @return Batch identifier.
   */
  public final native com.google.gwt.gdata.client.batch.Id getBatchId() /*-{
    return this.getBatchId();
  }-*/;

  /**
   * Returns the batch interruption information. This element is optional.
   * 
   * @return Batch interruption information.
   */
  public final native Interrupted getBatchInterrupted() /*-{
    return this.getBatchInterrupted();
  }-*/;

  /**
   * Returns the batch operation. This element is optional.
   * 
   * @return Batch operation.
   */
  public final native Operation getBatchOperation() /*-{
    return this.getBatchOperation();
  }-*/;

  /**
   * Returns the batch response status information. This element is optional.
   * 
   * @return Batch response status information.
   */
  public final native Status getBatchStatus() /*-{
    return this.getBatchStatus();
  }-*/;

  /**
   * Returns the custom properties.
   * 
   * @return Custom properties.
   */
  public final native CustomProperty[] getCustomProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCustomProperties());
  }-*/;
  
  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the nested feed link. This element is optional.
   * 
   * @return Nested feed link.
   */
  @SuppressWarnings("unchecked")
  public final native FeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the resource id. This element is optional.
   * 
   * @return Resource id.
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
  public final void getSelf(MapEntryCallback callback) {
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
  public final void getSelf(MapEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Sets the batch identifier. This element is optional.
   * 
   * @param batchId Batch identifier.
   */
  public final native void setBatchId(
      com.google.gwt.gdata.client.batch.Id batchId) /*-{
    this.setBatchId(batchId);
  }-*/;

  /**
   * Sets the batch interruption information. This element is optional.
   * 
   * @param batchInterrupted Batch interruption information.
   */
  public final native void setBatchInterrupted(
      Interrupted batchInterrupted) /*-{
    this.setBatchInterrupted(batchInterrupted);
  }-*/;

  /**
   * Sets the batch operation. This element is optional.
   * 
   * @param batchOperation Batch operation.
   */
  public final native void setBatchOperation(Operation batchOperation) /*-{
    this.setBatchOperation(batchOperation);
  }-*/;

  /**
   * Sets the batch response status information. This element is optional.
   * 
   * @param batchStatus Batch response status information.
   */
  public final native void setBatchStatus(Status batchStatus) /*-{
    this.setBatchStatus(batchStatus);
  }-*/;

  /**
   * Sets the custom properties.
   * 
   * @param customProperties Custom properties, where each custom property
   * is added using addCustomProperty().
   */
  public final native void setCustomProperties(
      CustomProperty[] customProperties) /*-{
    this.setCustomProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(customProperties)
    );
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(deleted);
  }-*/;

  /**
   * Sets the nested feed link. This element is optional.
   * 
   * @param feedLink Nested feed link.
   */
  @SuppressWarnings("unchecked")
  public final native void setFeedLink(FeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   * 
   * @param resourceId Resource id.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(resourceId);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(MapEntryCallback callback) {
    this.update(callback, null);
  }

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(MapEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }

}