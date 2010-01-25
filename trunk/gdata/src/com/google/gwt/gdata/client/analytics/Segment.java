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

package com.google.gwt.gdata.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Describes a segment.
 */
public class Segment extends JavaScriptObject {

  /**
   * Constructs a segment.
   * 
   * @return An instance of Segment.
   */
  public static native Segment newInstance() /*-{
    return new $wnd.google.gdata.analytics.Segment();
  }-*/;

  protected Segment() { }

  /**
   * Adds a new property.
   * 
   * @param property Property to add.
   */
  public final native void addProperty(Property property) /*-{
    this.addProperty(property);
  }-*/;

  /**
   * Returns the definition. This element is optional.
   * 
   * @return Definition.
   */
  public final native Definition getDefinition() /*-{
    return this.getDefinition();
  }-*/;

  /**
   * Returns the id of the segment. This attribute is optional.
   * 
   * @return Id of the segment.
   */
  public final native String getId() /*-{
    return this.getId();
  }-*/;

  /**
   * Returns the name of the segment. This attribute is optional.
   * 
   * @return Name of the segment.
   */
  public final native String getName() /*-{
    return this.getName();
  }-*/;

  /**
   * Returns the properties.
   * 
   * @return Properties.
   */
  public final native Property[] getProperties() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getProperties());
  }-*/;

  /**
   * Sets the definition. This element is optional.
   * 
   * @param definition Definition.
   */
  public final native void setDefinition(Definition definition) /*-{
    this.setDefinition(definition);
  }-*/;

  /**
   * Sets the id of the segment. This attribute is optional.
   * 
   * @param id Id of the segment.
   */
  public final native void setId(String id) /*-{
    this.setId(id);
  }-*/;

  /**
   * Sets the name of the segment. This attribute is optional.
   * 
   * @param name Name of the segment.
   */
  public final native void setName(String name) /*-{
    this.setName(name);
  }-*/;

  /**
   * Sets the properties.
   * 
   * @param properties Properties, where each property is added
   * using addProperty.
   */
  public final native void setProperties(Property[] properties) /*-{
    this.setProperties(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(properties)
    );
  }-*/;

}