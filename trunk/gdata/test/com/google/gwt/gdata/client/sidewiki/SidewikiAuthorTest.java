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

package com.google.gwt.gdata.client.sidewiki;

import com.google.gwt.gdata.client.Rating;
import com.google.gwt.gdata.client.ResourceId;

/**
 * Tests for the SidewikiAuthor class.
 */
public class SidewikiAuthorTest extends SidewikiTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", SidewikiAuthor.newInstance());
  }

  public void testProperties() {
    SidewikiAuthor obj = SidewikiAuthor.newInstance();
    Rating rating = Rating.newInstance();
    obj.setRating(rating);
    assertSame("rating", obj.getRating(), rating);
    EntriesNumber numentries = EntriesNumber.newInstance();
    obj.setNumEntries(numentries);
    assertSame("numentries", obj.getNumEntries(), numentries);
    ResourceId resourceid = ResourceId.newInstance();
    obj.setResourceId(resourceid);
    assertSame("resourceid", obj.getResourceId(), resourceid);
    SidewikiUserDescription description =
      SidewikiUserDescription.newInstance();
    obj.setDescription(description);
    assertSame("description", obj.getDescription(), description);
    SidewikiThumbnail thumbnail = SidewikiThumbnail.newInstance();
    obj.setThumbnail(thumbnail);
    assertSame("thumbnail", obj.getThumbnail(), thumbnail);
  }
}
