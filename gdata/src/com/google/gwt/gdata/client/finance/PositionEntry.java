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
 * Describes an entry in a feed of Finance positions.
 */
public class PositionEntry
    extends com.google.gwt.gdata.client.Entry<PositionEntry> {

  /**
   * Constructs a Finance position entry.
   */
  public static native PositionEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.PositionEntry();
  }-*/;

  protected PositionEntry() { }

  /**
   * Returns the transaction feed for the position. This element is optional.
   * 
   * @return Transaction feed for the position.
   */
  public final native PositionFeedLink getFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the data for the position. This element is required.
   * 
   * @return Data for the position.
   */
  public final native PositionData getPositionData() /*-{
    return this.getPositionData();
  }-*/;

  /**
   * Returns the stock symbol for the position. This element is required.
   * 
   * @return Stock symbol for the position.
   */
  public final native Symbol getSymbol() /*-{
    return this.getSymbol();
  }-*/;
  
  /**
   * Sets the transaction feed for the position. This element is optional.
   * 
   * @param feedLink Transaction feed for the position.
   */
  public final native void setFeedLink(PositionFeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Sets the data for the position. This element is required.
   * 
   * @param positionData Data for the position.
   */
  public final native void setPositionData(PositionData positionData) /*-{
    this.setPositionData(positionData);
  }-*/;

  /**
   * Sets the stock symbol for the position. This element is required.
   * 
   * @param symbol Stock symbol for the position.
   */
  public final native void setSymbol(Symbol symbol) /*-{
    this.setSymbol(symbol);
  }-*/;
  
}