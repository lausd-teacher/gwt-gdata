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
 * Indicates that this entry is a response to another resource.
 */
public class InReplyTo extends JavaScriptObject {

  /**
   * Constructs an in reply to.
   * @return An InReplyTo object.
   */
  public static native InReplyTo newInstance() /*-{
    return new $wnd.google.gdata.threading.InReplyTo();
  }-*/;

  protected InReplyTo() { }

  /**
   * Returns the IRI that may be used to retrieve a representation of the
   * resource being responded to. This attribute is optional.
   * 
   * @return IRI that may be used to retrieve a representation of the resource
   * being responded to.
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the persistent universally unique identifier of the resource being
   * responded to. This attribute is required.
   * 
   * @return Persistent universally unique identifier of the resource being
   * responded.
   */
  public final native String getRef() /*-{
    return this.getRef();
  }-*/;

  /**
   * Returns the IRI of an Atom Feed or Entry Document containing an atom:entry
   * with an atom:id value equal to the value of the "ref" attribute. This
   * attribute is optional.
   * 
   * @return IRI of an Atom Feed or Entry Document containing an atom:entry
   * with an atom:id value equal to the value of the "ref" attribute.
   */
  public final native String getSource() /*-{
    return this.getSource();
  }-*/;

  /**
   * Returns the hint to the client about the media type of the resource
   * identified by the "href" attribute. This attribute is optional.
   * 
   * @return Hint to the client about the media type of the resource identified
   * by the "href" attribute.
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the IRI that may be used to retrieve a representation of the resource
   * being responded to. This attribute is optional.
   * 
   * @param href IRI that may be used to retrieve a representation of the
   * resource being responded to.
   */
  public final native void setHref(String href) /*-{
    this.setHref(href);
  }-*/;

  /**
   * Sets the persistent universally unique identifier of the resource being
   * responded to. This attribute is required.
   * 
   * @param ref Persistent universally unique identifier of the resource being
   * responded to.
   */
  public final native void setRef(String ref) /*-{
    this.setRef(ref);
  }-*/;

  /**
   * Sets the IRI of an Atom Feed or Entry Document containing an atom:entry
   * with an atom:id value equal to the value of the "ref" attribute.
   * This attribute is optional.
   * 
   * @param source IRI of an Atom Feed or Entry Document containing an
   * atom:entry with an atom:id value equal to the value of the "ref"
   * attribute.
   */
  public final native void setSource(String source) /*-{
    this.setSource(source);
  }-*/;

  /**
   * Sets the hint to the client about the media type of the resource
   * identified by the "href" attribute. This attribute is optional.
   * 
   * @param type Hint to the client about the media type of the resource
   * identified by the "href" attribute.
   */
  public final native void setType(String type) /*-{
    this.setType(type);
  }-*/;

}