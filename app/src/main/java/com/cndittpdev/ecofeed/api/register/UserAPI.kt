package com.cndittpdev.ecofeed.api.register

import com.cndittpdev.ecofeed.api.register.model.UserRequest
import com.cndittpdev.ecofeed.api.register.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {
    @POST("register")
    fun register(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}