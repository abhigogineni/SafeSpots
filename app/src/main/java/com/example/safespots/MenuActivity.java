package com.example.safespots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleMenu = (TextView) findViewById(R.id.Title_menu);
        TextView hello = (TextView) findViewById(R.id.hello);
        System.out.println(MainActivity.getUser());
        Button medical = (Button) (findViewById(R.id.medicalHelp));
        Button fw = (Button) (findViewById(R.id.fw));
        Button discord = (Button) (findViewById(R.id.discord));
        Button custom  = (Button) (findViewById(R.id.custom));


        medical.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_medical_help);
            }
        });
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_medical_help);
            }
        });
        fw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_foodwater);
            }
        });
        discord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_discord_info);
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_custom_menu);
            }
        });
    }
}
