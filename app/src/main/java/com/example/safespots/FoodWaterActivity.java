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
        Button isQuarantined = (Button)(findViewById(R.id.isQuarantined));
        Button isNotQuarantined = (Button)(findViewById(R.id.isNotQuarantined));
        TextView textViewQuarantined = (TextView) findViewById(R.id.text_is_Quarantined);
        EditText textViewName = (EditText) findViewById(R.id.nameInput);
        TextView textViewTitle = (TextView) findViewById(R.id.Title_main);
    }


}
