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
 * Describes a query for the feed of a calendar's events.
 */
public class CalendarEventQuery extends Query {

  /**
   * Order the returned feed's entries by their <updated> values.
   */
  public static final String ORDERBY_LAST_MODIFIED =
      getConstant("ORDERBY_LAST_MODIFIED");

  /**
   * Order the returned feed's entries by the <gd:when> element's starttime
   * attribute.
   */
  public static final String ORDERBY_START_TIME =
      getConstant("ORDERBY_START_TIME");

  /**
   * Ascending.
   */
  public static final String SORTORDER_ASCENDING =
      getConstant("SORTORDER_ASCENDING");

  /**
   * Descending.
   */
  public static final String SORTORDER_DESCENDING =
      getConstant("SORTORDER_DESCENDING");

  /**
   * Constructs a calendar event query.
   * 
   * @param feedUri URI of feed.
   * @return A CalendarEventQuery object.
   */
  public static native CalendarEventQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.calendar.CalendarEventQuery(feedUri);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.calendar.CalendarEventQuery[name];
  }-*/;

  protected CalendarEventQuery() { }

  /**
   * Returns the author name or email address.
   * 
   * @return Author name or email address.
   */
  public final native String getAuthor() /*-{
    return this.getAuthor();
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
   * Returns the shortcut to request all events that are scheduled for future
   * times which overrides the recurrence-expansion-start,
   * recurrence-expansion-end, start-min, and start-max values.
   * 
   * @return Shortcut to request all events that are scheduled for future times
   * which overrides the recurrence-expansion-start, recurrence-expansion-end,
   * start-min, and start-max values.
   */
  public final native boolean getFutureEvents() /*-{
    return this.getFutureEvents();
  }-*/;

  /**
   * Returns the latest event start time to match (default is 2031-01-01).
   * 
   * @return Latest event start time to match (default is 2031-01-01).
   */
  public final native DateTime getMaximumStartTime() /*-{
    return this.getMaximumStartTime();
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
   * Returns the earliest event start time to match (default is 1970-01-01).
   * 
   * @return Earliest event start time to match (default is 1970-01-01).
   */
  public final native DateTime getMinimumStartTime() /*-{
    return this.getMinimumStartTime();
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
   * Returns the end of time period for which to expand recurring events.
   * 
   * @return End of time period for which to expand recurring events.
   */
  public final native DateTime getRecurrenceExpansionEnd() /*-{
    return this.getRecurrenceExpansionEnd();
  }-*/;

  /**
   * Returns the beginning of time period for which to expand recurring events.
   * 
   * @return Beginning of time period for which to expand recurring events.
   */
  public final native DateTime getRecurrenceExpansionStart() /*-{
    return this.getRecurrenceExpansionStart();
  }-*/;

  /**
   * Returns the whether to include the allowGSync flag in the output.
   * 
   * @return Whether to include the allowGSync flag in the output.
   */
  public final native boolean getShowAllowGSync() /*-{
    return this.getShowAllowGSync();
  }-*/;

  /**
   * Returns the whether to force including new invitation events.
   * 
   * @return Whether to force including new invitation events or null to
   * indicate that the parameter is disabled. 
   */
  public final native boolean getShowHidden() /*-{
    return this.getShowHidden();
  }-*/;

  /**
   * Returns the whether recurring events should be expanded or represented as
   * a single event.
   * 
   * @return Whether recurring events should be expanded or represented as a
   * single event.
   */
  public final native boolean getSingleEvents() /*-{
    return this.getSingleEvents();
  }-*/;

  /**
   * Returns the direction of sorting.
   * 
   * @return Direction of sorting.
   */
  public final native String getSortOrder() /*-{
    return this.getSortOrder();
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
   * Sets the full-text query string.
   * 
   * @param fullTextQuery Full-text query string.
   */
  public final native void setFullTextQuery(String fullTextQuery) /*-{
    this.setFullTextQuery(fullTextQuery);
  }-*/;

  /**
   * Sets the shortcut to request all events that are scheduled for future
   * times which overrides the recurrence-expansion-start,
   * recurrence-expansion-end, start-min, and start-max values.
   * The default value is false.
   * 
   * @param futureEvents Shortcut to request all events that are scheduled for
   * future times which overrides the recurrence-expansion-start,
   * recurrence-expansion-end, start-min, and start-max values.
   */
  public final native void setFutureEvents(boolean futureEvents) /*-{
    this.setFutureEvents(futureEvents);
  }-*/;

  /**
   * Sets the latest event start time to match (default is 2031-01-01).
   * 
   * @param maximumStartTime Latest event start time to match
   * (default is 2031-01-01).
   */
  public final native void setMaximumStartTime(DateTime maximumStartTime) /*-{
    this.setMaximumStartTime(maximumStartTime);
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
   * Sets the earliest event start time to match (default is 1970-01-01).
   * 
   * @param minimumStartTime Earliest event start time to match
   * (default is 1970-01-01).
   */
  public final native void setMinimumStartTime(DateTime minimumStartTime) /*-{
    this.setMinimumStartTime(minimumStartTime);
  }-*/;

  /**
   * Sets the order of entries in a feed. The default value is 'lastmodified'.
   * 
   * @param orderBy Order of entries in a feed.
   */
  public final native void setOrderBy(String orderBy) /*-{
    this.setOrderBy(orderBy);
  }-*/;

  /**
   * Sets the end of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionEnd End of time period for which to expand
   * recurring events.
   */
  public final native void setRecurrenceExpansionEnd(
      DateTime recurrenceExpansionEnd) /*-{
    this.setRecurrenceExpansionEnd(recurrenceExpansionEnd);
  }-*/;

  /**
   * Sets the beginning of time period for which to expand recurring events.
   * 
   * @param recurrenceExpansionStart Beginning of time period for which to
   * expand recurring events.
   */
  public final native void setRecurrenceExpansionStart(
      DateTime recurrenceExpansionStart) /*-{
    this.setRecurrenceExpansionStart(recurrenceExpansionStart);
  }-*/;

  /**
   * Sets the whether to include the allowGSync flag in the output.
   * The default value is false.
   * 
   * @param showAllowGSync Whether to include the allowGSync flag in the
   * output.
   */
  public final native void setShowAllowGSync(boolean showAllowGSync) /*-{
    this.setShowAllowGSync(showAllowGSync);
  }-*/;

  /**
   * Sets the whether to force including new invitation events.
   * The default value is false.
   * 
   * @param showHidden Whether to force including new invitation events. 
   */
  public final native void setShowHidden(boolean showHidden) /*-{
    this.setShowHidden(showHidden);
  }-*/;
  
  /**
   * Sets the whether recurring events should be expanded or represented as a
   * single event. The default value is false.
   * 
   * @param singleEvents Whether recurring events should be expanded or
   * represented as a single event.
   */
  public final native void setSingleEvents(boolean singleEvents) /*-{
    this.setSingleEvents(singleEvents);
  }-*/;

  /**
   * Sets the direction of sorting.
   * 
   * @param sortOrder Direction of sorting.
   */
  public final native void setSortOrder(String sortOrder) /*-{
    this.setSortOrder(sortOrder);
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