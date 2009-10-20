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
 * Represents the available GData system packages.
 */
public enum GDataSystemPackage implements GDataPackage {
  ANALYTICS("analytics"),
  BLOGGER("blogger"),
  CALENDAR("calendar"),
  CONTACTS("contacts"),
  FINANCE("finance"),
  GBASE("gbase"),
  MAPS("maps"),
  SIDEWIKI("sidewiki");
  
  private String value;
  private GDataSystemPackage(String name) {
    value = name;
  }
  
  public String getValue() {
    return value;
  }
}
