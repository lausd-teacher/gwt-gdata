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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.impl.MultiMap;

/**
 * A map in which keys are of type string and values of type Attribute.
 */
public class MapAttribute extends MultiMap<Attribute> {
  
  /**
   * Constructs a Map of attributes.
   */
  @SuppressWarnings("unchecked")
  public static MapAttribute newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  protected MapAttribute() { }
  
}
