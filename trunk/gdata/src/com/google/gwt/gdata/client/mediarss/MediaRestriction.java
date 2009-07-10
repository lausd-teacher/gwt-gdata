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
 * Describes a media restriction.
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
   * Constructs a media restriction.
   * @return A MediaRestriction object.
   */
  public static native MediaRestriction newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaRestriction();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaRestriction[name];
  }-*/;

  protected MediaRestriction() { }

  /**
   * Returns the distributor URIs or country codes. This attribute is optional.
   * 
   * @return Distributor URIs or country codes.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the type of relationship, either 'allow' or 'deny'. This attribute is required.
   * 
   * @return Type of relationship, either 'allow' or 'deny'.
   */
  public final native String getRelationship() /*-{
    return this.getRelationship();
  }-*/;

  /**
   * Returns the type of restriction, either 'country' or 'uri'. This attribute is optional.
   * 
   * @return Type of restriction, either 'country' or 'uri'.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the distributor URIs or country codes. This attribute is optional.
   * 
   * @param content Distributor URIs or country codes.
   */
  public final native void setContent(String content) /*-{
    this.setContent(content);
  }-*/;

  /**
   * Sets the type of relationship, either 'allow' or 'deny'. This attribute is required.
   * 
   * @param relationship Type of relationship, either 'allow' or 'deny'.
   */
  public final native void setRelationship(String relationship) /*-{
    this.setRelationship(relationship);
  }-*/;

  /**
   * Sets the type of restriction, either 'country' or 'uri'. This attribute is optional.
   * 
   * @param type Type of restriction, either 'country' or 'uri'.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

}