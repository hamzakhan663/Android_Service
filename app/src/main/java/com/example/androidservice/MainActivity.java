package com.example.androidservice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button buttonStart, buttonStop, buttonNext, playVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.start);
        buttonStop = findViewById(R.id.stop);
        buttonNext = findViewById(R.id.next);
        playVideo = findViewById(R.id.playvideo);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(), PlayMusic.class));
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(), PlayMusic.class));
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), NextActivity.class);
                startActivity(intent);
            }
        });
        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), PlayVideo.class);
                startActivity(intent);
            }
        });
    }
}