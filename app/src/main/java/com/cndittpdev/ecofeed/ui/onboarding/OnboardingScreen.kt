package com.cndittpdev.ecofeed.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.ui.login.LoginActivity

class OnboardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)

        val btnMulai: Button = findViewById(R.id.btnMulai)
        btnMulai.setOnClickListener {
            Intent(this@OnboardingScreen, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}