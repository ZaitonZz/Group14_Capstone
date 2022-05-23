package com.example.talasalitaan.Controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.talasalitaan.Model.firstbootsystem;
import com.example.talasalitaan.View.main_menu;

public class methods {



    public methods(){
    new firstbootsystem();
}
    public static void onStart
            (firstbootsystem changeScene, TextView txtQ, Button btnNew, Button btnLearn, Button btnNext ,Context context,
             Button btnChavacano, Button btnFilipino,Button btnNo1 ,Button btnYes1, Button btnCebuano , EditText userName, String name, Button btnYes2,Button btnNo2) {
        txtQ.setText("Welcome");
        btnNew.setVisibility(View.INVISIBLE);
        btnLearn.setVisibility(View.INVISIBLE);
        userName.setVisibility(View.INVISIBLE);
        btnChavacano.setVisibility(View.INVISIBLE);
        btnCebuano.setVisibility(View.INVISIBLE);
        btnFilipino.setVisibility(View.INVISIBLE);
        btnNo1.setVisibility(View.INVISIBLE);
        btnYes1.setVisibility(View.INVISIBLE);
        btnNext.setVisibility(View.VISIBLE);
        btnYes2.setVisibility(View.INVISIBLE);
        btnNo2.setVisibility(View.INVISIBLE);
    }



    //TODO Make a methods for buttons all invisible
    public void nextScene(firstbootsystem changeScene, TextView txtQ, Button btnNew, Button btnLearn, Button btnNext, Context context, Button btnChavacano, Button btnFilipino, Button btnNo1 , Button btnYes1, Button btnCebuano , EditText userName, String name,Button btnYes2,Button btnNo2) {
        switch (changeScene.getScene()) {
            case 1:
                txtQ.setText("Loading Profile Data");
                break;
            case 2:
                btnNew.setVisibility(View.VISIBLE);
                btnLearn.setVisibility(View.VISIBLE);
            case 3:
                txtQ.setText("");
                hideNext(btnNext);
                break;
            case 4:
                showNext(btnNext);
                txtQ.setText("Creating New User Profile");
                userName.setVisibility(View.VISIBLE);
                btnNew.setVisibility(View.INVISIBLE);
                btnLearn.setVisibility(View.INVISIBLE);
                if (userName.equals("")) {
                    userName.setText("Unknown");}
                break;
            case 5:
                userName.setVisibility(View.INVISIBLE);
                btnChavacano.setVisibility(View.VISIBLE);
                btnCebuano.setVisibility(View.VISIBLE);
                btnFilipino.setVisibility(View.VISIBLE);
                btnNew.setVisibility(View.INVISIBLE);
                btnLearn.setVisibility(View.INVISIBLE);
                hideNext(btnNext);
                break;
            case 6:
                txtQ.setText("Do you have much time to spend learning?");
                btnChavacano.setVisibility(View.INVISIBLE);
                btnCebuano.setVisibility(View.INVISIBLE);
                btnFilipino.setVisibility(View.INVISIBLE);
                btnNo1.setVisibility(View.VISIBLE);
                btnYes1.setVisibility(View.VISIBLE);
                break;
            case 7:
                btnNo1.setVisibility(View.INVISIBLE);
                btnYes1.setVisibility(View.INVISIBLE);
                txtQ.setText("Had prior experience learning the language?");
                btnNo2.setVisibility(View.VISIBLE);
                btnYes2.setVisibility(View.VISIBLE);
                break;
            case 8:
                Intent intent = new Intent(context, main_menu.class);
                context.startActivity(intent );
                break;






















        }
    }




    public static void showNext(Button btnNext) {
        btnNext.setVisibility(View.VISIBLE);
    }

    public static void hideNext(Button btnNext) {btnNext.setVisibility(View.INVISIBLE);}
}
