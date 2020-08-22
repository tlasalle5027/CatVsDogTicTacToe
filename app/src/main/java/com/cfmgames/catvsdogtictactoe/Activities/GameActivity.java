package com.cfmgames.catvsdogtictactoe.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cfmgames.catvsdogtictactoe.Controller.Board;
import com.cfmgames.catvsdogtictactoe.R;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class GameActivity extends AppCompatActivity {

    public AdView adView;

    public Board gameBoard;

    public boolean twoPlayerGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        twoPlayerGame = getIntent().getBooleanExtra("twoPlayer", false);

        adView = new AdView(this, "IMG_16_9_APP_INSTALL#352186359111923_352186625778563", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

        gameBoard = new Board();
    }

    @Override
    public void onBackPressed(){
        exit();
    }

    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    public void placeToken(View view) {
        Toast.makeText(this, "You placed a token", Toast.LENGTH_SHORT).show();

    }

    public void quitGame(View view){
        exit();
    }

    public void exit(){
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //Cancel
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to return to the title screen?")
                .setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }
}