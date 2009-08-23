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
import com.google.gwt.gdata.client.atom.Category;

/**
 * Value of the app:categories tag.
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
   * Constructs an app categories document.
   * @return A Categories object.
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
   * @param category Category to add.
   */
  public final native void addCategory(Category category) /*-{
    this.addCategory(category);
  }-*/;

  /**
   * Returns the categories.
   * 
   * @return Categories.
   */
  public final native Category[] getCategories() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCategories());
  }-*/;

  /**
   * Returns the indicates whether the list of categories is a fixed or an open
   * set. This attribute is optional.
   * 
   * @return Indicates whether the list of categories is a fixed or an open
   * set.
   */
  public final native String getFixed() /*-{
    return this.getFixed();
  }-*/;

  /**
   * Returns the an IRI reference to a Category Document.
   * This attribute is optional.
   * 
   * @return An IRI reference to a Category Document.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the default scheme of the contained category elements.
   * This attribute is optional.
   * 
   * @return Default scheme of the contained category elements.
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the categories.
   * 
   * @param categories Categories, where each category is added using
   * addCategory().
   */
  public final native void setCategories(Category[] categories) /*-{
    this.setCategories(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(categories)
    );
  }-*/;

  /**
   * Sets the indicates whether the list of categories is a fixed or an open
   * set. This attribute is optional.
   * 
   * @param fixed Indicates whether the list of categories is a fixed or an
   * open set.
   */
  public final native void setFixed(String fixed) /*-{
    this.setFixed(fixed);
  }-*/;

  /**
   * Sets the an IRI reference to a Category Document.
   * This attribute is optional.
   * 
   * @param href An IRI reference to a Category Document.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the default scheme of the contained category elements.
   * This attribute is optional.
   * 
   * @param scheme Default scheme of the contained category elements.
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(scheme);
  }-*/;

}