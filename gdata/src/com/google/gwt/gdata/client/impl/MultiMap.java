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
 * A JavaScript Map implementation for GWT where the value type is an array.
 * 
 * @param <T> The value type.
 */
public class MultiMap<T extends JavaScriptObject> extends JavaScriptObject {
  
  /**
   * Constructs a MultiMap.
   */  
  public static <T extends JavaScriptObject> MultiMap<T> newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  protected MultiMap() {
  }
  
  /**
   * Determines whether the specified key is contained in the map.
   * @param key The key to search for.
   */
  public final native boolean contains(String key) /*-{
    return (key in this);
  }-*/;
  
  /*
   *  NOTE: In GData, the underlying value type may not be an array.
   *  In the get() implementation below we use jQuery's isArray implementation
   *  to determine if the value is an array. If it's not, wrap the value in
   *  an object.
   */
  /**
   * Retrieves a value by the corresponding key.
   * 
   * @param key The key corresponding to the value which should be retrieved.
   * @return The corresponding value or null if the key is not present.
   */
  public final native T[] get(String key) /*-{
    var v = this[key];
    if(Object.prototype.toString.call(v) !== "[object Array]") v = [v];
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(v);
  }-*/;

  /**
   * Retrieves the collection of keys for this map.
   * (This method causes an iteration over the map entries)
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
  public final native void set(String key, T[] value) /*-{
    this[key] = @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(value);
  }-*/;
  
  private native JsArrayString getKeys() /*-{
    var ls = [];
    for(var l in this) ls.push(l);
    return ls;
  }-*/;

}
