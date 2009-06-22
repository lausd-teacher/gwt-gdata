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

package com.google.gwt.gdata.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes an exception to a recurring event.
 */
public class RecurrenceException extends JavaScriptObject {

  /**
   * Constructs a recurrence exception using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: entryLink and specialized.
   */
  public static native RecurrenceException newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.RecurrenceException(
      params
    );
  }-*/;

  protected RecurrenceException() { }

  /**
   * Returns the nested entry providing the details about the exception. This element is required.
   * 
   * @return Nested entry providing the details about the exception or undefined for none.
   */
  public final native RecurrenceExceptionEntryLink getEntryLink() /*-{
    return this.getEntryLink();
  }-*/;

  /**
   * Returns whether the exception is specialized. This attribute is required.
   * 
   * @return Whether the exception is specialized or undefined for none.
   */
  public final native boolean getSpecialized() /*-{
    return this.getSpecialized();
  }-*/;

  /**
   * Sets the nested entry providing the details about the exception. This element is required.
   */
  public final native void setEntryLink() /*-{
    this.setEntryLink();
  }-*/;

  /**
   * Sets the nested entry providing the details about the exception. This element is required.
   * 
   * @param entryLink Nested entry providing the details about the exception, or object to use as a parameter to the google.gdata.RecurrenceExceptionEntryLink constructor, or undefined for none.
   */
  public final native void setEntryLink(RecurrenceExceptionEntryLink entryLink) /*-{
    this.setEntryLink(
      entryLink
    );
  }-*/;

  /**
   * Sets whether the exception is specialized. This attribute is required.
   */
  public final native void setSpecialized() /*-{
    this.setSpecialized();
  }-*/;

  /**
   * Sets whether the exception is specialized. This attribute is required.
   * 
   * @param specialized Whether the exception is specialized or undefined for none.
   */
  public final native void setSpecialized(boolean specialized) /*-{
    this.setSpecialized(
      specialized
    );
  }-*/;

}
