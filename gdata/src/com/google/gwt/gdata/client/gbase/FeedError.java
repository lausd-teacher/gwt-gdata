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
 * The description of an error while processing a Google Base datafeed.
 */
public class FeedError extends JavaScriptObject {

  /**
   * Constructs a feed error.
   * @return A FeedError object.
   */
  public static native FeedError newInstance() /*-{
    return new $wnd.google.gdata.gbase.FeedError();
  }-*/;

  protected FeedError() { }

  /**
   * Returns the id. This attribute is required.
   * 
   * @return Id.
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns the line. This attribute is optional.
   * 
   * @return Line.
   */
  public final native double getLine() /*-{
    return this.getLine();
  }-*/;

  /**
   * Returns the value. This attribute is optional.
   * 
   * @return Value.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the id. This attribute is required.
   * 
   * @param id Id.
   */
  public final native void setId(String id) /*-{
    this.setId(id);
  }-*/;

  /**
   * Sets the line. This attribute is optional.
   * 
   * @param line Line.
   */
  public final native void setLine(double line) /*-{
    this.setLine(line);
  }-*/;

  /**
   * Sets the value. This attribute is optional.
   * 
   * @param value Value.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}