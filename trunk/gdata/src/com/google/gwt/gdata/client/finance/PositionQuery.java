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

import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of all the positions belonging to the portfolio.
 */
public class PositionQuery extends Query {

  /**
   * Constructor.
   * 
   * @param feedUri URI of feed.
   * @return A PositionQuery object.
   */
  public static native PositionQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.finance.PositionQuery(feedUri);
  }-*/;

  protected PositionQuery() { }

  /**
   * Returns the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   * 
   * @return Flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   */
  public final native boolean getIncludeReturns() /*-{
    return this.getIncludeReturns();
  }-*/;

  /**
   * Returns the flag to inline transactions under the position feed.
   * 
   * @return Flag to inline transactions under the position feed.
   */
  public final native boolean getInlineTransactions() /*-{
    return this.getInlineTransactions();
  }-*/;

  /**
   * Sets the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries. The default value is false.
   * 
   * @param includeReturns Flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   */
  public final native void setIncludeReturns(boolean includeReturns) /*-{
    this.setIncludeReturns(includeReturns);
  }-*/;

  /**
   * Sets the flag to inline transactions under the position feed. The default value is false.
   * 
   * @param inlineTransactions Flag to inline transactions under the position feed.
   */
  public final native void setInlineTransactions(boolean inlineTransactions) /*-{
    this.setInlineTransactions(inlineTransactions);
  }-*/;

  /**
   * Sets the flag to inline transactions under the position feed. The default value is false.
   * 
   * @param inlineTransactions Flag to inline transactions under the position feed.
   */
  public final native void setInlineTransactions(String inlineTransactions) /*-{
    this.setInlineTransactions(inlineTransactions);
  }-*/;

}