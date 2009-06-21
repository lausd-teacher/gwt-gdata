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
public class PortfolioEntry extends com.google.gwt.gdata.client.Entry<PortfolioEntry> {

  /**
   * Constructs a Finance portfolio entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PortfolioEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.PortfolioEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Finance portfolio entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native PortfolioEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.PortfolioEntry();
  }-*/;

  protected PortfolioEntry() { }

  /**
   * Returns the position feed for the portfolio.
   * 
   * @return
   */
  public final native PortfolioFeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the data for the portfolio.
   * 
   * @return
   */
  public final native PortfolioData getPortfolioData() /*-{
    return this.getPortfolioData();
  }-*/;

  /**
   * Sets the position feed for the portfolio.
   * 
   * @param feedLink
   */
  public final native void setFeedLink(PortfolioFeedLink feedLink) /*-{
    this.setFeedLink(
      feedLink
    );
  }-*/;

  /**
   * Sets the position feed for the portfolio.
   * 
   * @param feedLink
   */
  public final native void setFeedLink() /*-{
    this.setFeedLink();
  }-*/;

  /**
   * Sets the data for the portfolio.
   * 
   * @param portfolioData
   */
  public final native void setPortfolioData(PortfolioData portfolioData) /*-{
    this.setPortfolioData(
      portfolioData
    );
  }-*/;

  /**
   * Sets the data for the portfolio.
   * 
   * @param portfolioData
   */
  public final native void setPortfolioData() /*-{
    this.setPortfolioData();
  }-*/;

}
