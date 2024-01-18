package com.cndittpdev.ecofeed.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.ui.login.LoginActivity
import com.cndittpdev.ecofeed.ui.onboarding.OnboardingScreen

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this@SplashScreen, OnboardingScreen::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}