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

package com.google.gwt.gdata.client.threading;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class InReplyTo extends JavaScriptObject {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.threading.InReplyTo;
  }-*/;

  /**
   * Constructs an in reply to using an object parameter whose property names match the setter method to use for each property.
   */
  public static native InReplyTo newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.threading.InReplyTo(
      params
    );
  }-*/;

  /**
   * Constructs an in reply to using an object parameter whose property names match the setter method to use for each property.
   */
  public static native InReplyTo newInstance() /*-{
    return new $wnd.google.gdata.threading.InReplyTo();
  }-*/;

  protected InReplyTo() { }

  /**
   * Returns the IRI that may be used to retrieve a representation of the resource being responded to.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the persistent universally unique identifier of the resource being responded to.
   * 
   * @return
   */
  public final native String getRef() /*-{
    return this.getRef();
  }-*/;

  /**
   * Returns the IRI of an Atom Feed or Entry Document containing an atom:entry with an atom:id value equal to the value of the ref attribute.
   * 
   * @return
   */
  public final native String getSource() /*-{
    return this.getSource();
  }-*/;

  /**
   * Returns the hint to the client about the media type of the resource identified by the href attribute.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the IRI that may be used to retrieve a representation of the resource being responded to.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the IRI that may be used to retrieve a representation of the resource being responded to.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the persistent universally unique identifier of the resource being responded to.
   * 
   * @param ref
   */
  public final native void setRef(String ref) /*-{
    this.setRef(
      ref
    );
  }-*/;

  /**
   * Sets the persistent universally unique identifier of the resource being responded to.
   * 
   * @param ref
   */
  public final native void setRef() /*-{
    this.setRef();
  }-*/;

  /**
   * Sets the IRI of an Atom Feed or Entry Document containing an atom:entry with an atom:id value equal to the value of the ref attribute.
   * 
   * @param source
   */
  public final native void setSource(String source) /*-{
    this.setSource(
      source
    );
  }-*/;

  /**
   * Sets the IRI of an Atom Feed or Entry Document containing an atom:entry with an atom:id value equal to the value of the ref attribute.
   * 
   * @param source
   */
  public final native void setSource() /*-{
    this.setSource();
  }-*/;

  /**
   * Sets the hint to the client about the media type of the resource identified by the href attribute.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the hint to the client about the media type of the resource identified by the href attribute.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
