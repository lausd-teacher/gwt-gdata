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

package com.google.gwt.gdata.client.mediarss;

/**
 * Tests for the MediaRating class.
 */
public class MediaRatingTest extends MediaRssTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstants() {
    assertNotNull("SCHEME_DEFAULT_SCHEME", MediaRating.SCHEME_DEFAULT_SCHEME);
  }

  public void testConstructors() {
    assertNotNull("newInstance()", MediaRating.newInstance());
  }

  public void testProperties() {
    MediaRating obj = MediaRating.newInstance();
    String scheme = "myValue";
    obj.setScheme(scheme);
    assertEquals("scheme", obj.getScheme(), scheme);
    String content = "myValue";
    obj.setContent(content);
    assertEquals("content", obj.getContent(), content);
  }
}
