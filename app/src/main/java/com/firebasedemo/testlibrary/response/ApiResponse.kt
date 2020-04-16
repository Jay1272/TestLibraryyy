package com.firebasedemo.testlibrary.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ApiResponse<T> (
    @SerializedName("statusCode")
    @Expose
    var statusCode: Int = 0,
    @SerializedName("APICODERESULT")
    @Expose
    var aPICODERESULT: String = "",
    @SerializedName("result")
    @Expose
    var result: T
)
