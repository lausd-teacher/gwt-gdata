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

/**
 * Describes an entry in a feed of Finance portfolios.
 */
public class PortfolioEntry
    extends com.google.gwt.gdata.client.Entry<PortfolioEntry> {

  /**
   * Constructs a Finance portfolio entry.
   */
  public static native PortfolioEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.PortfolioEntry();
  }-*/;

  protected PortfolioEntry() { }

  /**
   * Returns the position feed for the portfolio. This element is optional.
   * 
   * @return Position feed for the portfolio. 
   */
  public final native PortfolioFeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the data for the portfolio. This element is required.
   * 
   * @return Data for the portfolio.
   */
  public final native PortfolioData getPortfolioData() /*-{
    return this.getPortfolioData();
  }-*/;
  
  /**
   * Sets the position feed for the portfolio. This element is optional.
   * 
   * @param feedLink Position feed for the portfolio.
   */
  public final native void setFeedLink(PortfolioFeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Sets the data for the portfolio. This element is required.
   * 
   * @param portfolioData Data for the portfolio.
   */
  public final native void setPortfolioData(PortfolioData portfolioData) /*-{
    this.setPortfolioData(portfolioData);
  }-*/;
  
}