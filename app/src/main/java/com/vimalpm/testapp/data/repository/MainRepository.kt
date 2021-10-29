package com.vimalpm.testapp.data.repository

import com.vimalpm.testapp.data.api.ApiHelper


class MainRepository(val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}