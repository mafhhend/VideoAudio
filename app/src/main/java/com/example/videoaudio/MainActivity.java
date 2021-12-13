package com.example.videoaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button video_btn;
    Button audio_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video_btn=findViewById(R.id.btn_video);
        audio_btn=findViewById(R.id.btn_audio);
        video_btn.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,video.class);
            startActivity(intent);
        });
        audio_btn.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,Audio.class);
            startActivity(intent);
        });
    }
}