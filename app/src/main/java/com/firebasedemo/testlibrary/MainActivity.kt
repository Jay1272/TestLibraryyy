package com.firebasedemo.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.firebasedemo.testlibrary.response.ApiResponse
import com.jetbrains.handson.mpp.mobile.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var order: ArrayList<Order> = arrayListOf()
    lateinit var testApi: TestApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText(createApplicationScreenMessage())
        order.add(Order("20", "12", "500"))
        order.add(Order("21", "13", "600"))
        order.add(Order("22", "14", "700"))
        var id: Int = 4

//        button.setOnClickListener {
//            val params = Result(id, order)
//            sendData(params, object : CallBackListener<Any> {
//                override fun onComplete(obj: Any) {
//                    Toast.makeText(applicationContext, "success", Toast.LENGTH_SHORT).show()
//                }
//
//                override fun onFailure(errorMessage: String) {
//                    Toast.makeText(applicationContext, "fail", Toast.LENGTH_SHORT).show()
//                }
//            })
//        }

    }

    fun sendData(result: Result, listener: CallBackListener<Any>) {
        testApi.sendData(result)
            .enqueue(object : Callback<ApiResponse<Any>> {
                override fun onResponse(
                    call: Call<ApiResponse<Any>>,
                    response: Response<ApiResponse<Any>>
                ) {
                    if (response.isSuccessful) {

                        response.body()?.let { body ->
                            listener.onComplete(body.result)
                        }
                    } else {
                        listener.onFailure(ApiUtils.parseError(response))
                    }
                }

                override fun onFailure(call: Call<ApiResponse<Any>>, t: Throwable) {
                    listener.onFailure("gvhbjkjkjhgcgfg")
                }
            })
    }
}
