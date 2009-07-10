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
 * Describes a media description.
 */
public class MediaDescription extends JavaScriptObject {

  /**
   * Entity encoded html.
   */
  public static final String TYPE_HTML = getConstant("TYPE_HTML");

  /**
   * Plain text.
   */
  public static final String TYPE_PLAIN = getConstant("TYPE_PLAIN");

  /**
   * Constructs a media description.
   * @return A MediaDescription object.
   */
  public static native MediaDescription newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaDescription();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaDescription[name];
  }-*/;

  protected MediaDescription() { }

  /**
   * Returns the text of the description. This attribute is optional.
   * 
   * @return Text of the description.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the type of text embedded, either plain or html. This attribute is optional.
   * 
   * @return Type of text embedded, either plain or html.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the text of the description. This attribute is optional.
   * 
   * @param content Text of the description.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the type of text embedded, either plain or html. This attribute is optional.
   * 
   * @param type Type of text embedded, either plain or html.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

}