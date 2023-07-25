package com.example.androidservice;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.Bundle;

public class PlayVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        VideoView videoView =findViewById(R.id.videoView);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.myvideo);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}