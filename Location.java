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

/**
 * {@link Location} represents locations.
 * It contains resource IDs for the location, and
 * optional image file for that word.
 */
public class Location {

    /**
     * String resource ID for the default translation of the word
     */
    private String locationsName;
    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private String infolocation;

    private int ContactImage;

    private String PhoneNumber;

    private int MapImage;

    private String Address;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param imageResourceId is the string resource Id for the word in the Miwok language
     */
    public Location(String locationsName, int imageResourceId) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;

    }

    /**
     * Create a new Word object.
     *
     * @param locationsName   is the string resource ID for the word in a language that the
     *                        user is already familiar with (such as English)
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Location(String locationsName, int imageResourceId, String infolocation) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;
        this.infolocation = infolocation;
    }

    public Location(String locationsName, int imageResourceId, String infolocation, int ContactImage) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;
        this.infolocation = infolocation;
        this.ContactImage = ContactImage;
    }

    public Location(String locationsName, int imageResourceId, String infolocation, int ContactImage, String PhoneNumber) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;
        this.infolocation = infolocation;
        this.ContactImage = ContactImage;
        this.PhoneNumber = PhoneNumber;
    }

    public Location(String locationsName, int imageResourceId, String infolocation, int ContactImage, String PhoneNumber, int MapImage) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;
        this.infolocation = infolocation;
        this.ContactImage = ContactImage;
        this.PhoneNumber = PhoneNumber;
        this.MapImage = MapImage;
    }

    public Location(String locationsName, int imageResourceId, String infolocation, int ContactImage, String PhoneNumber, int MapImage, String Address) {
        this.locationsName = locationsName;
        mImageResourceId = imageResourceId;
        this.infolocation = infolocation;
        this.ContactImage = ContactImage;
        this.PhoneNumber = PhoneNumber;
        this.MapImage = MapImage;
        this.Address = Address;
    }

    /**
     * Get the string resource ID for the default location name.
     */
    public String getlocationsName() {
        return locationsName;
    }

    /**
     * Return the image resource ID of location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getInfolocation() {
        return infolocation;
    }

    public int getContactImage() {
        return ContactImage;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getMapImage() {
        return MapImage;
    }

    public String getAddress() {
        return Address;
    }
}