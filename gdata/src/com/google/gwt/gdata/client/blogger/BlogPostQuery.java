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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of a blog's posts.
 */
public class BlogPostQuery extends Query {

  /**
   * Order the returned feed's entries by their <app:edited> values.
   */
  public static final String ORDERBY_EDITED = getConstant("ORDERBY_EDITED");

  /**
   * Order the returned feed's entries by their <published> values.
   */
  public static final String ORDERBY_PUBLISHED = getConstant("ORDERBY_PUBLISHED");

  /**
   * Order the returned feed's entries by their <updated> values.
   */
  public static final String ORDERBY_UPDATED = getConstant("ORDERBY_UPDATED");

  /**
   * Constructs a blog post query.
   * 
   * @param feedUri URI of feed.
   * @return A BlogPostQuery object.
   */
  public static native BlogPostQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.blogger.BlogPostQuery(
      feedUri
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.blogger.BlogPostQuery[name];
  }-*/;

  protected BlogPostQuery() { }

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return Maximum number of results to be retrieved.
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the order of entries in a feed.
   * 
   * @return Order of entries in a feed.
   */
  public final native String getOrderBy() /*-{
    return this.getOrderBy();
  }-*/;

  /**
   * Returns the maximum published date.
   * 
   * @return Maximum published date.
   */
  public final native DateTime getPublishedMax() /*-{
    return this.getPublishedMax();
  }-*/;

  /**
   * Returns the minimum published date.
   * 
   * @return Minimum published date.
   */
  public final native DateTime getPublishedMin() /*-{
    return this.getPublishedMin();
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
   * Returns the maximum updated date.
   * 
   * @return Maximum updated date.
   */
  public final native DateTime getUpdatedMax() /*-{
    return this.getUpdatedMax();
  }-*/;

  /**
   * Returns the minimum updated date.
   * 
   * @return Minimum updated date.
   */
  public final native DateTime getUpdatedMin() /*-{
    return this.getUpdatedMin();
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
   * Sets the order of entries in a feed. The default value is 'published'.
   * 
   * @param orderBy Order of entries in a feed.
   */
  public final native void setOrderBy(String orderBy) /*-{
    this.setOrderBy(orderBy);
  }-*/;

  /**
   * Sets the maximum published date.
   * 
   * @param publishedMax Maximum published date.
   */
  public final native void setPublishedMax(DateTime publishedMax) /*-{
    this.setPublishedMax(publishedMax);
  }-*/;

  /**
   * Sets the minimum published date.
   * 
   * @param publishedMin Minimum published date.
   */
  public final native void setPublishedMin(DateTime publishedMin) /*-{
    this.setPublishedMin(publishedMin);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved. The default value is 1.
   * 
   * @param startIndex 1-based index of the first result to be retrieved.
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(startIndex);
  }-*/;

  /**
   * Sets the maximum updated date.
   * 
   * @param updatedMax Maximum updated date.
   */
  public final native void setUpdatedMax(DateTime updatedMax) /*-{
    this.setUpdatedMax(updatedMax);
  }-*/;

  /**
   * Sets the minimum updated date.
   * 
   * @param updatedMin Minimum updated date.
   */
  public final native void setUpdatedMin(DateTime updatedMin) /*-{
    this.setUpdatedMin(updatedMin);
  }-*/;

}