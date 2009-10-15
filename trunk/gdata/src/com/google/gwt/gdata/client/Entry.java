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

package com.google.gwt.gdata.client;

import com.google.gwt.gdata.client.app.Control;
import com.google.gwt.gdata.client.app.Edited;
import com.google.gwt.gdata.client.impl.Callback;

/**
 * Describes a Google Data API Entry.
 */
public class Entry extends com.google.gwt.gdata.client.atom.Entry {
  
  /**
   * Constructs an entry.
   * @return An Entry object.
   */
  public static native Entry newInstance() /*-{
    return new $wnd.google.gdata.Entry();
  }-*/;

  protected Entry() { }
  
  /**
   * Returns the Atom publication control status. This element is optional.
   * 
   * @return Atom publication control status.
   */
  public final native Control getControl() /*-{
    return this.getControl();
  }-*/;

  /**
   * Returns the Atom entry last edited timestamp. This element is optional.
   * 
   * @return Atom entry last edited timestamp.
   */
  public final native Edited getEdited() /*-{
    return this.getEdited();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to edit the entry.
   * 
   * @return Link that provides the URI that can be used to edit the entry.
   */
  public final native com.google.gwt.gdata.client.Link getEditLink() /*-{
    return this.getEditLink();
  }-*/;

  /**
   * Returns the entity tag of the entry. This attribute is optional.
   * 
   * @return Entity tag of the entry.
   */
  public final native String getEtag() /*-{
    return this.getEtag();
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel Link relation type to filter on.
   * @return First link whose relation and type is a match.
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel) /*-{
    return this.getLink(rel);
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel Link relation type to filter on.
   * @param type MIME type of the link target to filter on.
   * @return First link whose relation and type is a match.
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel, 
      String type) /*-{
    return this.getLink(rel, type);
  }-*/;

  /**
   * Returns the link that provides the URI of the feed or entry.
   * 
   * @return Link that provides the URI of the feed or entry.
   */
  public final native com.google.gwt.gdata.client.Link getSelfLink() /*-{
    return this.getSelfLink();
  }-*/;

  /**
   * Sets the Atom publication control status.
   * 
   * @param control Atom publication control status.
   */
  public final native void setControl(Control control) /*-{
    this.setControl(control);
  }-*/;

  /**
   * Sets the Atom entry last edited timestamp.
   * 
   * @param edited Atom entry last edited timestamp.
   */
  public final native void setEdited(Edited edited) /*-{
    this.setEdited(edited);
  }-*/;

  /**
   * Sets the entity tag of the entry. This attribute is optional.
   * 
   * @param etag Entity tag of the entry.
   */
  public final native void setEtag(String etag) /*-{
    this.setEtag(etag);
  }-*/;

  /**
   * Deletes the entry from the feed.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  protected final native <E extends Entry> void delete(
      Callback<E> callback) /*-{
    return this.deleteEntry(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the
   * associated service using the entry's self link.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   * @return current representation of the entry.
   */
  protected final native <E extends Entry> E get(Callback<E> callback) /*-{
    return this.getSelf(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param callback Callback defining success and failure handlers for this
   * command.
   */
  protected final native<E extends Entry> void update(
      Callback<E> callback) /*-{
    return this.updateEntry(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result ? result.entry : result); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/gdata/client/impl/Callback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;
}
