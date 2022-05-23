package com.example.talasalitaan.View;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.R;

public class pause_screen extends AppCompatActivity {

    private Button btnResume, btnSettings, btnMainMenu, btnExitGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause_screen);
        enableFullscreen();
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .25), (int) (height * .7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
        btnResume = (Button) findViewById(R.id.btn_Resume);
        btnResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed(); }});
        getWindow().setAttributes(params);
        btnSettings = (Button) findViewById(R.id.btn_settings_ingame);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pause_screen.this, com.example.talasalitaan.View.settings_screen.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }});
        getWindow().setAttributes(params);
        btnMainMenu = (Button) findViewById(R.id.btn_MainMenu);
        btnMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pause_screen.this, com.example.talasalitaan.View.main_menu_confirmation.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

            }
        });
        btnExitGame = (Button) findViewById(R.id.btn_Exit2);
        btnExitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(pause_screen.this, com.example.talasalitaan.View.exit_confirmation.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

            }
        });
    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}
