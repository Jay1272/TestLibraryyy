package com.firebasedemo.testlibrary


import com.google.gson.annotations.SerializedName

data class Order (
    @SerializedName("productid")
    val productid: String = "",
    @SerializedName("qty")
    val qty: String = "",
    @SerializedName("price")
    val price: String = ""

)
