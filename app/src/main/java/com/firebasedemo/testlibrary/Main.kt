package com.firebasedemo.testlibrary

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    var encryptor: AES = AES()

    val secretKey = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz"
    val originalString = "359F8C55-400A-4B88-8157-1F88B5355DFE"
    
    val encryptedString: String? = encryptor.encrypt(originalString, secretKey)
    val decryptedString: String? = encryptor.decrypt(encryptedString, secretKey)
    println(originalString)
    println(encryptedString)
    println(decryptedString)
}