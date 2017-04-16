package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChineseDairy2 extends AppCompatActivity {
    Button oonline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_dairy2);
        oonline = (Button) findViewById(R.id.button7);

        oonline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://chefwuchineserestaurant.com"));
                startActivity(intent);
            }
        });
    }
}
