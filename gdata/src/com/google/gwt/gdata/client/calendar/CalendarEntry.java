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

import com.google.gwt.gdata.client.Where;

/**
 * Describes a Calendar entry in the feed of a user's calendars.
 */
public class CalendarEntry
    extends com.google.gwt.gdata.client.Entry<CalendarEntry> {

  /**
   * Constructs a Calendar entry.
   * @return A CalendarEntry object.
   */
  public static native CalendarEntry newInstance() /*-{
    return new $wnd.google.gdata.calendar.CalendarEntry();
  }-*/;

  protected CalendarEntry() { }

  /**
   * Adds a new calendar location.
   * 
   * @param location Calendar location to add.
   */
  public final native void addLocation(Where location) /*-{
    this.addLocation(location);
  }-*/;

  /**
   * Returns the link that provides the URI of the feed for the access control
   * list for the entry.
   * 
   * @return Link that provides the URI of the feed for the access control list
   * for the entry.
   */
  public final native CalendarLink getAccessControlListLink() /*-{
    return this.getAccessControlListLink();
  }-*/;

  /**
   * Returns the access level property. This element is required.
   * 
   * @return Access level property.
   */
  public final native AccessLevelProperty getAccessLevel() /*-{
    return this.getAccessLevel();
  }-*/;

  /**
   * Returns the link that provides the URI of an alternate format of the
   * entry's or feed's contents.
   * 
   * @return Link that provides the URI of an alternate format of the entry's
   * or feed's contents.
   */
  public final native CalendarLink getAtomAlternateLink() /*-{
    return this.getAtomAlternateLink();
  }-*/;

  /**
   * Returns the color property. This element is required.
   * 
   * @return Color property.
   */
  public final native ColorProperty getColor() /*-{
    return this.getColor();
  }-*/;

  /**
   * Returns the eventFeed event feed link.
   * 
   * @return EventFeed event feed link.
   */
  public final native EventFeedLink getEventFeedLink() /*-{
    return this.getEventFeedLink();
  }-*/;

  /**
   * Returns the hidden property. This element is required.
   * 
   * @return Hidden property.
   */
  public final native HiddenProperty getHidden() /*-{
    return this.getHidden();
  }-*/;

  /**
   * Returns mode where the server returns incomplete entries
   * (for which the full metadata could not be retrieved).
   * This attribute is optional.
   * 
   * @return Mode where the server returns incomplete entries
   * (for which the full metadata could not be retrieved).
   */
  public final native boolean getIncomplete() /*-{
    return this.getIncomplete();
  }-*/;

  /**
   * Returns the calendar locations.
   * 
   * @return Calendar locations.
   */
  public final native Where[] getLocations() /*-{
    return @com.google.gwt.gdata.client.impl.ArrayHelper::toArray(Lcom/google/gwt/core/client/JsArray;)(this.getLocations());
  }-*/;

  /**
   * Returns the override name property. This element is optional.
   * 
   * @return Override name property.
   */
  public final native OverrideNameProperty getOverrideName() /*-{
    return this.getOverrideName();
  }-*/;

  /**
   * Returns the link that provides the URI of a related link to the entry.
   * 
   * @return Link that provides the URI of a related link to the entry.
   */
  public final native CalendarLink getRelatedLink() /*-{
    return this.getRelatedLink();
  }-*/;

  /**
   * Returns the selected property. This element is required.
   * 
   * @return Selected property.
   */
  public final native SelectedProperty getSelected() /*-{
    return this.getSelected();
  }-*/;

  /**
   * Returns the times cleaned property. This element is optional.
   * 
   * @return Times cleaned property.
   */
  public final native TimesCleanedProperty getTimesCleaned() /*-{
    return this.getTimesCleaned();
  }-*/;

  /**
   * Returns the time zone property. This element is optional.
   * 
   * @return Time zone property.
   */
  public final native TimeZoneProperty getTimeZone() /*-{
    return this.getTimeZone();
  }-*/;

  /**
   * Sets the access level property. This element is required.
   * 
   * @param accessLevel Access level property.
   */
  public final native void setAccessLevel(AccessLevelProperty accessLevel) /*-{
    this.setAccessLevel(accessLevel);
  }-*/;

  /**
   * Sets the color property. This element is required.
   * 
   * @param color Color property.
   */
  public final native void setColor(ColorProperty color) /*-{
    this.setColor(color);
  }-*/;

  /**
   * Sets the hidden property. This element is required.
   * 
   * @param hidden Hidden property.
   */
  public final native void setHidden(HiddenProperty hidden) /*-{
    this.setHidden(hidden);
  }-*/;

  /**
   * Sets mode where the server returns incomplete entries
   * (for which the full metadata could not be retrieved).
   * This attribute is optional.
   * 
   * @param incomplete Mode where the server returns incomplete entries
   * (for which the full metadata could not be retrieved).
   */
  public final native void setIncomplete(boolean incomplete) /*-{
    this.setIncomplete(incomplete);
  }-*/;

  /**
   * Sets the calendar locations.
   * 
   * @param locations Calendar locations, where each calendar location is
   * added using addLocation().
   */
  public final native void setLocations(Where[] locations) /*-{
    this.setLocations(
      @com.google.gwt.gdata.client.impl.ArrayHelper::fromArray([Lcom/google/gwt/core/client/JavaScriptObject;)(locations)
    );
  }-*/;

  /**
   * Sets the override name property. This element is optional.
   * 
   * @param overrideName Override name property.
   */
  public final native void setOverrideName(
      OverrideNameProperty overrideName) /*-{
    this.setOverrideName(overrideName);
  }-*/;

  /**
   * Sets the selected property. This element is required.
   * 
   * @param selected Selected property.
   */
  public final native void setSelected(SelectedProperty selected) /*-{
    this.setSelected(selected);
  }-*/;

  /**
   * Sets the times cleaned property. This element is optional.
   * 
   * @param timesCleaned Times cleaned property.
   */
  public final native void setTimesCleaned(
      TimesCleanedProperty timesCleaned) /*-{
    this.setTimesCleaned(timesCleaned);
  }-*/;

  /**
   * Sets the time zone property. This element is optional.
   * 
   * @param timeZone Time zone property.
   */
  public final native void setTimeZone(TimeZoneProperty timeZone) /*-{
    this.setTimeZone(timeZone);
  }-*/;
  
}