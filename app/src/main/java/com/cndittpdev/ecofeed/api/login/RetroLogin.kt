package com.cndittpdev.ecofeed.api.login

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroLogin {
    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("https://backend-s4d6pky5zq-uc.a.run.app/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}