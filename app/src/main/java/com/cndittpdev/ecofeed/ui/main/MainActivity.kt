package com.cndittpdev.ecofeed.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.ui.login.LoginActivity
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pindahActivity()

    }

    fun pindahActivity() {

        val home : ImageView = findViewById(R.id.home)
        home.setOnClickListener {
            Intent(this@MainActivity, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val belanja : ImageView = findViewById(R.id.belanja)
        belanja.setOnClickListener {
            Intent(this@MainActivity, BelanjaActivity::class.java).also {
                startActivity(it)
            }
        }

        val scan: ImageView = findViewById(R.id.scanner)
        scan.setOnClickListener {
            Intent(this@MainActivity, ScanActivity::class.java).also {
                startActivity(it)
            }
        }

        val coin : ImageView = findViewById(R.id.coin)
        coin.setOnClickListener {
            Intent(this@MainActivity, CoinActivity::class.java).also {
                startActivity(it)
            }
        }

        val profile: ImageView = findViewById(R.id.profile)
        profile.setOnClickListener {
            Intent(this@MainActivity, ProfileActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}