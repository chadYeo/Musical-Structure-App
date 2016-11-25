package com.example.android.musicalstructureapp.utilis;

/**
 * Created by ChadYeo on 11/25/16.
 */
public class Artist {
    private String mArtistName;
    private Song[] mSongs;
    private Albaum[] mAlbaums;

    public Artist(String artistName, Song[] songs, Albaum[] albaums) {
        mArtistName = artistName;
        mSongs = songs;
        mAlbaums = albaums;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public Song[] getSongs() {
        return mSongs;
    }

    public void setSongs(Song[] songs) {
        mSongs = songs;
    }

    public String[] getSongNames() {
        int len = mAlbaums.length;
        String[] songNames = new String[len];
        for (int i=0; i<len; i++) {
            songNames[i] = mSongs[i].getName();
        }
        return songNames;
    }

    public Albaum[] getAlbaums() {
        return mAlbaums;
    }

    public void setAlbaums(Albaum[] albaums) {
        mAlbaums = albaums;
    }

    public String[] getAlbaumNames() {
        int len = mAlbaums.length;
        String[] albaumNames = new String[len];
        for (int i=0; i<len; i++) {
            albaumNames[i] = mAlbaums[i].getAlbaumName();
        }
        return albaumNames;
    }
}
