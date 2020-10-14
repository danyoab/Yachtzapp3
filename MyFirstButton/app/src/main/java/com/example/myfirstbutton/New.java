package com.example.myfirstbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.*;

public class New extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    Button backb, btn;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txt = (TextView) findViewById(R.id.mytext);
        btn = (Button) findViewById(R.id.mybutton);
        backb = (Button) findViewById(R.id.button3);
        backb.setOnClickListener(this);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.mybutton:
                        if (i == 0)
                        { Toast toast = Toast.makeText(getApplicationContext(),
                                "התחל...",
                                Toast.LENGTH_SHORT);

                            toast.setGravity(TOP| LEFT, 800, 100);
                            toast.show();

                            { Toast toast2 = Toast.makeText(getApplicationContext(),
                                    "הצפנה...",
                                    Toast.LENGTH_SHORT);

                                toast2.setGravity(TOP| LEFT, 800, 100);
                                toast2.show();}


                            i++;}

                         else if (i == 1) {
                            txt.setText("");
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Power Off",
                                    Toast.LENGTH_SHORT);
                            toast.setGravity(TOP| LEFT, 800, 100);
                            toast.show(); i=i-1;}
                        break;


                }
            }


        });



    }

    @Override
    public void onClick(View view) {finish();}
}