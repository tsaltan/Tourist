package com.example.android.tourist;

import android.content.Intent;

/**
 * Class for holding country images and names
 */

public class City {

    int mImageId;
    String mName;

    public City(String name, int imageId) {
        mImageId = imageId;
        mName = name;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getName () {
        return mName;
    }

}
