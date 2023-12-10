package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class PartTimeStudentActivity : AppCompatActivity() {
    private lateinit var studentPartTimeSignUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_time_student)

        studentPartTimeSignUpButton = findViewById(R.id.buttonPartTime)

        studentPartTimeSignUpButton.setOnClickListener{
            Log.i("TAG", "Sign Up button was Clicked!")
            val intent = Intent(this, StudentSignUpActivity::class.java)
            startActivity(intent)
        }
    }
}