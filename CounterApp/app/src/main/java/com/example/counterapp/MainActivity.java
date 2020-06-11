package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
    }

    public void addOne(View view) {
        if(i<1000){
            i++;
            tv.setText(""+i);
        }else{
            Toast.makeText(this,"You cannot increase more than "+i,Toast.LENGTH_SHORT).show();
        }
    }

    public void subOne(View view) {
        if(i>0){
            i--;
            tv.setText(""+i);
        }else {
            Toast.makeText(this, "You cannot decrease less than " + i, Toast.LENGTH_SHORT).show();
        }
    }

    public void makeItZero(View view) {
        i=0;
        tv.setText(""+i);
        Toast.makeText(this,"Reset Done",Toast.LENGTH_SHORT).show();
    }
}
