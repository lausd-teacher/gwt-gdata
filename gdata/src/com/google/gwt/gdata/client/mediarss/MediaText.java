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
 * Describes a media text.
 */
public class MediaText extends JavaScriptObject {

  /**
   * Entity encoded html.
   */
  public static final String TYPE_HTML = getConstant("TYPE_HTML");

  /**
   * Plain text.
   */
  public static final String TYPE_PLAIN = getConstant("TYPE_PLAIN");

  /**
   * Constructs a media text.
   * @return A MediaText object.
   */
  public static native MediaText newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaText();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaText[name];
  }-*/;

  protected MediaText() { }

  /**
   * Returns the text transcript, closed captioning, or lyrics. This attribute is optional.
   * 
   * @return Text transcript, closed captioning, or lyrics.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the end time that the text is relevant. This attribute is optional.
   * 
   * @return End time that the text is relevant.
   */
  public final native String getEnd() /*-{
    return this.getEnd();
  }-*/;

  /**
   * Returns the primary language in the object. This attribute is optional.
   * 
   * @return Primary language in the object.
   */
  public final native String getLang() /*-{
    return this.getLang();
  }-*/;

  /**
   * Returns the start time offset when the text starts. This attribute is optional.
   * 
   * @return Start time offset when the text starts.
   */
  public final native String getStart() /*-{
    return this.getStart();
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
   * Sets the text transcript, closed captioning, or lyrics. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the text transcript, closed captioning, or lyrics. This attribute is optional.
   * 
   * @param content Text transcript, closed captioning, or lyrics.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the end time that the text is relevant. This attribute is optional.
   * 
   * @param end End time that the text is relevant.
   */
  public final native void setEnd(String end) /*-{
    this.setEnd(end);
  }-*/;

  /**
   * Sets the primary language in the object. This attribute is optional.
   * 
   * @param lang Primary language in the object.
   */
  public final native void setLang(String lang) /*-{
    this.setLang(lang);
  }-*/;

  /**
   * Sets the start time offset when the text starts. This attribute is optional.
   * 
   * @param start Start time offset when the text starts.
   */
  public final native void setStart(String start) /*-{
    this.setStart(start);
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