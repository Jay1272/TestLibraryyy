package com.firebasedemo.testlibrary.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

public data class ErrorResponse (

    @SerializedName("ResponseCode")
    @Expose
    var responseCode: Int = 0,
    @SerializedName("ResponseMessage")
    @Expose
    var responseMessage:String = "Unknown error",
    @SerializedName("Comments")
    @Expose
    var comments: String = ""
)
