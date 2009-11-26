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

package com.google.gwt.gdata.client.batch;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes the batch operation to apply.
 */
public class Operation extends JavaScriptObject {

  /**
   * Delete the current entry identified by its id.
   */
  public static final String TYPE_DELETE = getConstant("TYPE_DELETE");

  /**
   * Insert the current entry.
   */
  public static final String TYPE_INSERT = getConstant("TYPE_INSERT");

  /**
   * Query for the entry by id.
   */
  public static final String TYPE_QUERY = getConstant("TYPE_QUERY");

  /**
   * Update the current entry identified by its id.
   */
  public static final String TYPE_UPDATE = getConstant("TYPE_UPDATE");

  /**
   * Constructs a batch operation.
   */
  public static native Operation newInstance() /*-{
    return new $wnd.google.gdata.batch.Operation();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.batch.Operation[name];
  }-*/;

  protected Operation() { }

  /**
   * Returns the operation type. This attribute is required.
   * 
   * @return Operation type.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the operation type. This attribute is required.
   * 
   * @param type Operation type.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

}