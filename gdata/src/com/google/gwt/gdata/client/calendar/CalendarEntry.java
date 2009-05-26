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

package com.google.gwt.gdata.client.calendar;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.gdata.client.Where;

/**
 * Comment unavailable.
 */
public class CalendarEntry extends com.google.gwt.gdata.client.Entry {

  /**
   * Retrieves the constructor for underlying JavaScript object.
   */
  public static native JavaScriptObject getConstructor() /*-{
    return $wnd.google.gdata.calendar.CalendarEntry;
  }-*/;

  /**
   * Constructs a Calendar entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarEntry(
      params
    );
  }-*/;

  /**
   * Constructs a Calendar entry using an object parameter whose property names match the setter method to use for each property.
   */
  public static native CalendarEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEntry();
  }-*/;

  protected CalendarEntry() { }

  /**
   * Adds a new calendar location.
   * 
   * @param location
   */
  public final native void addLocation(JavaScriptObject location) /*-{
    this.addLocation(
      location
    );
  }-*/;

  /**
   * Adds a new calendar location.
   * 
   * @param location
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(
      location
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the feed for the access control list for the entry.
   * 
   * @return
   */
  public final native CalendarLink getAccessControlListLink() /*-{
    return this.getAccessControlListLink();
  }-*/;

  /**
   * Returns the access level property.
   * 
   * @return
   */
  public final native AccessLevelProperty getAccessLevel() /*-{
    return this.getAccessLevel();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entrys or feeds contents.
   * 
   * @return
   */
  public final native CalendarLink getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the color property.
   * 
   * @return
   */
  public final native ColorProperty getColor() /*-{
    return this.getColor();
  }-*/;

  /**
   * Returns the hidden property.
   * 
   * @return
   */
  public final native HiddenProperty getHidden() /*-{
    return this.getHidden();
  }-*/;

  /**
   * Returns the calendar locations.
   * 
   * @return
   */
  public final native Where[] getLocations() /*-{
    return this.getLocations();
  }-*/;

  /**
   * Returns the override name property.
   * 
   * @return
   */
  public final native OverrideNameProperty getOverrideName() /*-{
    return this.getOverrideName();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return
   */
  public final native CalendarLink getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Returns the selected property.
   * 
   * @return
   */
  public final native SelectedProperty getSelected() /*-{
    return this.getSelected();
  }-*/;

  /**
   * Returns the times cleaned property.
   * 
   * @return
   */
  public final native TimesCleanedProperty getTimesCleaned() /*-{
    return this.getTimesCleaned();
  }-*/;

  /**
   * Returns the time zone property.
   * 
   * @return
   */
  public final native TimeZoneProperty getTimeZone() /*-{
    return this.getTimeZone();
  }-*/;

  /**
   * Sets the access level property.
   * 
   * @param accessLevel
   */
  public final native void setAccessLevel(JavaScriptObject accessLevel) /*-{
    this.setAccessLevel(
      accessLevel
    );
  }-*/;

  /**
   * Sets the access level property.
   * 
   * @param accessLevel
   */
  public final native void setAccessLevel() /*-{
    this.setAccessLevel();
  }-*/;

  /**
   * Sets the access level property.
   * 
   * @param accessLevel
   */
  public final native void setAccessLevel(AccessLevelProperty accessLevel) /*-{
    this.setAccessLevel(
      accessLevel
    );
  }-*/;

  /**
   * Sets the color property.
   * 
   * @param color
   */
  public final native void setColor(JavaScriptObject color) /*-{
    this.setColor(
      color
    );
  }-*/;

  /**
   * Sets the color property.
   * 
   * @param color
   */
  public final native void setColor() /*-{
    this.setColor();
  }-*/;

  /**
   * Sets the color property.
   * 
   * @param color
   */
  public final native void setColor(ColorProperty color) /*-{
    this.setColor(
      color
    );
  }-*/;

  /**
   * Sets the hidden property.
   * 
   * @param hidden
   */
  public final native void setHidden(JavaScriptObject hidden) /*-{
    this.setHidden(
      hidden
    );
  }-*/;

  /**
   * Sets the hidden property.
   * 
   * @param hidden
   */
  public final native void setHidden() /*-{
    this.setHidden();
  }-*/;

  /**
   * Sets the hidden property.
   * 
   * @param hidden
   */
  public final native void setHidden(HiddenProperty hidden) /*-{
    this.setHidden(
      hidden
    );
  }-*/;

  /**
   * Sets the calendar locations.
   * 
   * @param locations
   */
  public final native void setLocations(JavaScriptObject[] locations) /*-{
    this.setLocations(
      locations
    );
  }-*/;

  /**
   * Sets the calendar locations.
   * 
   * @param locations
   */
  public final native void setLocations() /*-{
    this.setLocations();
  }-*/;

  /**
   * Sets the calendar locations.
   * 
   * @param locations
   */
  public final native void setLocations(Where[] locations) /*-{
    this.setLocations(
      locations
    );
  }-*/;

  /**
   * Sets the override name property.
   * 
   * @param overrideName
   */
  public final native void setOverrideName(JavaScriptObject overrideName) /*-{
    this.setOverrideName(
      overrideName
    );
  }-*/;

  /**
   * Sets the override name property.
   * 
   * @param overrideName
   */
  public final native void setOverrideName() /*-{
    this.setOverrideName();
  }-*/;

  /**
   * Sets the override name property.
   * 
   * @param overrideName
   */
  public final native void setOverrideName(OverrideNameProperty overrideName) /*-{
    this.setOverrideName(
      overrideName
    );
  }-*/;

  /**
   * Sets the selected property.
   * 
   * @param selected
   */
  public final native void setSelected(JavaScriptObject selected) /*-{
    this.setSelected(
      selected
    );
  }-*/;

  /**
   * Sets the selected property.
   * 
   * @param selected
   */
  public final native void setSelected() /*-{
    this.setSelected();
  }-*/;

  /**
   * Sets the selected property.
   * 
   * @param selected
   */
  public final native void setSelected(SelectedProperty selected) /*-{
    this.setSelected(
      selected
    );
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned(JavaScriptObject timesCleaned) /*-{
    this.setTimesCleaned(
      timesCleaned
    );
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned() /*-{
    this.setTimesCleaned();
  }-*/;

  /**
   * Sets the times cleaned property.
   * 
   * @param timesCleaned
   */
  public final native void setTimesCleaned(TimesCleanedProperty timesCleaned) /*-{
    this.setTimesCleaned(
      timesCleaned
    );
  }-*/;

  /**
   * Sets the time zone property.
   * 
   * @param timeZone
   */
  public final native void setTimeZone(JavaScriptObject timeZone) /*-{
    this.setTimeZone(
      timeZone
    );
  }-*/;

  /**
   * Sets the time zone property.
   * 
   * @param timeZone
   */
  public final native void setTimeZone() /*-{
    this.setTimeZone();
  }-*/;

  /**
   * Sets the time zone property.
   * 
   * @param timeZone
   */
  public final native void setTimeZone(TimeZoneProperty timeZone) /*-{
    this.setTimeZone(
      timeZone
    );
  }-*/;

}