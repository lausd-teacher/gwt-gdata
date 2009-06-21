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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class VersionEntry extends com.google.gwt.gdata.client.Entry<VersionEntry> {

  /**
   * Constructs a version entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native VersionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.VersionEntry(
      params
    );
  }-*/;

  /**
   * Constructs a version entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native VersionEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.VersionEntry();
  }-*/;

  protected VersionEntry() { }

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

}
