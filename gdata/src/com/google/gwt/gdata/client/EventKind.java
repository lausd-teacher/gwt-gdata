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
 * Describes an event kind.
 */
public class EventKind extends Kind {

  /**
   * Event.
   */
  public static final String TERM_EVENT = getConstant("TERM_EVENT");

  /**
   * Overview  File   Class  Tree  Index  Help  GData JavaScript Client 1.10  
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: scheme and term.
   */
  public static native EventKind newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.EventKind(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.EventKind[name];
  }-*/;

  protected EventKind() { }

}
