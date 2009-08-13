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

package com.google.gwt.gdata.client.gbase;

/**
 * Describes an entry in the feed of a user's private items.
 */
public class ItemsEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Constructs a Google Base item entry.
   * @return An ItemsEntry object.
   */
  public static native ItemsEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemsEntry();
  }-*/;

  protected ItemsEntry() { }

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void deleteEntry(ItemsEntryCallback callback) {
    this.delete(callback);
  }

  /**
   * Returns the attributes. The returned object is a map from attribute name to the associated Attribute class.
   * 
   * @return Attributes.
   */
  public final native MapAttribute getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents.
   */
  public final native com.google.gwt.gdata.client.atom.Link getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Returns the nested feed link. This element is optional.
   * 
   * @return Nested feed link.
   */
  public final native MediaFeedLink getMediaFeedLink() /*-{
    return this.getFeedLink();
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   * @return current representation of the entry.
   */
  public final ItemsEntry getSelf(ItemsEntryCallback callback) {
    return this.get(callback);
  }

  /**
   * Sets the attribute.
   * 
   * @param name name of attribute.
   * @param attribute Attribute to add.
   */
  public final native void setAttribute(String name, Attribute attribute) /*-{
    this.setAttribute(name, attribute);
  }-*/;

  /**
   * Sets the attributes. The parameter is a map from attribute name to the associated Attribute class.
   * 
   * @param attributes Attributes, where each attribute is added using setAttribute().
   */
  public final native void setAttributes(MapAttribute attributes) /*-{
    this.setAttributes(attributes);
  }-*/;

  /**
   * Sets the nested feed link. This element is optional.
   * 
   * @param feedLink Nested feed link.
   */
  public final native void setMediaFeedLink(MediaFeedLink feedLink) /*-{
    this.setFeedLink(feedLink);
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this command.
   */
  public final void updateEntry(ItemsEntryCallback callback) {
    this.update(callback);
  }
}