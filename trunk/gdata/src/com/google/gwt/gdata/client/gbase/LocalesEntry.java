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
 * Describes an entry in the feed of locales.
 */
public class LocalesEntry extends com.google.gwt.gdata.client.Entry<LocalesEntry> {

  /**
   * Constructs a Google Base locale entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, id, links, title, and updated.
   */
  public static native LocalesEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.LocalesEntry(
      params
    );
  }-*/;

  protected LocalesEntry() { }

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry or undefined for none.
   */
  public final native com.google.gwt.gdata.client.atom.Link getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

}
