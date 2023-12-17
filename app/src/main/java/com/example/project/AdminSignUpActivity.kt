package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class AdminSignUpActivity : AppCompatActivity() {

    private lateinit var UserName: EditText
    private lateinit var PasswordEditText: EditText
    private lateinit var SignUpButton: Button
    private lateinit var backToHomeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_sign_up)
        Toast.makeText(this,getString(R.string.welcome_sign_up_page), Toast.LENGTH_SHORT).show()

        val imageSignUpLogo = findViewById<ImageView>(R.id.image_sign_up_logo)

        imageSignUpLogo.setImageResource(R.drawable.sign_up_logo)

        adminPasswordEditText = findViewById(R.id.edit_admin_password_input)
        adminUserName = findViewById(R.id.edit_admin_username_input)

        adminSignUpButton = findViewById(R.id.btn_admin_sign_up_success)
        backToHomeButton = findViewById(R.id.btn_back_to_home_page)


        adminSignUpButton.setOnClickListener{
            val password = adminPasswordEditText.text.toString().trim()
            val userName = adminUserName.text.toString().trim()

            if (password.isEmpty() || userName.isEmpty()) {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            } else {
                // Save the sadmin information in the database
               // adminViewModel.insert(Admin(userName,password))

                Toast.makeText(this, "Admin information saved successfully", Toast.LENGTH_SHORT).show()
                // Open the AdminLoginActivity
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