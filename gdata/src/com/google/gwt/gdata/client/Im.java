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
 * Describes an instant messaging address.
 */
public class Im extends JavaScriptObject {

  /**
   * AIM.
   */
  public static final String PROTOCOL_AIM = getConstant("PROTOCOL_AIM");

  /**
   * Google Talk.
   */
  public static final String PROTOCOL_GOOGLE_TALK =
      getConstant("PROTOCOL_GOOGLE_TALK");

  /**
   * ICQ.
   */
  public static final String PROTOCOL_ICQ = getConstant("PROTOCOL_ICQ");

  /**
   * Jabber.
   */
  public static final String PROTOCOL_JABBER = getConstant("PROTOCOL_JABBER");

  /**
   * MSN.
   */
  public static final String PROTOCOL_MSN = getConstant("PROTOCOL_MSN");

  /**
   * Tencent QQ.
   */
  public static final String PROTOCOL_QQ = getConstant("PROTOCOL_QQ");

  /**
   * Skype.
   */
  public static final String PROTOCOL_SKYPE = getConstant("PROTOCOL_SKYPE");

  /**
   * Yahoo.
   */
  public static final String PROTOCOL_YAHOO = getConstant("PROTOCOL_YAHOO");

  /**
   * Home instant messaging address.
   */
  public static final String REL_HOME = getConstant("REL_HOME");

  /**
   * Other instant messaging address.
   */
  public static final String REL_OTHER = getConstant("REL_OTHER");

  /**
   * Work instant messaging address.
   */
  public static final String REL_WORK = getConstant("REL_WORK");

  /**
   * Constructs an instant messaging address.
   * @return An Im object.
   */
  public static native Im newInstance() /*-{
    return new $wnd.google.gdata.Im();
  }-*/;

  private static native String getConstant(String name) /*-{
    return $wnd.google.gdata.Im[name];
  }-*/;

  protected Im() { }

  /**
   * Returns the IM address. This attribute is required.
   * 
   * @return IM address.
   */
  public final native String getAddress() /*-{
    return this.getAddress();
  }-*/;

  /**
   * Returns the label. This attribute is optional.
   * 
   * @return Label.
   */
  public final native String getLabel() /*-{
    return this.getLabel();
  }-*/;

  /**
   * Returns whether this is the primary instant messaging address.
   * This attribute is optional.
   * 
   * @return Whether this is the primary instant messaging address.
   */
  public final native boolean getPrimary() /*-{
    return this.getPrimary();
  }-*/;

  /**
   * Returns the im protocol. This attribute is optional.
   * 
   * @return Im protocol.
   */
  public final native String getProtocol() /*-{
    return this.getProtocol();
  }-*/;

  /**
   * Returns the im type. This attribute is optional.
   * 
   * @return Im type.
   */
  public final native String getRel() /*-{
    return this.getRel();
  }-*/;

  /**
   * Sets the IM address. This attribute is required.
   * 
   * @param address IM address.
   */
  public final native void setAddress(String address) /*-{
    this.setAddress(address);
  }-*/;

  /**
   * Sets the label. This attribute is optional.
   * 
   * @param label Label.
   */
  public final native void setLabel(String label) /*-{
    this.setLabel(label);
  }-*/;

  /**
   * Sets whether this is the primary instant messaging address.
   * This attribute is optional.
   * 
   * @param primary Whether this is the primary instant messaging address.
   */
  public final native void setPrimary(boolean primary) /*-{
    this.setPrimary(primary);
  }-*/;

  /**
   * Sets the im protocol. This attribute is optional.
   * 
   * @param protocol Im protocol.
   */
  public final native void setProtocol(String protocol) /*-{
    this.setProtocol(protocol);
  }-*/;

  /**
   * Sets the im type. This attribute is optional.
   * 
   * @param rel Im type.
   */
  public final native void setRel(String rel) /*-{
    this.setRel(rel);
  }-*/;

}