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
 * Describes an entry in the media feed used for managing the media attachments for one Google Base Item.
 */
public class MediaEntry extends com.google.gwt.gdata.client.Entry<MediaEntry> {

  /**
   * Constructs a Google Base media entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, id, links, mediaContent, published, title, and updated.
   */
  public static native MediaEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.MediaEntry(
      params
    );
  }-*/;

  protected MediaEntry() { }

  /**
   * Returns the media content. This element is optional.
   * 
   * @return Media content or undefined for none.
   */
  public final native MediaContent getMediaContent() /*-{
    return this.getMediaContent();
  }-*/;

  /**
   * Sets the media content. This element is optional.
   */
  public final native void setMediaContent() /*-{
    this.setMediaContent();
  }-*/;

  /**
   * Sets the media content. This element is optional.
   * 
   * @param mediaContent Media content, or object to use as a parameter to the google.gdata.mediarss.MediaContent constructor, or undefined for none.
   */
  public final native void setMediaContent(MediaContent mediaContent) /*-{
    this.setMediaContent(
      mediaContent
    );
  }-*/;

}
