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

package com.google.gwt.gdata.client.acl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Kind;

/**
 * Comment unavailable.
 */
public class AclKind extends Kind {

  /**
   * Access rule.
   */
  public static final String TERM_ACCESSRULE = getConstant("TERM_ACCESSRULE");

  /**
   * Constructs an access control list kind using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AclKind newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.acl.AclKind(
      params
    );
  }-*/;

  /**
   * Constructs an access control list kind using an object parameter whose property names match the setter method to use for each property.
   */
  public static native AclKind newInstance() /*-{
    return new $wnd.google.gdata.acl.AclKind();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.acl.AclKind[name];
  }-*/;

  protected AclKind() { }

}
