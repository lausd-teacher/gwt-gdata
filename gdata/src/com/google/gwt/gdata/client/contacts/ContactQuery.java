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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.DateTime;
import com.google.gwt.gdata.client.Query;

/**
 * Comment unavailable.
 */
public class ContactQuery extends Query {

  /**
   * Order the returned feeds entries by their <app:edited> values.
   */
  public static final String ORDERBY_EDITED = getConstant("ORDERBY_EDITED");

  /**
   * Order the returned feeds entries by their <updated> values.
   */
  public static final String ORDERBY_LAST_MODIFIED = getConstant("ORDERBY_LAST_MODIFIED");

  /**
   * None.
   */
  public static final String ORDERBY_NONE = getConstant("ORDERBY_NONE");

  /**
   * Ascending.
   */
  public static final String SORTORDER_ASCENDING = getConstant("SORTORDER_ASCENDING");

  /**
   * Descending.
   */
  public static final String SORTORDER_DESCENDING = getConstant("SORTORDER_DESCENDING");

  /**
   * None.
   */
  public static final String SORTORDER_NONE = getConstant("SORTORDER_NONE");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.contacts.ContactQuery;
  }-*/;

  /**
   * Constructor.
   */
  public static native ContactQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.contacts.ContactQuery(
      feedUri
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.contacts.ContactQuery[name];
  }-*/;

  protected ContactQuery() { }

  /**
   * Returns the group id.
   * 
   * @return
   */
  public final native String getGroup() /*-{
    return this.getGroup();
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
   * Returns the order of entries in a feed.
   * 
   * @return
   */
  public final native String getOrderBy() /*-{
    return this.getOrderBy();
  }-*/;

  /**
   * Returns the should tombstones be returned.
   * 
   * @return
   */
  public final native Boolean getShowDeleted() /*-{
    return this.getShowDeleted();
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
   * Sets the group id.
   * 
   * @param group
   */
  public final native void setGroup(String group) /*-{
    this.setGroup(
      group
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
   * Sets the should tombstones be returned.
   * 
   * @param showDeleted
   */
  public final native void setShowDeleted(Boolean showDeleted) /*-{
    this.setShowDeleted(
      showDeleted
    );
  }-*/;

  /**
   * Sets the should tombstones be returned.
   * 
   * @param showDeleted
   */
  public final native void setShowDeleted(String showDeleted) /*-{
    this.setShowDeleted(
      showDeleted
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
