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

package com.google.gwt.gdata.client.app;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.atom.Category;

/**
 * Comment unavailable.
 */
public class Categories extends JavaScriptObject {

  /**
   * Is not fixed.
   */
  public static final String FIXED_NO = getConstant("FIXED_NO");

  /**
   * Is fixed.
   */
  public static final String FIXED_YES = getConstant("FIXED_YES");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.app.Categories;
  }-*/;

  /**
   * Constructs an app categories document using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Categories newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.Categories(
      params
    );
  }-*/;

  /**
   * Constructs an app categories document using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Categories newInstance() /*-{
    return new $wnd.google.gdata.app.Categories();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.app.Categories[name];
  }-*/;

  protected Categories() { }

  /**
   * Adds a new category.
   * 
   * @param category
   */
  public final native void addCategory(JavaScriptObject category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Adds a new category.
   * 
   * @param category
   */
  public final native void addCategory(Category category) /*-{
    this.addCategory(
      category
    );
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return
   */
  public final native JsArray<Category> getCategories() /*-{
    return this.getCategories();
  }-*/;

  /**
   * Returns the indicates whether the list of categories is a fixed or an open set.
   * 
   * @return
   */
  public final native String getFixed() /*-{
    return this.getFixed();
  }-*/;

  /**
   * Returns the an IRI reference to a Category Document.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the default scheme of the contained category elements.
   * 
   * @return
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories(JavaScriptObject[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories() /*-{
    this.setCategories();
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories
   */
  public final native void setCategories(Category[] categories) /*-{
    this.setCategories(
      categories
    );
  }-*/;

  /**
   * Sets the indicates whether the list of categories is a fixed or an open set.
   * 
   * @param fixed
   */
  public final native void setFixed(String fixed) /*-{
    this.setFixed(
      fixed
    );
  }-*/;

  /**
   * Sets the indicates whether the list of categories is a fixed or an open set.
   * 
   * @param fixed
   */
  public final native void setFixed() /*-{
    this.setFixed();
  }-*/;

  /**
   * Sets the an IRI reference to a Category Document.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the an IRI reference to a Category Document.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the default scheme of the contained category elements.
   * 
   * @param scheme
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the default scheme of the contained category elements.
   * 
   * @param scheme
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

}
