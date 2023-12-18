package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GuestActivity : AppCompatActivity() {

    // Initializing variables
    private lateinit var listCourses: Button
    private lateinit var aboutInstitution: Button
    private lateinit var contactForm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)


        listCourses = findViewById(R.id.courseList)
        aboutInstitution = findViewById(R.id.aboutInt)
        contactForm = findViewById(R.id.contactForm)

        //Listeners for buttons
        listCourses.setOnClickListener {
            val intent = Intent(this, CourseListActivity::class.java)
            startActivity(intent)
        }

        aboutInstitution.setOnClickListener {
            val intent = Intent(this, AboutIntActivity::class.java)
            startActivity(intent)
        }
        contactForm.setOnClickListener {
            val intent = Intent(this, ContactFormActivity::class.java)
            startActivity(intent)
        }


    }
}