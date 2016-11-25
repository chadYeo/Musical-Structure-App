package com.example.android.musicalstructureapp.utilis;

/**
 * Created by ChadYeo on 11/25/16.
 */
public class Playlist {
    private String mPlaylistName;
    private Song[] mSongs;

    public Playlist(String playListName, Song[] songs) {
        mPlaylistName = playListName;
        mSongs = songs;
    }

    public String getPlaylistName() {
        return mPlaylistName;
    }

    public void setPlaylistName(String playlistName) {
        mPlaylistName = playlistName;
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
