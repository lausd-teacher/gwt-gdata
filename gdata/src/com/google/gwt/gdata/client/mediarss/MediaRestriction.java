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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class MediaRestriction extends JavaScriptObject {

  /**
   * Allow only the given restriction.
   */
  public static final String RELATIONSHIP_ALLOW = getConstant("RELATIONSHIP_ALLOW");

  /**
   * Deny the given restriction.
   */
  public static final String RELATIONSHIP_DENY = getConstant("RELATIONSHIP_DENY");

  /**
   * Restriction is a country identifier.
   */
  public static final String TYPE_COUNTRY = getConstant("TYPE_COUNTRY");

  /**
   * Restriction is a URI.
   */
  public static final String TYPE_URI = getConstant("TYPE_URI");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.mediarss.MediaRestriction;
  }-*/;

  /**
   * Constructs a media restriction using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaRestriction newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaRestriction(
      params
    );
  }-*/;

  /**
   * Constructs a media restriction using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaRestriction newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaRestriction();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaRestriction[name];
  }-*/;

  protected MediaRestriction() { }

  /**
   * Returns the distributor URIs or country codes.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the type of relationship, either allow or deny.
   * 
   * @return
   */
  public final native String getRelationship() /*-{
    return this.getRelationship();
  }-*/;

  /**
   * Returns the type of restriction, either country or uri.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the distributor URIs or country codes.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the distributor URIs or country codes.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the type of relationship, either allow or deny.
   * 
   * @param relationship
   */
  public final native void setRelationship(String relationship) /*-{
    this.setRelationship(
      relationship
    );
  }-*/;

  /**
   * Sets the type of relationship, either allow or deny.
   * 
   * @param relationship
   */
  public final native void setRelationship() /*-{
    this.setRelationship();
  }-*/;

  /**
   * Sets the type of restriction, either country or uri.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the type of restriction, either country or uri.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
