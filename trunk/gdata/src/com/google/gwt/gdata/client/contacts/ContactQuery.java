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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Describes a query.
 */
public class ContactQuery extends Query {

  /**
   * Order the returned feed's entries by their <app:edited> values.
   */
  public static final String ORDERBY_EDITED = getConstant("ORDERBY_EDITED");

  /**
   * Order the returned feed's entries by their <updated> values.
   */
  public static final String ORDERBY_LAST_MODIFIED =
      getConstant("ORDERBY_LAST_MODIFIED");

  /**
   * None.
   */
  public static final String ORDERBY_NONE = getConstant("ORDERBY_NONE");

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
   * None.
   */
  public static final String SORTORDER_NONE = getConstant("SORTORDER_NONE");

  /**
   * Constructs a Contact query.
   * 
   * @param feedUri URI of feed.
   * @return A ContactQuery object.
   */
  public static native ContactQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.contacts.ContactQuery(feedUri);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.ContactQuery[name];
  }-*/;

  protected ContactQuery() { }

  /**
   * Returns the group id. Results are limited to contacts belonging to this
   * group.
   * 
   * @return Group id.
   */
  public final native String getGroup() /*-{
    return this.getGroup();
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
   * Returns the order of entries in a feed.
   * 
   * @return Order of entries in a feed.
   */
  public final native String getOrderBy() /*-{
    return this.getOrderBy();
  }-*/;

  /**
   * Returns the should tombstones be returned.
   * 
   * @return Should tombstones be returned.
   */
  public final native boolean getShowDeleted() /*-{
    return this.getShowDeleted();
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
   * @return Maximum updated dat.
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
   * Sets the group id. Results are limited to contacts belonging to this
   * group.
   * 
   * @param group Group id.
   */
  public final native void setGroup(String group) /*-{
    this.setGroup(group);
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
   * Sets the order of entries in a feed. The default value is 'none'.
   * 
   * @param orderBy Order of entries in a feed.
   */
  public final native void setOrderBy(String orderBy) /*-{
    this.setOrderBy(orderBy);
  }-*/;

  /**
   * Sets the should tombstones be returned. The default value is false.
   * 
   * @param showDeleted Should tombstones be returned.
   */
  public final native void setShowDeleted(boolean showDeleted) /*-{
    this.setShowDeleted(showDeleted);
  }-*/;

  /**
   * Sets the direction of sorting. The default value is 'none'.
   * 
   * @param sortOrder Direction of sorting.
   */
  public final native void setSortOrder(String sortOrder) /*-{
    this.setSortOrder(sortOrder);
  }-*/;

  /**
   * Sets the 1-based index of the first result to be retrieved. The default
   * value is 1.
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