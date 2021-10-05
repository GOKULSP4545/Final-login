package com.gokulsundar4545.finalloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Privacy extends AppCompatActivity {
    Button Back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        Back_Button=findViewById(R.id.BackButton);


        Back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Privacy.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}