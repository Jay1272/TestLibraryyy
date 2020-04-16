package com.firebasedemo.testlibrary


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result (
    @SerializedName("id")
    @Expose
    var id: Int = 0,
    @SerializedName("order")
    @Expose
    val order: List<Order> = listOf()
)