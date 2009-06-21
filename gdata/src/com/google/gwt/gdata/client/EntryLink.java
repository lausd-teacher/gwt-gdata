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
 * Comment unavailable.
 */
public class EntryLink extends JavaScriptObject {

  /**
   * Constructs a nested entry link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native EntryLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.EntryLink(
      params
    );
  }-*/;

  /**
   * Constructs a nested entry link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native EntryLink newInstance() /*-{
    return new $wnd.google.gdata.EntryLink();
  }-*/;

  protected EntryLink() { }

  /**
   * Returns the nested entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Entry getEntry() /*-{
    return this.getEntry();
  }-*/;

  /**
   * Returns the entry URI.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns whether the contained entry is read-only.
   * 
   * @return
   */
  public final native boolean getReadOnly() /*-{
    return this.getReadOnly();
  }-*/;

  /**
   * Returns the entry relation type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the nested entry.
   * 
   * @param entry
   */
  public final native void setEntry(Entry entry) /*-{
    this.setEntry(
      entry
    );
  }-*/;

  /**
   * Sets the nested entry.
   * 
   * @param entry
   */
  public final native void setEntry() /*-{
    this.setEntry();
  }-*/;

  /**
   * Sets the entry URI.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the entry URI.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets whether the contained entry is read-only.
   * 
   * @param readOnly
   */
  public final native void setReadOnly(boolean readOnly) /*-{
    this.setReadOnly(
      readOnly
    );
  }-*/;

  /**
   * Sets whether the contained entry is read-only.
   * 
   * @param readOnly
   */
  public final native void setReadOnly() /*-{
    this.setReadOnly();
  }-*/;

  /**
   * Sets the entry relation type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the entry relation type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

}
