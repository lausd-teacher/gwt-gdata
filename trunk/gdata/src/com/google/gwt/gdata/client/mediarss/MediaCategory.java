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

package com.google.gwt.gdata.client.mediarss;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a media category.
 */
public class MediaCategory extends JavaScriptObject {

  /**
   * Constructs a media category using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: content, label, and scheme.
   */
  public static native MediaCategory newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaCategory(
      params
    );
  }-*/;

  protected MediaCategory() { }

  /**
   * Returns the text of the category. This attribute is optional.
   * 
   * @return Text of the category or undefined for none.
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the human readable label. This attribute is optional.
   * 
   * @return Human readable label or undefined for none.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the URI that identifies the categorization scheme. This attribute is optional.
   * 
   * @return URI that identifies the categorization scheme or undefined for none.
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the text of the category. This attribute is optional.
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the text of the category. This attribute is optional.
   * 
   * @param content Text of the category or undefined for none.
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the human readable label. This attribute is optional.
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the human readable label. This attribute is optional.
   * 
   * @param label Human readable label or undefined for none.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the URI that identifies the categorization scheme. This attribute is optional.
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

  /**
   * Sets the URI that identifies the categorization scheme. This attribute is optional.
   * 
   * @param scheme URI that identifies the categorization scheme or undefined for none.
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

}
