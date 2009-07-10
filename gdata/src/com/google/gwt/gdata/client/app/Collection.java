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
import com.google.gwt.gdata.client.atom.Text;

/**
 * Describes a Collection.
 */
public class Collection extends JavaScriptObject {

  /**
   * Constructs a collection.
   * @return A Collection object.
   */
  public static native Collection newInstance() /*-{
    return new $wnd.google.gdata.app.Collection();
  }-*/;

  protected Collection() { }

  /**
   * Adds a new accept element.
   * 
   * @param accept Accept element to add.
   */
  public final native void addAccept(Accept accept) /*-{
    this.addAccept(accept);
  }-*/;

  /**
   * Adds a new app categories document.
   * 
   * @param categories App categories document to add.
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
  public final native Accept[] getAccepts() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getAccepts());
  }-*/;

  /**
   * Returns the app categories documents.
   * 
   * @return App categories documents.
   */
  public final native Categories[] getCategorieses() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCategorieses());
  }-*/;

  /**
   * Returns the href. This attribute is required.
   * 
   * @return Href.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the title. This element is required.
   * 
   * @return Title.
   */
  public final native Text getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Sets the accept elements.
   * 
   * @param accepts Accept elements, where each accept element is added using addAccept().
   */
  public final native void setAccepts(Accept[] accepts) /*-{
    this.setAccepts(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(accepts)
    );
  }-*/;

  /**
   * Sets the app categories documents.
   * 
   * @param categorieses App categories documents, where each app categories document is added using addCategories().
   */
  public final native void setCategorieses(Categories[] categorieses) /*-{
    this.setCategorieses(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(categorieses)
    );
  }-*/;

  /**
   * Sets the href. This attribute is required.
   * 
   * @param href Href.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the title. This element is required.
   * 
   * @param title Title.
   */
  public final native void setTitle(Text title) /*-{
    this.setTitle(title);
  }-*/;

}