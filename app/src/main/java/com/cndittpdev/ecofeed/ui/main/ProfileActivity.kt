package com.cndittpdev.ecofeed.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.ui.login.LoginActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        pindahActivity()
        logOut()
    }

    fun pindahActivity() {

        val home : ImageView = findViewById(R.id.home)
        home.setOnClickListener {
            Intent(this@ProfileActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val belanja : ImageView = findViewById(R.id.belanja)
        belanja.setOnClickListener {
            Intent(this@ProfileActivity, BelanjaActivity::class.java).also {
                startActivity(it)
            }
        }

        val scan: ImageView = findViewById(R.id.scanner)
        scan.setOnClickListener {
            Intent(this@ProfileActivity, ScanActivity::class.java).also {
                startActivity(it)
            }
        }

        val coin : ImageView = findViewById(R.id.coin)
        coin.setOnClickListener {
            Intent(this@ProfileActivity, CoinActivity::class.java).also {
                startActivity(it)
            }
        }

        val profile: ImageView = findViewById(R.id.profile)
        profile.setOnClickListener {
            Intent(this@ProfileActivity, ProfileActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun logOut() {
        val out: ImageView = findViewById(R.id.out)
        out.setOnClickListener {
            Intent(this@ProfileActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}