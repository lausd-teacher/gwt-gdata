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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class MediaThumbnail extends JavaScriptObject {

  /**
   * Constructs a media thumbnail using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaThumbnail newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaThumbnail(
      params
    );
  }-*/;

  /**
   * Constructs a media thumbnail using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaThumbnail newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaThumbnail();
  }-*/;

  protected MediaThumbnail() { }

  /**
   * Returns the height of the thumbnail.
   * 
   * @return
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns the time offset in relation to the media object.
   * 
   * @return
   */
  public final native String getTime() /*-{
    return this.getTime();
  }-*/;

  /**
   * Returns the url of the thumbnail.
   * 
   * @return
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width of the thumbnail.
   * 
   * @return
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the height of the thumbnail.
   * 
   * @param height
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(
      height
    );
  }-*/;

  /**
   * Sets the height of the thumbnail.
   * 
   * @param height
   */
  public final native void setHeight() /*-{
    this.setHeight();
  }-*/;

  /**
   * Sets the time offset in relation to the media object.
   * 
   * @param time
   */
  public final native void setTime(String time) /*-{
    this.setTime(
      time
    );
  }-*/;

  /**
   * Sets the time offset in relation to the media object.
   * 
   * @param time
   */
  public final native void setTime() /*-{
    this.setTime();
  }-*/;

  /**
   * Sets the url of the thumbnail.
   * 
   * @param url
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(
      url
    );
  }-*/;

  /**
   * Sets the url of the thumbnail.
   * 
   * @param url
   */
  public final native void setUrl() /*-{
    this.setUrl();
  }-*/;

  /**
   * Sets the width of the thumbnail.
   * 
   * @param width
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(
      width
    );
  }-*/;

  /**
   * Sets the width of the thumbnail.
   * 
   * @param width
   */
  public final native void setWidth() /*-{
    this.setWidth();
  }-*/;

}
