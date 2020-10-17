package com.example.safespots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create user
        EditText textViewName = (EditText) findViewById(R.id.nameInput);
        EditText textViewAge = (EditText) findViewById(R.id.age_year_Input);
        //enter user
        Button isQuarantined = (Button)(findViewById(R.id.isQuarantined));
        isQuarantined.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_menu);
            }
        });
        Button isNotQuarantined = (Button)(findViewById(R.id.isNotQuarantined));
        TextView textViewQuarantined = (TextView) findViewById(R.id.text_is_Quarantined);
        TextView textViewTitle = (TextView) findViewById(R.id.Title_main);
    }


}
