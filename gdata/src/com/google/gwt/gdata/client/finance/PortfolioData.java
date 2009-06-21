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
public class PortfolioData extends JavaScriptObject {

  /**
   * Constructs a portfolio data using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PortfolioData newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.PortfolioData(
      params
    );
  }-*/;

  /**
   * Constructs a portfolio data using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PortfolioData newInstance() /*-{
    return new $wnd.google.gdata.finance.PortfolioData();
  }-*/;

  protected PortfolioData() { }

  /**
   * Returns the cost basis of the portfolio in the portfolio default currency.
   * 
   * @return
   */
  public final native CostBasis getCostBasis() /*-{
    return this.getCostBasis();
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
   * Returns the todays gain for the portfolio in the portfolio default currency.
   * 
   * @return
   */
  public final native DaysGain getDaysGain() /*-{
    return this.getDaysGain();
  }-*/;

  /**
   * Returns the gain for the portfolio in the portfolio default currency.
   * 
   * @return
   */
  public final native Gain getGain() /*-{
    return this.getGain();
  }-*/;

  /**
   * Returns the percentage gain.
   * 
   * @return
   */
  public final native double getGainPercentage() /*-{
    return this.getGainPercentage();
  }-*/;

  /**
   * Returns the market value of the portfolio in the portfolio default currency.
   * 
   * @return
   */
  public final native MarketValue getMarketValue() /*-{
    return this.getMarketValue();
  }-*/;

  /**
   * Returns the 1 week return (percentage).
   * 
   * @return
   */
  public final native double getReturn1w() /*-{
    return this.getReturn1w();
  }-*/;

  /**
   * Returns the 1 year return (percentage).
   * 
   * @return
   */
  public final native double getReturn1y() /*-{
    return this.getReturn1y();
  }-*/;

  /**
   * Returns the 3 month return (percentage).
   * 
   * @return
   */
  public final native double getReturn3m() /*-{
    return this.getReturn3m();
  }-*/;

  /**
   * Returns the 3 year return (percentage).
   * 
   * @return
   */
  public final native double getReturn3y() /*-{
    return this.getReturn3y();
  }-*/;

  /**
   * Returns the 4 week return (percentage).
   * 
   * @return
   */
  public final native double getReturn4w() /*-{
    return this.getReturn4w();
  }-*/;

  /**
   * Returns the 5 year return (percentage).
   * 
   * @return
   */
  public final native double getReturn5y() /*-{
    return this.getReturn5y();
  }-*/;

  /**
   * Returns the overall return (percentage).
   * 
   * @return
   */
  public final native double getReturnOverall() /*-{
    return this.getReturnOverall();
  }-*/;

  /**
   * Returns the Year-to-date return (percentage).
   * 
   * @return
   */
  public final native double getReturnYTD() /*-{
    return this.getReturnYTD();
  }-*/;

  /**
   * Sets the cost basis of the portfolio in the portfolio default currency.
   * 
   * @param costBasis
   */
  public final native void setCostBasis(CostBasis costBasis) /*-{
    this.setCostBasis(
      costBasis
    );
  }-*/;

  /**
   * Sets the cost basis of the portfolio in the portfolio default currency.
   * 
   * @param costBasis
   */
  public final native void setCostBasis() /*-{
    this.setCostBasis();
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

  /**
   * Sets the todays gain for the portfolio in the portfolio default currency.
   * 
   * @param daysGain
   */
  public final native void setDaysGain(DaysGain daysGain) /*-{
    this.setDaysGain(
      daysGain
    );
  }-*/;

  /**
   * Sets the todays gain for the portfolio in the portfolio default currency.
   * 
   * @param daysGain
   */
  public final native void setDaysGain() /*-{
    this.setDaysGain();
  }-*/;

  /**
   * Sets the gain for the portfolio in the portfolio default currency.
   * 
   * @param gain
   */
  public final native void setGain(Gain gain) /*-{
    this.setGain(
      gain
    );
  }-*/;

  /**
   * Sets the gain for the portfolio in the portfolio default currency.
   * 
   * @param gain
   */
  public final native void setGain() /*-{
    this.setGain();
  }-*/;

  /**
   * Sets the percentage gain.
   * 
   * @param gainPercentage
   */
  public final native void setGainPercentage(double gainPercentage) /*-{
    this.setGainPercentage(
      gainPercentage
    );
  }-*/;

  /**
   * Sets the percentage gain.
   * 
   * @param gainPercentage
   */
  public final native void setGainPercentage() /*-{
    this.setGainPercentage();
  }-*/;

  /**
   * Sets the market value of the portfolio in the portfolio default currency.
   * 
   * @param marketValue
   */
  public final native void setMarketValue(MarketValue marketValue) /*-{
    this.setMarketValue(
      marketValue
    );
  }-*/;

  /**
   * Sets the market value of the portfolio in the portfolio default currency.
   * 
   * @param marketValue
   */
  public final native void setMarketValue() /*-{
    this.setMarketValue();
  }-*/;

  /**
   * Sets the 1 week return (percentage).
   * 
   * @param return1w
   */
  public final native void setReturn1w(double return1w) /*-{
    this.setReturn1w(
      return1w
    );
  }-*/;

  /**
   * Sets the 1 week return (percentage).
   * 
   * @param return1w
   */
  public final native void setReturn1w() /*-{
    this.setReturn1w();
  }-*/;

  /**
   * Sets the 1 year return (percentage).
   * 
   * @param return1y
   */
  public final native void setReturn1y(double return1y) /*-{
    this.setReturn1y(
      return1y
    );
  }-*/;

  /**
   * Sets the 1 year return (percentage).
   * 
   * @param return1y
   */
  public final native void setReturn1y() /*-{
    this.setReturn1y();
  }-*/;

  /**
   * Sets the 3 month return (percentage).
   * 
   * @param return3m
   */
  public final native void setReturn3m(double return3m) /*-{
    this.setReturn3m(
      return3m
    );
  }-*/;

  /**
   * Sets the 3 month return (percentage).
   * 
   * @param return3m
   */
  public final native void setReturn3m() /*-{
    this.setReturn3m();
  }-*/;

  /**
   * Sets the 3 year return (percentage).
   * 
   * @param return3y
   */
  public final native void setReturn3y(double return3y) /*-{
    this.setReturn3y(
      return3y
    );
  }-*/;

  /**
   * Sets the 3 year return (percentage).
   * 
   * @param return3y
   */
  public final native void setReturn3y() /*-{
    this.setReturn3y();
  }-*/;

  /**
   * Sets the 4 week return (percentage).
   * 
   * @param return4w
   */
  public final native void setReturn4w(double return4w) /*-{
    this.setReturn4w(
      return4w
    );
  }-*/;

  /**
   * Sets the 4 week return (percentage).
   * 
   * @param return4w
   */
  public final native void setReturn4w() /*-{
    this.setReturn4w();
  }-*/;

  /**
   * Sets the 5 year return (percentage).
   * 
   * @param return5y
   */
  public final native void setReturn5y(double return5y) /*-{
    this.setReturn5y(
      return5y
    );
  }-*/;

  /**
   * Sets the 5 year return (percentage).
   * 
   * @param return5y
   */
  public final native void setReturn5y() /*-{
    this.setReturn5y();
  }-*/;

  /**
   * Sets the overall return (percentage).
   * 
   * @param returnOverall
   */
  public final native void setReturnOverall(double returnOverall) /*-{
    this.setReturnOverall(
      returnOverall
    );
  }-*/;

  /**
   * Sets the overall return (percentage).
   * 
   * @param returnOverall
   */
  public final native void setReturnOverall() /*-{
    this.setReturnOverall();
  }-*/;

  /**
   * Sets the Year-to-date return (percentage).
   * 
   * @param returnYTD
   */
  public final native void setReturnYTD(double returnYTD) /*-{
    this.setReturnYTD(
      returnYTD
    );
  }-*/;

  /**
   * Sets the Year-to-date return (percentage).
   * 
   * @param returnYTD
   */
  public final native void setReturnYTD() /*-{
    this.setReturnYTD();
  }-*/;

}