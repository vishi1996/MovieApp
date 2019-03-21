package com.example.androidprojectmovieapp;

public class Movie {
    private int mImageDrawable;
    private String mName;
    private String mRelease;

    public Movie(int mImageDrawable, String mName, String mRelease) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }

}
