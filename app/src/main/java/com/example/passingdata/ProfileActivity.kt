package com.example.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//        fetching the data from the intent
        val intentObject: Intent = intent


        val name = intentObject.getStringExtra("name")
        val email = intentObject.getStringExtra("email")
        val age = intentObject.getStringExtra("age")

        profileName.text = "Name: $name"
        profileEmail.text = "Email: $email"
        profileAge.text = "Age: $age"

    }
}