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
 * Stock symbol for the company.
 */
public class Symbol extends JavaScriptObject {

  /**
   * Constructs a stock symbol.
   */
  public static native Symbol newInstance() /*-{
    return new $wnd.google.gdata.finance.Symbol();
  }-*/;

  protected Symbol() { }

  /**
   * Returns the exchange symbol for the company or mutual fund.
   * This attribute is required.
   * 
   * @return Exchange symbol for the company or mutual fund.
   */
  public final native String getExchange() /*-{
    return this.getExchange();
  }-*/;

  /**
   * Returns the full name for the company or mutual fund.
   * This attribute is required.
   * 
   * @return Full name for the company or mutual fund.
   */
  public final native String getFullName() /*-{
    return this.getFullName();
  }-*/;

  /**
   * Returns the stock symbol for the company or mutual fund.
   * This attribute is required.
   * 
   * @return Stock symbol for the company or mutual fund.
   */
  public final native String getSymbol() /*-{
    return this.getSymbol();
  }-*/;

  /**
   * Sets the exchange symbol for the company or mutual fund.
   * This attribute is required.
   * 
   * @param exchange Exchange symbol for the company or mutual fund.
   */
  public final native void setExchange(String exchange) /*-{
    this.setExchange(exchange);
  }-*/;

  /**
   * Sets the full name for the company or mutual fund.
   * This attribute is required.
   * 
   * @param fullName Full name for the company or mutual fund.
   */
  public final native void setFullName(String fullName) /*-{
    this.setFullName(fullName);
  }-*/;

  /**
   * Sets the stock symbol for the company or mutual fund.
   * This attribute is required.
   * 
   * @param symbol Stock symbol for the company or mutual fund.
   */
  public final native void setSymbol(String symbol) /*-{
    this.setSymbol(symbol);
  }-*/;

}