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

import com.google.gwt.gdata.client.mediarss.MediaContent;

/**
 * Describes an entry in the media feed used for managing the media attachments for one Google Base Item..
 */
public class MediaEntry extends com.google.gwt.gdata.client.Entry<MediaEntry> {

  /**
   * Constructs a Google Base media entry.
   * @return A MediaEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native MediaEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.MediaEntry();
  }-*/;

  protected MediaEntry() { }

  /**
   * Returns the media content. This element is optional.
   * 
   * @return Media content.
   */
  public final native MediaContent getMediaContent() /*-{
    return this.getMediaContent();
  }-*/;

  /**
   * Sets the media content. This element is optional.
   * 
   * @param mediaContent Media content.
   */
  public final native void setMediaContent(MediaContent mediaContent) /*-{
    this.setMediaContent(mediaContent);
  }-*/;

}