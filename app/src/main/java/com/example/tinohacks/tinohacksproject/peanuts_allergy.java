package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class peanuts_allergy extends AppCompatActivity {
    Button jcuisine;
    Button icuisineP;
    Button chcuisineP;
    Button itcuisineP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa);
        //jcuisine= (Button) findViewById(R.id.japanese);
        icuisineP= (Button) findViewById(R.id.indian);
        chcuisineP = (Button) findViewById(R.id.Chinese);
        itcuisineP = (Button) findViewById(R.id.Italian);
        itcuisineP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ItalianPeanuts.class);
                startActivity(intent);
            }

        });

        icuisineP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IndianPeanuts.class);
                startActivity(intent);
            }

        });

        chcuisineP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChinesePeanut.class);
                startActivity(intent);
            }

        });

    }
}
