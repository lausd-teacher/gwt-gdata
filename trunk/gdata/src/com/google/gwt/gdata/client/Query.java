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
 * Describes a GData Query.
 */
public class Query extends JavaScriptObject {

  /**
   * Creates a Query instance.
   * 
   * @param feedUri URI of feed.
   * @return A Query object.
   */
  public static native Query newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.client.Query(feedUri);
  }-*/;

  protected Query() { }
  
  /**
   * Returns the value of a numeric parameter.
   * 
   * @param name Name of the parameter.
   * @return Parameter value or null if not defined or if it is the same as the
   * default value.
   */
  public final native double getNumericParam(String name) /*-{
    return this.getParam(name, value);
  }-*/;
  
  /**
   * Gets path of URI.
   * 
   * @return Path of URI.
   */
  public final native String getPath() /*-{
    return this.getPath();
  }-*/;
  
  /**
   * Returns the value of a string parameter.
   * 
   * @param name Name of the parameter.
   * @return Parameter value or null if not defined or if it is the same as the
   * default value.
   */
  public final native String getStringParam(String name) /*-{
    return this.getParam(name, value);
  }-*/;

  /**
   * Gets URI of query.
   * 
   * @return URI of query.
   */
  public final native String getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets a parameter of the query. If a parameter definition does not already
   * exist for the parameter, we create a default for it before setting the
   * parameter. The default definition is no value decoration and no default
   * value.
   * 
   * @param name Name of the parameter.
   * @param value Value of the parameter.
   */
  public final native void setNumericParam(String name, double value) /*-{
    this.setParam(name, value);
  }-*/;

  /**
   * Sets the definition of a parameter.
   * 
   * @param name Name of the parameter.
   * @param paramDef Definition of the parameter. If parameter value is the
   * same as default value, parameter is not included in query string.
   */
  public final native void setParamDef(String name,
      QueryParameterDefinition paramDef) /*-{
    this.setParamDef(name, paramDef);
  }-*/;
  
  /**
   * Sets a parameter of the query. If a parameter definition does not already
   * exist for the parameter, we create a default for it before setting the
   * parameter. The default definition is no value decoration and no default
   * value.
   * 
   * @param name Name of the parameter.
   * @param value Value of the parameter.
   */
  public final native void setStringParam(String name, String value) /*-{
    this.setParam(name, value);
  }-*/;

}