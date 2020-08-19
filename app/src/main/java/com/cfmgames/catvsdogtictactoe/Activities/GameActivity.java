package com.cfmgames.catvsdogtictactoe.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.cfmgames.catvsdogtictactoe.R;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class GameActivity extends AppCompatActivity {

    public AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        adView = new AdView(this, "IMG_16_9_APP_INSTALL#352186359111923_352186625778563", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }

    @Override
    public void onBackPressed(){
        finish();
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    public void placeToken(View view) {

    }
}