package com.example.android.musicalstructureapp.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by ChadYeo on 11/24/16.
 */
public class MediaPlayerService extends Service implements MediaPlayer.OnPreparedListener {

    private static final String ACTION_PLAY = "com.exmple.action.PLAY";
    MediaPlayer mMediaPlayer= null;

    public int onStartCommand(Intent intent, int flags, int startId) {
        return startId;
    }

    @Override
    public void onPrepared(android.media.MediaPlayer player) {
        player.start();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
