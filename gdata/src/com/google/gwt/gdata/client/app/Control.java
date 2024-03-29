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
 * Describes an Atom publication control status.
 */
public class Control extends JavaScriptObject {

  /**
   * Constructs a control status.
   * @return A Control object.
   */
  public static native Control newInstance() /*-{
    return new $wnd.google.gdata.app.Control();
  }-*/;

  protected Control() { }

  /**
   * Returns the draft tag. This element is optional.
   * 
   * @return Draft tag.
   */
  public final native Draft getDraft() /*-{
    return this.getDraft();
  }-*/;

  /**
   * Sets the draft tag. This element is optional.
   * 
   * @param draft Draft tag.
   */
  public final native void setDraft(Draft draft) /*-{
    this.setDraft(draft);
  }-*/;

}