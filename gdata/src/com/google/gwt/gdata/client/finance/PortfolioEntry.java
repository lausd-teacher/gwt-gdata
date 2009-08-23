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
public class PortfolioEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a Finance portfolio entry.
   */
  public static native PortfolioEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.PortfolioEntry();
  }-*/;

  protected PortfolioEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(PortfolioEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the data for the portfolio. This element is required.
   * 
   * @return Data for the portfolio.
   */
  public final native PortfolioData getPortfolioData() /*-{
    return this.getPortfolioData();
  }-*/;

  /**
   * Returns the position feed for the portfolio. This element is optional.
   * 
   * @return Position feed for the portfolio.
   */
  public final native PositionFeedLink getPositionFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  public final PortfolioEntry getSelf(PortfolioEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Sets the data for the portfolio. This element is required.
   * 
   * @param portfolioData Data for the portfolio.
   */
  public final native void setPortfolioData(PortfolioData portfolioData) /*-{
    this.setPortfolioData(portfolioData);
  }-*/;

  /**
   * Sets the position feed for the portfolio. This element is optional.
   * 
   * @param feedLink Position feed for the portfolio.
   */
  public final native void setPositionFeedLink(PositionFeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(PortfolioEntryCallback callback) {
    this.update(callback);
  }
  
}