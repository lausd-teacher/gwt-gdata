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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class Generator extends JavaScriptObject {

  /**
   * Constructs a generator using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Generator newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Generator(
      params
    );
  }-*/;

  /**
   * Constructs a generator using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Generator newInstance() /*-{
    return new $wnd.google.gdata.atom.Generator();
  }-*/;

  protected Generator() { }

  /**
   * Returns the name.
   * 
   * @return
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the URI.
   * 
   * @return
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Returns the version.
   * 
   * @return
   */
  public final native String getVersion() /*-{
    return this.getVersion();
  }-*/;

  /**
   * Sets the name.
   * 
   * @param name
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the name.
   * 
   * @param name
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the URI.
   * 
   * @param uri
   */
  public final native void setUri(String uri) /*-{
    this.setUri(
      uri
    );
  }-*/;

  /**
   * Sets the URI.
   * 
   * @param uri
   */
  public final native void setUri() /*-{
    this.setUri();
  }-*/;

  /**
   * Sets the version.
   * 
   * @param version
   */
  public final native void setVersion(String version) /*-{
    this.setVersion(
      version
    );
  }-*/;

  /**
   * Sets the version.
   * 
   * @param version
   */
  public final native void setVersion() /*-{
    this.setVersion();
  }-*/;

}
