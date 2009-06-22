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
   * Constructs a media restriction using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: content, relationship, and type.
   */
  public static native MediaRestriction newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaRestriction(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.mediarss.MediaRestriction[name];
  }-*/;

  protected MediaRestriction() { }

  /**
   * Returns the distributor URIs or country codes. This attribute is optional.
   * 
   * @return Distributor URIs or country codes or undefined for none.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the type of relationship, either 'allow' or 'deny'. This attribute is required.
   * 
   * @return Type of relationship, either 'allow' or 'deny' or undefined for none.
   */
  public final native String getRelationship() /*-{
    return this.getRelationship();
  }-*/;

  /**
   * Returns the type of restriction, either 'country' or 'uri'. This attribute is optional.
   * 
   * @return Type of restriction, either 'country' or 'uri' or undefined for none.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the distributor URIs or country codes. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the distributor URIs or country codes. This attribute is optional.
   * 
   * @param content Distributor URIs or country codes or undefined for none.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the type of relationship, either 'allow' or 'deny'. This attribute is required.
   */
  public final native void setRelationship() /*-{
    this.setRelationship();
  }-*/;

  /**
   * Sets the type of relationship, either 'allow' or 'deny'. This attribute is required.
   * 
   * @param relationship Type of relationship, either 'allow' or 'deny' or undefined for none.
   */
  public final native void setRelationship(String relationship) /*-{
    this.setRelationship(
      relationship
    );
  }-*/;

  /**
   * Sets the type of restriction, either 'country' or 'uri'. This attribute is optional.
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

  /**
   * Sets the type of restriction, either 'country' or 'uri'. This attribute is optional.
   * 
   * @param type Type of restriction, either 'country' or 'uri' or undefined for none.
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

}
