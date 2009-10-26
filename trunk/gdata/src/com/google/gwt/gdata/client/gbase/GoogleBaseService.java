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

import com.google.gwt.gdata.client.GDataRequestParameters;
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
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes an attributes entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteAttributesEntry(String uri,
      AttributesEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes an items entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteItemsEntry(String uri, ItemsEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes an items entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteItemsEntry(String uri, ItemsEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
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
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes an item types entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteItemTypesEntry(String uri,
      ItemTypesEntryCallback callback, GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Deletes a media entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteMediaEntry(String uri, MediaEntryCallback callback) {
    this.deleteEntry(uri, callback, null);
  }

  /**
   * Deletes a media entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void deleteMediaEntry(String uri, MediaEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
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
    this.getEntry(uri, callback, null, "getAttributesEntry");
  }

  /**
   * Retrieves a Google Base attribute entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAttributesEntry(String uri,
      AttributesEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getAttributesEntry");
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
    this.getFeed(query, callback, null, "getAttributesFeed");
  }

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAttributesFeed(AttributesQuery query,
      AttributesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getAttributesFeed");
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
    this.getFeed(uri, callback, null, "getAttributesFeed");
  }

  /**
   * Retrieves the feed of public attributes.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getAttributesFeed(String uri,
      AttributesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getAttributesFeed");
  }

  /**
   * Retrieves a Google Base item entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getItemsEntry(String uri, ItemsEntryCallback callback) {
    this.getEntry(uri, callback, null, "getItemsEntry");
  }

  /**
   * Retrieves a Google Base item entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemsEntry(String uri, ItemsEntryCallback callback,
      GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getItemsEntry");
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
    this.getFeed(query, callback, null, "getItemsFeed");
  }

  /**
   * Retrieves the feed of a user's private items.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemsFeed(ItemsQuery query,
      ItemsFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getItemsFeed");
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
    this.getFeed(uri, callback, null, "getItemsFeed");
  }

  /**
   * Retrieves the feed of a user's private items.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemsFeed(String uri,
      ItemsFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getItemsFeed");
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
    this.getEntry(uri, callback, null, "getItemTypesEntry");
  }

  /**
   * Retrieves a Google Base item type entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemTypesEntry(String uri,
      ItemTypesEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getItemTypesEntry");
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
    this.getFeed(query, callback, null, "getItemTypesFeed");
  }

  /**
   * Retrieves the feed of public item types.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemTypesFeed(ItemTypesQuery query,
      ItemTypesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getItemTypesFeed");
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
    this.getFeed(uri, callback, null, "getItemTypesFeed");
  }

  /**
   * Retrieves the feed of public item types.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getItemTypesFeed(String uri,
      ItemTypesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getItemTypesFeed");
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
    this.getEntry(uri, callback, null, "getLocalesEntry");
  }

  /**
   * Retrieves a Google Base locale entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getLocalesEntry(String uri,
      LocalesEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getLocalesEntry");
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
    this.getFeed(query, callback, null, "getLocalesFeed");
  }

  /**
   * Retrieves the feed of locales.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getLocalesFeed(LocalesQuery query,
      LocalesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getLocalesFeed");
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
    this.getFeed(uri, callback, null, "getLocalesFeed");
  }

  /**
   * Retrieves the feed of locales.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getLocalesFeed(String uri,
      LocalesFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getLocalesFeed");
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
    this.getEntry(uri, callback, null, "getMediaEntry");
  }

  /**
   * Retrieves a Google Base media entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getMediaEntry(String uri,
      MediaEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getMediaEntry");
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
    this.getFeed(uri, callback, null, "getMediaFeed");
  }

  /**
   * Retrieves the media feed used for managing the media attachments for one
   * Google Base Item.
   * 
   * @param uri URI of feed.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getMediaFeed(String uri, MediaFeedCallback callback,
      GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getMediaFeed");
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
    this.getEntry(uri, callback, null, "getSnippetsEntry");
  }

  /**
   * Retrieves a Google Base snippet entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSnippetsEntry(String uri,
      SnippetsEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, parameters, "getSnippetsEntry");
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
    this.getFeed(query, callback, null, "getSnippetsFeed");
  }

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param query URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSnippetsFeed(SnippetsQuery query,
      SnippetsFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(query, callback, parameters, "getSnippetsFeed");
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
    this.getFeed(uri, callback, null, "getSnippetsFeed");
  }

  /**
   * Retrieves the feed of snippets of public items.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getSnippetsFeed(String uri,
      SnippetsFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, parameters, "getSnippetsFeed");
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
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates an attributes entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateAttributesEntry(String uri, AttributesEntry entry,
      AttributesEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
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
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a items entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateItemsEntry(String uri, ItemsEntry entry,
      ItemsEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
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
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a item types entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateItemTypesEntry(String uri, ItemTypesEntry entry,
      ItemTypesEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
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
    this.updateEntry(uri, entry, callback, null);
  }

  /**
   * Updates a media entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateMediaEntry(String uri, MediaEntry entry,
      MediaEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, parameters);
  }

}