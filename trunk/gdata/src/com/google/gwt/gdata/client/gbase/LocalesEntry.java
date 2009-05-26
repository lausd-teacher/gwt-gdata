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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class LocalesEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.LocalesEntry;
  }-*/;

  /**
   * Constructs a Google Base locale entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native LocalesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.LocalesEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Google Base locale entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native LocalesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.LocalesEntry();
  }-*/;

  protected LocalesEntry() { }

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.atom.Link getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

}
