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
public class Workspace extends JavaScriptObject {

  /**
   * Constructs a workspace using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Workspace newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.Workspace(
      params
    );
  }-*/;

  /**
   * Constructs a workspace using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Workspace newInstance() /*-{
    return new $wnd.google.gdata.app.Workspace();
  }-*/;

  protected Workspace() { }

  /**
   * Adds a new collection.
   * 
   * @param collection
   */
  public final native void addCollection(Collection collection) /*-{
    this.addCollection(
      collection
    );
  }-*/;

  /**
   * Returns the collections.
   * 
   * @return
   */
  public final native JsArray<Collection> getCollections() /*-{
    return this.getCollections();
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
   * Sets the collections.
   * 
   * @param collections
   */
  public final native void setCollections(JsArray<Collection> collections) /*-{
    this.setCollections(
      collections
    );
  }-*/;

  /**
   * Sets the collections.
   * 
   * @param collections
   */
  public final native void setCollections() /*-{
    this.setCollections();
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
