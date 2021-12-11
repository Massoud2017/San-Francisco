/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param words           is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public LocationAdapter(Context context, ArrayList<Location> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Location currentlocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version name from the current location object and
        // set this text on the name TextView
        locationTextView.setText(currentlocation.getlocationsName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.location_text_view_info);
        // Get the version number from the location object and
        // set this text on the number TextView
        defaultTextView.setText(currentlocation.getInfolocation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song);
        // Get the image resource ID from the current  location object and
        // set the image to iconView
        iconView.setImageResource(currentlocation.getImageResourceId());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        // Get the version name from the current location object and
        // set this text on the name TextView
        phoneTextView.setText(currentlocation.getPhoneNumber());

        TextView mapTextView = (TextView) listItemView.findViewById(R.id.map_text_view);
        // Get the version name from the current location object and
        // set this text on the name TextView
        mapTextView.setText(currentlocation.getAddress());


        ImageView contactImage = (ImageView) listItemView.findViewById(R.id.contact_text_view);
        // Get the image resource ID from the current location object and
        // set the image to iconView
        contactImage.setImageResource(currentlocation.getContactImage());

        ImageView mapImage = (ImageView) listItemView.findViewById(R.id.map_view);
        // Get the image resource ID from the current location object and
        // set the image to iconView
        mapImage.setImageResource(currentlocation.getMapImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
        // Get the {@link Word} object located at this position in the list
    }
}