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
    assertNotNull("newInstance()", PostEntry.newInstance());
  }

  public void testOther() {
    PostEntry obj = PostEntry.newInstance();
    // Unit Test for getEnclosureLink()
    assertEquals("getEnclosureLink", obj.getEnclosureLink(), null);
    // Unit Test for getEntryPostLink()
    assertEquals("getEntryPostLink", obj.getEntryPostLink(), null);
    // Unit Test for getFeedLink()
    assertEquals("getFeedLink", obj.getFeedLink(), null);
    // Unit Test for getHtmlLink()
    assertEquals("getHtmlLink", obj.getHtmlLink(), null);
    // Unit Test for getRepliesHtmlLink()
    assertEquals("getRepliesHtmlLink", obj.getRepliesHtmlLink(), null);
    // Unit Test for getRepliesLink()
    assertEquals("getRepliesLink", obj.getRepliesLink(), null);
  }

  public void testProperties() {
    PostEntry obj = PostEntry.newInstance();
    Total total = Total.newInstance();
    obj.setTotal(total);
    assertSame("total", obj.getTotal(), total);
    MediaThumbnail thumbnail = MediaThumbnail.newInstance();
    obj.setThumbnail(thumbnail);
    assertSame("thumbnail", obj.getThumbnail(), thumbnail);
  }
}
