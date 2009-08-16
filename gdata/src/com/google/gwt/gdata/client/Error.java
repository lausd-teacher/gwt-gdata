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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.impl.MapString;

/**
 * Represents a GData error.
 */
public class Error extends JavaScriptObject {
  
  /**
   * Constructs an error.
   * @return An Error object.
   */
  public static native Error newInstance() /*-{
    return {};
  }-*/;

  protected Error() { }
  
  /**
   * Returns the error cause.
   * @return Error cause.
   */
  public final native ErrorCause getCause() /*-{
    return this.cause;
  }-*/;
  
  /**
   * Returns the error file name.
   * @return Error file name.
   */
  public final native String getFileName() /*-{
    return this.fileName;
  }-*/;
  
  /**
   * Returns the error line number.
   * @return Error line number.
   */
  public final native double getLineNumber() /*-{
    return this.lineNumber;
  }-*/;
  
  /**
   * Returns the error message.
   * @return Error message.
   */
  public final native String getMessage() /*-{
    return this.message;
  }-*/;

  /**
   * Returns the error name.
   * @return Error name.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * Returns the error stack.
   * @return Error stack.
   */
  public final native String getStack() /*-{
    return this.stack;
  }-*/;

  /**
   * Returns the error's status text content type.
   * @return Status text content type.
   */
  public final native String getStatusTextContentType() /*-{
    return this.statusTextContentType;
  }-*/;
  
  /**
   * Describes the cause of an error.
   */
  public static class ErrorCause extends JavaScriptObject {
    
    protected ErrorCause() { }
    
    /**
     * Returns the server response headers.
     * @return The response headers.
     */
    public final native MapString getResponseHeaders() /*-{
      return this.responseHeaders;
    }-*/;
    
    /**
     * Returns the server response text.
     * @return The response text.
     */
    public final native String getResponseText() /*-{
      return this.responseText;
    }-*/;
    
    /**
     * Returns the server response status.
     * @return The response status.
     */
    public final native int getStatus() /*-{
      return this.status;
    }-*/;
    
    /**
     * Returns the server response status text.
     * @return The response status text.
     */
    public final native String getStatusText() /*-{
      return this.statusText;
    }-*/;
  }
}
