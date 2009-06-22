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
 * Describes a media player.
 */
public class MediaPlayer extends JavaScriptObject {

  /**
   * Constructs a media player using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: height, url, and width.
   */
  public static native MediaPlayer newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaPlayer(
      params
    );
  }-*/;

  protected MediaPlayer() { }

  /**
   * Returns the height of the browser window. This attribute is optional.
   * 
   * @return Height of the browser window or undefined for none.
   */
  public final native double getHeight() /*-{
    return this.getHeight();
  }-*/;

  /**
   * Returns the url of the player console that plays the media. This attribute is required.
   * 
   * @return Url of the player console that plays the media or undefined for none.
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Returns the width of the browser window. This attribute is optional.
   * 
   * @return Width of the browser window or undefined for none.
   */
  public final native double getWidth() /*-{
    return this.getWidth();
  }-*/;

  /**
   * Sets the height of the browser window. This attribute is optional.
   */
  public final native void setHeight() /*-{
    this.setHeight();
  }-*/;

  /**
   * Sets the height of the browser window. This attribute is optional.
   * 
   * @param height Height of the browser window or undefined for none.
   */
  public final native void setHeight(double height) /*-{
    this.setHeight(
      height
    );
  }-*/;

  /**
   * Sets the url of the player console that plays the media. This attribute is required.
   */
  public final native void setUrl() /*-{
    this.setUrl();
  }-*/;

  /**
   * Sets the url of the player console that plays the media. This attribute is required.
   * 
   * @param url Url of the player console that plays the media or undefined for none.
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(
      url
    );
  }-*/;

  /**
   * Sets the width of the browser window. This attribute is optional.
   */
  public final native void setWidth() /*-{
    this.setWidth();
  }-*/;

  /**
   * Sets the width of the browser window. This attribute is optional.
   * 
   * @param width Width of the browser window or undefined for none.
   */
  public final native void setWidth(double width) /*-{
    this.setWidth(
      width
    );
  }-*/;

}
