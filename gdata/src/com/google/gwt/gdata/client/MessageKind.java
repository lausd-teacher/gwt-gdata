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

/**
 * Describes a message kind.
 */
public class MessageKind extends Kind {

  /**
   * Message.
   */
  public static final String TERM_MESSAGE = getConstant("TERM_MESSAGE");

  /**
   * Constructs a message kind.
   * @return A MessageKind object.
   */
  public static native MessageKind newInstance() /*-{
    return new $wnd.google.gdata.MessageKind();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.MessageKind[name];
  }-*/;

  protected MessageKind() { }

}