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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_sign_up)
        Toast.makeText(this,getString(R.string.welcome_sign_up_page), Toast.LENGTH_SHORT).show()

        // Get the widgets reference from XML layout
        val imageSignUpLogo = findViewById<ImageView>(R.id.image_sign_up_logo)

        // Display an image on image view from resource
        imageSignUpLogo.setImageResource(R.drawable.sign_up_logo)






    }
}