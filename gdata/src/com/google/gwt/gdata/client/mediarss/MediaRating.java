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
public class MediaRating extends JavaScriptObject {

  /**
   * Default rating scheme.
   */
  public static final String SCHEME_DEFAULT_SCHEME = getConstant("SCHEME_DEFAULT_SCHEME");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.mediarss.MediaRating;
  }-*/;

  /**
   * Constructs a media rating using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaRating newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaRating(
      params
    );
  }-*/;

  /**
   * Constructs a media rating using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaRating newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaRating();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaRating[name];
  }-*/;

  protected MediaRating() { }

  /**
   * Returns the the rating value.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the URI that identifies the rating scheme.
   * 
   * @return
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the the rating value.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the the rating value.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the URI that identifies the rating scheme.
   * 
   * @param scheme
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the URI that identifies the rating scheme.
   * 
   * @param scheme
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

}
