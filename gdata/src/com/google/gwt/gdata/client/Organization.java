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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes an organization (like Company).
 */
public class Organization extends JavaScriptObject {

  /**
   * Other organization.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Work organization.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs an organization using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: label, orgName, orgTitle, primary, and rel.
   */
  public static native Organization newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Organization(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Organization[name];
  }-*/;

  protected Organization() { }

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label or undefined for none.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the name of organization. This element is optional.
   * 
   * @return Name of organization or undefined for none.
   */
  public final native OrgName getOrgName() /*-{
    return this.getOrgName();
  }-*/;

  /**
   * Returns the position in organization. This element is optional.
   * 
   * @return Position in organization or undefined for none.
   */
  public final native OrgTitle getOrgTitle() /*-{
    return this.getOrgTitle();
  }-*/;

  /**
   * Returns whether this is the primary organization. This attribute is optional.
   * 
   * @return Whether this is the primary organization or undefined for none.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the organization type. This attribute is optional.
   * 
   * @return Organization type or undefined for none.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label Label or undefined for none.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the name of organization. This element is optional.
   */
  public final native void setOrgName() /*-{
    this.setOrgName();
  }-*/;

  /**
   * Sets the name of organization. This element is optional.
   * 
   * @param orgName Name of organization, or object to use as a parameter to the google.gdata.OrgName constructor, or undefined for none.
   */
  public final native void setOrgName(OrgName orgName) /*-{
    this.setOrgName(
      orgName
    );
  }-*/;

  /**
   * Sets the position in organization. This element is optional.
   */
  public final native void setOrgTitle() /*-{
    this.setOrgTitle();
  }-*/;

  /**
   * Sets the position in organization. This element is optional.
   * 
   * @param orgTitle Position in organization, or object to use as a parameter to the google.gdata.OrgTitle constructor, or undefined for none.
   */
  public final native void setOrgTitle(OrgTitle orgTitle) /*-{
    this.setOrgTitle(
      orgTitle
    );
  }-*/;

  /**
   * Sets whether this is the primary organization. This attribute is optional.
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets whether this is the primary organization. This attribute is optional.
   * 
   * @param primary Whether this is the primary organization or undefined for none.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets the organization type. This attribute is optional.
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the organization type. This attribute is optional.
   * 
   * @param rel Organization type or undefined for none.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

}
