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
 * Comment unavailable.
 */
public class Money extends JavaScriptObject {

  /**
   * Constructs a money using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Money newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Money(
      params
    );
  }-*/;

  /**
   * Constructs a money using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Money newInstance() /*-{
    return new $wnd.google.gdata.Money();
  }-*/;

  protected Money() { }

  /**
   * Returns the amount.
   * 
   * @return
   */
  public final native double getAmount() /*-{
    return this.getAmount();
  }-*/;

  /**
   * Returns the ISO4217 currency code.
   * 
   * @return
   */
  public final native String getCurrencyCode() /*-{
    return this.getCurrencyCode();
  }-*/;

  /**
   * Sets the amount.
   * 
   * @param amount
   */
  public final native void setAmount(double amount) /*-{
    this.setAmount(
      amount
    );
  }-*/;

  /**
   * Sets the amount.
   * 
   * @param amount
   */
  public final native void setAmount() /*-{
    this.setAmount();
  }-*/;

  /**
   * Sets the ISO4217 currency code.
   * 
   * @param currencyCode
   */
  public final native void setCurrencyCode(String currencyCode) /*-{
    this.setCurrencyCode(
      currencyCode
    );
  }-*/;

  /**
   * Sets the ISO4217 currency code.
   * 
   * @param currencyCode
   */
  public final native void setCurrencyCode() /*-{
    this.setCurrencyCode();
  }-*/;

}
