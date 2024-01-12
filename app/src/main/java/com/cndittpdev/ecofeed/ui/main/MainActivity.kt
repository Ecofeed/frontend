package com.cndittpdev.ecofeed.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogout : Button = findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}