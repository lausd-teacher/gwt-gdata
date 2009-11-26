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

package com.google.gwt.gdata.client.batch;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Signals that feed processing was interrupted.
 */
public class Interrupted extends JavaScriptObject {

  /**
   * Constructs an interrupted.
   */
  public static native Interrupted newInstance() /*-{
    return new $wnd.google.gdata.batch.Interrupted();
  }-*/;

  protected Interrupted() { }

  /**
   * Returns the error message explaining what went wrong while processing
   * the request. This attribute is optional.
   * 
   * @return Error message explaining what went wrong while processing the
   * request.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the MIME type of the content of this element.
   * This attribute is optional.
   * 
   * @return MIME type of the content of this element.
   */
  public final native String getContentType() /*-{
    return this.getContentType();
  }-*/;

  /**
   * Returns the number of entries for which processing failed.
   * This attribute is required.
   * 
   * @return Number of entries for which processing failed.
   */
  public final native double getErrorCount() /*-{
    return this.getErrorCount();
  }-*/;

  /**
   * Returns the reason. This attribute is optional.
   * 
   * @return Reason.
   */
  public final native String getReason() /*-{
    return this.getReason();
  }-*/;

  /**
   * Returns the number of entries parsed but not processed.
   * This attribute is required.
   * 
   * @return Number of entries parsed but not processed.
   */
  public final native double getSkippedCount() /*-{
    return this.getSkippedCount();
  }-*/;

  /**
   * Returns the number of entries processed successfully.
   * This attribute is required.
   * 
   * @return Number of entries processed successfully.
   */
  public final native double getSuccessCount() /*-{
    return this.getSuccessCount();
  }-*/;

  /**
   * Returns the number of entries that were parsed.
   * This attribute is required.
   * 
   * @return Number of entries that were parsed.
   */
  public final native double getTotalCount() /*-{
    return this.getTotalCount();
  }-*/;

  /**
   * Sets the error message explaining what went wrong while processing
   * the request. This attribute is optional.
   * 
   * @param content Error message explaining what went wrong while processing
   * the request.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the MIME type of the content of this element.
   * This attribute is optional.
   * 
   * @param contentType MIME type of the content of this element.
   */
  public final native void setContentType(String contentType) /*-{
    this.setContentType(contentType);
  }-*/;

  /**
   * Sets the number of entries for which processing failed.
   * This attribute is required.
   * 
   * @param errorCount Number of entries for which processing failed.
   */
  public final native void setErrorCount(double errorCount) /*-{
    this.setErrorCount(errorCount);
  }-*/;

  /**
   * Sets the reason. This attribute is optional.
   * 
   * @param reason Reason.
   */
  public final native void setReason(String reason) /*-{
    this.setReason(reason);
  }-*/;

  /**
   * Sets the number of entries parsed but not processed.
   * This attribute is required.
   * 
   * @param skippedCount Number of entries parsed but not processed.
   */
  public final native void setSkippedCount(double skippedCount) /*-{
    this.setSkippedCount(skippedCount);
  }-*/;

  /**
   * Sets the number of entries processed successfully.
   * This attribute is required.
   * 
   * @param successCount Number of entries processed successfully.
   */
  public final native void setSuccessCount(double successCount) /*-{
    this.setSuccessCount(successCount);
  }-*/;

  /**
   * Sets the number of entries that were parsed. This attribute is required.
   * 
   * @param totalCount Number of entries that were parsed.
   */
  public final native void setTotalCount(double totalCount) /*-{
    this.setTotalCount(totalCount);
  }-*/;

}