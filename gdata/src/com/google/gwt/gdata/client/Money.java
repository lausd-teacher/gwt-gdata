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
 * Describes money.
 */
public class Money extends JavaScriptObject {

  /**
   * Constructs a money using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: amount and currencyCode.
   */
  public static native Money newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Money(
      params
    );
  }-*/;

  protected Money() { }

  /**
   * Returns the amount. This attribute is required.
   * 
   * @return Amount or undefined for none.
   */
  public final native double getAmount() /*-{
    return this.getAmount();
  }-*/;

  /**
   * Returns the ISO4217 currency code. This attribute is required.
   * 
   * @return ISO4217 currency code or undefined for none.
   */
  public final native String getCurrencyCode() /*-{
    return this.getCurrencyCode();
  }-*/;

  /**
   * Sets the amount. This attribute is required.
   */
  public final native void setAmount() /*-{
    this.setAmount();
  }-*/;

  /**
   * Sets the amount. This attribute is required.
   * 
   * @param amount Amount or undefined for none.
   */
  public final native void setAmount(double amount) /*-{
    this.setAmount(
      amount
    );
  }-*/;

  /**
   * Sets the ISO4217 currency code. This attribute is required.
   */
  public final native void setCurrencyCode() /*-{
    this.setCurrencyCode();
  }-*/;

  /**
   * Sets the ISO4217 currency code. This attribute is required.
   * 
   * @param currencyCode ISO4217 currency code or undefined for none.
   */
  public final native void setCurrencyCode(String currencyCode) /*-{
    this.setCurrencyCode(
      currencyCode
    );
  }-*/;

}
