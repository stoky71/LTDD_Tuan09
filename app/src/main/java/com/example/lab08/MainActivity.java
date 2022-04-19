package com.example.lab08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button signbtn = findViewById(R.id.SignInBtn);
        Button regisbtn = findViewById(R.id.RegisterBtn);

        signbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open1();
            }
        });
        regisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2();
            }
        });
    }


    public void open1() {
        Intent intent = new Intent(MainActivity.this, SignIn.class);
        startActivity(intent);
    }

    public void open2() {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }

}