package com.example.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup radioGroup;
    String gen="",branch;
    Spinner spinner;
    EditText name,email,phone,rollNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et1);
        email = findViewById(R.id.et2);
        phone = findViewById(R.id.et3);
        rollNo = findViewById(R.id.et4);
        spinner = findViewById(R.id.s1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.branches,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
        radioGroup = (RadioGroup)findViewById(R.id.rg1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.male:

                        gen = "Male";break;
                    case R.id.female:
//                        Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();break;
                        gen = "Female";break;


                }

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        branch = parent.getItemAtPosition(position).toString();
//        Toast.makeText(parent.getContext(),branch, LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void reg(View view) {
        String n,e,p,r,g,b;
        n = name.getText().toString().trim();
        e = email.getText().toString().trim();
        p = phone.getText().toString().trim();
        r = rollNo.getText().toString().trim();
        g = gen;
        b = branch;
//        if(n!="" && e!="" && p!="" && r!="" && g!="" && b!="---"){
//
            Toast.makeText(this,""+n+","+e+","+p+","+r+","+g+","+b,Toast.LENGTH_LONG).show();

//        }else{
//            Toast.makeText(this,"Please fill all the fields", Toast.LENGTH_SHORT).show();
//        }
    }

}
