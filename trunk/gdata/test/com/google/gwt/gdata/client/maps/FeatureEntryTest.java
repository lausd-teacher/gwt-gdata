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

package com.google.gwt.gdata.client.maps;

import com.google.gwt.gdata.client.CustomProperty;
import com.google.gwt.gdata.client.Deleted;
import com.google.gwt.gdata.client.PostalAddress;
import com.google.gwt.gdata.client.ResourceId;
import com.google.gwt.gdata.client.StructuredPostalAddress;

/**
 * Tests for the FeatureEntry class.
 */
public class FeatureEntryTest extends MapsTest {
  @Override
  public String getModuleName() {
    return "com.google.gwt.gdata.GDataTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", FeatureEntry.newInstance());
  }

  public void testOther() {
    FeatureEntry obj = FeatureEntry.newInstance();
    // Unit Test for addCustomProperty(CustomProperty customProperty)
    // Unit Test for getAtomFeedLink()
    assertEquals("getAtomFeedLink", obj.getAtomFeedLink(), null);
  }

  public void testProperties() {
    FeatureEntry obj = FeatureEntry.newInstance();
    PostalAddress postaladdress = PostalAddress.newInstance();
    obj.setPostalAddress(postaladdress);
    assertSame("postaladdress", obj.getPostalAddress(), postaladdress);
    CustomProperty[] customproperties = new CustomProperty[]{ CustomProperty.newInstance() };
    obj.setCustomProperties(customproperties);
    assertEquals("customproperties", obj.getCustomProperties().length, customproperties.length);
    StructuredPostalAddress structuredpostaladdress = StructuredPostalAddress.newInstance();
    obj.setStructuredPostalAddress(structuredpostaladdress);
    assertSame("structuredpostaladdress", obj.getStructuredPostalAddress(), structuredpostaladdress);
    ResourceId resourceid = ResourceId.newInstance();
    obj.setResourceId(resourceid);
    assertSame("resourceid", obj.getResourceId(), resourceid);
    Deleted deleted = Deleted.newInstance();
    obj.setDeleted(deleted);
    assertSame("deleted", obj.getDeleted(), deleted);
  }
}
