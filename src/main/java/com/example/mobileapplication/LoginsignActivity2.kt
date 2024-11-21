package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginsignActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginsign2)

        // Window settings
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val signUpButton = findViewById<Button>(R.id.sign1Btn)
        val loginButton = findViewById<Button>(R.id.logBtn)

        // Set an onClickListener to the signUpButton
        signUpButton.setOnClickListener {
            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)
        }

        // Set an onClickListener to the loginButton
        loginButton.setOnClickListener {
            val intent = Intent(this, SigninActivity2::class.java)
            startActivity(intent)
        }
    }
}
