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

import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;

/**
 * Describes an entry in the feed of public item types.
 */
public class ItemTypesEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a Google Base item type entry.
   * @return An ItemTypesEntry object.
   */
  public static native ItemTypesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemTypesEntry();
  }-*/;

  protected ItemTypesEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(ItemTypesEntryCallback callback) {
    this.delete(callback, null);
  }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteEntry(ItemTypesEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the gm attributes. This element is optional.
   * 
   * @return Gm attributes.
   */
  public final native GmAttributes getAttributes() /*-{
    return this.getAttributes();
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
   * Returns the item type as defined in /itemtypes feed.
   * This element is required.
   * 
   * @return Item type as defined in /itemtypes feed.
   */
  public final native GmItemType getItemType() /*-{
    return this.getItemType();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry.
   */
  public final native com.google.gwt.gdata.client.atom.Link
      getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(ItemTypesEntryCallback callback) {
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
  public final void getSelf(ItemTypesEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Sets the gm attributes. This element is optional.
   * 
   * @param attributes Gm attributes.
   */
  public final native void setAttributes(GmAttributes attributes) /*-{
    this.setAttributes(attributes);
  }-*/;

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
  public final native void setBatchInterrupted(Interrupted batchInterrupted) /*-{
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
   * Sets the item type as defined in itemtypes feed. This element is required.
   * 
   * @param itemType Item type as defined in /itemtypes feed.
   */
  public final native void setItemType(GmItemType itemType) /*-{
    this.setItemType(itemType);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(ItemTypesEntryCallback callback) {
    this.update(callback, null);
  }

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(ItemTypesEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }
  
}