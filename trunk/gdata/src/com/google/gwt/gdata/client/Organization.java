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
 * Comment unavailable.
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
   */
  public static native Organization newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Organization(
      params
    );
  }-*/;

  /**
   * Constructs an organization using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Organization newInstance() /*-{
    return new $wnd.google.gdata.Organization();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Organization[name];
  }-*/;

  protected Organization() { }

  /**
   * Returns the label.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the name of organization.
   * 
   * @return
   */
  public final native OrgName getOrgName() /*-{
    return this.getOrgName();
  }-*/;

  /**
   * Returns the position in organization.
   * 
   * @return
   */
  public final native OrgTitle getOrgTitle() /*-{
    return this.getOrgTitle();
  }-*/;

  /**
   * Returns whether this is the primary organization.
   * 
   * @return
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the organization type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the label.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the label.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the name of organization.
   * 
   * @param orgName
   */
  public final native void setOrgName(OrgName orgName) /*-{
    this.setOrgName(
      orgName
    );
  }-*/;

  /**
   * Sets the name of organization.
   * 
   * @param orgName
   */
  public final native void setOrgName() /*-{
    this.setOrgName();
  }-*/;

  /**
   * Sets the position in organization.
   * 
   * @param orgTitle
   */
  public final native void setOrgTitle(OrgTitle orgTitle) /*-{
    this.setOrgTitle(
      orgTitle
    );
  }-*/;

  /**
   * Sets the position in organization.
   * 
   * @param orgTitle
   */
  public final native void setOrgTitle() /*-{
    this.setOrgTitle();
  }-*/;

  /**
   * Sets whether this is the primary organization.
   * 
   * @param primary
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(
      primary
    );
  }-*/;

  /**
   * Sets whether this is the primary organization.
   * 
   * @param primary
   */
  public final native void setPrimary() /*-{
    this.setPrimary();
  }-*/;

  /**
   * Sets the organization type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the organization type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

}
