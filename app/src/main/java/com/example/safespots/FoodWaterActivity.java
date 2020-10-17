package com.example.safespots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FoodWaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView foodWaterTitle = (TextView) findViewById(R.id.foodwater);
        Button food = (Button) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_water_preparing);
            }
        });
        Button water = (Button) findViewById(R.id.h20);
        water.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_water_preparing);
            }
        });
    }


}
