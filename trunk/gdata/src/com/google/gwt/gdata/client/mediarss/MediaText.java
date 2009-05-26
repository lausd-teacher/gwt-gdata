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
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.mediarss.MediaText;
  }-*/;

  /**
   * Constructs a media text using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaText newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaText(
      params
    );
  }-*/;

  /**
   * Constructs a media text using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaText newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaText();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaText[name];
  }-*/;

  protected MediaText() { }

  /**
   * Returns the text transcript, closed captioning, or lyrics.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the end time that the text is relevant.
   * 
   * @return
   */
  public final native String getEnd() /*-{
    return this.getEnd();
  }-*/;

  /**
   * Returns the primary language in the object.
   * 
   * @return
   */
  public final native String getLang() /*-{
    return this.getLang();
  }-*/;

  /**
   * Returns the start time offset when the text starts.
   * 
   * @return
   */
  public final native String getStart() /*-{
    return this.getStart();
  }-*/;

  /**
   * Returns the type of text embedded, either plain or html.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the text transcript, closed captioning, or lyrics.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the text transcript, closed captioning, or lyrics.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the end time that the text is relevant.
   * 
   * @param end
   */
  public final native void setEnd(String end) /*-{
    this.setEnd(
      end
    );
  }-*/;

  /**
   * Sets the end time that the text is relevant.
   * 
   * @param end
   */
  public final native void setEnd() /*-{
    this.setEnd();
  }-*/;

  /**
   * Sets the primary language in the object.
   * 
   * @param lang
   */
  public final native void setLang(String lang) /*-{
    this.setLang(
      lang
    );
  }-*/;

  /**
   * Sets the primary language in the object.
   * 
   * @param lang
   */
  public final native void setLang() /*-{
    this.setLang();
  }-*/;

  /**
   * Sets the start time offset when the text starts.
   * 
   * @param start
   */
  public final native void setStart(String start) /*-{
    this.setStart(
      start
    );
  }-*/;

  /**
   * Sets the start time offset when the text starts.
   * 
   * @param start
   */
  public final native void setStart() /*-{
    this.setStart();
  }-*/;

  /**
   * Sets the type of text embedded, either plain or html.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type of text embedded, either plain or html.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
