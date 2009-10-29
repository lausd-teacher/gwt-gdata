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

import com.google.gwt.gdata.client.CustomProperty;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.GDataRequestParameters;
import com.google.gwt.gdata.client.PostalAddress;
import com.google.gwt.gdata.client.ResourceId;
import com.google.gwt.gdata.client.StructuredPostalAddress;

/**
 * Describes a feature entry.
 */
public class FeatureEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a feature entry.
   * @return A FeatureEntry object.
   */
  public static native FeatureEntry newInstance() /*-{
    return new $wnd.google.gdata.maps.FeatureEntry();
  }-*/;

  protected FeatureEntry() { }

  /**
   * Adds a new custom property.
   * 
   * @param customProperty Custom property to add.
   */
  public final native void addCustomProperty(
      CustomProperty customProperty) /*-{
    this.addCustomProperty(customProperty);
  }-*/;
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteEntry(FeatureEntryCallback callback) {
    this.delete(callback, null);
  }
  
  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteEntry(FeatureEntryCallback callback,
      GDataRequestParameters parameters) {
    this.delete(callback, parameters);
  }

  /**
   * Returns the link that provides the URI of the full feed
   * (without any query parameters).
   * 
   * @return Link that provides the URI of the full feed
   * (without any query parameters).
   */
  public final native com.google.gwt.gdata.client.Link getAtomFeedLink() /*-{
    return this.getAtomFeedLink();
  }-*/;

  /**
   * Returns the custom properties.
   * 
   * @return Custom properties.
   */
  public final native CustomProperty[] getCustomProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getCustomProperties());
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
   * Returns the postal address. This element is optional.
   * 
   * @return Postal address.
   */
  public final native PostalAddress getPostalAddress() /*-{
    return this.getPostalAddress();
  }-*/;

  /**
   * Returns the resource id. This element is optional.
   * 
   * @return Resource id.
   */
  public final native ResourceId getResourceId() /*-{
    return this.getResourceId();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSelf(FeatureEntryCallback callback) {
    this.get(callback, null);
  }

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSelf(FeatureEntryCallback callback,
      GDataRequestParameters parameters) {
    this.get(callback, parameters);
  }

  /**
   * Returns the structured postal address. This element is optional.
   * 
   * @return Structured postal address.
   */
  public final native StructuredPostalAddress getStructuredPostalAddress() /*-{
    return this.getStructuredPostalAddress();
  }-*/;

  /**
   * Sets the custom properties.
   * 
   * @param customProperties Custom properties, where each custom property is
   * added using addCustomProperty().
   */
  public final native void setCustomProperties(
      CustomProperty[] customProperties) /*-{
    this.setCustomProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(customProperties)
    );
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
   * Sets the postal address. This element is optional.
   * 
   * @param postalAddress Postal address.
   */
  public final native void setPostalAddress(PostalAddress postalAddress) /*-{
    this.setPostalAddress(postalAddress);
  }-*/;
  
  /**
   * Sets the resource id. This element is optional.
   * 
   * @param resourceId Resource id.
   */
  public final native void setResourceId(ResourceId resourceId) /*-{
    this.setResourceId(resourceId);
  }-*/;

  /**
   * Sets the structured postal address. This element is optional.
   * 
   * @param structuredPostalAddress Structured postal address.
   */
  public final native void setStructuredPostalAddress(
      StructuredPostalAddress structuredPostalAddress) /*-{
    this.setStructuredPostalAddress(structuredPostalAddress);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateEntry(FeatureEntryCallback callback) {
    this.update(callback, null);
  }

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateEntry(FeatureEntryCallback callback,
      GDataRequestParameters parameters) {
    this.update(callback, parameters);
  }

}