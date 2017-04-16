package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EggAllergy extends AppCompatActivity {
    Button jcuisine;
    Button icuisineE;
    Button chcuisineE;
    Button itcuisineE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea);
        //jcuisine= (Button) findViewById(R.id.japanese);
        icuisineE= (Button) findViewById(R.id.button11);
        chcuisineE = (Button) findViewById(R.id.button13);
        itcuisineE = (Button) findViewById(R.id.button14);
        itcuisineE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                assert view != null;
                Intent intent = new Intent(getApplicationContext(), ItalianEgg.class);
                startActivity(intent);
            }

        });
        icuisineE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IndianEgg.class);
                startActivity(intent);
            }

        });
        chcuisineE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chinese_Egg.class);
                startActivity(intent);
            }

        });
    }
}
