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
 * Describes a category.
 */
public class Category extends JavaScriptObject {

  /**
   * Constructs a category using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: label, labelLang, scheme, and term.
   */
  public static native Category newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Category(
      params
    );
  }-*/;

  protected Category() { }

  /**
   * Returns the human-readable label. This attribute is optional.
   * 
   * @return Human-readable label or undefined for none.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the language. This attribute is optional.
   * 
   * @return Language or undefined for none.
   */
  public final native String getLabelLang() /*-{
    return this.getLabelLang();
  }-*/;

  /**
   * Returns the scheme (domain). This attribute is optional.
   * 
   * @return Scheme (domain) or undefined for none.
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Returns the term. This attribute is required.
   * 
   * @return Term or undefined for none.
   */
  public final native String getTerm() /*-{
    return this.getTerm();
  }-*/;

  /**
   * Sets the human-readable label. This attribute is optional.
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the human-readable label. This attribute is optional.
   * 
   * @param label Human-readable label or undefined for none.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the language. This attribute is optional.
   */
  public final native void setLabelLang() /*-{
    this.setLabelLang();
  }-*/;

  /**
   * Sets the language. This attribute is optional.
   * 
   * @param labelLang Language or undefined for none.
   */
  public final native void setLabelLang(String labelLang) /*-{
    this.setLabelLang(
      labelLang
    );
  }-*/;

  /**
   * Sets the scheme (domain). This attribute is optional.
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

  /**
   * Sets the scheme (domain). This attribute is optional.
   * 
   * @param scheme Scheme (domain) or undefined for none.
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the term. This attribute is required.
   */
  public final native void setTerm() /*-{
    this.setTerm();
  }-*/;

  /**
   * Sets the term. This attribute is required.
   * 
   * @param term Term or undefined for none.
   */
  public final native void setTerm(String term) /*-{
    this.setTerm(
      term
    );
  }-*/;

}
