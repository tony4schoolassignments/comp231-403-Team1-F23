package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class AdminActivity : AppCompatActivity() {

    private lateinit var studentFullTimeSignUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        studentFullTimeSignUpButton = findViewById(R.id.buttonFullTime)

        systemAnalytics = findViewById(R.id.buttonSystemAnalytics)
        systemSettings = findViewById(R.id.buttonSystemSettings)

        systemAnalytics.setOnClickListener{
            val intent = Intent(this, AdminActivity::class.java)
            startActivity(intent)
        }


        systemSettings.setOnClickListener{
            val intent = Intent(this, AdminActivity::class.java)
            startActivity(intent)
        }

    }
}