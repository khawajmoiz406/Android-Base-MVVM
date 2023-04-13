package com.centerpoint.connect.models.helper

import com.centerpoint.connect.constants.CHECK_OUT
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

data class User(
    var userId: Int = 0,
    var name: String? = "",
    var email: String? = "",
    var password: String? = "",
    var pictureUrl: String? = null,
    var mobileNo: String? = null,
    var officeNo: String? = null,
    var attendance: Int? = CHECK_OUT
) : java.io.Serializable {
    companion object {
        val TYPE: Type = object : TypeToken<User>() {}.type
    }
}
