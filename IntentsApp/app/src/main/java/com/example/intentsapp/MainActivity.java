package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoPassge1(View view) {
        String n="Hii";
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",this.getString(R.string.p1));
        startActivity(i);
        Toast.makeText(this,"passage1",Toast.LENGTH_SHORT).show();

    }

    public void gotoPassge2(View view) {
        String n="Hii";
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",this.getString(R.string.p2));
        startActivity(i);
        Toast.makeText(this,"passage2",Toast.LENGTH_SHORT).show();
    }

    public void gotoPassge3(View view) {
        String n="Hii";
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",this.getString(R.string.p3));
        startActivity(i);
        Toast.makeText(this,"passage3",Toast.LENGTH_SHORT).show();
    }
}
