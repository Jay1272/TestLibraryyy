package com.firebasedemo.testlibrary

import com.firebasedemo.testlibrary.response.ApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface TestApi {
    @POST("orderPlace")
    fun sendData(
        @Body params: Result
    ): Call<ApiResponse<Any>>


}