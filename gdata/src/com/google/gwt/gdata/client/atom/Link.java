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

package com.google.gwt.gdata.client.atom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class Link extends JavaScriptObject {

  /**
   * Link that provides the URI of an alternate format of the entrys or feeds contents.
   */
  public static final String REL_ALTERNATE = getConstant("REL_ALTERNATE");

  /**
   * Link that identifies a resource related to the entry.
   */
  public static final String REL_ENCLOSURE = getConstant("REL_ENCLOSURE");

  /**
   * Link that provides the URI that can be used to edit the entry.
   */
  public static final String REL_ENTRY_EDIT = getConstant("REL_ENTRY_EDIT");

  /**
   * Link that provides the URI that can be used to edit the media associated with an entry.
   */
  public static final String REL_MEDIA_EDIT = getConstant("REL_MEDIA_EDIT");

  /**
   * Link that provides the URI of next page in a paged feed.
   */
  public static final String REL_NEXT = getConstant("REL_NEXT");

  /**
   * Link that provides the URI of previous page in a paged feed.
   */
  public static final String REL_PREVIOUS = getConstant("REL_PREVIOUS");

  /**
   * Link that provides the URI of a related link to the entry.
   */
  public static final String REL_RELATED = getConstant("REL_RELATED");

  /**
   * Link that provides the URI of the feed or entry.
   */
  public static final String REL_SELF = getConstant("REL_SELF");

  /**
   * Link that provides the URI that of link that provides the data for the content in the feed.
   */
  public static final String REL_VIA = getConstant("REL_VIA");

  /**
   * Link type used for Atom content.
   */
  public static final String TYPE_ATOM = getConstant("TYPE_ATOM");

  /**
   * Link type used for HTML content.
   */
  public static final String TYPE_HTML = getConstant("TYPE_HTML");

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.atom.Link;
  }-*/;

  /**
   * Constructs an external link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Link newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Link(
      params
    );
  }-*/;

  /**
   * Constructs an external link using an object parameter whose property names match the setter method to use for each property.
   */
  public static native Link newInstance() /*-{
    return new $wnd.google.gdata.atom.Link();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.atom.Link[name];
  }-*/;

  protected Link() { }

  /**
   * Returns the link URI.
   * 
   * @return
   */
  public final native String getHref() /*-{
    return this.getHref();
  }-*/;

  /**
   * Returns the language of resource pointed to by href.
   * 
   * @return
   */
  public final native String getHrefLang() /*-{
    return this.getHrefLang();
  }-*/;

  /**
   * Returns the length of the resource pointed to by href in bytes.
   * 
   * @return
   */
  public final native double getLength() /*-{
    return this.getLength();
  }-*/;

  /**
   * Returns the link relation type.
   * 
   * @return
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Returns the link title.
   * 
   * @return
   */
  public final native String getTitle() /*-{
    return this.getTitle();
  }-*/;

  /**
   * Returns the language of link title.
   * 
   * @return
   */
  public final native String getTitleLang() /*-{
    return this.getTitleLang();
  }-*/;

  /**
   * Returns the MIME type of link target.
   * 
   * @return
   */
  public final native String getType() /*-{
    return this.getType();
  }-*/;

  /**
   * Sets the link URI.
   * 
   * @param href
   */
  public final native void setHref(String href) /*-{
    this.setHref(
      href
    );
  }-*/;

  /**
   * Sets the link URI.
   * 
   * @param href
   */
  public final native void setHref() /*-{
    this.setHref();
  }-*/;

  /**
   * Sets the language of resource pointed to by href.
   * 
   * @param hrefLang
   */
  public final native void setHrefLang(String hrefLang) /*-{
    this.setHrefLang(
      hrefLang
    );
  }-*/;

  /**
   * Sets the language of resource pointed to by href.
   * 
   * @param hrefLang
   */
  public final native void setHrefLang() /*-{
    this.setHrefLang();
  }-*/;

  /**
   * Sets the length of the resource pointed to by href in bytes.
   * 
   * @param length
   */
  public final native void setLength(double length) /*-{
    this.setLength(
      length
    );
  }-*/;

  /**
   * Sets the length of the resource pointed to by href in bytes.
   * 
   * @param length
   */
  public final native void setLength() /*-{
    this.setLength();
  }-*/;

  /**
   * Sets the link relation type.
   * 
   * @param rel
   */
  public final native void setRel(String rel) /*-{
    this.setRel(
      rel
    );
  }-*/;

  /**
   * Sets the link relation type.
   * 
   * @param rel
   */
  public final native void setRel() /*-{
    this.setRel();
  }-*/;

  /**
   * Sets the link title.
   * 
   * @param title
   */
  public final native void setTitle(String title) /*-{
    this.setTitle(
      title
    );
  }-*/;

  /**
   * Sets the link title.
   * 
   * @param title
   */
  public final native void setTitle() /*-{
    this.setTitle();
  }-*/;

  /**
   * Sets the language of link title.
   * 
   * @param titleLang
   */
  public final native void setTitleLang(String titleLang) /*-{
    this.setTitleLang(
      titleLang
    );
  }-*/;

  /**
   * Sets the language of link title.
   * 
   * @param titleLang
   */
  public final native void setTitleLang() /*-{
    this.setTitleLang();
  }-*/;

  /**
   * Sets the MIME type of link target.
   * 
   * @param type
   */
  public final native void setType(String type) /*-{
    this.setType(
      type
    );
  }-*/;

  /**
   * Sets the MIME type of link target.
   * 
   * @param type
   */
  public final native void setType() /*-{
    this.setType();
  }-*/;

}
