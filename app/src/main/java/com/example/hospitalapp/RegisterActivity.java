package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    EditText et3,et4,et5,et6,et7,et8,et9;
    Button b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        et3=(EditText) findViewById(R.id.name1);
        et4=(EditText) findViewById(R.id.address);
        et5=(EditText) findViewById(R.id.pin);
        et6=(EditText) findViewById(R.id.un1);
        et7=(EditText) findViewById(R.id.ph);
        et8=(EditText) findViewById(R.id.pass1);
        et9=(EditText) findViewById(R.id.pass2);

        b3=(Button) findViewById(R.id.reg1);
        b4=(Button) findViewById(R.id.log1);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob1);
            }
        });
    }
}