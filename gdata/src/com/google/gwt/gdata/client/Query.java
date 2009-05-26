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
public class Query extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.client.Query;
  }-*/;

  /**
   * Creates a Query instance.
   */
  public static native Query newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.client.Query(
      feedUri
    );
  }-*/;

  protected Query() { }

  /**
   * Returns the value of a parameter.
   * 
   * @param name
   * 
   * @return
   */
  public final native JavaScriptObject getParam(String name) /*-{
    return this.getParam(
      name
    );
  }-*/;

  /**
   * Gets path of URI
   * 
   * @return
   */
  public final native String getPath() /*-{
    return this.getPath();
  }-*/;

  /**
   * Gets URI of query
   * 
   * @return
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets a parameter of the query.
   * 
   * @param name
   * @param value
   */
  public final native void setParam(String name, JavaScriptObject value) /*-{
    this.setParam(
      name,
      value
    );
  }-*/;

  /**
   * Sets the definition of a parameter.
   * 
   * @param name
   * @param paramDef
   */
  public final native void setParamDef(String name, JavaScriptObject paramDef) /*-{
    this.setParamDef(
      name,
      paramDef
    );
  }-*/;

}
