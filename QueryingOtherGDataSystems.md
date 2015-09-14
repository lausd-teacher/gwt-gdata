This page is still being assembled.

## Introduction ##

While there isn't explicit support in GData JS API for all of the GData systems, these can still be queried since the GData protocol has built-in json-in-script support.

This page describes how to use gwt-gdata to query Google Docs.


## Create Entry Class ##
Start by defining a class for DocumentEntry which extends the Entry class common to all Entries.
```
public class DocumentEntry extends com.google.gwt.gdata.client.Entry<DocumentEntry> {

  /**
   * Constructs a document entry.
   * @return A DocumentEntry object.
   */
  public static native DocumentEntry newInstance() /*-{
    return new $wnd.google.gdata.Entry();
  }-*/;

  protected DocumentEntry() { }

  /**
   * Returns the JavaScript constructor for this class.
   * @return The JavaScript constructor.
   */
  public static final native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Entry;
  }-*/;
  
}
```

The native method getConstructor returns the JS type that corresponds to the DocumentEntry, which in this case is the google.gdata.Entry class of the underlying JS API.

## Create Feed Class ##
As with the DocumentEntry class, create a DocumentFeed class extending Feed.
```
/**
 * Describes a feed of a user's documents.
 */
public class DocumentFeed extends com.google.gwt.gdata.client.Feed<DocumentFeed, DocumentEntry> {

  /**
   * Constructs a document feed.
   * @return A DocumentFeed object.
   */
  @SuppressWarnings("unchecked")
  public static native DocumentFeed newInstance() /*-{
    return new $wnd.google.gdata.Feed();
  }-*/;

  protected DocumentFeed() { }

  /**
   * Returns the JavaScript constructor for this class.
   * @return The JavaScript constructor.
   */
  public static final native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.Feed;
  }-*/;

}
```

## Create Service Class ##
Create the Documents service class, extending GoogleService.
```
/**
 * Google Documents service.
 */
public class DocumentsService extends GoogleService {
  
  /**
   * Constructs a DocumentsService object.
   * 
   * @param applicationName Name of application (used for tracking).
   * @return A DocumentsService object.
   */
  public static native DocumentsService newInstance(
      String applicationName) /*-{
    return new $wnd.google.gdata.client.GoogleService(applicationName);
  }-*/;

  protected DocumentsService() { }

  /**
   * Deletes a document entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void deleteDocumentEntry(String uri,
      DocumentEntryCallback callback,
      GDataRequestParameters parameters) {
    this.deleteEntry(uri, callback, parameters);
  }

  /**
   * Retrieves a document entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDocumentEntry(String uri,
      DocumentEntryCallback callback) {
    this.getEntry(uri, callback, DocumentEntry.getConstructor(), true, null);
  }
  
  /**
   * Retrieves a document entry.
   * 
   * @param uri URI of entry.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getDocumentEntry(String uri,
      DocumentEntryCallback callback, GDataRequestParameters parameters) {
    this.getEntry(uri, callback, DocumentEntry.getConstructor(), true,
        parameters);
  }

  /**
   * Retrieves the feed of documents.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void getDocumentFeed(String uri,
      DocumentFeedCallback callback) {
    this.getFeed(uri, callback, DocumentFeed.getConstructor(), true, null);
  }
  
  /**
   * Retrieves the feed of documents.
   * 
   * @param uri URI of feed or query.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void getDocumentFeed(String uri,
      DocumentFeedCallback callback, GDataRequestParameters parameters) {
    this.getFeed(uri, callback, DocumentFeed.getConstructor(), true, parameters);
  }


  /**
   * Inserts a new document entry.
   * 
   * @param uri URI of feed.
   * @param entry Entry to insert.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void insertDocumentEntry(String uri, DocumentEntry entry,
      DocumentEntryCallback callback) {
    this.insertEntry(uri, entry, callback, DocumentEntry.getConstructor());
  }
  
  /**
   * Updates a document entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  public final void updateDocumentEntry(String uri, DocumentEntry entry,
      DocumentEntryCallback callback) {
    this.updateEntry(uri, entry, callback,
        DocumentEntry.getConstructor(), null);
  }
  
  /**
   * Updates a document entry.
   * 
   * @param uri URI of entry.
   * @param entry Entry to update.
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @param parameters The request parameters.
   */
  public final void updateDocumentEntry(String uri, DocumentEntry entry,
      DocumentEntryCallback callback, GDataRequestParameters parameters) {
    this.updateEntry(uri, entry, callback, DocumentEntry.getConstructor(),
        parameters);
  }
  
}
```