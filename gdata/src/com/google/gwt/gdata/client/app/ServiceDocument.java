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
 * Container for service information.
 */
public class ServiceDocument extends JavaScriptObject {

  /**
   * Constructs a service document using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: workspaces.
   */
  public static native ServiceDocument newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.app.ServiceDocument(
      params
    );
  }-*/;

  protected ServiceDocument() { }

  /**
   * Adds a new workspace.
   * 
   * @param workspace Workspace to add, or object to use as a parameter to the google.gdata.app.Workspace constructor.
   */
  public final native void addWorkspace(Workspace workspace) /*-{
    this.addWorkspace(
      workspace
    );
  }-*/;

  /**
   * Returns the workspaces.
   * 
   * @return Workspaces.
   */
  public final native JsArray<Workspace> getWorkspaces() /*-{
    return this.getWorkspaces();
  }-*/;

  /**
   * Sets the workspaces.
   */
  public final native void setWorkspaces() /*-{
    this.setWorkspaces();
  }-*/;

  /**
   * Sets the workspaces.
   * 
   * @param workspaces Workspaces, where each workspace is added using the addWorkspace() function, or undefined to clear the workspaces.
   */
  public final native void setWorkspaces(JsArray<Workspace> workspaces) /*-{
    this.setWorkspaces(
      workspaces
    );
  }-*/;

}
