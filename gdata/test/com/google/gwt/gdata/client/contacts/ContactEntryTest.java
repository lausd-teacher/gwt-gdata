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

package com.google.gwt.gdata.client.contacts;

import com.google.gwt.ajaxloader.client.ArrayHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the ContactEntry class.
 */
public class ContactEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", ContactEntry.getConstructor());
    assertNotNull("newInstance()", ContactEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    ContactEntry obj = ContactEntry.newInstance(JavaScriptObject.createObject());
    JsArray<GroupMembershipInfo> groupmembershipinfos = ArrayHelper.toJsArray(GroupMembershipInfo.newInstance(JavaScriptObject.createObject()));
    obj.setGroupMembershipInfos(groupmembershipinfos);
    assertEquals("groupmembershipinfos", obj.getGroupMembershipInfos().length(), groupmembershipinfos.length());
    int lenGroupMembershipInfos = obj.getGroupMembershipInfos().length();
    obj.addGroupMembershipInfo(GroupMembershipInfo.newInstance(JavaScriptObject.createObject()));
    assertEquals("groupmembershipinfos", obj.getGroupMembershipInfos().length(), lenGroupMembershipInfos + 1);
    Deleted deleted = Deleted.newInstance(JavaScriptObject.createObject());
    obj.setDeleted(deleted);
    assertSame("deleted", obj.getDeleted(), deleted);
  }
}
