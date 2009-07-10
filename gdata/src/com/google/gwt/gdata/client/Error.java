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
 * Represents a GData error.
 */
public class Error extends JavaScriptObject {

  protected Error() { }
  
  /**
   * Returns the error description.
   * @return Error description.
   */
  public final native String getDescription() /*-{
    return this.description;
  }-*/;

  /**
   * Returns the error message.
   * @return Erro message.
   */
  public final native String getMessage() /*-{
    return this.message;
  }-*/;

  /**
   * Returns the error name.
   * @return Erro name.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;

  /**
   * Returns the error's status text content type.
   * @return Status text content type.
   */
  public final native String getStatusTextContentType() /*-{
    return this.statusTextContentType;
  }-*/;
}
