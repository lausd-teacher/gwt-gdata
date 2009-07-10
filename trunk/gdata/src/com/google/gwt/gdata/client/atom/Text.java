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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a text construct containing either plain text, HTML, or XHTML.
 */
public class Text extends JavaScriptObject {

  /**
   * Constructs a text.
   * @return A Text object.
   */
  public static native Text newInstance() /*-{
    return new $wnd.google.gdata.atom.Text();
  }-*/;

  protected Text() { }

  /**
   * Returns the language of link title. This attribute is optional.
   * 
   * @return Language of link title.
   */
  public final native String getLang() /*-{
    return this.getLang();
  }-*/;

  /**
   * Returns the text content. This attribute is optional.
   * 
   * @return Text content.
   */
  public final native String getText() /*-{
    return this.getText();
  }-*/;

  /**
   * Returns the type of text construct (typically 'text', 'html' or 'xhtml'). This attribute is optional.
   * 
   * @return Type of text construct (typically 'text', 'html' or 'xhtml').
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the external URI. This attribute is optional.
   * 
   * @return External URI.
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets the language of link title. This attribute is optional.
   * 
   * @param lang Language of link title.
   */
  public final native void setLang(String lang) /*-{
    this.setLang(lang);
  }-*/;

  /**
   * Sets the text content. This attribute is optional.
   * 
   * @param text Text content.
   */
  public final native void setText(String text) /*-{
    this.setText(text);
  }-*/;

  /**
   * Sets the type of text construct (typically 'text', 'html' or 'xhtml'). This attribute is optional.
   * 
   * @param type Type of text construct (typically 'text', 'html' or 'xhtml').
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

  /**
   * Sets the external URI. This attribute is optional.
   * 
   * @param uri External URI.
   */
  public final native void setUri(String uri) /*-{
    this.setUri(uri);
  }-*/;

}