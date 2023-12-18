package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ContactFormActivity : AppCompatActivity() {

    private lateinit var submitFormbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_form)

        submitFormbtn = findViewById(R.id.submitForm)

        submitFormbtn.setOnClickListener {
            Toast.makeText(this,getString(R.string.form_submit), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GuestActivity::class.java)
            startActivity(intent)
        }


    }
}