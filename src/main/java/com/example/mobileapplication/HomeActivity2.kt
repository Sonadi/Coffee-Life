package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)  // Ensure you have a corresponding XML layout file

        // Window settings for edge-to-edge layout
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        // Initialize the button and set the click listener
        val nextButton = findViewById<ImageButton>(R.id.imageButton)
        nextButton.setOnClickListener {
            // Create an Intent to start CartActivity2
            val intent = Intent(this, CartActivity2::class.java)
            startActivity(intent)
        }
    }
}
