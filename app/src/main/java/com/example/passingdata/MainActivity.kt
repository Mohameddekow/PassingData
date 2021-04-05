package com.example.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        save.setOnClickListener {
            val name = names.text.toString()
            val email = emails.text.toString()
            val age = ages.text.toString()

            val intent: Intent = Intent(this, ProfileActivity::class.java)
                                    .putExtra("name", name)
                                    .putExtra("email", email)
                                    .putExtra("age", age)

            startActivity(intent)
        }
    }
}