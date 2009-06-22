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
 * Describes a Collection.
 */
public class Collection extends JavaScriptObject {

  /**
   * Constructs a collection using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: accepts, categorieses, href, and title.
   */
  public static native Collection newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.Collection(
      params
    );
  }-*/;

  protected Collection() { }

  /**
   * Adds a new accept element.
   * 
   * @param accept Accept element to add, or object to use as a parameter to the google.gdata.app.Accept constructor.
   */
  public final native void addAccept(Accept accept) /*-{
    this.addAccept(
      accept
    );
  }-*/;

  /**
   * Adds a new app categories document.
   * 
   * @param categories App categories document to add, or object to use as a parameter to the google.gdata.app.Categories constructor.
   */
  public final native void addCategories(Categories categories) /*-{
    this.addCategories(
      categories
    );
  }-*/;

  /**
   * Returns the accept elements.
   * 
   * @return Accept elements.
   */
  public final native JsArray<Accept> getAccepts() /*-{
    return this.getAccepts();
  }-*/;

  /**
   * Returns the app categories documents.
   * 
   * @return App categories documents.
   */
  public final native JsArray<Categories> getCategorieses() /*-{
    return this.getCategorieses();
  }-*/;

  /**
   * Returns the href. This attribute is required.
   * 
   * @return Href or undefined for none.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the title. This element is required.
   * 
   * @return Title or undefined for none.
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Sets the accept elements.
   */
  public final native void setAccepts() /*-{
    this.setAccepts();
  }-*/;

  /**
   * Sets the accept elements.
   * 
   * @param accepts Accept elements, where each accept element is added using the addAccept() function, or undefined to clear the accept elements.
   */
  public final native void setAccepts(JsArray<Accept> accepts) /*-{
    this.setAccepts(
      accepts
    );
  }-*/;

  /**
   * Sets the app categories documents.
   */
  public final native void setCategorieses() /*-{
    this.setCategorieses();
  }-*/;

  /**
   * Sets the app categories documents.
   * 
   * @param categorieses App categories documents, where each app categories document is added using the addCategories() function, or undefined to clear the app categories documents.
   */
  public final native void setCategorieses(JsArray<Categories> categorieses) /*-{
    this.setCategorieses(
      categorieses
    );
  }-*/;

  /**
   * Sets the href. This attribute is required.
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the href. This attribute is required.
   * 
   * @param href Href or undefined for none.
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the title. This element is required.
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the title. This element is required.
   * 
   * @param title Title, or object to use as a parameter to the google.gdata.atom.Text constructor, or undefined for none.
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(
      title
    );
  }-*/;

}
