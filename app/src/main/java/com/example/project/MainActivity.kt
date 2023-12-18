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
import com.example.project.R.id.guestContinue

class MainActivity : AppCompatActivity() {

    private lateinit var studentSignUpButton: Button
    private lateinit var studentFullTimeSignUpButton: Button
    private lateinit var studentPartTimeSignUpButton: Button
    private lateinit var adminSignUpButton: Button
    private lateinit var guestContinueButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        Toast.makeText(this,getString(string.welcome_message), Toast.LENGTH_SHORT).show()

        // Get the widgets reference from XML layout
        val imageCourseLogo = findViewById<ImageView>(R.id.image_course_logo)

        // Display an image on image view from resource
        imageCourseLogo.setImageResource(drawable.course_logo)

        guestContinueButton = findViewById(guestContinue)
        studentSignUpButton = findViewById(btn_student_sign_up)
        adminSignUpButton = findViewById(id.btn_admin_sign_up)
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

        guestContinueButton.setOnClickListener {
            Log.i("TAG", "Guest Continue button clicked.")
            val intent = Intent(this, GuestActivity::class.java)
            startActivity(intent)
        }

    }



}