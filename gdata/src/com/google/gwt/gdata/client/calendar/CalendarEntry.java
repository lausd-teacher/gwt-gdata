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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.gdata.client.Where;

/**
 * Describes a Calendar entry in the feed of a user's calendars.
 */
public class CalendarEntry extends com.google.gwt.gdata.client.Entry<CalendarEntry> {

  /**
   * Constructs a Calendar entry using an object parameter whose property names match the setter method to use for each property.
   * 
   * @param params Optional parameters, each of which is used as the sole parameter to the associated setter method: accessLevel, authors, categories, color, content, contributors, hidden, id, links, locations, overrideName, published, selected, summary, timeZone, timesCleaned, title, and updated.
   */
  public static native CalendarEntry newInstance(JavaScriptObject params) /*-{
    return new $wnd.google.gdata.calendar.CalendarEntry(
      params
    );
  }-*/;

  protected CalendarEntry() { }

  /**
   * Adds a new calendar location.
   * 
   * @param location Calendar location to add, or object to use as a parameter to the google.gdata.Where constructor.
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(
      location
    );
  }-*/;

  /**
   * Returns the link that provides the URI of the feed for the access control list for the entry.
   * 
   * @return Link that provides the URI of the feed for the access control list for the entry or undefined for none.
   */
  public final native CalendarLink getAccessControlListLink() /*-{
    return this.getAccessControlListLink();
  }-*/;

  /**
   * Returns the access level property. This element is required.
   * 
   * @return Access level property or undefined for none.
   */
  public final native AccessLevelProperty getAccessLevel() /*-{
    return this.getAccessLevel();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's or feed's contents or undefined for none.
   */
  public final native CalendarLink getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the color property. This element is required.
   * 
   * @return Color property or undefined for none.
   */
  public final native ColorProperty getColor() /*-{
    return this.getColor();
  }-*/;

  /**
   * Returns the eventFeed event feed link.
   * 
   * @return EventFeed event feed link or undefined for none.
   */
  public final native EventFeedLink getEventFeedLink() /*-{
    return this.getEventFeedLink();
  }-*/;

  /**
   * Returns the hidden property. This element is required.
   * 
   * @return Hidden property or undefined for none.
   */
  public final native HiddenProperty getHidden() /*-{
    return this.getHidden();
  }-*/;

  /**
   * Returns the calendar locations.
   * 
   * @return Calendar locations.
   */
  public final native JsArray<Where> getLocations() /*-{
    return this.getLocations();
  }-*/;

  /**
   * Returns the override name property. This element is optional.
   * 
   * @return Override name property or undefined for none.
   */
  public final native OverrideNameProperty getOverrideName() /*-{
    return this.getOverrideName();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry or undefined for none.
   */
  public final native CalendarLink getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Returns the selected property. This element is required.
   * 
   * @return Selected property or undefined for none.
   */
  public final native SelectedProperty getSelected() /*-{
    return this.getSelected();
  }-*/;

  /**
   * Returns the times cleaned property. This element is optional.
   * 
   * @return Times cleaned property or undefined for none.
   */
  public final native TimesCleanedProperty getTimesCleaned() /*-{
    return this.getTimesCleaned();
  }-*/;

  /**
   * Returns the time zone property. This element is optional.
   * 
   * @return Time zone property or undefined for none.
   */
  public final native TimeZoneProperty getTimeZone() /*-{
    return this.getTimeZone();
  }-*/;

  /**
   * Sets the access level property. This element is required.
   */
  public final native void setAccessLevel() /*-{
    this.setAccessLevel();
  }-*/;

  /**
   * Sets the access level property. This element is required.
   * 
   * @param accessLevel Access level property, or object to use as a parameter to the google.gdata.calendar.AccessLevelProperty constructor, or undefined for none.
   */
  public final native void setAccessLevel(AccessLevelProperty accessLevel) /*-{
    this.setAccessLevel(
      accessLevel
    );
  }-*/;

  /**
   * Sets the color property. This element is required.
   */
  public final native void setColor() /*-{
    this.setColor();
  }-*/;

  /**
   * Sets the color property. This element is required.
   * 
   * @param color Color property, or object to use as a parameter to the google.gdata.calendar.ColorProperty constructor, or undefined for none.
   */
  public final native void setColor(ColorProperty color) /*-{
    this.setColor(
      color
    );
  }-*/;

  /**
   * Sets the hidden property. This element is required.
   */
  public final native void setHidden() /*-{
    this.setHidden();
  }-*/;

  /**
   * Sets the hidden property. This element is required.
   * 
   * @param hidden Hidden property, or object to use as a parameter to the google.gdata.calendar.HiddenProperty constructor, or undefined for none.
   */
  public final native void setHidden(HiddenProperty hidden) /*-{
    this.setHidden(
      hidden
    );
  }-*/;

  /**
   * Sets the calendar locations.
   */
  public final native void setLocations() /*-{
    this.setLocations();
  }-*/;

  /**
   * Sets the calendar locations.
   * 
   * @param locations Calendar locations, where each calendar location is added using the addLocation() function, or undefined to clear the calendar locations.
   */
  public final native void setLocations(JsArray<Where> locations) /*-{
    this.setLocations(
      locations
    );
  }-*/;

  /**
   * Sets the override name property. This element is optional.
   */
  public final native void setOverrideName() /*-{
    this.setOverrideName();
  }-*/;

  /**
   * Sets the override name property. This element is optional.
   * 
   * @param overrideName Override name property, or object to use as a parameter to the google.gdata.calendar.OverrideNameProperty constructor, or undefined for none.
   */
  public final native void setOverrideName(OverrideNameProperty overrideName) /*-{
    this.setOverrideName(
      overrideName
    );
  }-*/;

  /**
   * Sets the selected property. This element is required.
   */
  public final native void setSelected() /*-{
    this.setSelected();
  }-*/;

  /**
   * Sets the selected property. This element is required.
   * 
   * @param selected Selected property, or object to use as a parameter to the google.gdata.calendar.SelectedProperty constructor, or undefined for none.
   */
  public final native void setSelected(SelectedProperty selected) /*-{
    this.setSelected(
      selected
    );
  }-*/;

  /**
   * Sets the times cleaned property. This element is optional.
   */
  public final native void setTimesCleaned() /*-{
    this.setTimesCleaned();
  }-*/;

  /**
   * Sets the times cleaned property. This element is optional.
   * 
   * @param timesCleaned Times cleaned property, or object to use as a parameter to the google.gdata.calendar.TimesCleanedProperty constructor, or undefined for none.
   */
  public final native void setTimesCleaned(TimesCleanedProperty timesCleaned) /*-{
    this.setTimesCleaned(
      timesCleaned
    );
  }-*/;

  /**
   * Sets the time zone property. This element is optional.
   */
  public final native void setTimeZone() /*-{
    this.setTimeZone();
  }-*/;

  /**
   * Sets the time zone property. This element is optional.
   * 
   * @param timeZone Time zone property, or object to use as a parameter to the google.gdata.calendar.TimeZoneProperty constructor, or undefined for none.
   */
  public final native void setTimeZone(TimeZoneProperty timeZone) /*-{
    this.setTimeZone(
      timeZone
    );
  }-*/;

}
