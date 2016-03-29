package com.example.dblackweir.project_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mblackweir on 22/03/2016.
 */
public class SoccerRss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soccer_rss);


        Button home = (Button) findViewById(R.id.button_home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Home selected", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(SoccerRss.this, MainActivity.class);
                SoccerRss.this.startActivity(myIntent);


            }
        });
    }
}