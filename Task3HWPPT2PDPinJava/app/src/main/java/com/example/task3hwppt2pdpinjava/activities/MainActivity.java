package com.example.task3hwppt2pdpinjava.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.task3hwppt2pdpinjava.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button btnOpenImage = findViewById(R.id.btnOpenImage);
        btnOpenImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenPhotoActivity();
            }
        });
    }
    void OpenPhotoActivity(){
        Intent intent = new Intent(this, PhotoActivity.class);
        startActivity(intent);
    }
}