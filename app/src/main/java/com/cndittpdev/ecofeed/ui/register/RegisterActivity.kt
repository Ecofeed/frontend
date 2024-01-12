package com.cndittpdev.ecofeed.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.cndittpdev.ecofeed.R
import com.cndittpdev.ecofeed.api.register.Retro
import com.cndittpdev.ecofeed.api.register.UserAPI
import com.cndittpdev.ecofeed.api.register.model.UserRequest
import com.cndittpdev.ecofeed.api.register.model.UserResponse
import com.cndittpdev.ecofeed.ui.login.LoginActivity
import com.cndittpdev.ecofeed.ui.main.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //      Button Register
        registerInit()

        val btnLogin : Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun registerInit(){
        val btnRegister : Button = findViewById(R.id.btnSignUp)
        btnRegister.setOnClickListener {
            register()
        }
    }

    fun register() {
        Intent(this@RegisterActivity, MainActivity::class.java).also {
            startActivity(it)
        }
        val etUsername : EditText = findViewById(R.id.etUsername)
        val etEmail : EditText = findViewById(R.id.etEmail)
        val etPassword : EditText = findViewById(R.id.etPassword)

        val request = UserRequest()
        request.username = etUsername.text.toString().trim()
        request.email = etEmail.text.toString().trim()
        request.password = etPassword.text.toString().trim()

        val retro = Retro().getretroClientInstance().create(UserAPI::class.java)
        retro.register(request).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("TAG", "Error")
            }

        })
    }
}