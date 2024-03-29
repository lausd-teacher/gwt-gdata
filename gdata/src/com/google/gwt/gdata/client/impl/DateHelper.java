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

package com.google.gwt.gdata.client.impl;

import java.util.Date;

/**
 * Provides utility methods for interacting with Date objects in GWT.
 */
public class DateHelper {
  
  /**
   * Converts a Date object to a value in milliseconds.
   * 
   * @param value The value as a Date object.
   * @return The value in milliseconds.
   */
  public static double dateToMilliseconds(Date value) {
    return value.getTime();
  }
  
  /**
   * Converts a value in milliseconds to a Date object.
   * 
   * @param value The value in milliseconds.
   * @return The value as a Date object.
   */
  public static Date millisecondsToDate(double value) {
    return new Date((long) value);
  }
}
