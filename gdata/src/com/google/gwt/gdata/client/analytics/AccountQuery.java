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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of accounts and profiles to which a given user has access.
 */
public class AccountQuery extends Query {

  /**
   * Constructs an account query.
   * 
   * @param feedUri URI of feed.
   * @return An AccountQuery object.
   */
  public static native AccountQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.analytics.AccountQuery(feedUri);
  }-*/;

  protected AccountQuery() { }

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return Maximum number of results to be retrieved.
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the whether to indent the elements.
   * 
   * @return Whether to indent the elements.
   */
  public final native boolean getPrettyprint() /*-{
    return this.getPrettyprint();
  }-*/;

  /**
   * Returns the 1-based index of the first result to be retrieved.
   * 
   * @return 1-based index of the first result to be retrieved.
   */
  public final native double getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults Maximum number of results to be retrieved.
   */
  public final native void setMaxResults(double maxResults) /*-{
    this.setMaxResults(maxResults);
  }-*/;

  /**
   * Sets the whether to indent the elements. The default value is false.
   * 
   * @param prettyprint Whether to indent the elements.
   */
  public final native void setPrettyprint(boolean prettyprint) /*-{
    this.setPrettyprint(prettyprint);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved. The default value is 1.
   * 
   * @param startIndex 1-based index of the first result to be retrieved.
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(startIndex);
  }-*/;

}