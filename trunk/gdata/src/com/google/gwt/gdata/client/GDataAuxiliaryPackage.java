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
 * Represents the available GData auxiliary packages.
 */
public enum GDataAuxiliaryPackage implements GDataPackage {
  
  ACL("acl"),
  APP("app"),
  ATOM("atom"),
  GEO("geo"),
  MEDIARSS("mediarss"),
  OPENSEARCH("opensearch"),
  THREADING("threading");
  
  private String value;
  private GDataAuxiliaryPackage(String name) {
    value = name;
  }
  
  public String getValue() {
    return value;
  }
}
