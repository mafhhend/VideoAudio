package com.example.videoaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Audio extends AppCompatActivity {
    Button audio_start;
    Button audio_pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        audio_start=findViewById(R.id.audio_start);
        audio_pause=findViewById(R.id.audio_pause);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.banner);
        audio_start.setOnClickListener(view -> {
            mediaPlayer.start();
        });
        audio_pause.setOnClickListener(view -> {
            mediaPlayer.pause();
        });
    }
}