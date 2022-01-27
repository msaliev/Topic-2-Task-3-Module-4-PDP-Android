package com.example.task3hwsecondpptwithpdpinkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.task3hwsecondpptwithpdpinkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        var btnOpenImage = findViewById<Button>(R.id.btnOpenImage)
        btnOpenImage.setOnClickListener {
            openPhotoActivity()

        }
    }
    fun openPhotoActivity(){
        var intent = Intent(this, PhotoActivity::class.java)
        startActivity(intent)
    }
}