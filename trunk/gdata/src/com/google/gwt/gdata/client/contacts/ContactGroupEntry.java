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
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.ExtendedProperty;

/**
 * Comment unavailable.
 */
public class ContactGroupEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.contacts.ContactGroupEntry;
  }-*/;

  /**
   * Constructs a contact group entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactGroupEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactGroupEntry(
      params
    );
  }-*/;

  /**
   * Constructs a contact group entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ContactGroupEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactGroupEntry();
  }-*/;

  protected ContactGroupEntry() { }

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty
   */
  public final native void addExtendedProperty(JavaScriptObject extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty
   */
  public final native void addExtendedProperty(ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Returns the marker for deleted entries.
   * 
   * @return
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return
   */
  public final native ExtendedProperty[] getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the system group.
   * 
   * @return
   */
  public final native SystemGroup getSystemGroup() /*-{
    return this.getSystemGroup();
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted(JavaScriptObject deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties(JavaScriptObject[] extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties
   */
  public final native void setExtendedProperties(ExtendedProperty[] extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the system group.
   * 
   * @param systemGroup
   */
  public final native void setSystemGroup(JavaScriptObject systemGroup) /*-{
    this.setSystemGroup(
      systemGroup
    );
  }-*/;

  /**
   * Sets the system group.
   * 
   * @param systemGroup
   */
  public final native void setSystemGroup() /*-{
    this.setSystemGroup();
  }-*/;

  /**
   * Sets the system group.
   * 
   * @param systemGroup
   */
  public final native void setSystemGroup(SystemGroup systemGroup) /*-{
    this.setSystemGroup(
      systemGroup
    );
  }-*/;

}
