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

package com.google.gwt.gdata.client.blogger;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.mediarss.MediaThumbnail;
import com.google.gwt.gdata.client.threading.Total;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PostEntry class.
 */
public class PostEntryTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("getConstructor()", PostEntry.getConstructor());
    assertNotNull("newInstance()", PostEntry.newInstance(JavaScriptObject.createObject()));
  }

  public void testProperties() {
    PostEntry obj = PostEntry.newInstance(JavaScriptObject.createObject());
    MediaThumbnail thumbnail = MediaThumbnail.newInstance(JavaScriptObject.createObject());
    obj.setThumbnail(thumbnail);
    assertSame("thumbnail", obj.getThumbnail(), thumbnail);
    Total total = Total.newInstance(JavaScriptObject.createObject());
    obj.setTotal(total);
    assertSame("total", obj.getTotal(), total);
  }
}
