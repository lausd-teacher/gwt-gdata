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

/**
 * A GData transport response.
 */
public class TransportResponse extends JavaScriptObject {
  
  /**
   * Constructs a Transport Response.
   * 
   * @return A TransportResponse object.
   */
  public static native TransportResponse newInstance() /*-{
    return new $wnd.google.gdata.client.TransportResponse();
  }-*/;

  protected TransportResponse() { }

  /**
   * Adds a header to the response.
   * 
   * @param headerKey The key used to access the header.
   * @param headerValue The value of the header.
   */
  public final native void addHeader(String headerKey, String headerValue) /*-{
    this.addHeader(headerKey,headerValue);
  }-*/;

  /**
   * Retrieves the header value with the given key.
   * 
   * @param headerKey The key used to access the header.
   * @return The value of the header.
   */
  public final native String getResponseHeader(String headerKey) /*-{
    return this.getResponseHeader(headerKey);
  }-*/;

  /**
   * Retrieves the response text.
   * 
   * @return The response text.
   */
  public final native String getResponseText() /*-{
    return this.getResponseText();
  }-*/;

  /**
   * Retrieves the response text as xml.
   * 
   * @return The response text as xml.
   */
  public final native String getResponseXml() /*-{
    return this.getResponseXml();
  }-*/;

  /**
   * Retrieves the http status code of the response.
   * 
   * @return The http status code of the response.
   */
  public final native double getStatus() /*-{
    return this.getStatus();
  }-*/;

  /**
   * Retrieves the text associated with the http status code of the response.
   * 
   * @return The text associated with the http status code of the response.
   */
  public final native String getStatusText() /*-{
    return this.getStatusText();
  }-*/;

  /**
   * Sets the response text.
   * 
   * @param responseText The response text.
   */
  public final native void setResponseText(String responseText) /*-{
    this.setResponseText(responseText);
  }-*/;

  /**
   * Sets the response text as xml.
   * 
   * @param responseXml The response text as xml.
   */
  public final native void setResponseXml(String responseXml) /*-{
    this.setResponseXml(responseXml);
  }-*/;

  /**
   * Sets the http status code of the response.
   * 
   * @param status The http status code of the response.
   */
  public final native void setStatus(double status) /*-{
    this.setStatus(status);
  }-*/;

  /**
   * Sets the text associated with the http status code of the response.
   * 
   * @param statusText The text associated with the http status code of the response.
   */
  public final native void setStatusText(String statusText) /*-{
    this.setStatusText(statusText);
  }-*/;

}