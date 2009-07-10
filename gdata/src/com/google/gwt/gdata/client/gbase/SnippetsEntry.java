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

import com.google.gwt.gdata.client.impl.Map;

/**
 * Describes an entry in the feed of snippets of public items.
 */
public class SnippetsEntry extends com.google.gwt.gdata.client.Entry<SnippetsEntry> {

  /**
   * Constructs a Google Base snippet entry.
   * @return A SnippetsEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native SnippetsEntry newInstance() /*-{
    return new $wnd.google.gdata.gbase.SnippetsEntry();
  }-*/;

  protected SnippetsEntry() { }

  /**
   * Returns the attributes. The returned object is a map from attribute name to the associated Attribute class.
   * 
   * @return Attributes.
   */
  public final native Map<Attribute> getAttributes() /*-{
    return this.getAttributes();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents.
   */
  public final native com.google.gwt.gdata.client.atom.Link getHtmlLink() /*-{
    return this.getHtmlLink();
  }-*/;

  /**
   * Sets the attribute.
   * 
   * @param name name of attribute.
   * @param attribute Attribute to add, or object to use as a parameter to the Attribute constructor.
   */
  public final native void setAttribute(String name, Attribute attribute) /*-{
    this.setAttribute(name, attribute);
  }-*/;

  /**
   * Sets the attributes. The parameter is a map from attribute name to the associated Attribute class.
   * 
   * @param attributes Attributes, where each attribute is added using setAttribute().
   */
  public final native void setAttributes(Map<Attribute> attributes) /*-{
    this.setAttributes(attributes);
  }-*/;

}