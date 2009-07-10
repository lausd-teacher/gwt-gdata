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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.gdata.client.Kind;

/**
 * Describes a position kind.
 */
public class PositionKind extends Kind {

  /**
   * Position.
   */
  public static final String TERM_POSITION = getConstant("TERM_POSITION");

  /**
   * Constructs a position kind.
   * @return A PositionKind object.
   */
  public static native PositionKind newInstance() /*-{
    return new $wnd.google.gdata.finance.PositionKind();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.finance.PositionKind[name];
  }-*/;

  protected PositionKind() { }

}