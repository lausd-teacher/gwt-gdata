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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Data about a user-defined custom variable.
 */
public class CustomVariable extends JavaScriptObject {

  /**
   * Hit custom variable.
   */
  public static final String SCOPE_HIT = getConstant("SCOPE_HIT");

  /**
   * Visit custom variable.
   */
  public static final String SCOPE_VISIT = getConstant("SCOPE_VISIT");

  /**
   * Visitor custom variable.
   */
  public static final String SCOPE_VISITOR = getConstant("SCOPE_VISITOR");

  /**
   * Constructs a custom variable.
   * 
   * @return An instance of CustomVariable.
   */
  public static native CustomVariable newInstance() /*-{
    return new $wnd.google.gdata.analytics.CustomVariable();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.analytics.CustomVariable[name];
  }-*/;

  protected CustomVariable() { }

  /**
   * Returns the index. This attribute is required.
   * 
   * @return Index.
   */
  public final native double getIndex() /*-{
    return this.getIndex();
  }-*/;

  /**
   * Returns the name. This attribute is required.
   * 
   * @return Name.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the scope. This attribute is required.
   * 
   * @return Scope.
   */
  public final native String getScope() /*-{
    return this.getScope();
  }-*/;

  /**
   * Sets the index. This attribute is required.
   * 
   * @param index Index.
   */
  public final native void setIndex(double index) /*-{
    this.setIndex(index);
  }-*/;

  /**
   * Sets the name. This attribute is required.
   * 
   * @param name Name.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the scope. This attribute is required.
   * 
   * @param scope Scope.
   */
  public final native void setScope(String scope) /*-{
    this.setScope(scope);
  }-*/;

}