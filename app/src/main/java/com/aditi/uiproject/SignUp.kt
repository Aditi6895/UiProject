package com.aditi.uiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signup = findViewById<Button>(R.id.btnsignUp)
        signup.setOnClickListener {
            Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
        }
    }
}