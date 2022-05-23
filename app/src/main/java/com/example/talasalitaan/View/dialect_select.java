package com.example.talasalitaan.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talasalitaan.R;

public class dialect_select extends AppCompatActivity implements View.OnClickListener {


    Button tagalog, chabacano, bisaya;
    TextView charSelect, back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialect_screen);

        tagalog = findViewById(R.id.chooseTagalog);
        chabacano = findViewById(R.id.chooseChabacano);
        bisaya = findViewById(R.id.chooseBisaya);
        charSelect = findViewById(R.id.charSelect);
        back2 = findViewById(R.id.btn_BACK2);
        charSelect.setOnClickListener(this);
        back2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.charSelect:
                startActivity(new Intent(dialect_select.this, character_select.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
            case R.id.btn_BACK2:
                startActivity(new Intent(dialect_select.this, main_menu.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
    }
}
