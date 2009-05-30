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
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 */
public class Utils {
  
  @SuppressWarnings("unchecked")
  public static void handleFailureCallback(AsyncCallback cb, String error) {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        cb.onFailure(new JavaScriptException(error));
      } catch (Throwable e) {
        handler.onUncaughtException(e);
      }
    } else {
      cb.onFailure(new JavaScriptException(error));
    }
  }

  @SuppressWarnings("unchecked")
  public static void handleSuccessCallback(AsyncCallback cb, Object arg) {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    if (handler != null) {
      try {
        cb.onSuccess(arg);
      } catch (Throwable e) {
        handler.onUncaughtException(e);
      }
    } else {
      cb.onSuccess(arg);
    }
  }
}
