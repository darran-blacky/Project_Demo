package com.example.dblackweir.project_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton soccer = (ImageButton) findViewById(R.id.soccer_button);
        Button ufc = (Button) findViewById(R.id.ufc_button);
        ImageButton rugby = (ImageButton) findViewById(R.id.rugby_button);


        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Loading Soccer data", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, SoccerRss.class);
                startActivity(myIntent);


            }
        });
        ufc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Loading UFC data", Toast.LENGTH_SHORT).show();


            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Loading Rugby data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
