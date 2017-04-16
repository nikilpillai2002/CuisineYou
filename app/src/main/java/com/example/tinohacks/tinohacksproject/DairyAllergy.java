package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DairyAllergy extends AppCompatActivity {

    Button icuisine;
    Button chcuisine;
    Button itcuisine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da);
        icuisine= (Button) findViewById(R.id.button1);
        chcuisine = (Button) findViewById(R.id.button2);
        itcuisine = (Button) findViewById(R.id.button3);

       itcuisine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ItalianDairy.class);
                startActivity(intent);
            }

        });

        icuisine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IndianDiary.class);
                startActivity(intent);
            }

        });
        chcuisine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChineseDairy2.class);
                startActivity(intent);
            }

        });
    }
}
