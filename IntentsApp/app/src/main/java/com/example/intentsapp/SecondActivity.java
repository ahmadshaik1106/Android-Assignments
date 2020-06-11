package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tv);
        String name = getIntent().getStringExtra("key");
//        Toast.makeText(this,"passage1",Toast.LENGTH_SHORT).show();
        tv.setText("Hi "+name);
    }
}
