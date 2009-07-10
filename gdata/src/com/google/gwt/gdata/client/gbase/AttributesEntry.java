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

/**
 * Describes an entry in the feed of public attributes.
 */
public class AttributesEntry extends com.google.gwt.gdata.client.Entry<AttributesEntry> {

  /**
   * Constructs a Google Base attribute entry.
   */
  @SuppressWarnings("unchecked")
  public static native AttributesEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.AttributesEntry();
  }-*/;

  protected AttributesEntry() { }

  /**
   * Returns the list of attribute for an item type. This element is required.
   * 
   * @return List of attribute for an item type.
   */
  public final native GmAttribute getAttribute() /*-{
    return this.getAttribute();
  }-*/;

  /**
   * Sets the list of attribute for an item type. This element is required.
   * 
   * @param attribute List of attribute for an item type.
   */
  public final native void setAttribute(GmAttribute attribute) /*-{
    this.setAttribute(attribute);
  }-*/;

}