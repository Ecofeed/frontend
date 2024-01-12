package com.cndittpdev.ecofeed.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.api.login.RetroLogin
import com.cndittpdev.ecofeed.api.login.UserAPILogin
import com.cndittpdev.ecofeed.api.login.model.UserRequest
import com.cndittpdev.ecofeed.api.login.model.UserResponse
import com.cndittpdev.ecofeed.ui.main.MainActivity
import com.cndittpdev.ecofeed.ui.register.RegisterActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginInit()

        val btnRegister : Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun loginInit() {
        val btnLogin : Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            login()
        }
    }

    fun login() {
        Intent(this@LoginActivity, MainActivity::class.java).also {
            startActivity(it)
        }

        val etUsername : EditText = findViewById(R.id.etUsername)
        val etPassword : EditText = findViewById(R.id.etPassword)

        val request = UserRequest()
        request.username = etUsername.text.toString().trim()
        request.password = etPassword.text.toString().trim()

        val retroLogin = RetroLogin().getRetroClientInstance().create(UserAPILogin::class.java)
        retroLogin.login(request).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("TAG", "Error")
            }

        })
    }
}