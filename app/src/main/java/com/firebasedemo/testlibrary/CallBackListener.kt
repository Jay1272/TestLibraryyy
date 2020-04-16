package com.firebasedemo.testlibrary

interface CallBackListener<T> {

    fun onComplete(obj: T)

    fun onFailure(errorMessage: String)
}
