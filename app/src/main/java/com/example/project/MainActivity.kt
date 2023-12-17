package com.example.project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.project.R.*
import com.example.project.R.id.btn_student_sign_up

class MainActivity : AppCompatActivity() {

    private lateinit var studentSignUpButton: Button
    private lateinit var studentFullTimeSignUpButton: Button
    private lateinit var studentPartTimeSignUpButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        Toast.makeText(this,getString(string.welcome_message), Toast.LENGTH_SHORT).show()

        // Get the widgets reference from XML layout
        val imageCourseLogo = findViewById<ImageView>(R.id.image_course_logo)

        // Display an image on image view from resource
        imageCourseLogo.setImageResource(drawable.course_logo)

        studentSignUpButton = findViewById(btn_student_sign_up)
        adminSignUpButton = findViewById(btn_admin_sign_up)
        studentFullTimeSignUpButton= findViewById(id.buttonFullTime)
        studentPartTimeSignUpButton= findViewById(id.buttonPartTime)


        // Log message and Display sign up screen
        studentSignUpButton.setOnClickListener{
            Log.i("TAG", "Sign Up button was Clicked!")
            val intent = Intent(this, StudentSignUpActivity::class.java)
            startActivity(intent)
        }

        studentFullTimeSignUpButton.setOnClickListener{
            Log.i("TAG", "Sign Up button was Clicked!")
            val intent = Intent(this, StudentSignUpActivity::class.java)
            startActivity(intent)
        }

        studentPartTimeSignUpButton.setOnClickListener{
            Log.i("TAG", "Sign Up button was Clicked!")
            val intent = Intent(this, StudentSignUpActivity::class.java)
            startActivity(intent)
        }

        adminSignUpButton.setOnClickListener{
            Log.i("TAG", "Sign Up button was Clicked!")
            val intent = Intent(this, AdminSignUpActivity::class.java)
            startActivity(intent)
        }

    }



}