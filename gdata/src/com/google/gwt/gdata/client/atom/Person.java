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
   * Constructs a person.
   * @return A Person object.
   */
  public static native Person newInstance() /*-{
    return new $wnd.google.gdata.atom.Person();
  }-*/;

  protected Person() { }

  /**
   * Returns the author's email address. This element is optional.
   * 
   * @return Author's email address.
   */
  public final native com.google.gwt.gdata.client.atom.Email getEmail() /*-{
    return this.getEmail();
  }-*/;

  /**
   * Returns the author's name. This element is required.
   * 
   * @return Author's name.
   */
  public final native Name getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the language of name. This attribute is optional.
   * 
   * @return Language of name.
   */
  public final native String getNameLang() /*-{
    return this.getNameLang();
  }-*/;

  /**
   * Returns the author's URI. This element is optional.
   * 
   * @return Author's URI.
   */
  public final native Uri getUri() /*-{
    return this.getUri();
  }-*/;

  /**
   * Sets the author's email address. This element is optional.
   * 
   * @param email Author's email address.
   */
  public final native void setEmail(Email email) /*-{
    this.setEmail(email);
  }-*/;

  /**
   * Sets the author's name. This element is required.
   * 
   * @param name Author's name.
   */
  public final native void setName(Name name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the language of name. This attribute is optional.
   * 
   * @param nameLang Language of name.
   */
  public final native void setNameLang(String nameLang) /*-{
    this.setNameLang(nameLang);
  }-*/;

  /**
   * Sets the author's URI. This element is optional.
   * 
   * @param uri Author's URI.
   */
  public final native void setUri(Uri uri) /*-{
    this.setUri(uri);
  }-*/;

}