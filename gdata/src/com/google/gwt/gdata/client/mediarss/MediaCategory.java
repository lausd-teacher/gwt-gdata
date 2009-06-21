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
 * Comment unavailable.
 */
public class MediaCategory extends JavaScriptObject {

  /**
   * Constructs a media category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaCategory newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.mediarss.MediaCategory(
      params
    );
  }-*/;

  /**
   * Constructs a media category using an object parameter whose property names match the setter method to use for each property.
   */
  public static native MediaCategory newInstance() /*-{
    return new $wnd.google.gdata.mediarss.MediaCategory();
  }-*/;

  protected MediaCategory() { }

  /**
   * Returns the text of the category.
   * 
   * @return
   */
  public final native String getContent() /*-{
    return this.getContent();
  }-*/;

  /**
   * Returns the human readable label.
   * 
   * @return
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns the URI that identifies the categorization scheme.
   * 
   * @return
   */
  public final native String getScheme() /*-{
    return this.getScheme();
  }-*/;

  /**
   * Sets the text of the category.
   * 
   * @param content
   */
  public final native void setContent(String content) /*-{
    this.setContent(
      content
    );
  }-*/;

  /**
   * Sets the text of the category.
   * 
   * @param content
   */
  public final native void setContent() /*-{
    this.setContent();
  }-*/;

  /**
   * Sets the human readable label.
   * 
   * @param label
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(
      label
    );
  }-*/;

  /**
   * Sets the human readable label.
   * 
   * @param label
   */
  public final native void setLabel() /*-{
    this.setLabel();
  }-*/;

  /**
   * Sets the URI that identifies the categorization scheme.
   * 
   * @param scheme
   */
  public final native void setScheme(String scheme) /*-{
    this.setScheme(
      scheme
    );
  }-*/;

  /**
   * Sets the URI that identifies the categorization scheme.
   * 
   * @param scheme
   */
  public final native void setScheme() /*-{
    this.setScheme();
  }-*/;

}
