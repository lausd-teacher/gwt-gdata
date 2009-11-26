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
 * Describes server status information about how an entry was processed in a
 * batch operation.
 */
public class Status extends JavaScriptObject {

  /**
   * Constructs a status.
   */
  public static native Status newInstance() /*-{
    return new $wnd.google.gdata.batch.Status();
  }-*/;

  protected Status() { }

  /**
   * Returns the HTTP response code. This attribute is required.
   * 
   * @return HTTP response code.
   */
  public final native double getCode() /*-{
    return this.getCode();
  }-*/;

  /**
   * Returns the error message explaining what went wrong while processing
   * the request. This attribute is optional.
   * 
   * @return Error message explaining what went wrong while processing
   * the request.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the MIME type for the content of the error message contained in
   * this element. This attribute is optional.
   * 
   * @return MIME type for the content of the error message contained in
   * this element.
   */
  public final native String getContentType() /*-{
    return this.getContentType();
  }-*/;

  /**
   * Returns the short message describing this status. 
   * This attribute is required
   * 
   * @return Short message describing this status.
   */
  public final native String getReason() /*-{
    return this.getReason();
  }-*/;

  /**
   * Sets the HTTP response code. This attribute is required.
   * 
   * @param code HTTP response code.
   */
  public final native void setCode(double code) /*-{
    this.setCode(code);
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
   * Sets the MIME type for the content of the error message contained in
   * this element. This attribute is optional.
   * 
   * @param contentType MIME type for the content of the error message
   * contained in this element.
   */
  public final native void setContentType(String contentType) /*-{
    this.setContentType(contentType);
  }-*/;

  /**
   * Sets the short message describing this status.
   * This attribute is required.
   * 
   * @param reason Short message describing this status.
   */
  public final native void setReason(String reason) /*-{
    this.setReason(reason);
  }-*/;

}