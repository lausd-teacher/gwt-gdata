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
public class MediaTitle extends JavaScriptObject {

  /**
   * Entity encoded html.
   */
  public static final String TYPE_HTML = getConstant("TYPE_HTML");

  /**
   * Plain text.
   */
  public static final String TYPE_PLAIN = getConstant("TYPE_PLAIN");

  /**
   * Constructs a media title using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaTitle newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaTitle(
      params
    );
  }-*/;

  /**
   * Constructs a media title using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaTitle newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaTitle();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaTitle[name];
  }-*/;

  protected MediaTitle() { }

  /**
   * Returns the text of the title.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the type of text, either plain or html.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the text of the title.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the text of the title.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the type of text, either plain or html.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type of text, either plain or html.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
