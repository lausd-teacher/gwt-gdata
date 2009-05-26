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
import com.google.gwt.gdata.client.mediarss.MediaContent;

/**
 * Comment unavailable.
 */
public class MediaEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.MediaEntry;
  }-*/;

  /**
   * Constructs a Google Base media entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.MediaEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base media entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.MediaEntry();
  }-*/;

  protected MediaEntry() { }

  /**
   * Returns the media content.
   * 
   * @return
   */
  public final native MediaContent getMediaContent() /*-{
    return this.getMediaContent();
  }-*/;

  /**
   * Sets the media content.
   * 
   * @param mediaContent
   */
  public final native void setMediaContent(JavaScriptObject mediaContent) /*-{
    this.setMediaContent(
      mediaContent
    );
  }-*/;

  /**
   * Sets the media content.
   * 
   * @param mediaContent
   */
  public final native void setMediaContent() /*-{
    this.setMediaContent();
  }-*/;

  /**
   * Sets the media content.
   * 
   * @param mediaContent
   */
  public final native void setMediaContent(MediaContent mediaContent) /*-{
    this.setMediaContent(
      mediaContent
    );
  }-*/;

}
