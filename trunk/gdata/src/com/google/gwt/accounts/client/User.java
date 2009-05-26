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

package com.google.gwt.accounts.client;

import com.google.gwt.user.client.Command;

/**
 * Comment unavailable.
 */
public class User {
  public static final native String checkLogin(String scope) /*-{ return $wnd.google.accounts.user.checkLogin(scope); }-*/;
  public static final native boolean getInfo(Runnable callback, String scope) /*-{ return $wnd.google.accounts.user.getInfo(function() { callback.@java.lang.Runnable::run()(); }, scope); }-*/;
  public static final native boolean getInfo(Runnable callback) /*-{ return $wnd.google.accounts.user.getInfo(function() { callback.@java.lang.Runnable::run()(); }); }-*/;
  public static final native String getScopes() /*-{ return $wnd.google.accounts.user.getScopes(); }-*/;
  public static final native AuthSubStatus getStatus(String scope) /*-{ return @com.google.gwt.accounts.client.AuthSubStatus::valueOf(I)($wnd.google.accounts.user.getStatus(scope)); }-*/;
  public static final native AuthSubStatus getStatus() /*-{ return @com.google.gwt.accounts.client.AuthSubStatus::valueOf(I)($wnd.google.accounts.user.getStatus()); }-*/;
  public static final native String login(String scope, String hd) /*-{ return $wnd.google.accounts.user.login(scope, hd); }-*/;
  public static final native String login(String scope) /*-{ return $wnd.google.accounts.user.login(scope); }-*/;
  public static final native boolean logout(Command callback, String scope) /*-{ return $wnd.google.accounts.user.logout(function() { callback.@java.lang.Runnable::run()(); }, scope); }-*/;
  public static final native boolean logout(Command callback) /*-{ return $wnd.google.accounts.user.logout(function() { callback.@java.lang.Runnable::run()(); }, scope); }-*/;
}
