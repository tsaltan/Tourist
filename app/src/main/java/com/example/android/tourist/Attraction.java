package com.example.android.tourist;

/**
 * Created by alicantipi on 26.11.17.
 */

public class Attraction {
    String mName, mInfo, mRating, mDistance;
    int mImageId;



    public Attraction(String name, String info, String rating, String distance, int imageId ){
        mName=name;
        mInfo=info;
        mRating=rating;
        mDistance=distance;
        mImageId=imageId;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmName() {
        return mName;
    }

    public String getmInfo() {
        return mInfo;
    }

    public String getmRating() {
        return mRating;
    }

    public String getmDistance() {
        return mDistance;
    }
}
