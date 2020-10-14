package com.example.myfirstbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton ibold, ibnew;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibold = findViewById(R.id.imageButtonOld);
        ibnew = findViewById(R.id.imageButtonNew);
        ibold.setOnClickListener(this);
        ibnew.setOnClickListener(this);
        /*button = findViewById(R.id.btnDoMagic);
        button.setOnClickListener(this);*/
    }


    @Override
    public void onClick(View view) {
        /**if(view == button){
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }*/
        if(view == ibold){
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        else if(view == ibnew){
            Intent intent = new Intent(this,New.class);
            startActivity(intent);
        }
    }
}