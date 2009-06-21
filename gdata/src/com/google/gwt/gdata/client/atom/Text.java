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
 * Comment unavailable.
 */
public class Text extends JavaScriptObject {

  /**
   * Constructs a text construct using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Text newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Text(
      params
    );
  }-*/;

  /**
   * Constructs a text construct using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Text newInstance() /*-{
    return new $wnd.google.gdata.atom.Text();
  }-*/;

  protected Text() { }

  /**
   * Returns the language of link title.
   * 
   * @return
   */
  public final native String getLang() /*-{
    return this.getLang();
  }-*/;

  /**
   * Returns the text content.
   * 
   * @return
   */
  public final native String getText() /*-{
    return this.getText();
  }-*/;

  /**
   * Returns the type of text construct (typically text, html or xhtml).
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Returns the external URI.
   * 
   * @return
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets the language of link title.
   * 
   * @param lang
   */
  public final native void setLang(String lang) /*-{
    this.setLang(
      lang
    );
  }-*/;

  /**
   * Sets the language of link title.
   * 
   * @param lang
   */
  public final native void setLang() /*-{
    this.setLang();
  }-*/;

  /**
   * Sets the text content.
   * 
   * @param text
   */
  public final native void setText(String text) /*-{
    this.setText(
      text
    );
  }-*/;

  /**
   * Sets the text content.
   * 
   * @param text
   */
  public final native void setText() /*-{
    this.setText();
  }-*/;

  /**
   * Sets the type of text construct (typically text, html or xhtml).
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type of text construct (typically text, html or xhtml).
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the external URI.
   * 
   * @param uri
   */
  public final native void setUri(String uri) /*-{
    this.setUri(
      uri
    );
  }-*/;

  /**
   * Sets the external URI.
   * 
   * @param uri
   */
  public final native void setUri() /*-{
    this.setUri();
  }-*/;

}
