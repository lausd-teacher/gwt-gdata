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

/**
 * The format of the Google Base datafeed file.
 */
public class FileFormat extends JavaScriptObject {

  /**
   * The format of this feed file is auto detect.
   */
  public static final String FORMAT_AUTO = getConstant("FORMAT_AUTO");

  /**
   * The format of this feed file is delimiter-separated values.
   */
  public static final String FORMAT_DSV = getConstant("FORMAT_DSV");

  /**
   * The format of this feed file is XML.
   */
  public static final String FORMAT_XML = getConstant("FORMAT_XML");

  /**
   * Constructs a file format.
   * @return A FileFormat object.
   */
  public static native FileFormat newInstance() /*-{
    return new $wnd.google.gdata.gbase.FileFormat();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.gbase.FileFormat[name];
  }-*/;

  protected FileFormat() { }

  /**
   * Returns the delimiter. This element is optional.
   * 
   * @return Delimiter.
   */
  public final native Delimiter getDelimiter() /*-{
    return this.getDelimiter();
  }-*/;

  /**
   * Returns the encoding. This element is optional.
   * 
   * @return Encoding.
   */
  public final native Encoding getEncoding() /*-{
    return this.getEncoding();
  }-*/;

  /**
   * Returns the format. This attribute is required.
   * 
   * @return Format.
   */
  public final native String getFormat() /*-{
    return this.getFormat();
  }-*/;

  /**
   * Returns the boolean to indicate whether to use quoted fields. This element is optional.
   * 
   * @return Boolean to indicate whether to use quoted fields.
   */
  public final native UseQuotedFields getUseQuotedFields() /*-{
    return this.getUseQuotedFields();
  }-*/;

  /**
   * Sets the delimiter. This element is optional.
   * 
   * @param delimiter Delimiter.
   */
  public final native void setDelimiter(Delimiter delimiter) /*-{
    this.setDelimiter(delimiter);
  }-*/;

  /**
   * Sets the encoding. This element is optional.
   * 
   * @param encoding Encoding.
   */
  public final native void setEncoding(Encoding encoding) /*-{
    this.setEncoding(encoding);
  }-*/;

  /**
   * Sets the format. This attribute is required.
   * 
   * @param format Format.
   */
  public final native void setFormat(String format) /*-{
    this.setFormat(format);
  }-*/;

  /**
   * Sets the boolean to indicate whether to use quoted fields. This element is optional.
   * 
   * @param useQuotedFields Boolean to indicate whether to use quoted fields.
   */
  public final native void setUseQuotedFields(UseQuotedFields useQuotedFields) /*-{
    this.setUseQuotedFields(useQuotedFields);
  }-*/;

}