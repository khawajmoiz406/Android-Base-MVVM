package com.centerpoint.connect.util

import android.content.SharedPreferences
import com.google.gson.Gson
import java.lang.reflect.Type

/**
@author Salman Aziz
created on 2/22/21
 **/


class EncryptSharedPref(private val encryptedSharedPreferences: SharedPreferences) {

    fun saveString(key: String, value: String) {
        encryptedSharedPreferences.edit()
            .putString(key, value)
            .apply()
    }

    fun getString(key: String, defaultValue: String): String {
        return encryptedSharedPreferences.getString(key, defaultValue).toString()
    }

    fun saveModel(data: Any? , type: Type) {
        saveString(type.toString() , Gson().toJson(data))
    }

    fun <T> getModel(type: Type): T? =
        Gson().fromJson(getString(type.toString(), ""), type)

}