package com.orbit.alcandroidchallengeone;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button_goto_alc;
    private Button button_goto_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button_goto_profile = (Button) findViewById(R.id.btn_my_profile);
        button_goto_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });

        button_goto_alc = (Button) findViewById(R.id.btn_abt_alc);
        button_goto_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbtAlc();
            }
        });


    }

    private void openMyProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
    private void openAbtAlc() {
        Intent intent2 = new Intent(this, AboutAlc.class);
        startActivity(intent2);
    }}
