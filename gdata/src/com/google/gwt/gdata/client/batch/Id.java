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
 * Identifies an entry inside of a batch feed.
 */
public class Id extends JavaScriptObject {

  /**
   * Constructs an entry id.
   */
  public static native Id newInstance() /*-{
    return new $wnd.google.gdata.batch.Id();
  }-*/;

  protected Id() { }

  /**
   * Returns the value. This attribute is required.
   * 
   * @return Value
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Sets the value. This attribute is required.
   * 
   * @param id Value.
   */
  public final native void setId(String id) /*-{
    this.setId(id);
  }-*/;

}