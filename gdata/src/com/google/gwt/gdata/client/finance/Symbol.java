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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class Symbol extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.finance.Symbol;
  }-*/;

  /**
   * Constructs a stock symbol using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Symbol newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.Symbol(
      params
    );
  }-*/;

  /**
   * Constructs a stock symbol using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Symbol newInstance() /*-{
    return new $wnd.google.gdata.finance.Symbol();
  }-*/;

  protected Symbol() { }

  /**
   * Returns the exchange symbol for the company or mutual fund.
   * 
   * @return
   */
  public final native String getExchange() /*-{
    return this.getExchange();
  }-*/;

  /**
   * Returns the full name for the company or mutual fund.
   * 
   * @return
   */
  public final native String getFullName() /*-{
    return this.getFullName();
  }-*/;

  /**
   * Returns the stock symbol for the company or mutual fund.
   * 
   * @return
   */
  public final native String getSymbol() /*-{
    return this.getSymbol();
  }-*/;

  /**
   * Sets the exchange symbol for the company or mutual fund.
   * 
   * @param exchange
   */
  public final native void setExchange(String exchange) /*-{
    this.setExchange(
      exchange
    );
  }-*/;

  /**
   * Sets the exchange symbol for the company or mutual fund.
   * 
   * @param exchange
   */
  public final native void setExchange() /*-{
    this.setExchange();
  }-*/;

  /**
   * Sets the full name for the company or mutual fund.
   * 
   * @param fullName
   */
  public final native void setFullName(String fullName) /*-{
    this.setFullName(
      fullName
    );
  }-*/;

  /**
   * Sets the full name for the company or mutual fund.
   * 
   * @param fullName
   */
  public final native void setFullName() /*-{
    this.setFullName();
  }-*/;

  /**
   * Sets the stock symbol for the company or mutual fund.
   * 
   * @param symbol
   */
  public final native void setSymbol(String symbol) /*-{
    this.setSymbol(
      symbol
    );
  }-*/;

  /**
   * Sets the stock symbol for the company or mutual fund.
   * 
   * @param symbol
   */
  public final native void setSymbol() /*-{
    this.setSymbol();
  }-*/;

}
