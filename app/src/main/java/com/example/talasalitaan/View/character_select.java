package com.example.talasalitaan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.R;

public class character_select extends AppCompatActivity implements View.OnClickListener {

    TextView back3;
    ImageButton wizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_select_screen);

        back3 = findViewById(R.id.btn_BACK3);
        wizard = findViewById(R.id.imageButton2);
        wizard.setOnClickListener(this);
        back3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.imageButton2:


            break;

            case R.id.btn_BACK3:
                startActivity(new Intent(character_select.this, dialect_select.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
    }
}
