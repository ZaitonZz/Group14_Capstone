package com.example.talasalitaan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.R;

public class main_menu extends AppCompatActivity implements View.OnClickListener {

    TextView userProfile;
    Button start, dialectSelect, settings, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userProfile = findViewById(R.id.userprofile_txt);
        start = findViewById(R.id.start_btn);
        dialectSelect = findViewById(R.id.dialectselect_btn);
        settings = findViewById(R.id.settings_btn);
        quit = findViewById(R.id.quit_btn);
        enableFullscreen();
        start.setOnClickListener(this);
        dialectSelect.setOnClickListener(this);
        settings.setOnClickListener(this);
        quit.setOnClickListener(this);
        userProfile.setOnClickListener(this);

}
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //case R.id.start_btn:
              //  startActivity(new Intent(main_menu.this, .class));
           // break;
            case R.id.dialectselect_btn:
                startActivity(new Intent(main_menu.this, dialect_select.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
            case R.id.settings_btn:
                startActivity(new Intent(main_menu.this, settings_screen.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
            case R.id.quit_btn:
                startActivity(new Intent(main_menu.this, exit_confirmation.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
            case R.id.userprofile_txt:
                startActivity(new Intent(main_menu.this, player_profile.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }


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

