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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.app.Control;
import com.google.gwt.gdata.client.app.Edited;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Comment unavailable.
 * @param <E>
 */
public class Entry<E extends com.google.gwt.gdata.client.atom.Entry> extends com.google.gwt.gdata.client.atom.Entry {

  /**
   * Constructs a GData entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native <E extends com.google.gwt.gdata.client.atom.Entry> Entry<E> newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.Entry(
      params
    );
  }-*/;

  /**
   * Constructs a GData entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native <E extends com.google.gwt.gdata.client.atom.Entry> Entry<E> newInstance() /*-{
    return new $wnd.google.gdata.Entry();
  }-*/;

  protected Entry() { }


  /**
   * Deletes the entry from the feed.
   * 
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native void deleteEntry(AsyncCallback<E> callback) /*-{
    return this.deleteEntry(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Returns the Atom publication control status.
   * 
   * @return
   */
  public final native Control getControl() /*-{
    return this.getControl();
  }-*/;

  /**
   * Returns the Atom entry last edited timestamp.
   * 
   * @return
   */
  public final native Edited getEdited() /*-{
    return this.getEdited();
  }-*/;

  /**
   * Returns the link that provides the URI that can be used to edit the entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getEditLink() /*-{
    return this.getEditLink();
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel
   * @param opt_type
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel, String type) /*-{
    return this.getLink(
      rel,
      type
    );
  }-*/;

  /**
   * Returns the link of a relation and type.
   * 
   * @param rel
   * @param opt_type
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getLink(String rel) /*-{
    return this.getLink(
      rel,
      undefined
    );
  }-*/;

  /**
   * Returns the current representation of the entry by requesting it from the associated service using the entrys self link.
   * 
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native E getSelf(AsyncCallback<E> callback) /*-{
    return this.getSelf(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the feed or entry.
   * 
   * @return
   */
  public final native com.google.gwt.gdata.client.Link getSelfLink() /*-{
    return this.getSelfLink();
  }-*/;

  /**
   * Sets the Atom publication control status.
   * 
   * @param control
   */
  public final native void setControl(Control control) /*-{
    this.setControl(
      control
    );
  }-*/;

  /**
   * Sets the Atom publication control status.
   * 
   * @param control
   */
  public final native void setControl() /*-{
    this.setControl();
  }-*/;

  /**
   * Sets the Atom entry last edited timestamp.
   * 
   * @param edited
   */
  public final native void setEdited(Edited edited) /*-{
    this.setEdited(
      edited
    );
  }-*/;

  /**
   * Sets the Atom entry last edited timestamp.
   * 
   * @param edited
   */
  public final native void setEdited() /*-{
    this.setEdited();
  }-*/;

  /**
   * Updated the entry in the feed by sending the representation of this entry.
   * 
   * @param continuation
   * @param opt_errorHandler
   * 
   * @return
   */
  public final native E updateEntry(AsyncCallback<E> callback) /*-{
    return this.updateEntry(
      function(result) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleSuccessCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback, result.entry); },
      function(error) { @com.google.gwt.gdata.client.impl.CallbackHelper::handleFailureCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/gdata/client/Error;)(callback, error); }
    );
  }-*/;
}
