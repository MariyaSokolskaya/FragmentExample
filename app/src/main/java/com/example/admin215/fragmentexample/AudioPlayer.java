package com.example.admin215.fragmentexample;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.admin215.fragmentexample.R;

/**
 * Created by Admin215 on 28.12.2017.
 */

public class AudioPlayer {
    private MediaPlayer mediaPlayer;
    public  void stop(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    public void play(Context context){
        stop();
        mediaPlayer = MediaPlayer.create(context, R.raw.new_year_music);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });
        mediaPlayer.start();
    }
}
