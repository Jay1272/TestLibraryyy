package com.firebasedemo.testlibrary

import android.content.Context
import android.widget.Toast
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtils {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://demo4esl.com/foodguy/product/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun parseError(response: Response<*>): String {
        try {
            val jObjError = JSONObject(response.errorBody()?.string())
            return jObjError.getString("Comments")
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return "Something went wrong"
    }

    fun showApiError(context: Context, response: Response<*>) {
        Toast.makeText(context, parseError(response), Toast.LENGTH_SHORT).show()
    }

    fun showApiFailedMsg(context: Context) {
        Toast.makeText(context, context.getString(R.string.conntectfailed), Toast.LENGTH_SHORT).show()
    }

    fun showApiSuccessMsg(context: Context, comments: String) {
        Toast.makeText(context, comments, Toast.LENGTH_SHORT).show()
    }

}