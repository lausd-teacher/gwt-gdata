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
public class Category extends JavaScriptObject {

  /**
   * Constructs a category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Category newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Category(
      params
    );
  }-*/;

  /**
   * Constructs a category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Category newInstance() /*-{
    return new $wnd.google.gdata.atom.Category();
  }-*/;

  protected Category() { }

  /**
   * Returns the human-readable label.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the language.
   * 
   * @return
   */
  public final native String getLabelLang() /*-{
    return this.getLabelLang();
  }-*/;

  /**
   * Returns the scheme (domain).
   * 
   * @return
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Returns the term.
   * 
   * @return
   */
  public final native String getTerm() /*-{
    return this.getTerm();
  }-*/;

  /**
   * Sets the human-readable label.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the human-readable label.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the language.
   * 
   * @param labelLang
   */
  public final native void setLabelLang(String labelLang) /*-{
    this.setLabelLang(
      labelLang
    );
  }-*/;

  /**
   * Sets the language.
   * 
   * @param labelLang
   */
  public final native void setLabelLang() /*-{
    this.setLabelLang();
  }-*/;

  /**
   * Sets the scheme (domain).
   * 
   * @param scheme
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the scheme (domain).
   * 
   * @param scheme
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

  /**
   * Sets the term.
   * 
   * @param term
   */
  public final native void setTerm(String term) /*-{
    this.setTerm(
      term
    );
  }-*/;

  /**
   * Sets the term.
   * 
   * @param term
   */
  public final native void setTerm() /*-{
    this.setTerm();
  }-*/;

}
