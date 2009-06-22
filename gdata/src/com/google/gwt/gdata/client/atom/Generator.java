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
 * Describes the generator.
 */
public class Generator extends JavaScriptObject {

  /**
   * Constructs a generator using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: name, uri, and version.
   */
  public static native Generator newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Generator(
      params
    );
  }-*/;

  protected Generator() { }

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name or undefined for none.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the URI. This attribute is optional.
   * 
   * @return URI or undefined for none.
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Returns the version. This attribute is optional.
   * 
   * @return Version or undefined for none.
   */
  public final native String getVersion() /*-{
    return this.getVersion();
  }-*/;

  /**
   * Sets the name. This attribute is required.
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the name. This attribute is required.
   * 
   * @param name Name or undefined for none.
   */
  public final native void setName(String name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the URI. This attribute is optional.
   */
  public final native void setUri() /*-{
    this.setUri();
  }-*/;

  /**
   * Sets the URI. This attribute is optional.
   * 
   * @param uri URI or undefined for none.
   */
  public final native void setUri(String uri) /*-{
    this.setUri(
      uri
    );
  }-*/;

  /**
   * Sets the version. This attribute is optional.
   */
  public final native void setVersion() /*-{
    this.setVersion();
  }-*/;

  /**
   * Sets the version. This attribute is optional.
   * 
   * @param version Version or undefined for none.
   */
  public final native void setVersion(String version) /*-{
    this.setVersion(
      version
    );
  }-*/;

}
