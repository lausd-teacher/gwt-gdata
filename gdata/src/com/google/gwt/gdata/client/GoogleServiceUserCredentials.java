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
 * Describes user credentials.
 */
public class GoogleServiceUserCredentials extends JavaScriptObject {

  protected GoogleServiceUserCredentials() { }
  
  /**
   * Gets the account type.
   * @return The account type.
   */
  public final native ClientLoginAccountType getAccountType() /*-{
    return @com.google.gwt.gdata.client.ClientLoginAccountType::valueOf(Ljava/lang/String;)(this.accountType);
  }-*/;
  
  /**
   * Gets the password.
   * @return The password value.
   */
  public final native String getPassword() /*-{
    return this.password;
  }-*/;
  
  /**
   * Gets the username.
   * @return The username value.
   */
  public final native String getUsername() /*-{
    return this.username;
  }-*/;
  
}