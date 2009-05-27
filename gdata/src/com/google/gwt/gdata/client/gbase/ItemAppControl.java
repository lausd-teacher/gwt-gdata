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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.app.Control;

/**
 * Comment unavailable.
 */
public class ItemAppControl extends Control {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.gbase.ItemAppControl;
  }-*/;

  /**
   * Constructs an item app control using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemAppControl newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.gbase.ItemAppControl(
      params
    );
  }-*/;

  /**
   * Constructs an item app control using an object parameter whose property names match the setter method to use for each property.
   */
  public static native ItemAppControl newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemAppControl();
  }-*/;

  protected ItemAppControl() { }

  /**
   * Returns the item disapproved.
   * 
   * @return
   */
  public final native ItemDisapproved getDisapproved() /*-{
    return this.getDisapproved();
  }-*/;

  /**
   * Returns the item publishing priority.
   * 
   * @return
   */
  public final native ItemPublishingPriority getPublishingPriority() /*-{
    return this.getPublishingPriority();
  }-*/;

  /**
   * Sets the item disapproved.
   * 
   * @param disapproved
   */
  public final native void setDisapproved(ItemDisapproved disapproved) /*-{
    this.setDisapproved(
      disapproved
    );
  }-*/;

  /**
   * Sets the item disapproved.
   * 
   * @param disapproved
   */
  public final native void setDisapproved() /*-{
    this.setDisapproved();
  }-*/;

  /**
   * Sets the item publishing priority.
   * 
   * @param publishingPriority
   */
  public final native void setPublishingPriority(ItemPublishingPriority publishingPriority) /*-{
    this.setPublishingPriority(
      publishingPriority
    );
  }-*/;

  /**
   * Sets the item publishing priority.
   * 
   * @param publishingPriority
   */
  public final native void setPublishingPriority() /*-{
    this.setPublishingPriority();
  }-*/;

}
