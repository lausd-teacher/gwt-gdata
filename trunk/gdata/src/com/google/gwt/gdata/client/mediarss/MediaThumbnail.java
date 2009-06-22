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
 * Describes a media thumbnail.
 */
public class MediaThumbnail extends JavaScriptObject {

  /**
   * Constructs a media thumbnail using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: height, time, url, and width.
   */
  public static native MediaThumbnail newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaThumbnail(
      params
    );
  }-*/;

  protected MediaThumbnail() { }

  /**
   * Returns the height of the thumbnail. This attribute is optional.
   * 
   * @return Height of the thumbnail or undefined for none.
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns the time offset in relation to the media object. This attribute is optional.
   * 
   * @return Time offset in relation to the media object or undefined for none.
   */
  public final native String getTime() /*-{
    return this.getTime();
  }-*/;

  /**
   * Returns the url of the thumbnail. This attribute is required.
   * 
   * @return Url of the thumbnail or undefined for none.
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width of the thumbnail. This attribute is optional.
   * 
   * @return Width of the thumbnail or undefined for none.
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the height of the thumbnail. This attribute is optional.
   */
  public final native void setHeight() /*-{
    this.setHeight();
  }-*/;

  /**
   * Sets the height of the thumbnail. This attribute is optional.
   * 
   * @param height Height of the thumbnail or undefined for none.
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(
      height
    );
  }-*/;

  /**
   * Sets the time offset in relation to the media object. This attribute is optional.
   */
  public final native void setTime() /*-{
    this.setTime();
  }-*/;

  /**
   * Sets the time offset in relation to the media object. This attribute is optional.
   * 
   * @param time Time offset in relation to the media object or undefined for none.
   */
  public final native void setTime(String time) /*-{
    this.setTime(
      time
    );
  }-*/;

  /**
   * Sets the url of the thumbnail. This attribute is required.
   */
  public final native void setUrl() /*-{
    this.setUrl();
  }-*/;

  /**
   * Sets the url of the thumbnail. This attribute is required.
   * 
   * @param url Url of the thumbnail or undefined for none.
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(
      url
    );
  }-*/;

  /**
   * Sets the width of the thumbnail. This attribute is optional.
   */
  public final native void setWidth() /*-{
    this.setWidth();
  }-*/;

  /**
   * Sets the width of the thumbnail. This attribute is optional.
   * 
   * @param width Width of the thumbnail or undefined for none.
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(
      width
    );
  }-*/;

}
