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

package com.google.gwt.gdata.client.finance;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Comment unavailable.
 */
public class TransactionEntry extends com.google.gwt.gdata.client.Entry<TransactionEntry> {

  /**
   * Constructs a Finance transaction entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native TransactionEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.finance.TransactionEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Finance transaction entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native TransactionEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.TransactionEntry();
  }-*/;

  protected TransactionEntry() { }

  /**
   * Returns the data for the transaction.
   * 
   * @return
   */
  public final native TransactionData getTransactionData() /*-{
    return this.getTransactionData();
  }-*/;

  /**
   * Sets the data for the transaction.
   * 
   * @param transactionData
   */
  public final native void setTransactionData(TransactionData transactionData) /*-{
    this.setTransactionData(
      transactionData
    );
  }-*/;

  /**
   * Sets the data for the transaction.
   * 
   * @param transactionData
   */
  public final native void setTransactionData() /*-{
    this.setTransactionData();
  }-*/;

}
