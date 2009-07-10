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
 * Describes a media copyright.
 */
public class MediaCopyright extends JavaScriptObject {

  /**
   * Constructs a media copyright.
   * @return A MediaCopyright object.
   */
  public static native MediaCopyright newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaCopyright();
  }-*/;

  protected MediaCopyright() { }

  /**
   * Returns the text of the copyright. This attribute is optional.
   * 
   * @return Text of the copyright.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the url to the terms of usage page or copyright information. This attribute is optional.
   * 
   * @return Url to the terms of usage page or copyright information.
   */
  public final native String getUrl() /*-{
    return this.getUrl();
  }-*/;

  /**
   * Sets the text of the copyright. This attribute is optional.
   * 
   * @param content Text of the copyright.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the url to the terms of usage page or copyright information. This attribute is optional.
   * 
   * @param url Url to the terms of usage page or copyright information.
   */
  public final native void setUrl(String url) /*-{
    this.setUrl(url);
  }-*/;

}