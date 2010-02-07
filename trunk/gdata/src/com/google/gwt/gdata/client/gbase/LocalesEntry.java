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

import com.google.gwt.gdata.client.batch.Interrupted;
import com.google.gwt.gdata.client.batch.Operation;
import com.google.gwt.gdata.client.batch.Status;

/**
 * Describes an entry in the feed of locales.
 */
public class LocalesEntry
    extends com.google.gwt.gdata.client.Entry<LocalesEntry> {

  /**
   * Constructs a Google Base locale entry.
   * @return A LocalesEntry object.
   */
  public static native LocalesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.LocalesEntry();
  }-*/;

  protected LocalesEntry() { }

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
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry.
   */
  public final native com.google.gwt.gdata.client.atom.Link
      getRelatedLink() /*-{
    return this.getRelatedLink();
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

}