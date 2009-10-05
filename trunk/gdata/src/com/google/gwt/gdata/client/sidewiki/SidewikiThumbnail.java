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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The thumbnail for a user portrait or the web page a Sidewiki entry is about.
 */
public class SidewikiThumbnail extends JavaScriptObject {

  /**
   * Constructs a sidewiki thumbnail.
   * 
   * @return A SidewikiThumbnail object.
   */
  public static native SidewikiThumbnail newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiThumbnail();
  }-*/;

  protected SidewikiThumbnail() { }

  /**
   * Returns the thumbnail url. This attribute is optional.
   * 
   * @return Thumbnail url.
   */
  public final native String getValue() /*-{
    return this.getValue();
  }-*/;

  /**
   * Sets the thumbnail url. This attribute is optional.
   * 
   * @param value Thumbnail url.
   */
  public final native void setValue(String value) /*-{
    this.setValue(value);
  }-*/;

}