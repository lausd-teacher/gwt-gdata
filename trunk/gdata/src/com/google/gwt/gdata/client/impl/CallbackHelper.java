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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

/**
 * Provides utility methods for interacting with Callbacks in GWT.
 */
public class CallbackHelper {

  /**
   * Performs a call to a failure callback, with the supplied error.
   * @param <T> The callback's return type
   * @param cb The callback object
   * @param error The error object
   */
  public static <T extends JavaScriptObject> void handleFailureCallback(
      Callback<T> cb, com.google.gwt.gdata.client.Error error) {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        CallErrorException exc = new CallErrorException(error);
        cb.onFailure(exc);
      } catch (Throwable e) {
        e.printStackTrace();
        handler.onUncaughtException(e);
      }
    } else {
      cb.onFailure(new CallErrorException(error));
    }
  }

  /**
   * Performs a call to a success callback, with the supplied return value.
   * @param <T> The callback's return type
   * @param cb The callback object
   * @param arg The callback's return value
   */
  public static <T extends JavaScriptObject> void handleSuccessCallback(
      Callback<T> cb, T arg) {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        cb.onSuccess(arg);
      } catch (Throwable e) {
        e.printStackTrace();
        handler.onUncaughtException(e);
      }
    } else {
      cb.onSuccess(arg);
    }
  }
}
