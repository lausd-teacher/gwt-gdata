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

package com.google.gwt.gdata.client.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Code adapted from http://code.google.com/p/gwt-in-the-air/source/browse/trunk/src/net/ltgt/gwt/jscollections/client/JsMap.java.
 * A JavaScript Map implementation for GWT.
 * 
 * @param <T> The value type.
 */
public class Map<T extends JavaScriptObject> extends JavaScriptObject {
  
  /**
   * Constructs a Map.
   */  
  public static <T extends JavaScriptObject> Map<T> newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  protected Map() {
  }
  
  /**
   * Determines whether the specified key is contained in the map.
   * @param key The key to search for.
   */
  public final native boolean contains(String key) /*-{
    return (key in this);
  }-*/;
  
  /**
   * Retrieves a value by the corresponding key.
   * 
   * @param key The key corresponding to the value which should be retrieved.
   * @return The corresponding value or null if the key is not present.
   */
  public final native T get(String key) /*-{
    return this[key];
  }-*/;

  /**
   * Retrieves the collection of keys for this map.
   * 
   * @return The map keys.
   */
  public final String[] keys() {
    return ArrayHelper.toArray(getKeys());
  }
  
  /**
   * Removes the selected key/value pair from the map.
   * 
   * @param key The key which should be removed
   */
  public final native void remove(String key) /*-{
    delete this[key];
  }-*/;
  
  /**
   * Adds a key/value pair to the map.
   * 
   * @param key The key.
   * @param value The value.
   */
  public final native void set(String key, T value) /*-{
    this[key] = value;
  }-*/;
  
  private native JsArrayString getKeys() /*-{
    var ls = [];
    for(var l in this) ls.push(l);
    return ls;
  }-*/;

}
