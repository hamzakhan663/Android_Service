package com.example.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.media.MediaPlayer;
import androidx.annotation.Nullable;
import android.widget.Toast;

public class PlayMusic extends Service {
    public PlayMusic() {
    }
MediaPlayer myPlayer;
    @Nullable
    @Override
    public void onCreate(){
        Toast.makeText(this,"Service Created", Toast.LENGTH_LONG).show();

        myPlayer=MediaPlayer.create(this,R.raw.sweet);
        myPlayer.setLooping(false);
    }
    @Override
    public void onStart(Intent intent,int startid){
        Toast.makeText(this,"Service Started", Toast.LENGTH_LONG).show();
        myPlayer.start();
    }
    @Override
    public void onDestroy(){
        Toast.makeText(this,"Service Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }

    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}