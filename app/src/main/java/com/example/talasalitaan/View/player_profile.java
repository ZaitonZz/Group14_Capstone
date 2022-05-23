package com.example.talasalitaan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.R;

public class player_profile extends AppCompatActivity implements View.OnClickListener {

    TextView back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_profile_screen);

        back4 = findViewById(R.id.btn_BACK4);
        back4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_BACK4:
                startActivity(new Intent(player_profile.this, main_menu.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                break;
        }
    }
}
