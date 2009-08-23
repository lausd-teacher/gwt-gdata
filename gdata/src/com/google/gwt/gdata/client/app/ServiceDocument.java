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

/**
 * Container for service information.
 */
public class ServiceDocument extends JavaScriptObject {

  /**
   * Constructs a service document.
   * @return A ServiceDocument object.
   */
  public static native ServiceDocument newInstance() /*-{
    return new $wnd.google.gdata.app.ServiceDocument();
  }-*/;

  protected ServiceDocument() { }

  /**
   * Adds a new workspace.
   * 
   * @param workspace Workspace to add.
   */
  public final native void addWorkspace(Workspace workspace) /*-{
    this.addWorkspace(workspace);
  }-*/;

  /**
   * Returns the workspaces.
   * 
   * @return Workspaces.
   */
  public final native Workspace[] getWorkspaces() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getWorkspaces());
  }-*/;

  /**
   * Sets the workspaces.
   * 
   * @param workspaces Workspaces, where each workspace is added using
   * addWorkspace().
   */
  public final native void setWorkspaces(Workspace[] workspaces) /*-{
    this.setWorkspaces(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(workspaces)
    );
  }-*/;

}