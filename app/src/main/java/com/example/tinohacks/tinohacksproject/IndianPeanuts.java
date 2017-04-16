package com.example.tinohacks.tinohacksproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndianPeanuts extends AppCompatActivity {
    Button india;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_peanuts);
        india = (Button) findViewById(R.id.button11);

        india.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://samraatcurryhutonline.com"));
                startActivity(intent);
            }
        });
    }
}
