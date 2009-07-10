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

/**
 * Describes an entry in a feed of Finance transactions.
 */
public class TransactionEntry extends com.google.gwt.gdata.client.Entry<TransactionEntry> {

  /**
   * Constructs a Finance transaction entry.
   * @return A TransactionEntry object.
   */
  @SuppressWarnings("unchecked")
  public static native TransactionEntry newInstance() /*-{
    return new $wnd.google.gdata.finance.TransactionEntry();
  }-*/;

  protected TransactionEntry() { }

  /**
   * Returns the data for the transaction. This element is required.
   * 
   * @return Data for the transaction.
   */
  public final native TransactionData getTransactionData() /*-{
    return this.getTransactionData();
  }-*/;
  
  /**
   * Sets the data for the transaction. This element is required.
   * 
   * @param transactionData Data for the transaction.
   */
  public final native void setTransactionData(TransactionData transactionData) /*-{
    this.setTransactionData(transactionData);
  }-*/;

}