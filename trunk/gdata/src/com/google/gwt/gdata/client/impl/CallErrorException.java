/*
 * Copyright 2006 Google Inc.
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

import com.google.gwt.gdata.client.Error;

/**
 * Represents an error encountered during an Asynchronous call.
 */
public class CallErrorException extends Exception {

  private static final long serialVersionUID = -1773652769719715897L;
  private Error error;

  /**
   * Constructs a CallError exception.
   * @param message The error message
   */
  public CallErrorException(String message) {
    super(message);
  }

  /**
   * Constructs a CallError exception.
   * @param message The error object
   */
  public CallErrorException(Error error) {
    super(error.getMessage());
    this.error = error;
  }
  
  /**
   * Retrieves the error object containing the error details,
   * or null if none is available.
   * 
   * @return The error object
   */
  public Error getError() {
    return error;
  }
}
