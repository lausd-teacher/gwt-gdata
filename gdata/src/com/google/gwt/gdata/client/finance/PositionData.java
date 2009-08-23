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
 * Data for the position.
 */
public class PositionData extends JavaScriptObject {

  /**
   * Constructs a position data.
   * @return A PositionData object.
   */
  public static native PositionData newInstance() /*-{
    return new $wnd.google.gdata.finance.PositionData();
  }-*/;

  protected PositionData() { }

  /**
   * Returns the cost basis of the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @return Cost basis of the position in the portfolio default currency
   * (and exchange currency if it differs).
   */
  public final native CostBasis getCostBasis() /*-{
    return this.getCostBasis();
  }-*/;

  /**
   * Returns the today's gain for the position in the portfolio default
   * currency (and exchange currency if it differs). This element is optional.
   * 
   * @return Today's gain for the position in the portfolio default currency
   * (and exchange currency if it differs).
   */
  public final native DaysGain getDaysGain() /*-{
    return this.getDaysGain();
  }-*/;

  /**
   * Returns the gain for the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @return Gain for the position in the portfolio default currency
   * (and exchange currency if it differs).
   */
  public final native Gain getGain() /*-{
    return this.getGain();
  }-*/;

  /**
   * Returns the percentage gain. This attribute is optional.
   * 
   * @return Percentage gain.
   */
  public final native double getGainPercentage() /*-{
    return this.getGainPercentage();
  }-*/;

  /**
   * Returns the market value of the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @return Market value of the position in the portfolio default currency
   * (and exchange currency if it differs).
   */
  public final native MarketValue getMarketValue() /*-{
    return this.getMarketValue();
  }-*/;

  /**
   * Returns the 1 week return (percentage). This attribute is optional.
   * 
   * @return 1 week return (percentage).
   */
  public final native double getReturn1w() /*-{
    return this.getReturn1w();
  }-*/;

  /**
   * Returns the 1 year return (percentage). This attribute is optional.
   * 
   * @return 1 year return (percentage).
   */
  public final native double getReturn1y() /*-{
    return this.getReturn1y();
  }-*/;

  /**
   * Returns the 3 month return (percentage). This attribute is optional.
   * 
   * @return 3 month return (percentage).
   */
  public final native double getReturn3m() /*-{
    return this.getReturn3m();
  }-*/;

  /**
   * Returns the 3 year return (percentage). This attribute is optional.
   * 
   * @return 3 year return (percentage).
   */
  public final native double getReturn3y() /*-{
    return this.getReturn3y();
  }-*/;

  /**
   * Returns the 4 week return (percentage). This attribute is optional.
   * 
   * @return 4 week return (percentage).
   */
  public final native double getReturn4w() /*-{
    return this.getReturn4w();
  }-*/;

  /**
   * Returns the 5 year return (percentage). This attribute is optional.
   * 
   * @return 5 year return (percentage).
   */
  public final native double getReturn5y() /*-{
    return this.getReturn5y();
  }-*/;

  /**
   * Returns the overall return (percentage). This attribute is optional.
   * 
   * @return Overall return (percentage).
   */
  public final native double getReturnOverall() /*-{
    return this.getReturnOverall();
  }-*/;

  /**
   * Returns the Year-to-date return (percentage). This attribute is optional.
   * 
   * @return Year-to-date return (percentage).
   */
  public final native double getReturnYTD() /*-{
    return this.getReturnYTD();
  }-*/;

  /**
   * Returns the number of shares belonging to the position.
   * This attribute is optional.
   * 
   * @return Number of shares belonging to the position.
   */
  public final native double getShares() /*-{
    return this.getShares();
  }-*/;

  /**
   * Sets the cost basis of the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @param costBasis Cost basis of the position in the portfolio default
   * currency (and exchange currency if it differs), or object to use as a
   * parameter to the google.gdata.finance.CostBasis constructor.
   */
  public final native void setCostBasis(CostBasis costBasis) /*-{
    this.setCostBasis(costBasis);
  }-*/;

  /**
   * Sets the today's gain for the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @param daysGain Today's gain for the position in the portfolio default
   * currency (and exchange currency if it differs).
   */
  public final native void setDaysGain(DaysGain daysGain) /*-{
    this.setDaysGain(daysGain);
  }-*/;

  /**
   * Sets the gain for the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @param gain Gain for the position in the portfolio default currency
   * (and exchange currency if it differs).
   */
  public final native void setGain(Gain gain) /*-{
    this.setGain(gain);
  }-*/;

  /**
   * Sets the percentage gain. This attribute is optional.
   * 
   * @param gainPercentage Percentage gain or undefined for none.
   */
  public final native void setGainPercentage(double gainPercentage) /*-{
    this.setGainPercentage(gainPercentage);
  }-*/;

  /**
   * Sets the market value of the position in the portfolio default currency
   * (and exchange currency if it differs). This element is optional.
   * 
   * @param marketValue Market value of the position in the portfolio default
   * currency (and exchange currency if it differs).
   */
  public final native void setMarketValue(MarketValue marketValue) /*-{
    this.setMarketValue(marketValue);
  }-*/;

  /**
   * Sets the 1 week return (percentage). This attribute is optional.
   * 
   * @param return1w 1 week return (percentage).
   */
  public final native void setReturn1w(double return1w) /*-{
    this.setReturn1w(return1w);
  }-*/;

  /**
   * Sets the 1 year return (percentage). This attribute is optional.
   * 
   * @param return1y 1 year return (percentage).
   */
  public final native void setReturn1y(double return1y) /*-{
    this.setReturn1y(return1y);
  }-*/;

  /**
   * Sets the 3 month return (percentage). This attribute is optional.
   * 
   * @param return3m 3 month return (percentage).
   */
  public final native void setReturn3m(double return3m) /*-{
    this.setReturn3m(return3m);
  }-*/;

  /**
   * Sets the 3 year return (percentage). This attribute is optional.
   * 
   * @param return3y 3 year return (percentage).
   */
  public final native void setReturn3y(double return3y) /*-{
    this.setReturn3y(return3y);
  }-*/;

  /**
   * Sets the 4 week return (percentage). This attribute is optional.
   * 
   * @param return4w 4 week return (percentage).
   */
  public final native void setReturn4w(double return4w) /*-{
    this.setReturn4w(return4w);
  }-*/;

  /**
   * Sets the 5 year return (percentage). This attribute is optional.
   * 
   * @param return5y 5 year return (percentage).
   */
  public final native void setReturn5y(double return5y) /*-{
    this.setReturn5y(return5y);
  }-*/;
  
  /**
   * Sets the overall return (percentage). This attribute is optional.
   * 
   * @param returnOverall Overall return (percentage).
   */
  public final native void setReturnOverall(double returnOverall) /*-{
    this.setReturnOverall(returnOverall);
  }-*/;

  /**
   * Sets the Year-to-date return (percentage). This attribute is optional.
   * 
   * @param returnYTD Year-to-date return (percentage).
   */
  public final native void setReturnYTD(double returnYTD) /*-{
    this.setReturnYTD(returnYTD);
  }-*/;

  /**
   * Sets the number of shares belonging to the position.
   * This attribute is optional.
   * 
   * @param shares Number of shares belonging to the position.
   */
  public final native void setShares(double shares) /*-{
    this.setShares(shares);
  }-*/;

}