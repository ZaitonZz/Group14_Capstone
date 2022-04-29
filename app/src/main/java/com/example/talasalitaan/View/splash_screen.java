package com.example.talasalitaan.View;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.Controller.first_boot_system;
import com.example.talasalitaan.R;

public class splash_screen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;



    Animation splashScreen,  splashScreen2;
    ImageView station, station14 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Log.d(TAG, "onCreate: working");
            setContentView(R.layout.splash_screen);

            splashScreen = AnimationUtils.loadAnimation(this,R.anim.gasstation_anim);
            splashScreen2 = AnimationUtils.loadAnimation(this,R.anim.station14_anim);

            station = findViewById(R.id.gasStation);
            station.setAnimation(splashScreen);

            station14 = findViewById(R.id.station14);
            station14.setAnimation(splashScreen2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (splash_screen.this, first_boot_system.class );
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
