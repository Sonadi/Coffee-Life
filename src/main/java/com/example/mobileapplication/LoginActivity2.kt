package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)  // Assuming you have a layout file named activity_base.xml

        // Window settings
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val nextButton = findViewById<Button>(R.id.signuptBtn)

        // Set an onClickListener to the button
        nextButton.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, HomeActivity2::class.java)
            startActivity(intent)  // Start the NextActivity2
        }

        val logintext = findViewById<TextView>(R.id.textView9)

        // Set an onClickListener to the button
        logintext.setOnClickListener {
            // Create an Intent to start NextActivity2
            val intent = Intent(this, SigninActivity2::class.java)
            startActivity(intent)  // Start the NextActivity2
        }
    }
}