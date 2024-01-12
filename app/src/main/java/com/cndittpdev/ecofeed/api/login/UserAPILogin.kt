package com.cndittpdev.ecofeed.api.login

import com.cndittpdev.ecofeed.api.login.model.UserRequest
import com.cndittpdev.ecofeed.api.login.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPILogin {
    @POST("login")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}