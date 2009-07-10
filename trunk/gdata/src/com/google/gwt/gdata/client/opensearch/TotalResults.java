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

package com.google.gwt.gdata.client.opensearch;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes the total number of results associated with this feed.
 */
public class TotalResults extends JavaScriptObject {

  /**
   * Constructs a total results count.
   */
  public static native TotalResults newInstance() /*-{
    return new $wnd.google.gdata.opensearch.TotalResults();
  }-*/;

  protected TotalResults() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value.
   */
  public final native double getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param value Value.
   */
  public final native void setValue(double value) /*-{
    this.setValue(value);
  }-*/;

}