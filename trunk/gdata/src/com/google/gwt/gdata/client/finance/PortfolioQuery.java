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
import com.google.gwt.gdata.client.Query;

/**
 * Comment unavailable.
 */
public class PortfolioQuery extends Query {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.finance.PortfolioQuery;
  }-*/;

  /**
   * Constructor.
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
   * @return
   */
  public final native Boolean getIncludeReturns() /*-{
    return this.getIncludeReturns();
  }-*/;

  /**
   * Returns the flag to inline positions under the portfolio feed.
   * 
   * @return
   */
  public final native Boolean getInlinePositions() /*-{
    return this.getInlinePositions();
  }-*/;

  /**
   * Sets the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   * 
   * @param includeReturns
   */
  public final native void setIncludeReturns(Boolean includeReturns) /*-{
    this.setIncludeReturns(
      includeReturns
    );
  }-*/;

  /**
   * Sets the flag indicating whether returns and performance stats should be included in the portfolio and position feed entries.
   * 
   * @param includeReturns
   */
  public final native void setIncludeReturns(String includeReturns) /*-{
    this.setIncludeReturns(
      includeReturns
    );
  }-*/;

  /**
   * Sets the flag to inline positions under the portfolio feed.
   * 
   * @param inlinePositions
   */
  public final native void setInlinePositions(Boolean inlinePositions) /*-{
    this.setInlinePositions(
      inlinePositions
    );
  }-*/;

  /**
   * Sets the flag to inline positions under the portfolio feed.
   * 
   * @param inlinePositions
   */
  public final native void setInlinePositions(String inlinePositions) /*-{
    this.setInlinePositions(
      inlinePositions
    );
  }-*/;

}
