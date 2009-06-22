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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a nested entry link.
 */
public class EntryLink extends JavaScriptObject {

  /**
   * Constructs a nested entry link using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: entry, href, readOnly, and rel.
   */
  public static native EntryLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.EntryLink(
      params
    );
  }-*/;

  protected EntryLink() { }

  /**
   * Returns the nested entry. This element is optional.
   * 
   * @return Nested entry or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Entry getEntry() /*-{
    return this.getEntry();
  }-*/;

  /**
   * Returns the entry URI. This attribute is optional.
   * 
   * @return Entry URI or undefined for none.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns whether the contained entry is read-only. This attribute is optional.
   * 
   * @return Whether the contained entry is read-only or undefined for none.
   */
  public final native boolean getReadOnly() /*-{
    return this.getReadOnly();
  }-*/;

  /**
   * Returns the entry relation type. This attribute is optional.
   * 
   * @return Entry relation type or undefined for none.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the nested entry. This element is optional.
   */
  public final native void setEntry() /*-{
    this.setEntry();
  }-*/;

  /**
   * Sets the nested entry. This element is optional.
   * 
   * @param entry Nested entry, or object to use as a parameter to the google.gdata.Entry constructor, or undefined for none.
   */
  public final native void setEntry(Entry entry) /*-{
    this.setEntry(
      entry
    );
  }-*/;

  /**
   * Sets the entry URI. This attribute is optional.
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the entry URI. This attribute is optional.
   * 
   * @param href Entry URI or undefined for none.
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets whether the contained entry is read-only. This attribute is optional.
   */
  public final native void setReadOnly() /*-{
    this.setReadOnly();
  }-*/;

  /**
   * Sets whether the contained entry is read-only. This attribute is optional.
   * 
   * @param readOnly Whether the contained entry is read-only or undefined for none.
   */
  public final native void setReadOnly(boolean readOnly) /*-{
    this.setReadOnly(
      readOnly
    );
  }-*/;

  /**
   * Sets the entry relation type. This attribute is optional.
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the entry relation type. This attribute is optional.
   * 
   * @param rel Entry relation type or undefined for none.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

}
