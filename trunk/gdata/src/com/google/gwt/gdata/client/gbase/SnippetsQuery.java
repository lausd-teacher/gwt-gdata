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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Comment unavailable.
 */
public class SnippetsQuery extends Query {

  /**
   * Specifies that gm:adjusted_name and gm:adjusted_value should be included in query results.
   */
  public static final String CONTENT_ADJUSTMENTS = getConstant("CONTENT_ADJUSTMENTS");

  /**
   * Specifies that elements from the atom:, g:, and gm: namespaces should be returned.
   */
  public static final String CONTENT_ALL = getConstant("CONTENT_ALL");

  /**
   * Specifies that elements from the atom: and g: namespaces should be returned.
   */
  public static final String CONTENT_ATTRIBUTES = getConstant("CONTENT_ATTRIBUTES");

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
   * Specifies that links to generated thumbnails should be included in query results.
   */
  public static final String CONTENT_THUMBNAILS = getConstant("CONTENT_THUMBNAILS");

  /**
   * Specifies that query results should be sorted by last modification time, where the most recently modified item has the highest rank.
   */
  public static final String ORDERBY_MODIFICATION_TIME = getConstant("ORDERBY_MODIFICATION_TIME");

  /**
   * Specifies that query results should be sorted by relevancy.
   */
  public static final String ORDERBY_RELEVANCY = getConstant("ORDERBY_RELEVANCY");

  /**
   * Specifies that items should be returned in increasing rank.
   */
  public static final String SORTORDER_ASCENDING = getConstant("SORTORDER_ASCENDING");

  /**
   * Specifies that items should be returned in decreasing rank.
   */
  public static final String SORTORDER_DESCENDING = getConstant("SORTORDER_DESCENDING");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.SnippetsQuery;
  }-*/;

  /**
   * Constructor.
   */
  public static native SnippetsQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.gbase.SnippetsQuery(
      feedUri
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.SnippetsQuery[name];
  }-*/;

  protected SnippetsQuery() { }

  /**
   * Returns the whether adjusted query results should contain the gm:adjusted_name and gm:adjusted_value tags.
   * 
   * @return
   */
  public final native Boolean getAdjust() /*-{
    return this.getAdjust();
  }-*/;

  /**
   * Returns the author name or email address.
   * 
   * @return
   */
  public final native String getAuthor() /*-{
    return this.getAuthor();
  }-*/;

  /**
   * Returns the query string that conforms to the Query Language Specification.
   * 
   * @return
   */
  public final native String getBq() /*-{
    return this.getBq();
  }-*/;

  /**
   * Returns the parameter that controls the content returned for each entry in a query request.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the crowding criteria for queries.
   * 
   * @return
   */
  public final native String getCrowdby() /*-{
    return this.getCrowdby();
  }-*/;

  /**
   * Returns the full-text query string.
   * 
   * @return
   */
  public final native String getFullTextQuery() /*-{
    return this.getFullTextQuery();
  }-*/;

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the ranking order for sorted queries.
   * 
   * @return
   */
  public final native String getOrderby() /*-{
    return this.getOrderby();
  }-*/;

  /**
   * Returns the maximum published date.
   * 
   * @return
   */
  public final native DateTime getPublishedMax() /*-{
    return this.getPublishedMax();
  }-*/;

  /**
   * Returns the minimum published date.
   * 
   * @return
   */
  public final native DateTime getPublishedMin() /*-{
    return this.getPublishedMin();
  }-*/;

  /**
   * Returns the whether to refine the query results.
   * 
   * @return
   */
  public final native Boolean getRefine() /*-{
    return this.getRefine();
  }-*/;

  /**
   * Returns the whether sorted query results are returned in increasing or decreasing order.
   * 
   * @return
   */
  public final native String getSortorder() /*-{
    return this.getSortorder();
  }-*/;

  /**
   * Returns the 1-based index of the first result to be retrieved.
   * 
   * @return
   */
  public final native double getStartIndex() /*-{
    return this.getStartIndex();
  }-*/;

  /**
   * Returns the maximum updated date.
   * 
   * @return
   */
  public final native DateTime getUpdatedMax() /*-{
    return this.getUpdatedMax();
  }-*/;

  /**
   * Returns the minimum updated date.
   * 
   * @return
   */
  public final native DateTime getUpdatedMin() /*-{
    return this.getUpdatedMin();
  }-*/;

  /**
   * Sets the whether adjusted query results should contain the gm:adjusted_name and gm:adjusted_value tags.
   * 
   * @param adjust
   */
  public final native void setAdjust(Boolean adjust) /*-{
    this.setAdjust(
      adjust
    );
  }-*/;

  /**
   * Sets the whether adjusted query results should contain the gm:adjusted_name and gm:adjusted_value tags.
   * 
   * @param adjust
   */
  public final native void setAdjust(String adjust) /*-{
    this.setAdjust(
      adjust
    );
  }-*/;

  /**
   * Sets the author name or email address.
   * 
   * @param author
   */
  public final native void setAuthor(String author) /*-{
    this.setAuthor(
      author
    );
  }-*/;

  /**
   * Sets the query string that conforms to the Query Language Specification.
   * 
   * @param bq
   */
  public final native void setBq(String bq) /*-{
    this.setBq(
      bq
    );
  }-*/;

  /**
   * Sets the parameter that controls the content returned for each entry in a query request.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the crowding criteria for queries.
   * 
   * @param crowdby
   */
  public final native void setCrowdby(String crowdby) /*-{
    this.setCrowdby(
      crowdby
    );
  }-*/;

  /**
   * Sets the full-text query string.
   * 
   * @param fullTextQuery
   */
  public final native void setFullTextQuery(String fullTextQuery) /*-{
    this.setFullTextQuery(
      fullTextQuery
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults
   */
  public final native void setMaxResults(double maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults
   */
  public final native void setMaxResults(String maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the ranking order for sorted queries.
   * 
   * @param orderby
   */
  public final native void setOrderby(String orderby) /*-{
    this.setOrderby(
      orderby
    );
  }-*/;

  /**
   * Sets the maximum published date.
   * 
   * @param publishedMax
   */
  public final native void setPublishedMax(DateTime publishedMax) /*-{
    this.setPublishedMax(
      publishedMax
    );
  }-*/;

  /**
   * Sets the maximum published date.
   * 
   * @param publishedMax
   */
  public final native void setPublishedMax(String publishedMax) /*-{
    this.setPublishedMax(
      publishedMax
    );
  }-*/;

  /**
   * Sets the minimum published date.
   * 
   * @param publishedMin
   */
  public final native void setPublishedMin(DateTime publishedMin) /*-{
    this.setPublishedMin(
      publishedMin
    );
  }-*/;

  /**
   * Sets the minimum published date.
   * 
   * @param publishedMin
   */
  public final native void setPublishedMin(String publishedMin) /*-{
    this.setPublishedMin(
      publishedMin
    );
  }-*/;

  /**
   * Sets the whether to refine the query results.
   * 
   * @param refine
   */
  public final native void setRefine(Boolean refine) /*-{
    this.setRefine(
      refine
    );
  }-*/;

  /**
   * Sets the whether to refine the query results.
   * 
   * @param refine
   */
  public final native void setRefine(String refine) /*-{
    this.setRefine(
      refine
    );
  }-*/;

  /**
   * Sets the whether sorted query results are returned in increasing or decreasing order.
   * 
   * @param sortorder
   */
  public final native void setSortorder(String sortorder) /*-{
    this.setSortorder(
      sortorder
    );
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * 
   * @param startIndex
   */
  public final native void setStartIndex(double startIndex) /*-{
    this.setStartIndex(
      startIndex
    );
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved.
   * 
   * @param startIndex
   */
  public final native void setStartIndex(String startIndex) /*-{
    this.setStartIndex(
      startIndex
    );
  }-*/;

  /**
   * Sets the maximum updated date.
   * 
   * @param updatedMax
   */
  public final native void setUpdatedMax(DateTime updatedMax) /*-{
    this.setUpdatedMax(
      updatedMax
    );
  }-*/;

  /**
   * Sets the maximum updated date.
   * 
   * @param updatedMax
   */
  public final native void setUpdatedMax(String updatedMax) /*-{
    this.setUpdatedMax(
      updatedMax
    );
  }-*/;

  /**
   * Sets the minimum updated date.
   * 
   * @param updatedMin
   */
  public final native void setUpdatedMin(DateTime updatedMin) /*-{
    this.setUpdatedMin(
      updatedMin
    );
  }-*/;

  /**
   * Sets the minimum updated date.
   * 
   * @param updatedMin
   */
  public final native void setUpdatedMin(String updatedMin) /*-{
    this.setUpdatedMin(
      updatedMin
    );
  }-*/;

}
