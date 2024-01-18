package com.cndittpdev.ecofeed.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.cndittpdev.ecofeed.R

class CoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        pindahActivity()
    }

    fun pindahActivity() {

        val home : ImageView = findViewById(R.id.home)
        home.setOnClickListener {
            Intent(this@CoinActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val belanja : ImageView = findViewById(R.id.belanja)
        belanja.setOnClickListener {
            Intent(this@CoinActivity, BelanjaActivity::class.java).also {
                startActivity(it)
            }
        }

        val scan: ImageView = findViewById(R.id.scanner)
        scan.setOnClickListener {
            Intent(this@CoinActivity, ScanActivity::class.java).also {
                startActivity(it)
            }
        }

        val coin : ImageView = findViewById(R.id.coin)
        coin.setOnClickListener {
            Intent(this@CoinActivity, CoinActivity::class.java).also {
                startActivity(it)
            }
        }

        val profile: ImageView = findViewById(R.id.profile)
        profile.setOnClickListener {
            Intent(this@CoinActivity, ProfileActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}