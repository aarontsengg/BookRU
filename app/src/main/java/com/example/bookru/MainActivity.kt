package com.example.bookru

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Immediately redirect to Home activity
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
        // Finish this activity so the user cannot come back to it
        finish()
    }
}
