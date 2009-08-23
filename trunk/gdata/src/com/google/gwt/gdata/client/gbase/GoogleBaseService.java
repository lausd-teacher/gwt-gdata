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

import com.google.gwt.gdata.client.GoogleService;

/**
 * Google Base service.
 */
public class GoogleBaseService extends GoogleService {

  /**
   * Google Base service name.
   */
  public static final String SERVICE_NAME = getConstant("SERVICE_NAME");

  /**
   * Constructs a Google Base service.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A GoogleBaseService object.
   */
  public static native GoogleBaseService newInstance(
      String applicationName) /*-{
    return new $wnd.google.gdata.gbase.GoogleBaseService(applicationName);
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.GoogleBaseService[name];
  }-*/;

  protected GoogleBaseService() { }

  /**
   * Deletes an attributes entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteAttributesEntry(String uri,
      AttributesEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes an items entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteItemsEntry(String uri, ItemsEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes an item types entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteItemTypesEntry(String uri,
      ItemTypesEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Deletes a media entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteMediaEntry(String uri, MediaEntryCallback callback) {
    this.deleteEntry(uri, callback);
  }

  /**
   * Retrieves a Google Base attribute entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAttributesEntry(String uri,
      AttributesEntryCallback callback) {
    this.getEntry(uri, callback, "getAttributesEntry");
  }

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAttributesFeed(AttributesQuery query,
      AttributesFeedCallback callback) {
    this.getFeed(query, callback, "getAttributesFeed");
  }

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getAttributesFeed(String uri,
      AttributesFeedCallback callback) {
    this.getFeed(uri, callback, "getAttributesFeed");
  }

  /**
   * Retrieves a Google Base item entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemsEntry(String uri, ItemsEntryCallback callback) {
    this.getEntry(uri, callback, "getItemsEntry");
  }

  /**
   * Retrieves the feed of a user's private items.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemsFeed(ItemsQuery query,
      ItemsFeedCallback callback) {
    this.getFeed(query, callback, "getItemsFeed");
  }

  /**
   * Retrieves the feed of a user's private items.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemsFeed(String uri,
      ItemsFeedCallback callback) {
    this.getFeed(uri, callback, "getItemsFeed");
  }

  /**
   * Retrieves a Google Base item type entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemTypesEntry(String uri,
      ItemTypesEntryCallback callback) {
    this.getEntry(uri, callback, "getItemTypesEntry");
  }

  /**
   * Retrieves the feed of public item types.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemTypesFeed(ItemTypesQuery query,
      ItemTypesFeedCallback callback) {
    this.getFeed(query, callback, "getItemTypesFeed");
  }

  /**
   * Retrieves the feed of public item types.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemTypesFeed(String uri,
      ItemTypesFeedCallback callback) {
    this.getFeed(uri, callback, "getItemTypesFeed");
  }

  /**
   * Retrieves a Google Base locale entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getLocalesEntry(String uri,
      LocalesEntryCallback callback) {
    this.getEntry(uri, callback, "getLocalesEntry");
  }

  /**
   * Retrieves the feed of locales.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getLocalesFeed(LocalesQuery query,
      LocalesFeedCallback callback) {
    this.getFeed(query, callback, "getLocalesFeed");
  }

  /**
   * Retrieves the feed of locales.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getLocalesFeed(String uri,
      LocalesFeedCallback callback) {
    this.getFeed(uri, callback, "getLocalesFeed");
  }

  /**
   * Retrieves a Google Base media entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getMediaEntry(String uri,
      MediaEntryCallback callback) {
    this.getEntry(uri, callback, "getMediaEntry");
  }

  /**
   * Retrieves the media feed used for managing the media attachments for one
   * Google Base Item.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getMediaFeed(String uri, MediaFeedCallback callback) {
    this.getFeed(uri, callback, "getMediaFeed");
  }

  /**
   * Retrieves a Google Base snippet entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSnippetsEntry(String uri,
      SnippetsEntryCallback callback) {
    this.getEntry(uri, callback, "getSnippetsEntry");
  }

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSnippetsFeed(SnippetsQuery query,
      SnippetsFeedCallback callback) {
    this.getFeed(query, callback, "getSnippetsFeed");
  }

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getSnippetsFeed(String uri,
      SnippetsFeedCallback callback) {
    this.getFeed(uri, callback, "getSnippetsFeed");
  }

  /**
   * Inserts a new attributes entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertAttributesEntry(String uri,
      AttributesEntry entry, AttributesEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new items entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertItemsEntry(String uri, ItemsEntry entry,
      ItemsEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new item types entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertItemTypesEntry(String uri, ItemTypesEntry entry,
      ItemTypesEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Inserts a new media entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertMediaEntry(String uri, MediaEntry entry,
      MediaEntryCallback callback) {
    this.insertEntry(uri, entry, callback);
  }

  /**
   * Updates an attributes entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateAttributesEntry(String uri, AttributesEntry entry,
      AttributesEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a items entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateItemsEntry(String uri, ItemsEntry entry,
      ItemsEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a item types entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateItemTypesEntry(String uri, ItemTypesEntry entry,
      ItemTypesEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

  /**
   * Updates a media entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateMediaEntry(String uri, MediaEntry entry,
      MediaEntryCallback callback) {
    this.updateEntry(uri, entry, callback);
  }

}