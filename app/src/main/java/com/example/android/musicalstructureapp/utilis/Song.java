package com.example.android.musicalstructureapp.utilis;

/**
 * Created by ChadYeo on 11/24/16.
 */
public class Song {
    private String mName;
    private String mArtist;
    private String mAlbaum;

    public Song (String name, String artist, String albaum) {
        this.mName = name;
        this.mArtist = artist;
        this.mAlbaum = albaum;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }
    public String getArtist() {
        return mArtist;
    }

    public void setAlbaum(String albaum) {
        mAlbaum = albaum;
    }

    public String getAlbaum() {
        return mAlbaum;
    }
}
