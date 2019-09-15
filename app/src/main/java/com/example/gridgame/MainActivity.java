package com.example.gridgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView viVi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viVi = findViewById(R.id.videoView);

//        Log.i("here", getPackageName() + '/' + R.raw.cover);

        viVi.setVideoPath("android.resource://" + getPackageName() + '/' + R.raw.cover);

        MediaController media = new MediaController(this);

        media.setAnchorView(viVi);

        viVi.setMediaController(media);

        viVi.start();
    }

    public void pause(View view) {
        viVi = findViewById(R.id.videoView);

        if(viVi.isPlaying()) {
            Log.i("Playing", String.valueOf(viVi.isPlaying()));
        }

        Log.i("Here", String.valueOf(viVi.isPlaying()));
        viVi.pause();
    }
}
