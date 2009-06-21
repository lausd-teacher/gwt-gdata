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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Comment unavailable.
 */
public class CalendarCommentQuery extends Query {

  /**
   * Constructor.
   */
  public static native CalendarCommentQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.calendar.CalendarCommentQuery(
      feedUri
    );
  }-*/;

  protected CalendarCommentQuery() { }

  /**
   * Returns the author name or email address.
   * 
   * @return
   */
  public final native String getAuthor() /*-{
    return this.getAuthor();
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
