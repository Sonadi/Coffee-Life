package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import com.example.mobileapplication.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity2() {
    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Start BaseActivity2 when the start button is clicked
        binding.startBtn.setOnClickListener {
            startActivity(Intent(this@IntroActivity, BaseActivity2::class.java))
        }
    }
}
