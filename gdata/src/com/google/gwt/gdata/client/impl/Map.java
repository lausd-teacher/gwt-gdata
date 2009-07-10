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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * Note: Temporary implementation, code borrowed from http://code.google.com/p/gwt-in-the-air/source/browse/trunk/src/net/ltgt/gwt/jscollections/client/JsMap.java.
 * A JavaScript Map implementation for GWT.
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
  
  public final native void contains(String key) /*-{ return (key in this); }-*/;
  
  public final native T get(String key) /*-{ return this[key]; }-*/;
  
  public final native T get(String key, T defaultValue) /*-{ return this[key] || defaultValue; }-*/;

  public final String[] keys() {
    return ArrayHelper.toArray(getKeys());
  }
  
  public final native void remove(String key) /*-{ delete this[key]; }-*/;
  
  public final native void set(String key, T value) /*-{ this[key] = value; }-*/;
  
  public final T[] values() {
    return ArrayHelper.toArray(getValues());
  }
  
  private native JsArrayString getKeys() /*-{
    var ls = [];
    for(var l in this) ls.push(l);
    return ls;
  }-*/;
  
  private native JsArray<T> getValues() /*-{
    var ls = [];
    for(var l in this) ls.push(l);
    return ls;
  }-*/;
}
