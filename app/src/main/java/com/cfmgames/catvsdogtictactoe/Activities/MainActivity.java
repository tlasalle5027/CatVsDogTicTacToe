package com.cfmgames.catvsdogtictactoe.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.cfmgames.catvsdogtictactoe.R;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View easySplashScreenView = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(TitleActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundResource(R.drawable.bg)
                .withFooterText("Copyright 2020")
                .withLogo(R.drawable.cfm_games_logo_transparent_background_small)
                .withAfterLogoText("Presents")
                .create();

        setContentView(easySplashScreenView);
    }
}