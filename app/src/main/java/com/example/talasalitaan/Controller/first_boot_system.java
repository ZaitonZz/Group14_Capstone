package com.example.talasalitaan.Controller;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.talasalitaan.Model.firstbootsystem;
import com.example.talasalitaan.R;

public class first_boot_system extends AppCompatActivity implements View.OnClickListener {

    private androidx.constraintlayout.widget.ConstraintLayout myLayout = null;
    private Button btnNext, btnNew, btnLearn, btnFilipino, btnCebuano, btnChavacano, btnYes1, btnNo1, btnYes2, btnNo2;
    private Boolean allowedback;
    int localvar;
    private TextView txtQ;
    firstbootsystem changeScene;
    methods controls;
    static String name;
    String dialect;
    int language;
    int ADS;
    private EditText userName;


    public first_boot_system() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_boot_sytem);
        changeScene = new firstbootsystem();
        controls = new methods();
        language = 0;
        ADS = 5;
        // ID
        btnNew = findViewById(R.id.new_user);
        btnLearn = findViewById(R.id.learn_new);
        userName = findViewById(R.id.user_name);
        btnNext = findViewById(R.id.btn_nxt);
        txtQ = findViewById(R.id.questions);
        btnNo1 = findViewById(R.id.btn_no1);
        btnYes1 = findViewById(R.id.btn_yes1);
        btnNo2 = findViewById(R.id.btn_no2);
        btnYes2 = findViewById(R.id.btn_yes2);
        btnFilipino = findViewById(R.id.filipino);
        btnCebuano = findViewById(R.id.cebuano);
        btnChavacano = findViewById(R.id.chavacano);

        // ONCLICKLISTENER
        btnNew.setOnClickListener(this);
        txtQ.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnLearn.setOnClickListener(this);
        btnFilipino.setOnClickListener(this);
        btnCebuano.setOnClickListener(this);
        btnChavacano.setOnClickListener(this);
        btnNo1.setOnClickListener(this);
        btnYes1.setOnClickListener(this);
        btnNo2.setOnClickListener(this);
        btnYes2.setOnClickListener(this);
    }

    @Override
    protected void onStart(){
    super.onStart();
    methods.onStart(changeScene,  txtQ,  btnNew,btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nxt:
                if (changeScene.getScene()==0){
                    changeScene.setScene(1); Log.d(TAG, "new scene activated");
                }else {
                    changeScene.setScene(changeScene.getScene()+1);}
                    controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);
                break;
            case R.id.user_name:
                name = userName.getText().toString();
                controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);

                break;
            case R.id.new_user:
                changeScene.setScene(4);
                Log.d(TAG, "create new user");
                controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);


                break;
            case R.id.learn_new:
                changeScene.setScene(5);
                Log.d(TAG, "learn new dialect");
                controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);

                break;
            case R.id.cebuano:
                language = 1;
                dialect = ("Cebuano");
                Log.d(TAG, "Cebuano Dialect");
                break;
            case R.id.chavacano:
                language = 2;
                dialect = ("Chavacano");
                Log.d(TAG, "Chavacano Dialect");

                break;
            case R.id.filipino:
                language = 3;
                dialect = ("Filipino");
                Log.d(TAG, "Filipino Dialect");
                break;
            case R.id.btn_no1:
            case R.id.btn_no2:
                changeScene.setScene(changeScene.getScene()+1);
                controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);
        break;
            case R.id.btn_yes1:
            case R.id.btn_yes2:
                ADS +=  1;
                changeScene.setScene(changeScene.getScene()+1);
                controls.nextScene(changeScene,  txtQ,  btnNew, btnLearn,  btnNext , this ,  btnChavacano,  btnFilipino, btnNo1, btnYes1,  btnCebuano ,userName,name, btnYes2,btnNo2);
                break;


        }
    }
    public static String getname() { return name; }
}

