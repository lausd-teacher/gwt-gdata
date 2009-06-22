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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.ExtendedProperty;

/**
 * Describes a contact group entry.
 */
public class ContactGroupEntry extends com.google.gwt.gdata.client.Entry<ContactGroupEntry> {

  /**
   * Constructs a contact group entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: categories, content, deleted, edited, extendedProperties, id, links, systemGroup, title, and updated.
   */
  public static native ContactGroupEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.contacts.ContactGroupEntry(
      params
    );
  }-*/;

  protected ContactGroupEntry() { }

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty Extended property to add, or object to use as a parameter to the google.gdata.ExtendedProperty constructor.
   */
  public final native void addExtendedProperty(ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(
      extendedProperty
    );
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries or undefined for none.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return Extended properties.
   */
  public final native JsArray<ExtendedProperty> getExtendedProperties() /*-{
    return this.getExtendedProperties();
  }-*/;

  /**
   * Returns the system group. This element is optional.
   * 
   * @return System group or undefined for none.
   */
  public final native SystemGroup getSystemGroup() /*-{
    return this.getSystemGroup();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries, or object to use as a parameter to the google.gdata.Deleted constructor, or undefined for none.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(
      deleted
    );
  }-*/;

  /**
   * Sets the extended properties.
   */
  public final native void setExtendedProperties() /*-{
    this.setExtendedProperties();
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties Extended properties, where each extended property is added using the addExtendedProperty() function, or undefined to clear the extended properties.
   */
  public final native void setExtendedProperties(JsArray<ExtendedProperty> extendedProperties) /*-{
    this.setExtendedProperties(
      extendedProperties
    );
  }-*/;

  /**
   * Sets the system group. This element is optional.
   */
  public final native void setSystemGroup() /*-{
    this.setSystemGroup();
  }-*/;

  /**
   * Sets the system group. This element is optional.
   * 
   * @param systemGroup System group, or object to use as a parameter to the google.gdata.contacts.SystemGroup constructor, or undefined for none.
   */
  public final native void setSystemGroup(SystemGroup systemGroup) /*-{
    this.setSystemGroup(
      systemGroup
    );
  }-*/;

}
