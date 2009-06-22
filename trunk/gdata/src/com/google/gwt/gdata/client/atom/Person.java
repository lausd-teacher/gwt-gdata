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
 * Describes a person construct used for authors and contributors.
 */
public class Person extends JavaScriptObject {

  /**
   * Constructs a person construct using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: email, name, nameLang, and uri.
   */
  public static native Person newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.atom.Person(
      params
    );
  }-*/;

  protected Person() { }

  /**
   * Returns the author's email address. This element is optional.
   * 
   * @return Author's email address or undefined for none.
   */
  public final native com.google.gwt.gdata.client.atom.Email getEmail() /*-{
    return this.getEmail();
  }-*/;

  /**
   * Returns the author's name. This element is required.
   * 
   * @return Author's name or undefined for none.
   */
  public final native Name getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the language of name. This attribute is optional.
   * 
   * @return Language of name or undefined for none.
   */
  public final native String getNameLang() /*-{
    return this.getNameLang();
  }-*/;

  /**
   * Returns the author's URI. This element is optional.
   * 
   * @return Author's URI or undefined for none.
   */
  public final native Uri getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets the author's email address. This element is optional.
   */
  public final native void setEmail() /*-{
    this.setEmail();
  }-*/;

  /**
   * Sets the author's email address. This element is optional.
   * 
   * @param email Author's email address, or object to use as a parameter to the google.gdata.atom.Email constructor, or undefined for none.
   */
  public final native void setEmail(Email email) /*-{
    this.setEmail(
      email
    );
  }-*/;

  /**
   * Sets the author's name. This element is required.
   */
  public final native void setName() /*-{
    this.setName();
  }-*/;

  /**
   * Sets the author's name. This element is required.
   * 
   * @param name Author's name, or object to use as a parameter to the google.gdata.atom.Name constructor, or undefined for none.
   */
  public final native void setName(Name name) /*-{
    this.setName(
      name
    );
  }-*/;

  /**
   * Sets the language of name. This attribute is optional.
   */
  public final native void setNameLang() /*-{
    this.setNameLang();
  }-*/;

  /**
   * Sets the language of name. This attribute is optional.
   * 
   * @param nameLang Language of name or undefined for none.
   */
  public final native void setNameLang(String nameLang) /*-{
    this.setNameLang(
      nameLang
    );
  }-*/;

  /**
   * Sets the author's URI. This element is optional.
   */
  public final native void setUri() /*-{
    this.setUri();
  }-*/;

  /**
   * Sets the author's URI. This element is optional.
   * 
   * @param uri Author's URI, or object to use as a parameter to the google.gdata.atom.Uri constructor, or undefined for none.
   */
  public final native void setUri(Uri uri) /*-{
    this.setUri(
      uri
    );
  }-*/;

}
