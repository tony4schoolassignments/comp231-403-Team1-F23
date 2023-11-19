package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class StudentSignUpActivity : AppCompatActivity() {

    private lateinit var studentUserName: EditText
    private lateinit var studentPasswordEditText: EditText
    private lateinit var studentSignUpButton: Button
    private lateinit var backToHomeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_sign_up)
        Toast.makeText(this,getString(R.string.welcome_sign_up_page), Toast.LENGTH_SHORT).show()

        // Get the widgets reference from XML layout
        val imageSignUpLogo = findViewById<ImageView>(R.id.image_sign_up_logo)

        // Display an image on image view from resource
        imageSignUpLogo.setImageResource(R.drawable.sign_up_logo)

        //Get user's input
        studentPasswordEditText = findViewById(R.id.edit_student_password_input)
        studentUserName = findViewById(R.id.edit_student_username_input)

        studentSignUpButton = findViewById(R.id.btn_student_sign_up_success)
        backToHomeButton = findViewById(R.id.btn_back_to_home_page)





    }
}