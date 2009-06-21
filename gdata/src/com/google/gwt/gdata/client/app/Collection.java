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
import com.google.gwt.gdata.client.atom.Text;

/**
 * Comment unavailable.
 */
public class Collection extends JavaScriptObject {

  /**
   * Constructs a collection using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Collection newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.Collection(
      params
    );
  }-*/;

  /**
   * Constructs a collection using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Collection newInstance() /*-{
    return new $wnd.google.gdata.app.Collection();
  }-*/;

  protected Collection() { }

  /**
   * Adds a new accept element.
   * 
   * @param accept
   */
  public final native void addAccept(Accept accept) /*-{
    this.addAccept(
      accept
    );
  }-*/;

  /**
   * Adds a new app categories document.
   * 
   * @param categories
   */
  public final native void addCategories(Categories categories) /*-{
    this.addCategories(
      categories
    );
  }-*/;

  /**
   * Returns the accept elements.
   * 
   * @return
   */
  public final native JsArray<Accept> getAccepts() /*-{
    return this.getAccepts();
  }-*/;

  /**
   * Returns the app categories documents.
   * 
   * @return
   */
  public final native JsArray<Categories> getCategorieses() /*-{
    return this.getCategorieses();
  }-*/;

  /**
   * Returns the href.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the title.
   * 
   * @return
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Sets the accept elements.
   * 
   * @param accepts
   */
  public final native void setAccepts(JsArray<Accept> accepts) /*-{
    this.setAccepts(
      accepts
    );
  }-*/;

  /**
   * Sets the accept elements.
   * 
   * @param accepts
   */
  public final native void setAccepts() /*-{
    this.setAccepts();
  }-*/;

  /**
   * Sets the app categories documents.
   * 
   * @param categorieses
   */
  public final native void setCategorieses(JsArray<Categories> categorieses) /*-{
    this.setCategorieses(
      categorieses
    );
  }-*/;

  /**
   * Sets the app categories documents.
   * 
   * @param categorieses
   */
  public final native void setCategorieses() /*-{
    this.setCategorieses();
  }-*/;

  /**
   * Sets the href.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the href.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

}
