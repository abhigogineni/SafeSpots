package com.example.safespots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    Button foodWater;
    TextView titleMenu;
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        titleMenu = (TextView) findViewById(R.id.Title_menu);
        hello = (TextView) findViewById(R.id.hello);
        foodWater = (Button) findViewById(R.id.food_water);

        foodWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_foodwater);
            }
        });
    }
}
