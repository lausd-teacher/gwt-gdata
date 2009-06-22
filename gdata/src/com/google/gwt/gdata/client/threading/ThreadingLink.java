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
import com.google.gwt.gdata.client.DateTime;

import java.util.Date;

/**
 * Describes a threading link.
 */
public class ThreadingLink extends com.google.gwt.gdata.client.atom.Link {

  /**
   * Replies threading link.
   */
  public static final String REL_REPLIES = getConstant("REL_REPLIES");

  /**
   * Constructs a threading link using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: count, href, hrefLang, length, rel, title, titleLang, type, and updated.
   */
  public static native ThreadingLink newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.threading.ThreadingLink(
      params
    );
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.threading.ThreadingLink[name];
  }-*/;

  protected ThreadingLink() { }

  /**
   * Returns the provides a hint to clients as to the total number of replies contained by the linked resource. This attribute is optional.
   * 
   * @return Provides a hint to clients as to the total number of replies contained by the linked resource or undefined for none.
   */
  public final native double getCount() /*-{
    return this.getCount();
  }-*/;

  /**
   * Returns the provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource. This attribute is optional.
   * 
   * @return Provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource or undefined for none.
   */
  public final native DateTime getUpdated() /*-{
    return this.getUpdated();
  }-*/;

  /**
   * Sets the provides a hint to clients as to the total number of replies contained by the linked resource. This attribute is optional.
   */
  public final native void setCount() /*-{
    this.setCount();
  }-*/;

  /**
   * Sets the provides a hint to clients as to the total number of replies contained by the linked resource. This attribute is optional.
   * 
   * @param count Provides a hint to clients as to the total number of replies contained by the linked resource or undefined for none.
   */
  public final native void setCount(double count) /*-{
    this.setCount(
      count
    );
  }-*/;

  /**
   * Sets the provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource. This attribute is optional.
   */
  public final native void setUpdated() /*-{
    this.setUpdated();
  }-*/;

  /**
   * Sets the provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource. This attribute is optional.
   * 
   * @param updated Provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource or undefined for none.
   */
  public final native void setUpdated(Date updated) /*-{
    this.setUpdated(
      new Date(@com.google.gwt.gdata.client.impl.DateHelper::dateToMilliseconds(Ljava/util/Date;)(updated))
    );
  }-*/;

  /**
   * Sets the provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource. This attribute is optional.
   * 
   * @param updated Provides a hint to clients as to the date and time of the most recently updated reply contained by the linked resource or undefined for none.
   */
  public final native void setUpdated(DateTime updated) /*-{
    this.setUpdated(
      updated
    );
  }-*/;

}
