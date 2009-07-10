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
 * Describes a query for the feed of public attributes.
 */
public class AttributesQuery extends Query {

  /**
   * Constructs an Attributes query.
   * 
   * @param feedUri URI of feed.
   * @return An AttributesQuery object.
   */
  public static native AttributesQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.gbase.AttributesQuery(feedUri);
  }-*/;

  protected AttributesQuery() { }

  /**
   * Returns the author name or email address.
   * 
   * @return Author name or email address.
   */
  public final native String getAuthor() /*-{
    return this.getAuthor();
  }-*/;

  /**
   * Returns the query string that conforms to the Query Language Specification.
   * 
   * @return Query string that conforms to the Query Language Specification.
   */
  public final native String getBq() /*-{
    return this.getBq();
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
   * Returns the number of distinct values returned in each entry. Most frequent N values along with their counts are returned.
   * 
   * @return Number of distinct values returned in each entry.
   */
  public final native double getMaxValues() /*-{
    return this.getMaxValues();
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
   * Sets the number of distinct values returned in each entry. Most frequent N values along with their counts are returned.. The default value is 0.
   * 
   * @param maxValues Number of distinct values returned in each entry.
   */
  public final native void setMaxValues(double maxValues) /*-{
    this.setMaxValues(maxValues);
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