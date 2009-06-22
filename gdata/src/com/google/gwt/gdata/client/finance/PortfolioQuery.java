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
 * Describes a query for the feed of all the user's portfolios.
 */
public class PortfolioQuery extends Query {

  /**
   * Constructor.
   * 
   * @param feedUri URI of feed.
   */
  public static native PortfolioQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.finance.PortfolioQuery(
      feedUri
    );
  }-*/;

  protected PortfolioQuery() { }

  /**
   * Returns the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   * 
   * @return Flag indicating whether returns and performance stats should be included in the portfolio and position feed entries or null to indicate that the parameter is disabled.
   */
  public final native boolean getIncludeReturns() /*-{
    return this.getIncludeReturns();
  }-*/;

  /**
   * Returns the flag to inline positions under the portfolio feed.
   * 
   * @return Flag to inline positions under the portfolio feed or null to indicate that the parameter is disabled.
   */
  public final native boolean getInlinePositions() /*-{
    return this.getInlinePositions();
  }-*/;

  /**
   * Sets the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries. The default value is false.
   * 
   * @param includeReturns Flag indicating whether returns and performance stats should be included in the portfolio and position feed entries or an equivalent string value or null to disable this parameter.
   */
  public final native void setIncludeReturns(boolean includeReturns) /*-{
    this.setIncludeReturns(
      includeReturns
    );
  }-*/;

  /**
   * Sets the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries. The default value is false.
   * 
   * @param includeReturns Flag indicating whether returns and performance stats should be included in the portfolio and position feed entries or an equivalent string value or null to disable this parameter.
   */
  public final native void setIncludeReturns(String includeReturns) /*-{
    this.setIncludeReturns(
      includeReturns
    );
  }-*/;

  /**
   * Sets the flag to inline positions under the portfolio feed. The default value is false.
   * 
   * @param inlinePositions Flag to inline positions under the portfolio feed or an equivalent string value or null to disable this parameter.
   */
  public final native void setInlinePositions(boolean inlinePositions) /*-{
    this.setInlinePositions(
      inlinePositions
    );
  }-*/;

  /**
   * Sets the flag to inline positions under the portfolio feed. The default value is false.
   * 
   * @param inlinePositions Flag to inline positions under the portfolio feed or an equivalent string value or null to disable this parameter.
   */
  public final native void setInlinePositions(String inlinePositions) /*-{
    this.setInlinePositions(
      inlinePositions
    );
  }-*/;

}
