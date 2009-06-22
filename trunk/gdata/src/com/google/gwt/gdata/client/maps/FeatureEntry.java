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
 * Describes a feature entry.
 */
public class FeatureEntry extends com.google.gwt.gdata.client.Entry<FeatureEntry> {

  /**
   * Constructs a feature entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: authors, categories, content, contributors, customProperties, deleted, edited, id, links, postalAddress, published, resourceId, structuredPostalAddress, title, and updated.
   */
  public static native FeatureEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.maps.FeatureEntry(
      params
    );
  }-*/;

  protected FeatureEntry() { }

  /**
   * Adds a new custom property.
   * 
   * @param customProperty Custom property to add, or object to use as a parameter to the google.gdata.CustomProperty constructor.
   */
  public final native void addCustomProperty(CustomProperty customProperty) /*-{
    this.addCustomProperty(
      customProperty
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the full feed (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed (without any query parameters) or undefined for none.
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the custom properties.
   * 
   * @return Custom properties.
   */
  public final native JsArray<CustomProperty> getCustomProperties() /*-{
    return this.getCustomProperties();
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
   * Returns the postal address. This element is optional.
   * 
   * @return Postal address or undefined for none.
   */
  public final native PostalAddress getPostalAddress() /*-{
    return this.getPostalAddress();
  }-*/;

  /**
   * Returns the resource id. This element is optional.
   * 
   * @return Resource id or undefined for none.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Returns the structured postal address. This element is optional.
   * 
   * @return Structured postal address or undefined for none.
   */
  public final native StructuredPostalAddress getStructuredPostalAddress() /*-{
    return this.getStructuredPostalAddress();
  }-*/;

  /**
   * Sets the custom properties.
   */
  public final native void setCustomProperties() /*-{
    this.setCustomProperties();
  }-*/;

  /**
   * Sets the custom properties.
   * 
   * @param customProperties Custom properties, where each custom property is added using the addCustomProperty() function, or undefined to clear the custom properties.
   */
  public final native void setCustomProperties(JsArray<CustomProperty> customProperties) /*-{
    this.setCustomProperties(
      customProperties
    );
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
   * Sets the postal address. This element is optional.
   */
  public final native void setPostalAddress() /*-{
    this.setPostalAddress();
  }-*/;

  /**
   * Sets the postal address. This element is optional.
   * 
   * @param postalAddress Postal address, or object to use as a parameter to the google.gdata.PostalAddress constructor, or undefined for none.
   */
  public final native void setPostalAddress(PostalAddress postalAddress) /*-{
    this.setPostalAddress(
      postalAddress
    );
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   */
  public final native void setResourceId() /*-{
    this.setResourceId();
  }-*/;

  /**
   * Sets the resource id. This element is optional.
   * 
   * @param resourceId Resource id, or object to use as a parameter to the google.gdata.ResourceId constructor, or undefined for none.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(
      resourceId
    );
  }-*/;

  /**
   * Sets the structured postal address. This element is optional.
   */
  public final native void setStructuredPostalAddress() /*-{
    this.setStructuredPostalAddress();
  }-*/;

  /**
   * Sets the structured postal address. This element is optional.
   * 
   * @param structuredPostalAddress Structured postal address, or object to use as a parameter to the google.gdata.StructuredPostalAddress constructor, or undefined for none.
   */
  public final native void setStructuredPostalAddress(StructuredPostalAddress structuredPostalAddress) /*-{
    this.setStructuredPostalAddress(
      structuredPostalAddress
    );
  }-*/;

}
