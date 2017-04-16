package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItalianPeanuts extends AppCompatActivity {
    Button oonline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_peanuts);
        oonline = (Button) findViewById(R.id.button5);

        oonline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://olivegarden.com/order-online"));
                startActivity(intent);
            }
        });
    }
}
