package com.vimalpm.testapp.data.api

import com.vimalpm.testapp.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}