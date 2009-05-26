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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Comment unavailable.
 */
public class CalendarEventQuery extends Query {

  /**
   * Order the returned feeds entries by their <updated> values.
   */
  public static final String ORDERBY_LAST_MODIFIED = getConstant("ORDERBY_LAST_MODIFIED");

  /**
   * Order the returned feeds entries by the <gd:when> elements starttime attribute.
   */
  public static final String ORDERBY_START_TIME = getConstant("ORDERBY_START_TIME");

  /**
   * Ascending.
   */
  public static final String SORTORDER_ASCENDING = getConstant("SORTORDER_ASCENDING");

  /**
   * Descending.
   */
  public static final String SORTORDER_DESCENDING = getConstant("SORTORDER_DESCENDING");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarEventQuery;
  }-*/;

  /**
   * Constructor.
   */
  public static native CalendarEventQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.calendar.CalendarEventQuery(
      feedUri
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarEventQuery[name];
  }-*/;

  protected CalendarEventQuery() { }

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
   * Returns the shortcut to request all events that are scheduled for future times which overrides the recurrence-expansion-start, recurrence-expansion-end, start-min, and start-max values.
   * 
   * @return
   */
  public final native Boolean getFutureEvents() /*-{
    return this.getFutureEvents();
  }-*/;

  /**
   * Returns the latest event start time to match (default is 2031-01-01).
   * 
   * @return
   */
  public final native DateTime getMaximumStartTime() /*-{
    return this.getMaximumStartTime();
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
   * Returns the earliest event start time to match (default is 1970-01-01).
   * 
   * @return
   */
  public final native DateTime getMinimumStartTime() /*-{
    return this.getMinimumStartTime();
  }-*/;

  /**
   * Returns the order of entries in a feed.
   * 
   * @return
   */
  public final native String getOrderBy() /*-{
    return this.getOrderBy();
  }-*/;

  /**
   * Returns the end of time period for which to expand recurring events.
   * 
   * @return
   */
  public final native DateTime getRecurrenceExpansionEnd() /*-{
    return this.getRecurrenceExpansionEnd();
  }-*/;

  /**
   * Returns the beginning of time period for which to expand recurring events.
   * 
   * @return
   */
  public final native DateTime getRecurrenceExpansionStart() /*-{
    return this.getRecurrenceExpansionStart();
  }-*/;

  /**
   * Returns the whether recurring events should be expanded or represented as a single event.
   * 
   * @return
   */
  public final native Boolean getSingleEvents() /*-{
    return this.getSingleEvents();
  }-*/;

  /**
   * Returns the direction of sorting.
   * 
   * @return
   */
  public final native String getSortOrder() /*-{
    return this.getSortOrder();
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
   * Sets the shortcut to request all events that are scheduled for future times which overrides the recurrence-expansion-start, recurrence-expansion-end, start-min, and start-max values.
   * 
   * @param futureEvents
   */
  public final native void setFutureEvents(Boolean futureEvents) /*-{
    this.setFutureEvents(
      futureEvents
    );
  }-*/;

  /**
   * Sets the shortcut to request all events that are scheduled for future times which overrides the recurrence-expansion-start, recurrence-expansion-end, start-min, and start-max values.
   * 
   * @param futureEvents
   */
  public final native void setFutureEvents(String futureEvents) /*-{
    this.setFutureEvents(
      futureEvents
    );
  }-*/;

  /**
   * Sets the latest event start time to match (default is 2031-01-01).
   * 
   * @param maximumStartTime
   */
  public final native void setMaximumStartTime(DateTime maximumStartTime) /*-{
    this.setMaximumStartTime(
      maximumStartTime
    );
  }-*/;

  /**
   * Sets the latest event start time to match (default is 2031-01-01).
   * 
   * @param maximumStartTime
   */
  public final native void setMaximumStartTime(String maximumStartTime) /*-{
    this.setMaximumStartTime(
      maximumStartTime
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
   * Sets the earliest event start time to match (default is 1970-01-01).
   * 
   * @param minimumStartTime
   */
  public final native void setMinimumStartTime(DateTime minimumStartTime) /*-{
    this.setMinimumStartTime(
      minimumStartTime
    );
  }-*/;

  /**
   * Sets the earliest event start time to match (default is 1970-01-01).
   * 
   * @param minimumStartTime
   */
  public final native void setMinimumStartTime(String minimumStartTime) /*-{
    this.setMinimumStartTime(
      minimumStartTime
    );
  }-*/;

  /**
   * Sets the order of entries in a feed.
   * 
   * @param orderBy
   */
  public final native void setOrderBy(String orderBy) /*-{
    this.setOrderBy(
      orderBy
    );
  }-*/;

  /**
   * Sets the end of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionEnd
   */
  public final native void setRecurrenceExpansionEnd(DateTime recurrenceExpansionEnd) /*-{
    this.setRecurrenceExpansionEnd(
      recurrenceExpansionEnd
    );
  }-*/;

  /**
   * Sets the end of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionEnd
   */
  public final native void setRecurrenceExpansionEnd(String recurrenceExpansionEnd) /*-{
    this.setRecurrenceExpansionEnd(
      recurrenceExpansionEnd
    );
  }-*/;

  /**
   * Sets the beginning of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionStart
   */
  public final native void setRecurrenceExpansionStart(DateTime recurrenceExpansionStart) /*-{
    this.setRecurrenceExpansionStart(
      recurrenceExpansionStart
    );
  }-*/;

  /**
   * Sets the beginning of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionStart
   */
  public final native void setRecurrenceExpansionStart(String recurrenceExpansionStart) /*-{
    this.setRecurrenceExpansionStart(
      recurrenceExpansionStart
    );
  }-*/;

  /**
   * Sets the whether recurring events should be expanded or represented as a single event.
   * 
   * @param singleEvents
   */
  public final native void setSingleEvents(Boolean singleEvents) /*-{
    this.setSingleEvents(
      singleEvents
    );
  }-*/;

  /**
   * Sets the whether recurring events should be expanded or represented as a single event.
   * 
   * @param singleEvents
   */
  public final native void setSingleEvents(String singleEvents) /*-{
    this.setSingleEvents(
      singleEvents
    );
  }-*/;

  /**
   * Sets the direction of sorting.
   * 
   * @param sortOrder
   */
  public final native void setSortOrder(String sortOrder) /*-{
    this.setSortOrder(
      sortOrder
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
