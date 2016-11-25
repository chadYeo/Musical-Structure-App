package com.example.android.musicalstructureapp.utilis;

/**
 * Created by ChadYeo on 11/24/16.
 */
public class Albaum {
    private String mAlbaumName;
    private Song[] mSongs;

    public Albaum(String albaumName, Song[] songs) {
        mAlbaumName = albaumName;
        mSongs = songs;
    }

    public String getAlbaumName() {
        return mAlbaumName;
    }

    public void setAlbaumName(String albaumName) {
        mAlbaumName = albaumName;
    }

    public Song[] getSongs(Song[] songs) {
        return mSongs;
    }

    public void setSongs(Song[] songs) {
        mSongs = songs;
    }

    public String[] getSongNames() {
        int len = mSongs.length;
        String[] songNames = new String[len];
        for (int i=0; i<len; i++) {
            songNames[i] = mSongs[i].getName();
        }
        return songNames;
    }
}
