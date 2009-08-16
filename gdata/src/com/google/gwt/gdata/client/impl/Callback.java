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

/**
 * A Callback interface defining success and failure methods.
 *
 * @param <T> The type of the return value
 */
public interface Callback<T> {

  /**
   * Called when an asynchronous call fails.
   * 
   * @param caught failure encountered while executing the asynchronous call
   */
  void onFailure(CallErrorException caught);

  /**
   * Called when an asynchronous call completes successfully.
   * 
   * @param result the return value of the asynchronous call
   */
  void onSuccess(T result);
}
