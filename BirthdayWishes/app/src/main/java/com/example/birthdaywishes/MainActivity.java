package com.example.birthdaywishes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.birthdaywishes.R.drawable.bday;

public class MainActivity extends AppCompatActivity {
    EditText et;
    LinearLayout l;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.name);
        l = findViewById(R.id.l);
        t=findViewById(R.id.t);
    }

    public void toastIt(View view) {
        String name = et.getText().toString();
        l.setBackground(ContextCompat.getDrawable(this,R.drawable.bday3));
        Toast.makeText(this,"Happy Birthday "+name,Toast.LENGTH_SHORT).show();
        et.setText("");
        t.setText("Happy Birthday "+name);


    }
}
