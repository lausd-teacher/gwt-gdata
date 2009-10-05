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

package com.google.gwt.gdata.client.sidewiki;

/**
 * Describes a Sidewiki user entry. Defined in gdata.js
 */
public class SidewikiUserEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a sidewiki user entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native SidewikiUserEntry newInstance() /*-{
    return new $wnd.google.gdata.sidewiki.SidewikiUserEntry();
  }-*/;

  protected SidewikiUserEntry() { }

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native SidewikiLink getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

}