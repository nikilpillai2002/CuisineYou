package com.example.tinohacks.tinohacksproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class allergyentry extends AppCompatActivity{

    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userName = (EditText) findViewById(R.id.username);
        //String name = userName.getText().toString();
    }
}
