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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.CustomProperty;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.PostalAddress;
import com.google.gwt.gdata.client.ResourceId;
import com.google.gwt.gdata.client.StructuredPostalAddress;

/**
 * Comment unavailable.
 */
public class FeatureEntry extends com.google.gwt.gdata.client.Entry<FeatureEntry> {

  /**
   * Constructs a feature entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeatureEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.FeatureEntry(
      params
    );
  }-*/;

  /**
   * Constructs a feature entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native FeatureEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.FeatureEntry();
  }-*/;

  protected FeatureEntry() { }

  /**
   * Adds a new custom property.
   * 
   * @param customProperty
   */
  public final native void addCustomProperty(CustomProperty customProperty) /*-{
    this.addCustomProperty(
      customProperty
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the custom properties.
   * 
   * @return
   */
  public final native JsArray<CustomProperty> getCustomProperties() /*-{
    return this.getCustomProperties();
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
   * Returns the postal address.
   * 
   * @return
   */
  public final native PostalAddress getPostalAddress() /*-{
    return this.getPostalAddress();
  }-*/;

  /**
   * Returns the resource id.
   * 
   * @return
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Returns the structured postal address.
   * 
   * @return
   */
  public final native StructuredPostalAddress getStructuredPostalAddress() /*-{
    return this.getStructuredPostalAddress();
  }-*/;

  /**
   * Sets the custom properties.
   * 
   * @param customProperties
   */
  public final native void setCustomProperties(JsArray<CustomProperty> customProperties) /*-{
    this.setCustomProperties(
      customProperties
    );
  }-*/;

  /**
   * Sets the custom properties.
   * 
   * @param customProperties
   */
  public final native void setCustomProperties() /*-{
    this.setCustomProperties();
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
   * Sets the marker for deleted entries.
   * 
   * @param deleted
   */
  public final native void setDeleted() /*-{
    this.setDeleted();
  }-*/;

  /**
   * Sets the postal address.
   * 
   * @param postalAddress
   */
  public final native void setPostalAddress(PostalAddress postalAddress) /*-{
    this.setPostalAddress(
      postalAddress
    );
  }-*/;

  /**
   * Sets the postal address.
   * 
   * @param postalAddress
   */
  public final native void setPostalAddress() /*-{
    this.setPostalAddress();
  }-*/;

  /**
   * Sets the resource id.
   * 
   * @param resourceId
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(
      resourceId
    );
  }-*/;

  /**
   * Sets the resource id.
   * 
   * @param resourceId
   */
  public final native void setResourceId() /*-{
    this.setResourceId();
  }-*/;

  /**
   * Sets the structured postal address.
   * 
   * @param structuredPostalAddress
   */
  public final native void setStructuredPostalAddress(StructuredPostalAddress structuredPostalAddress) /*-{
    this.setStructuredPostalAddress(
      structuredPostalAddress
    );
  }-*/;

  /**
   * Sets the structured postal address.
   * 
   * @param structuredPostalAddress
   */
  public final native void setStructuredPostalAddress() /*-{
    this.setStructuredPostalAddress();
  }-*/;

}
