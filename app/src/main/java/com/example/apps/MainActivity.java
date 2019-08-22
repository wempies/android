package com.example.apps;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scwang.wave.MultiWaveHeader;

public class MainActivity extends AppCompatActivity {
    MultiWaveHeader waveHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waveHeader = findViewById(R.id.wave_header);

        waveHeader.setVelocity(1);
        waveHeader.setProgress(1);
        waveHeader.isRunning();
        waveHeader.setGradientAngle(50);
        waveHeader.setWaveHeight(45);
        waveHeader.setStartColor(Color.YELLOW);
        waveHeader.setCloseColor(Color.MAGENTA);

    }
}
