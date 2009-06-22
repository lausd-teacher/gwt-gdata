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
 * Describes a media rating.
 */
public class MediaRating extends JavaScriptObject {

  /**
   * Default rating scheme.
   */
  public static final String SCHEME_DEFAULT_SCHEME = getConstant("SCHEME_DEFAULT_SCHEME");

  /**
   * Constructs a media rating using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: content and scheme.
   */
  public static native MediaRating newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaRating(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaRating[name];
  }-*/;

  protected MediaRating() { }

  /**
   * Returns the the rating value. This attribute is optional.
   * 
   * @return The rating value or undefined for none.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the URI that identifies the rating scheme. This attribute is optional.
   * 
   * @return URI that identifies the rating scheme or undefined for none.
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the the rating value. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the the rating value. This attribute is optional.
   * 
   * @param content The rating value or undefined for none.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the URI that identifies the rating scheme. This attribute is optional.
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

  /**
   * Sets the URI that identifies the rating scheme. This attribute is optional.
   * 
   * @param scheme URI that identifies the rating scheme or undefined for none.
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

}
