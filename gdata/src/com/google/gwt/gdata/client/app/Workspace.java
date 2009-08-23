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
 * Server-defined groups of Collections.
 */
public class Workspace extends JavaScriptObject {

  /**
   * Constructs a workspace.
   * @return A Workspace object.
   */
  public static native Workspace newInstance() /*-{
    return new $wnd.google.gdata.app.Workspace();
  }-*/;

  protected Workspace() { }

  /**
   * Adds a new collection.
   * 
   * @param collection Collection to add.
   */
  public final native void addCollection(Collection collection) /*-{
    this.addCollection(collection);
  }-*/;

  /**
   * Returns the collections.
   * 
   * @return Collections.
   */
  public final native Collection[] getCollections() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCollections());
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
   * Sets the collections.
   * 
   * @param collections Collections, where each collection is added using
   * addCollection().
   */
  public final native void setCollections(Collection[] collections) /*-{
    this.setCollections(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(collections)
    );
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