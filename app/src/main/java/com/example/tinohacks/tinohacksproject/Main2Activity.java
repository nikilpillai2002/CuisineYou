package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button pa;
    Button da;
    Button ea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pa = (Button) findViewById(R.id.button1);
        da= (Button) findViewById(R.id.dabutton);
        ea = (Button) findViewById(R.id.eabutton);

        pa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), peanuts_allergy.class);
                startActivity(intent);
            }

        });
        da.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DairyAllergy.class);
                startActivity(intent);
            }

        });
        ea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EggAllergy.class);
                startActivity(intent);
            }

        });

    }
}
