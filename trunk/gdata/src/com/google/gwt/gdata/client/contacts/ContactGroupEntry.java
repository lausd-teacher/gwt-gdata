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

import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.ExtendedProperty;

/**
 * Describes a contact group entry.
 */
public class ContactGroupEntry extends com.google.gwt.gdata.client.Entry<ContactGroupEntry> {

  /**
   * Constructs a contact group entry.
   * @return A ContactGroupEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native ContactGroupEntry newInstance() /*-{
    return new $wnd.google.gdata.contacts.ContactGroupEntry();
  }-*/;

  protected ContactGroupEntry() { }

  /**
   * Adds a new extended property.
   * 
   * @param extendedProperty Extended property to add.
   */
  public final native void addExtendedProperty(ExtendedProperty extendedProperty) /*-{
    this.addExtendedProperty(extendedProperty);
  }-*/;

  /**
   * Returns the marker for deleted entries. This element is optional.
   * 
   * @return Marker for deleted entries.
   */
  public final native Deleted getDeleted() /*-{
    return this.getDeleted();
  }-*/;

  /**
   * Returns the extended properties.
   * 
   * @return Extended properties.
   */
  public final native ExtendedProperty[] getExtendedProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getExtendedProperties());
  }-*/;

  /**
   * Returns the system group. This element is optional.
   * 
   * @return System group.
   */
  public final native SystemGroup getSystemGroup() /*-{
    return this.getSystemGroup();
  }-*/;

  /**
   * Sets the marker for deleted entries. This element is optional.
   * 
   * @param deleted Marker for deleted entries.
   */
  public final native void setDeleted(Deleted deleted) /*-{
    this.setDeleted(deleted);
  }-*/;

  /**
   * Sets the extended properties.
   * 
   * @param extendedProperties Extended properties, where each extended property is added using addExtendedProperty().
   */
  public final native void setExtendedProperties(ExtendedProperty[] extendedProperties) /*-{
    this.setExtendedProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(extendedProperties)
    );
  }-*/;

  /**
   * Sets the system group. This element is optional.
   * 
   * @param systemGroup System group.
   */
  public final native void setSystemGroup(SystemGroup systemGroup) /*-{
    this.setSystemGroup(systemGroup);
  }-*/;

}