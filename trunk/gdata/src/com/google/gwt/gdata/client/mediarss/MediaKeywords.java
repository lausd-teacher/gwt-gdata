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
 * Describes a media keywords.
 */
public class MediaKeywords extends JavaScriptObject {

  /**
   * Constructs a media keywords using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: content.
   */
  public static native MediaKeywords newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaKeywords(
      params
    );
  }-*/;

  protected MediaKeywords() { }

  /**
   * Returns the highly relevant keywords describing the media object. This attribute is optional.
   * 
   * @return Highly relevant keywords describing the media object or undefined for none.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Sets the highly relevant keywords describing the media object. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the highly relevant keywords describing the media object. This attribute is optional.
   * 
   * @param content Highly relevant keywords describing the media object or undefined for none.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

}
