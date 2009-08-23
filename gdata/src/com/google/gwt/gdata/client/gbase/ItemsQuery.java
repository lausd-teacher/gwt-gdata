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

package com.google.gwt.gdata.client.gbase;

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of a user's private items.
 */
public class ItemsQuery extends Query {

  /**
   * Specifies that gm:adjusted_name and gm:adjusted_value should be included
   * in query results.
   */
  public static final String CONTENT_ADJUSTMENTS =
      getConstant("CONTENT_ADJUSTMENTS");

  /**
   * Specifies that elements from the atom:, g:, and gm: namespaces should be
   * returned.
   */
  public static final String CONTENT_ALL = getConstant("CONTENT_ALL");

  /**
   * Specifies that elements from the atom: and g: namespaces should be
   * returned.
   */
  public static final String CONTENT_ATTRIBUTES =
      getConstant("CONTENT_ATTRIBUTES");

  /**
   * Specifies that the tags gm:stats and gm:adjusted should be returned.
   */
  public static final String CONTENT_META = getConstant("CONTENT_META");

  /**
   * Specifies that only elements from the atom: namespace should be returned.
   */
  public static final String CONTENT_NONE = getConstant("CONTENT_NONE");

  /**
   * Specifies that the gm:stats elements should be returned.
   */
  public static final String CONTENT_STATS = getConstant("CONTENT_STATS");

  /**
   * Specifies that links to generated thumbnails should be included in query
   * results.
   */
  public static final String CONTENT_THUMBNAILS =
      getConstant("CONTENT_THUMBNAILS");

  /**
   * Specifies that query results should be sorted by last modification time,
   * where the most recently modified item has the highest rank.
   */
  public static final String ORDERBY_MODIFICATION_TIME =
      getConstant("ORDERBY_MODIFICATION_TIME");

  /**
   * Specifies that query results should be sorted by relevancy.
   */
  public static final String ORDERBY_RELEVANCY =
      getConstant("ORDERBY_RELEVANCY");

  /**
   * Specifies that items should be returned in increasing rank.
   */
  public static final String SORTORDER_ASCENDING =
      getConstant("SORTORDER_ASCENDING");

  /**
   * Specifies that items should be returned in decreasing rank.
   */
  public static final String SORTORDER_DESCENDING =
      getConstant("SORTORDER_DESCENDING");

  /**
   * Constructs an Items query.
   * 
   * @param feedUri URI of feed.
   * @return An ItemsQuery object.
   */
  public static native ItemsQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.gbase.ItemsQuery(feedUri);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.ItemsQuery[name];
  }-*/;

  protected ItemsQuery() { }

  /**
   * Returns the whether adjusted query results should contain the
   * gm:adjusted_name and gm:adjusted_value tags.
   * 
   * @return Whether adjusted query results should contain the gm:adjusted_name
   * and gm:adjusted_value tags.
   */
  public final native boolean getAdjust() /*-{
    return this.getAdjust();
  }-*/;

  /**
   * Returns the author name or email address.
   * 
   * @return Author name or email address.
   */
  public final native String getAuthor() /*-{
    return this.getAuthor();
  }-*/;

  /**
   * Returns the query string that conforms to the Query Language
   * Specification.
   * 
   * @return Query string that conforms to the Query Language Specification.
   */
  public final native String getBq() /*-{
    return this.getBq();
  }-*/;

  /**
   * Returns the parameter that controls the content returned for each entry in
   * a query request.
   * 
   * @return Parameter that controls the content returned for each entry in a
   * query request.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the crowding criteria for queries.
   * 
   * @return Crowding criteria for queries.
   */
  public final native String getCrowdby() /*-{
    return this.getCrowdby();
  }-*/;

  /**
   * Returns the full-text query string.
   * 
   * @return Full-text query string.
   */
  public final native String getFullTextQuery() /*-{
    return this.getFullTextQuery();
  }-*/;

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return Maximum number of results to be retrieved.
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the ranking order for sorted queries.
   * 
   * @return Ranking order for sorted queries.
   */
  public final native String getOrderby() /*-{
    return this.getOrderby();
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
   * Returns the whether to refine the query results.
   * 
   * @return Whether to refine the query results.
   */
  public final native boolean getRefine() /*-{
    return this.getRefine();
  }-*/;

  /**
   * Returns the whether sorted query results are returned in increasing or
   * decreasing order.
   * 
   * @return Whether sorted query results are returned in increasing or
   * decreasing order.
   */
  public final native String getSortorder() /*-{
    return this.getSortorder();
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
   * Sets the whether adjusted query results should contain the
   * gm:adjusted_name and gm:adjusted_value tags. The default value is false.
   * 
   * @param adjust Whether adjusted query results should contain the
   * gm:adjusted_name and gm:adjusted_value tags.
   */
  public final native void setAdjust(boolean adjust) /*-{
    this.setAdjust(adjust);
  }-*/;

  /**
   * Sets the author name or email address.
   * 
   * @param author Author name or email address.
   */
  public final native void setAuthor(String author) /*-{
    this.setAuthor(author);
  }-*/;

  /**
   * Sets the query string that conforms to the Query Language Specification.
   * 
   * @param bq Query string that conforms to the Query Language Specification.
   */
  public final native void setBq(String bq) /*-{
    this.setBq(bq);
  }-*/;

  /**
   * Sets the parameter that controls the content returned for each entry in a
   * query request. The default value is 'attributes'.
   * 
   * @param content Parameter that controls the content returned for each entry
   * in a query request.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the crowding criteria for queries.
   * 
   * @param crowdby Crowding criteria for queries.
   */
  public final native void setCrowdby(String crowdby) /*-{
    this.setCrowdby(crowdby);
  }-*/;

  /**
   * Sets the full-text query string.
   * 
   * @param fullTextQuery Full-text query string.
   */
  public final native void setFullTextQuery(String fullTextQuery) /*-{
    this.setFullTextQuery(fullTextQuery);
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
   * Sets the ranking order for sorted queries. The default value is
   * 'relevancy'.
   * 
   * @param orderby Ranking order for sorted queries.
   */
  public final native void setOrderby(String orderby) /*-{
    this.setOrderby(orderby);
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
   * Sets the whether to refine the query results. The default value is false.
   * 
   * @param refine Whether to refine the query results.
   */
  public final native void setRefine(boolean refine) /*-{
    this.setRefine(refine);
  }-*/;


  /**
   * Sets the whether sorted query results are returned in increasing or
   * decreasing order. The default value is 'descending'.
   * 
   * @param sortorder Whether sorted query results are returned in increasing
   * or decreasing order.
   */
  public final native void setSortorder(String sortorder) /*-{
    this.setSortorder(sortorder);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * The default value is 1.
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