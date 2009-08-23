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

import com.google.gwt.gdata.client.app.Control;

/**
 * Describes an item app control.
 */
public class ItemAppControl extends Control {

  /**
   * Constructs an item app control.
   * @return An ItemAppControl object.
   */
  public static native ItemAppControl newInstance() /*-{
    return new $wnd.google.gdata.gbase.ItemAppControl();
  }-*/;

  protected ItemAppControl() { }

  /**
   * Returns the item disapproved. This element is optional.
   * 
   * @return Item disapproved.
   */
  public final native ItemDisapproved getDisapproved() /*-{
    return this.getDisapproved();
  }-*/;

  /**
   * Returns the item publishing priority. This element is optional.
   * 
   * @return Item publishing priority.
   */
  public final native ItemPublishingPriority getPublishingPriority() /*-{
    return this.getPublishingPriority();
  }-*/;

  /**
   * Sets the item disapproved. This element is optional.
   * 
   * @param disapproved Item disapproved.
   */
  public final native void setDisapproved(ItemDisapproved disapproved) /*-{
    this.setDisapproved(disapproved);
  }-*/;

  /**
   * Sets the item publishing priority. This element is optional.
   * 
   * @param publishingPriority Item publishing priority.
   */
  public final native void setPublishingPriority(ItemPublishingPriority
      publishingPriority) /*-{
    this.setPublishingPriority(publishingPriority);
  }-*/;

}