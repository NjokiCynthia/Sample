package com.example.false_phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMessage = findViewById(R.id.textMessage);

        if (getIntent().getData()!= null){
textMessage.setText(getIntent().getData().toString());
        }
        else {
            textMessage.setText("No data received!");
        }
    }
}
