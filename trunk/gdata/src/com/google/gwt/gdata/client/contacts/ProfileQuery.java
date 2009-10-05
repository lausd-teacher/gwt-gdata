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

import com.google.gwt.gdata.client.Query;

/**
 * Describes a query for the feed of profiles.
 */
public class ProfileQuery extends Query {

  /**
   * Constructs a profile query.
   * 
   * @param feedUri URI of feed.
   * @return A ProfileQuery object.
   */
  public static native ProfileQuery newInstance(String feedUri) /*-{
    return new $wnd.google.gdata.contacts.ProfileQuery(
      feedUri
    );
  }-*/;

  protected ProfileQuery() { }

  /**
   * Returns the domain to query.
   * 
   * @return Domain to query or null to indicate that the parameter is disabled.
   */
  public final native String getDomainName() /*-{
    return this.getDomainName();
  }-*/;

  /**
   * Returns the maximum number of results to be retrieved.
   * 
   * @return Maximum number of results to be retrieved or null to indicate that the parameter is disabled.
   */
  public final native double getMaxResults() /*-{
    return this.getMaxResults();
  }-*/;

  /**
   * Returns the opaque key of the first element to retrieve.
   * 
   * @return Opaque key of the first element to retrieve or null to indicate that the parameter is disabled.
   */
  public final native String getStartKey() /*-{
    return this.getStartKey();
  }-*/;

  /**
   * Returns the user name to query.
   * 
   * @return User name to query or null to indicate that the parameter is disabled.
   */
  public final native String getUserName() /*-{
    return this.getUserName();
  }-*/;

  /**
   * Sets the domain to query.
   * 
   * @param domainName Domain to query or null to disable this parameter.
   */
  public final native void setDomainName(String domainName) /*-{
    this.setDomainName(
      domainName
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults Maximum number of results to be retrieved or an equivalent string value or null to disable this parameter.
   */
  public final native void setMaxResults(double maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the maximum number of results to be retrieved.
   * 
   * @param maxResults Maximum number of results to be retrieved or an equivalent string value or null to disable this parameter.
   */
  public final native void setMaxResults(String maxResults) /*-{
    this.setMaxResults(
      maxResults
    );
  }-*/;

  /**
   * Sets the opaque key of the first element to retrieve.
   * 
   * @param startKey Opaque key of the first element to retrieve or null to disable this parameter.
   */
  public final native void setStartKey(String startKey) /*-{
    this.setStartKey(
      startKey
    );
  }-*/;

  /**
   * Sets the user name to query.
   * 
   * @param userName User name to query or null to disable this parameter.
   */
  public final native void setUserName(String userName) /*-{
    this.setUserName(
      userName
    );
  }-*/;

}