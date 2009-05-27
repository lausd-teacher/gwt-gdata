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

package com.google.gwt.gdata.client.app;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Comment unavailable.
 */
public class ServiceDocument extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.app.ServiceDocument;
  }-*/;

  /**
   * Constructs a service document using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ServiceDocument newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.ServiceDocument(
      params
    );
  }-*/;

  /**
   * Constructs a service document using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ServiceDocument newInstance() /*-{
    return new $wnd.google.gdata.app.ServiceDocument();
  }-*/;

  protected ServiceDocument() { }

  /**
   * Adds a new workspace.
   * 
   * @param workspace
   */
  public final native void addWorkspace(Workspace workspace) /*-{
    this.addWorkspace(
      workspace
    );
  }-*/;

  /**
   * Returns the workspaces.
   * 
   * @return
   */
  public final native JsArray<Workspace> getWorkspaces() /*-{
    return this.getWorkspaces();
  }-*/;

  /**
   * Sets the workspaces.
   * 
   * @param workspaces
   */
  public final native void setWorkspaces(JsArray<Workspace> workspaces) /*-{
    this.setWorkspaces(
      workspaces
    );
  }-*/;

  /**
   * Sets the workspaces.
   * 
   * @param workspaces
   */
  public final native void setWorkspaces() /*-{
    this.setWorkspaces();
  }-*/;

}
