package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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


        studentSignUpButton.setOnClickListener{
            // Get the values entered by the user
            val password = studentPasswordEditText.text.toString().trim()
            val userName = studentUserName.text.toString().trim()

            // Check if any of the fields are empty
            if (password.isEmpty() || userName.isEmpty()) {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            } else {
                // Save the student information in the database
               // studentViewModel.insert(Student(userName,password))

                Toast.makeText(this, "Student information saved successfully", Toast.LENGTH_SHORT).show()
                // Open the StudentLoginActivity
                val intent = Intent(this, MainActivity::class.java)
               startActivity(intent)


            }
        }

        // Log message and start MainActivity
        backToHomeButton.setOnClickListener {
            Log.i("TAG", "Home button was Clicked!")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}