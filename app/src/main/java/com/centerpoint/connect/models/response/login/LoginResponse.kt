package com.centerpoint.connect.models.response.login

import com.centerpoint.connect.models.helper.User

data class LoginResponse(
    var user: User? = User()
) : java.io.Serializable
