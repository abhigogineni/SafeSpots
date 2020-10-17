package com.example.safespots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}
